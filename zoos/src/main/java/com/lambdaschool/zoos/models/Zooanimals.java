package com.lambdaschool.zoos.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "zooanimals")
@IdClass(ZooAnimalId.class)
public class Zooanimals extends Auditable implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    @JsonIgnoreProperties(value = "animals", allowSetters = true)
    private Zoo zoo;
    @Id
    @ManyToOne
    @JoinColumn(name = "animalid")
    @JsonIgnoreProperties(value = "zoos", allowSetters = true)
    private Animal animal;

    private String incomingzoo;

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getIncomingzoo() {
        return incomingzoo;
    }

    public void setIncomingzoo(String incomingzoo) {
        this.incomingzoo = incomingzoo;
    }

    public Zooanimals(Zoo zoo, Animal animal, String incomingzoo) {
        this.zoo = zoo;
        this.animal = animal;
        this.incomingzoo = incomingzoo;
    }

    public Zooanimals() {
    }

    public Zooanimals(Zoo zoo, Animal animal) {
        this.zoo = zoo;
        this.animal = animal;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
        {
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass())
        {
            return false;
        }
        Zooanimals that = (Zooanimals) obj;
        return  (( this.zoo == null) ? 0 : this.zoo.getZooid()) ==
                (( that.zoo == null) ? 0 : that.zoo.getZooid()) &&
                (( this.animal == null) ? 0 : this.animal.getAnimalid()) ==
                (( that.animal == null) ? 0 : that.animal.getAnimalid());


    }
}
