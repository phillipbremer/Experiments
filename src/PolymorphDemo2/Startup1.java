/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphDemo2;

/**
 *
 * @author pbremer
 */
public class Startup1 {
    public static void main(String[] args) {
         Object[] animals = new Object[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        
        for(int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Dog) {
                ((Dog)animals[i]).speak();
            } else if(animals[i] instanceof Cat) {
                ((Cat)animals[i]).speak();
            }
        }
    }
}
