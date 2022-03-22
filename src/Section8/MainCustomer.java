package Section8;

import java.util.ArrayList;

public class MainCustomer {
    public static void main(String[] args) {
        CustomerLL customer = new CustomerLL("Hai",23.51);
        CustomerLL anotherC;
        anotherC = customer;
        anotherC.setBalance(23.12);
        System.out.println("balance for customer " + customer.getName() + " is " +customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);


        for (int i =0; i< intList.size();i++){
            System.out.println(i + " : " + intList.get(i));
        }

        intList.add(1,2);

        for (int i =0; i< intList.size();i++){
            System.out.println(i + " : " + intList.get(i));
        }
    }

}
