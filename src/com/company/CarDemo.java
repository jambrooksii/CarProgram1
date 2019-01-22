package com.company;

        //Create a new project in IntelliJ named CarProgram using the Command Line
        //App template
        //• Initialize your project as a Git repository and be sure to add and commit all changes as you work
        //• Rename your Main file to CarDemo (right-click -> Refactor -> Rename...)
        //• Create a new Java class file (File -> New -> Java Class) named Car
        //• Define your Car class with at least (3) instance variables such as color, make, model, etc., and create
        //accessor methods for each variable
        //• In your CarDemo class, write a program that instantiates a Car object named myCar, uses accessor methods
        //to set each of its instance variables and then get their values, and finally prints out information about your vehicle


public class CarDemo {

    public static void main(String[] args) {
	// write your code here

        Car myCar = new Car();

        myCar.setMake("Dodge");
        myCar.setColor("Orange");
        myCar.setModel("Nitro");



        System.out.println("Thre Make of my Car is " + myCar.getMake());
        System.out.println("The Color of my car is" + myCar.getColor());
        System.out.println("The Model of my Car is " + myCar.getModel());

    }

}
