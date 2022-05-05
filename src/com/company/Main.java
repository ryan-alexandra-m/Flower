package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Flower daisy= new Flower(7, "White", Flower.typeOfFlower.DAISY, true, false, "sweet");
        System.out.println(daisy);


    Flower rose= new Flower(Flower.typeOfFlower.ROSE, true, false);
    rose.setColor("red");
    rose.setSmell("stinks");
    rose.setNumPetals(6);
        System.out.println(rose);

        Scanner scan= new Scanner(System.in);
        System.out.println("What is the name of your person");
        String name= scan.nextLine();
        System.out.println(rose.lovesMeNot(name));
}}
