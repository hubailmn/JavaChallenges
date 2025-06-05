package OOP;

public class Person {

    private static String nationality;
    private static String languages;
    private final String name;
    private final int age;


    public Person(String name, int age, String nationality, String languages) {
        this.name = name;
        this.age = age;
        Person.nationality = nationality;
        Person.languages = languages;

    }

    public void selfIntroduce() {

        System.out.printf("\nHi my name is %s", name);
        System.out.printf("\nI'm from %s\n", nationality);
    }

    public void speak() {
        System.out.printf("\nI speak %s\n", languages);
    }

}
