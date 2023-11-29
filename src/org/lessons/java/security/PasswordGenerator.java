package org.lessons.java.security;


import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        String name;
        String lastname;
        String favouriteColor;
        int dayOfBirth;
        int monthOfBirth;
        int yearOfBirth;

        System.out.println("Inserisci il tuo nome: ");
        name = inputUser.next();

        System.out.println("Inserisci il tuo cognome: ");
        lastname = inputUser.next();

        System.out.println("Inserisci il tuo colore preferito: ");
        favouriteColor = inputUser.next();

        System.out.println("Inserisci il tuo giorno di nascita: ");
        dayOfBirth = inputUser.nextInt();

        System.out.println("Inserisci il tuo mese di nascita sottoforma di numero: ");
        monthOfBirth = inputUser.nextInt();

        System.out.println("Inserisci il tuo anno di nascita: ");
        yearOfBirth = inputUser.nextInt();

        int sumDateOfBirth = dayOfBirth + monthOfBirth + yearOfBirth;
        System.out.println(sumDateOfBirth);

        String generatePassword = name + "-" + lastname + "-" + favouriteColor + "-" + sumDateOfBirth;
        System.out.println(generatePassword);

        inputUser.close();
    }
}
