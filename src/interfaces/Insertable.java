/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import entity.Product;
import entity.Buyer;
import entity.Purchase;
import entity.Seller;

import java.util.List;


public interface Insertable {
    
    public Product addProduct();
    public Buyer addBuyer();
    public Purchase addPurchase(List<Product>products, List<Buyer>buyers,List<Purchase> purchases);
    public void showHistoryPurchases(List<Purchase> purchases);
}
