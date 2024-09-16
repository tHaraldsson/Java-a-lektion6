package se.tommy.PersonObjekt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person("tommy", 25, "lärare");
        System.out.println("Ange ditt namn");
        String name = scanner.nextLine();
        person.setName(name);
        System.out.println("Ange din ålder");
        int age = scanner.nextInt();
        person.setAge(age);
        System.out.println("Ange ditt yrke");
        String yrke = scanner.nextLine();
        person.setYrke(yrke);
        scanner.nextLine();
        System.out.println(person.info());

    }
}
