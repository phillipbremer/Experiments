/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphDemo3;

/**
 *
 * @author pbremer
 */
public class Startup1 {
    public static void main(String[] args) {
        
        /*Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();*/
        
        Animal[] animals = {
            new Dog(),
            new Cat(),
            new Duck()
        };
        
        for(int i = 0; i < animals.length; i++) {
            animals[i].speak();
        }
        
        for(Animal a : animals) {
            a.speak();
        }
        
        Vet vet = new Vet();
        vet.setPatientList(animals);
        vet.askAnimalToSpeak(null);
        
        Duck duck = (Duck)animals[2];
        duck.paddle();
        
        /*Animal a = animals[2];
        ((Duck)a).paddle();*/
    }
}
