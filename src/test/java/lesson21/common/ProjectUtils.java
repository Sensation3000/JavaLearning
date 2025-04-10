package lesson21.common;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

public final class ProjectUtils {

    private static final String PREFIX_JENKINS_PROP = "jenkins.";
    private static final String PREFIX_RUN_PROP = "run.";
    private static final String PREFIX_BROWSER_PROP = "browser.";
    private static final String PREFIX_BROWSER_OPTIONS = PREFIX_BROWSER_PROP + "options.";

    private static final Properties properties;

    private static final ChromeOptions chromeOptions;

    static {
        properties = new Properties();
        if (!isRunCI()) {
            try {
                InputStream inputStream = ProjectUtils.class.getClassLoader().getResourceAsStream(".properties");
                if (inputStream == null) {
                    log("The \u001B[31m.properties\u001B[0m file not found in src/test/resources/ directory.");
                    log("You need to create it from .properties.TEMPLATE file.");
                    System.exit(1);
                }
                properties.load(inputStream);
            } catch (IOException ignore) {
            }
        }

        chromeOptions = new ChromeOptions();
        String options = getValue(PREFIX_BROWSER_OPTIONS + "chrome");
        if (options != null) {
            for (String argument : options.split(";")) {
                chromeOptions.addArguments(argument);
            }
        }
    }

    private static String convertPropToEnvName(String propName) {
        return propName.replace('.', '_').toUpperCase();
    }

    private static String getValue(String name) {
        return properties.getProperty(name, System.getenv(convertPropToEnvName(name)));
    }

    static WebDriver createDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        return driver;
    }

    static void get(WebDriver driver) {
        driver.get(getUrl());
    }

    static String getUrl() {
        return String.format("http://%s:%s/",
                getValue(PREFIX_JENKINS_PROP + "host"),
                getValue(PREFIX_JENKINS_PROP + "port"));
    }

    static String getUserName() {
        return getValue(PREFIX_JENKINS_PROP + "username");
    }

    static String getPassword() {
        return getValue(PREFIX_JENKINS_PROP + "password");
    }

    static boolean closeIfError() {
        return Boolean.TRUE.toString().equals(getValue(PREFIX_BROWSER_PROP + "closeIfError"));
    }

    static boolean isRunCI() {
        return Boolean.TRUE.toString().equals(getValue(PREFIX_RUN_PROP + "ci"));
    }

    public static void log(String str) {
        System.out.println(str);
    }

    public static void logf(String str, Object... arr) {
        log(String.format(str, arr));
    }
}
