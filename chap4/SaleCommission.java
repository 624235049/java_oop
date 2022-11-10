package chap4;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleCommission {

    static void printMenu() {
        System.out.println("----Menu-----");
        System.out.println("0 : Exit");
        System.out.println("1 : Enter Data");
        System.out.println("2 : Summary");
        System.out.println("--------------");
    }

    static int commission(int saleClass, double saleTotal) {
        int commission = 0;

        if (saleClass == 1 && saleTotal < 10000) {

            commission = (int)(saleTotal * 0.05);
            
        } else if (saleClass == 2 && saleTotal < 10000) {

            commission = (int) (saleTotal * 0.15);
            
        } else if (saleClass == 3 && saleTotal < 10000) {

            commission = (int) (saleTotal * 0.25);
            
        } else if (saleClass == 1 && saleTotal >= 10000) {
            
            commission = (int) (saleTotal * 0.10);
            
        } else if (saleClass == 2 && saleTotal >= 10000) {
            
            commission = (int) (saleTotal * 0.20);
            
        } else if (saleClass == 3 && saleTotal >= 10000) {
            
            commission = (int) (saleTotal * 0.30);
            
        }
        return commission;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        ArrayList<Saleman> arr = new ArrayList<Saleman>();
        int commission = 0;
        double sumTotal = 0;
        do {
            printMenu();
            System.out.print("Please Enter Menu [0-2] :");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Enter Id: ");
                    String id = sc.next();
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter surname: ");
                    String surname = sc.next();
                    System.out.print("Enter Sale Class: ");
                    int saleClass = sc.nextInt();
                    System.out.print("Enter Sale Totol: ");
                    double saleTotal = sc.nextDouble();
                    Saleman sm = new Saleman(id, name, surname, saleClass, saleTotal);
                    arr.add(sm);

                    break;
                case 2:
                    System.out.println("-------show Data-------");
                    int com = 0;
                    for (Saleman sale : arr) {
                        System.out.print("ID : " + sale.getId());
                        System.out.print("\tName : " + sale.getName());
                        System.out.print("\tSurname : " + sale.getSurname());
                        System.out.print("\tSale Class : " + sale.getSaleClass());
                        System.out.print("\tSale Totol :  " + sale.getSaleTotal());
                        System.out.println("\tcommission : " + com);
                        System.out.println("\t");
                        com = commission(sale.getSaleClass(), sale.getSaleTotal());
                        sumTotal = sumTotal + sale.getSaleTotal();
                        commission = commission + com;
                        
                    }
                    System.out.println("--------Summary--------");
                    System.out.println("Sale Count : " + arr.size());
                    System.out.println("Sale Total : " + sumTotal);
                    System.out.println("Commission Total : "+commission);

                    break;

            }
        } while (menu != 0);
    }

}//end class
