class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void detalii() {
        System.out.println("Numele: " + name);
        System.out.println("Vârsta: " + age);
    }

    void setHours(int hours) {
        System.out.println(name + " învață " + hours + " ore pe zi.");
    }
}

public class Persoana {
    public static void main(String[] args) {
        Person pers = new Person("Dorina Vintea", 26);
        pers.detalii();
        pers.setHours(3);

        Person pers2 = new Person("Victoria Galanciuc", 23);
        pers2.detalii();
        pers2.setHours(5);
    }
}
