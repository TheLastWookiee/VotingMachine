package votingsystem;
/*

Must have the defined constructor:
● Person(int age, char gender, String firstName, String lastName, String politicalParty)
Which will set the passed properties to our defined variables
Will implement the following methods:
● getAge() - returns int
● getGender() - returns char
Will define the following abstract methods:
● getFullName() - returns string
 */



/**
 * @author: Caiden Henn
 * 2/19/2024
 * A Program to simulate a voting system consisting of an advanced class structure.
 */


public abstract class Person {
    private int age;
    private char gender;
    protected String firstname;
    protected String lastname;
    protected String politicalParty;

    //constructor for the class person
    public Person(int age, char gender, String firstname, String lastname, String politicalParty) {
        this.age = age;
        this.gender = gender;
        this.firstname = firstname;
        this.lastname = lastname;
        this.politicalParty = politicalParty;
    }

        public int getAge () {
            return age;
        }

        public char getGender () {
            return gender;
        }



    public abstract String getfullName();
    }
