//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski
//Date - 02/16/2021

public class DogDobranowski {
    private int age;
    private String name;

    public DogDobranowski(int a, String n) {
        age = a;
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "" + age + " " + name;
    }
}