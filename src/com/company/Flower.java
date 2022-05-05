package com.company;

public class Flower {
    int numPetals;
    String color;
    typeOfFlower type;
    boolean beesLike;
    boolean wilted;
    String smell;

    public enum typeOfFlower{
        DAISY,
        ROSE,
        ALUM,
        TULIP,
        CARNATION,
        IRIS,
        OTHER
    }

    public Flower(int numPetals, String color, typeOfFlower type, boolean beesLike, boolean wilted, String smell) {
        this.numPetals = numPetals;
        this.color = color;
        this.type = type;
        this.beesLike = beesLike;
        this.wilted = wilted;
        this.smell = smell;
    }

    public Flower(typeOfFlower type, boolean beesLike, boolean wilted) {
        this.type = type;
        this.beesLike = beesLike;
        this.wilted = wilted;
    }

    public int getNumPetals() {
        return numPetals;
    }
    public void setNumPetals(int numPetals) {
        this.numPetals = numPetals;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public typeOfFlower getType() {
        return type;
    }
    public void setType(typeOfFlower type) {
        this.type = type;
    }

    public boolean isBeesLike() {
        return beesLike;
    }
    public void setBeesLike(boolean beesLike) {
        this.beesLike = beesLike;
    }

    public boolean isWilted() {
        return wilted;
    }
    public void setWilted(boolean wilted) {
        this.wilted = wilted;
    }

    public String getSmell() {
        return smell;
    }
    public void setSmell(String smell) {
        this.smell = smell;
    }

    public String lovesMeNot(String name){
        if(numPetals%2==0){
            return name + " loves me";
        }
        if(numPetals%2!=0){
            return name+ " loves me not";
        }return name;
    }

    @Override
    public String toString() {
        return "This flower is a " + type +" with " + numPetals + " petals."+ " It is " + color + " and smells  "+ smell +" it is " + beesLike + " that bees like it, and " + wilted + " that it is wilted. ";
    }
}
