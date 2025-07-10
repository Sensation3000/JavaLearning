package codewars;

//https://www.codewars.com/kata/56f7f8215d7c12c0e7000b19/train/javascript
//Fun with ES6 Classes #1 - People, people, people
//Time for some OOP fun!
//
//Define a class Person with the following properties:
//
//A constructor that accepts 4 arguments:
// firstName/FirstName (defaults to "John" if not set),
// lastName/LastName (defaults to "Doe" if not set),
// age/Age (defaults to 0 if not set)
// and gender/Gender (defaults to "Male" if not set).
//
// These should be stored in this.firstName/this.FirstName, this.lastName/this.LastName, this.age/this.Age and this.gender/this.Gender respectively.
//A method sayFullName/SayFullName that accepts no arguments and returns the full name (e.g. "John Doe")
//A class/static method greetExtraTerrestrials/GreetExtraTerrestrials that accepts one parameter raceName and returns "Welcome to Planet Earth raceName".
// For example, if the race name is "Martians", it should say "Welcome to Planet Earth Martians"
//You may use any valid syntax you like; however, it is highly recommended that you complete this Kata using ES6 syntax and features.
//
//Have fun! :D

public class People {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    public People (String firstName, String lastName, int age, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public People(){
        this ("John", "Doe", 0, "Male");
    };

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String sayFullName(){
        return this.getFirstName() + " " + this.getLastName();
    }

    public static String greetExtraTerrestrials(String raceName){
        return "Welcome to Planet Earth " + raceName;
    }


    public static void main(String[] args) {
        People human1 = new People();
        System.out.println(human1.getFirstName());
        System.out.println(human1.sayFullName());

        People human2 = new People("Aliya", "Petrova", 18, "Female");
        System.out.println(human2.getFirstName());
        System.out.println(human2.sayFullName());
        System.out.println(People.greetExtraTerrestrials("zemlyanians"));
    }
}
