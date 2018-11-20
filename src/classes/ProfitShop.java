/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Purchase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pupil
 */
public class ProfitShop {
    
    private List<Purchase> purchases = new ArrayList<>();
    private Integer months;

    public ProfitShop() {
        
    }

    public ProfitShop(List<Purchase> purchases, Integer months) {
        this.purchases = purchases;
        this.months = months;
    }
//    public Integer getProfit(){
//        int months = 0;
//        int profit = 0;
//        for (int i = 0; i < purchases.size(); i++) {
//            Purchase purchase = purchases.get(i);
//            
//            
//            
//            
//        }
//        
//    }
//            
    public List<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }
    
    
    
}
