/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphDemo3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pbremer
 */
public class Vet {
    private List<Animal> patientList = new ArrayList<>();
    
    public void addAnimalToPatientList(Animal animal){
        patientList.add(animal);
        animal.speak();
    }
}
