/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Buyer;
import entity.Product;
import entity.Purchase;
import entity.Seller;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;


public class AddPurchase {
    
    public Purchase add(List<Product> products,List<Buyer> buyers,List<Purchase> purchases){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Покупка ------");
        System.out.println("Покупатели: ");
        for (int i = 0; i < buyers.size(); i++) {
            Buyer buyer = buyers.get(i);
            System.out.println(i+1+". "+buyer.getName()+" "+buyer.getSurname()+", баланс:"+buyer.getCash()+", Город:"+buyer.getCity());
        }
        System.out.println("Продукты: ");
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            System.out.println(i+1+". "+product.getName()+" , Количество: "+product.getCount()
                    +" , Цена за один товар: "+product.getPrice());
        }
        System.out.println("Покупатель выбирает товар");
        System.out.println("№ покупателя:");
        String numBuyer = scanner.nextLine();
        System.out.println("№ товара:");
        String numProduct = scanner.nextLine();
        System.out.println("Количество:");
        int productCount = scanner.nextInt();
        Product product=products.get(new Integer(numProduct)-1);
        Buyer buyer=buyers.get(new Integer(numBuyer)-1);
        Purchase purchase = new Purchase(product,buyer,productCount);
        product.setCount(product.getCount()-productCount);//уменьшение товара
        buyer.setCash(buyer.getCash()-(productCount*product.getPrice()));//уменьшаем деньги покупателя на стоимость покупки с учетом количества
        
        
        return purchase;
    }
    
    
}
