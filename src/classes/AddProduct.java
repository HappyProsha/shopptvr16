/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Product;
import java.util.Scanner;
/**
 *
 * @author pupil
 */
public class AddProduct {
    
    public Product add(){
        
        Product product = new Product();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Добавление товара ----");
        System.out.println("Введите название товара:");
        product.setName(scanner.nextLine());
        System.out.println("Укажите их количество:");
        product.setCount(scanner.nextInt());
        System.out.println("Введите стоимость одного товара:");
        product.setPrice(scanner.nextInt());
        return product;
    }
    
}

