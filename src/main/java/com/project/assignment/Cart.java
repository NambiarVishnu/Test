package com.project.assignment;

import java.util.List;

public class Cart{


    public  int CartReserved(List<GroceryItem> grocery,String[] cartArr){
        int sum=0;
        int i=0;
        while(i<cartArr.length){
            for(GroceryItem choose:grocery){
                if(choose.item.equals(cartArr[i])){
                    sum+= choose.itemPrice;


//                } else if (!choose.item.equals(arr[i])) {
//                    System.out.println(arr[i]+" out of stock");
//                    break;
                }

            }
            i++;

        }

        return sum;
    }
}
