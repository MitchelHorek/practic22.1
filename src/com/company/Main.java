package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Customer customers [] = new Customer[10];
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Exercise1();
    }
    private static boolean checkINN(Customer customer) throws Exception {
        if(customer.getINN().length()==12)
            return true;
        else
            throw new Exception(customer.getFIO()+ "Некорректое ИНН ");
    }

    public static void Exercise1()
    {
        System.out.println("\nДанные до покупок: \n");
        Random random=new Random();
        int r;
        String inn,name;
        int money;
        for(int i=0;i<customers.length;i++){
            r=random.nextInt(3)+11;
            inn = "";
            name="";
            for (int j=0;j<r;++j){
                inn+=((char)(random.nextInt(10) + '0'));
            }
            name+=(char)(i+'0');
            money= random.nextInt(3)*1000;
            customers[i]=new Customer(inn,name,money);
        }
        for(int i=0;i<customers.length;i++)
            System.out.println(customers[i].getFIO()+"\t"+customers[i].getINN()+"\t\t"+customers[i].money);
        System.out.println();
        for (int i=0;i<customers.length;++i){
            try {
                if(checkINN(customers[i]))
                    customers[i].money-=random.nextInt(500);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("\nДанные после покупок: \n");
        for(int i=0;i<customers.length;++i)
            System.out.println(customers[i].getFIO()+"\t"+customers[i].getINN()+"\t\t"+customers[i].money);
    }


}
