package section01.lec03;

import section01.lec01.Person;

public class Lec03Main {

    public static void main(String[] args) {

    }

    public static void printAgeIfPerson(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }

}
