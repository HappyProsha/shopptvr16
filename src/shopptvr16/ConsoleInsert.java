/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopptvr16;

import entity.Buyer;
import entity.Product;
import entity.Purchase;
import entity.Seller;
import interfaces.Insertable;
import java.util.List;
import classes.AddProduct;
import classes.AddBuyer;
import classes.AddPurchase;
import classes.HistoryPurchases;
import entity.Seller;
import java.util.List;




public class ConsoleInsert implements Insertable {

    @Override
    public Product addProduct() {
        AddProduct addProduct = new AddProduct();
        return addProduct.add();
    }

    @Override
    public Buyer addBuyer() {
        
        AddBuyer addBuyer = new AddBuyer();
        return addBuyer.add();
    }

    @Override
    public Purchase addPurchase(List<Product> products, List<Buyer> buyers,List<Purchase> purchases) {
        
        AddPurchase addPurchase = new AddPurchase();
        return addPurchase.add(products, buyers, purchases);
        
    }

    @Override
    public void showHistoryPurchases(List<Purchase> purchases) {
        HistoryPurchases historyPurchases = new HistoryPurchases();
        historyPurchases.show(purchases);
    }
    
}
