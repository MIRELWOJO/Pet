package org.vashonsd;


import

import java.time.LocalDate;
import java.time.LocalDateTime;.java.time.LocalDateTime;

public class Pet {

    String breed;
    String name;
    boolean needsRestraint;
    LocalDate dateOfBirth;
    Type typeOfAnimal;

    public enum Type {
        DOG,
        CAT,
        CHICKEN
    }

    public Pet(Type typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public Pet(String breed, String name, LocalDate dateOfBirth, Type typeOfAnimal) {
        this.breed = breed;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.typeOfAnimal = typeOfAnimal;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        int result = now.getYear() - dateOfBirth.getYear();
        if (now.getMonthValue() < dateOfBirth.getMonthValue()) {
            result -= 1;
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNeedsRestraint() {
        return needsRestraint;
    }

    public void setNeedsRestraint(boolean needsRestraint) {
        this.needsRestraint = needsRestraint;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean needsRestraint() {
        //if the pet is over 13 OR needsRestraint is false, return false.
        // otherwise, return true.
    


    }
}




