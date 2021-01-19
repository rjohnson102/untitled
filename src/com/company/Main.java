package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Rectangle box = new Rectangle();


        final int SIZE = 25;
        char letters[] = new char[SIZE];
        String message = "Hello World!";
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        boolean found = false;

        for(int i = 0; i < message.length(); i++ ){
            letters[i] = message.charAt(i);
            count++;
        }
        System.out.println(letters);

        int number = Integer.parseInt(keyboard.nextLine());
        System.out.println(number);

    }

}
