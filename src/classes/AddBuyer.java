/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;


import entity.Buyer;
import java.util.Scanner;

public class AddBuyer {
    
    public Buyer add(){
        
        Buyer buyer = new Buyer();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Идентификация покупателя ----");
        System.out.println("Имя:");
        buyer.setName(scanner.nextLine());
        System.out.println("Фамилия:");
        buyer.setSurname(scanner.nextLine());
        System.out.println("Город:");
        String city = scanner.nextLine();
        buyer.setCity(city);
        System.out.println("Баланс:");
        buyer.setCash(scanner.nextInt());
        
        
        return buyer;
        
    }
    
}
