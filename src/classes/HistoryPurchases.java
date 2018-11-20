/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Buyer;
import entity.Purchase;
import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;

public class HistoryPurchases {
    public void show(List<Purchase> purchases){
       ArrayList<Integer> profits = new ArrayList<Integer>();
       int profit = 0;
        
        for (int i = 0; i < purchases.size();i++) {
            Purchase h = purchases.get(i);
            System.out.println(i+". "+h.getBuyer().getName()
                    +" "+h.getBuyer().getSurname()+", "+h.getBuyer().getCity()
                    +": "+h.getProduct().getName()+", Кол-во:"+h.getPurchaseCount()
                    
            );
              System.out.println("Прибыль магазина за покупку: " + (h.getPurchaseCount()*h.getProduct().getPrice())) ;
              profits.add(h.getPurchaseCount()*h.getProduct().getPrice());
              
        }
        int total = 0 ;
        for (int element : profits){
    total += element;}
        
        System.out.println("Прибыль магазина:"+total);
        
        
        
    }
}
