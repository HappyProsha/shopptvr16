/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopptvr16;

import entity.Buyer;
import entity.Product;
import entity.Seller;
import entity.Purchase;

import interfaces.Saveble;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SaverToFile implements Saveble {

    @Override
    public void saveProducts(List<Product> products) {
         
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {    
            fos = new FileOutputStream("Products.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу записать в файл", ex);
        }
        
    }

    @Override
    public void saveBuyers(List<Buyer> buyers) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {    
            fos = new FileOutputStream("Buyers.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(buyers);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу записать в файл", ex);
        }
    }

    @Override
    public void saveHistories(List<Purchase> purchases) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {    
            fos = new FileOutputStream("Purchases.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(purchases);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу записать в файл", ex);
        }
    }

    @Override
    public void saveSellers(List<Seller> sellers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> loadProducts() {
        List<Product> products = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {    
            fis = new FileInputStream("Products.txt");
            oin = new ObjectInputStream(fis);
            products = (List<Product>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу отрыть файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу прочесть файл", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return products;
    }

    @Override
    public List<Buyer> loadBuyers() {
        List<Buyer> buyers = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {    
            fis = new FileInputStream("Buyers.txt");
            oin = new ObjectInputStream(fis);
            buyers = (List<Buyer>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу отрыть файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу прочесть файл", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return buyers;
    }

    @Override
    public List<Purchase> loadPurchase() {
        List<Purchase> purchases = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {    
            fis = new FileInputStream("Purchases.txt");
            oin = new ObjectInputStream(fis);
            purchases = (List<Purchase>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу отрыть файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Не могу прочесть файл", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToFile.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        return purchases;
    }

    @Override
    public List<Seller> loadSellers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
