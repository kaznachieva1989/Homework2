package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ваше имя ");
        String name = scanner.nextLine();
        System.out.print("Ваш возраст ");
        int age = scanner.nextInt();
        System.out.print("Температура сегодня? ");
        int temperature = scanner.nextInt();


        if (age >= 20 && age <= 45 && temperature < 30 && temperature > -20) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println("Можно гулять");
        } else if (age > 45 && temperature < 25 && temperature > -10) {
            System.out.println("ок");
        }
        generateRandomAge();
    }

    public static int generateRandomAge() {
        int min = 0;
        int max = 107;
        int range = min + (int) (Math.random() * max);

        System.out.printf("Случайно число от %d до %d : %d", min, max, range);
        return range;
    }
}



