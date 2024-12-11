package com.project.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<GroceryItem> wareHouse =new ArrayList<>();

        wareHouse.add(new GroceryItem("Paneer",50));
        wareHouse.add(new GroceryItem("Butter",60));
        wareHouse.add(new GroceryItem("Mushroom",60));
        wareHouse.add(new GroceryItem("Corn",10));

        Scanner sc=new Scanner(System.in);
        String [] arr=new String[3];
        System.out.println("Add the items");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
        }


//        Cart instance=new Cart();
//        int totalAmount=instance.CartReserved(grocery);
//        System.out.println("The total amount of your cart is: $"+totalAmount);
        Cart instance=new Cart();
        int totalAmount=instance.CartReserved(wareHouse,arr);
        if(totalAmount>0){
            System.out.println("-----------------------------------------------");
            System.out.println("The total amount of your cart is: $"+totalAmount);

        }else{
            System.out.println("Sorry, All items are out of stock");
        }




    }
//    public static String Cart(List<GroceryItem> grocery){
//        for(GroceryItem choose:grocery){
//            if(choose.item.equals("Butter")){
//                return choose.itemPrice;
//            }
//        }
//        return null;
//    }
}