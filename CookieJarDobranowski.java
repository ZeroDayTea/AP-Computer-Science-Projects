//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Patrick Dobranowski

//design your CookieJar class
//write all code for your CookieJar class here
//test your CookieJar class with the CookieJarRunner

public class CookieJarDobranowski {
    private int capacity;
    private int stuff;

    public CookieJarDobranowski(int cap) {
        capacity = cap;
    }

    public boolean isFull() {
        return stuff >= capacity;
    }

    public int addStuff(int add) {
        if ((stuff + add) > capacity) {
            int goBack = stuff + add - capacity;
            stuff = capacity;
            return goBack;
        }

        stuff += add;
        return stuff - capacity;
    }

    public int spaceLeft() {
        return capacity - stuff;
    }
}