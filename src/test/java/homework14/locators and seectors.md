## Основные виды локаторов

* **ID** – уникальный идентификатор элемента.
* **Class Name (Класс)** – используется для поиска по имени класса, но не
работает с составными классами.
* **Name (Имя)** – ищет элементы по атрибуту name.
* **Tag Name (Тег)** – находит элементы по названию HTML-тега.
* **Link Text (Текст ссылки)** – ищет ссылки по точному совпадению текста
(equals), выбирает первый найденный элемент.
* **Partial Link Text (Частичный текст ссылки)** – ищет ссылки по частичному
совпадению текста (contains), выбирает первый найденный элемент.
* **CSS-селектор** – позволяет находить элементы с помощью CSS-правил.
* **XPath-селектор** – мощный инструмент для поиска элементов с
использованием XPath-выражений.

## Примеры CSS-локаторов

* **ID** → By.cssSelector("#someId")
* **Class Name** → By.cssSelector(".myClass")
* **Name** → By.cssSelector("[name='username']")
* **Tag** → By.cssSelector("input")
* **Attribute** → By.cssSelector("[customProperty='myvalue']")
* **Tag + Class** → By.cssSelector("input.form-control")
* **Tag + ID** → By.cssSelector("input#my-text-id")
* **Tag + Attribute** → By.cssSelector("input[myprop='myvalue']")

**Дополнительные примеры CSS-локаторов**

* **Class + Class** → By.cssSelector(".form-label.w-100")
* **Prefix (начинается с указанного значения)** →
By.cssSelector("[href^='web']")
* **Suffix (заканчивается на указанное значение)** →
By.cssSelector("[href$='html']")
* **Substring (содержит указанное значение)** → By.cssSelector("[href*='-
form']")
* **Exact Match (полное соответствие значению)** →
By.cssSelector("a[href='web-form.html']")
* **Child (потомок)** → By.cssSelector("label.form-check-label
input[type='checkbox']")
* **Nth-child (n-й потомок)** → By.cssSelector("div.form-check label:nth-child(2)
input")

**Поиск элементов в Selenium**

* **Поиск первого элемента:**
WebElement vegetable = driver.findElement(By.className("tomatoes"));
* **Поиск коллекции элементов:**
List<WebElement> plants = driver.findElements(By.tagName("li"));
* **Поиск от родительского элемента:**
WebElement fruits = driver.findElement(By.id("fruits"));
WebElement fruit = fruits.findElement(By.className("tomatoes"));


## Примеры Xpath локаторов

* **Абсолютный путь** → By.xpath("/html/body/div/input") (не рекомендуется)
* **Относительный путь** → By.xpath("//div/input") (более гибкий вариант)
* **По тегу** → By.xpath("//input")
* **По тексту элемента** → By.xpath("//h1[text()='Hands-On Selenium WebDriver with Java']")
* **По частичному тексту** → By.xpath("//h1[contains(text(), 'Hands-On Selenium WebDriver')]")
* **По атрибуту** → By.xpath("//*[@myprop='myvalue']")
* **По потомку** → By.xpath("//label/input[@id='my-check-1']")
* **По предку (возвращает родительский элемент)** → By.xpath("//input[@id='my-text-id']/..")

**Навигация по DOM**

* **По ближайшему родителю (ancestor)** →
By.xpath("//input[@id='my-text-id']/ancestor::div")
* **По любому предку (ancestor-or-self)** →
By.xpath("//input[@id='my-text-id']/ancestor-or-self::*")
* **По любому потомку (descendant)** →
By.xpath("//div[@class='container']/descendant::input")
* **По любому потомку, включая себя (descendant-or-self)** →
By.xpath("//div[@class='container']/descendant-or-self::input")

**Навигация по соседним элементам**

* **По следующему соседу (following-sibling)** →
By.xpath("//h1/following-sibling::p")
* **По предыдущему соседу (preceding-sibling)** →
By.xpath("//p/preceding-sibling::h1")
* **По всем следующим элементам (following)** →
By.xpath("//h1/following::*")
* **По всем предыдущим элементам (preceding)** →
By.xpath("//p/preceding::*")

**Комбинации условий**
* **Использование AND** → By.xpath("//input[@type='text' and
@name='username']")
* **Использование OR** → By.xpath("//input[@type='text' or
@type='password']")
* **Использование NOT** → By.xpath("//input[not(@disabled)]")

**Выбор элементов по индексу**
* **Первый элемент** → By.xpath("(//input)[1]")
* **Последний элемент** → By.xpath("(//input)[last()]")
* **Второй элемент с определённым тегом** →
By.xpath("(//div[@class='row'])[2]")


**Особые случаи: normalize-space()**

Функция normalize-space() удаляет лишние пробелы в тексте (в
начале, в конце и дублирующиеся между словами).





