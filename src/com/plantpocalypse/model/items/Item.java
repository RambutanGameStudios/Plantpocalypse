package com.plantpocalypse.model.items;

import java.io.Serializable;

public abstract class Item implements Serializable {
    private String name;
    private String Description;

    /* CONSTRUCTORS */
    public Item() {}
    public Item(String name){
        setName(name);
        setDescription("This is a " + name);
    }

    /* ABSTRACT METHODS */
    public abstract void use();

    /* GETTERS AND SETTERS */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

//    @Override
//    public String toString() {
//        return "Item{" +
//                "Description='I am an item'" + '\'' +
//                '}';
//    }
}

