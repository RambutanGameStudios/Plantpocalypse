package com.plantpocalypse.model.items;

public class FloorPlan extends Item{

    /* CONSTRUCTORS */
    public FloorPlan() {}
    public FloorPlan(String name){
        super(name);
    }

    /* ABSTRACT METHODS */
    @Override
    public void use() {
        System.out.println(getName() + " opened");
    }

    /* BUSINESS METHODS */

    /* GETTERS AND SETTERS */

}
