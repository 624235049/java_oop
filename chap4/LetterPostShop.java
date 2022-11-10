package chap4;


import java.util.Scanner;

public class LetterPostShop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Songkhla Post Office\n");

        System.out.print("Enter weight :");
        int Score = sc.nextInt();
        System.out.println("-------Menu--------");
        System.out.println("0 : Exit\n"
                + "1 : Normal Letter\n"
                + "2 : Register Letter\n"
                + "3 : EMS Letter");
        System.out.println("-------------------");

        System.out.print("Enter lettertype :");
        int type = sc.nextInt();

        String lettertype = null;
        switch (type) {
            case 0:
                System.out.println("Exit");

                break;
            case 1:
                lettertype = "Normal Letter";
                String weight;
                if (Score >= 2001) {
                    weight = "error";

                } else if (Score >= 1000) {
                    weight = "45";

                } else if (Score >= 500) {
                    weight = "25";

                } else if (Score >= 250) {
                    weight = "15";

                } else if (Score >= 100) {
                    weight = "9";

                } else if (Score >= 20) {
                    weight = "5";

                } else {
                    weight = "3";

                }
                System.out.println("Normal Letter Service Price : " + weight + " baht");

                break;
            case 2:
                lettertype = "Register Letter";

                String regis;
                if (Score >= 2001) {
                    regis = "error";

                } else if (Score >= 1000) {
                    regis = "58";

                } else if (Score >= 500) {
                    regis = "38";

                } else if (Score >= 250) {
                    regis = "28";

                } else if (Score >= 100) {
                    regis = "22";

                } else if (Score >= 20) {
                    regis = "18";

                } else {
                    regis = "16";

                }
                System.out.println("Register Letter Service +13 Price : " + regis + " baht");

                break;
            case 3:
                lettertype = "EMS Letter";

                String ems;
                if (Score >= 2001) {
                    ems = "error";
                    System.out.println("EMS Letter Service Price : " + ems + " baht");
                } else if (Score >= 1000) {
                    ems = "77";
                    System.out.println("EMS Letter Service Price : " + ems + " baht");
                } else if (Score >= 500) {
                    ems = "62";
                    System.out.println("EMS Letter Service Price : " + ems + " baht");
                } else if (Score >= 250) {
                    ems = "47";
                    System.out.println("EMS Letter Service Price : " + ems + " baht");
                } else if (Score >= 100) {
                    ems = "37";
                    System.out.println("EMS Letter Service Price : " + ems + " baht");
                } else if (Score >= 20) {
                    ems = "32";
                    System.out.println("EMS Letter Service Price : " + ems + " baht");
                } else if (Score >= 1) {
                    ems = "27";
                    System.out.println("EMS Letter Service Price : " + ems + " baht");
                } else {
                    System.out.println("erron");
                }

                break;
            default:
                System.out.println("erron");
                break;
        }

    }
}