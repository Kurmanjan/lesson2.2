package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 5;
        switch (number) {
            case 1:
                System.out.println("Число ровно одному");
                System.out.println("Ещё строка");
                break;
            case 2:
                System.out.println("Число ровно диумя");
                break;
            case 3:
                System.out.println("Число ровно трём");
                break;
            default:
                System.out.println("число не угодоно");
        }
        String name = "Jack";
        switch (name) {
            case "John":
                System.out.println("vas zovut Jon");
                break;
            case "Jack":
                System.out.println("vas zovut Jack");
                break;
            default:
            System.out.println("imya ne ugadano");
        }

    }
}




















