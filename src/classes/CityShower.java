/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Buyer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author pupil
 */
public class CityShower {
    
    Buyer buyer= new Buyer();
    public void show(List<Buyer> buyers){
        
        HashSet<String> cities = new HashSet<>();
        
        for (int i = 0; i < buyers.size(); i++) {
            Buyer buyer = buyers.get(i);
            cities.add(buyer.getCity());
//            System.out.println(buyer.getCity());
        }
        
        Iterator<String> iter = cities.iterator();
        while(iter.hasNext()){
            String city = iter.next();
            System.out.println(city+": ");
            
            for (int i = 0; i < buyers.size(); i++) {
                Buyer b = buyers.get(i);
                if (city.equals(b.getCity())) {
                
                System.out.println(b.getSurname());
                
            }
                
            }
            
            
            
        }
        
    }
    
}
