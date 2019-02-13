package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Car 3
 * -----
 * More Composition
 *
 * Composition is nothing more than a class within a class. You've already seen this when you included private member
 * variables that were Strings. Later we'll use ArrayLists. That way we can build a more complex class out of a bunch
 * of simple classes.
 *
 * You've done a great job of creating your Car classes. Henry Ford would be proud of you. You'd have to explain to him
 * what a computer is but once you get past that I'm sure he'd be proud of you.
 *
 * Your cars and vehicles are missing one thing... Drivers, Pilots, Captains and whoever else might be in charge.
 *
 * Create an abstract Person class. Then extend that class to create a Driver, Pilot, Captain or whoever is operating
 * the vehicles you created. Add the person to your Car, Boat, etc...
 *
 * Add a print statement that says the red porsche is being driven by Bob. You will get Bob from the person.getName()
 * method.
 *
 * This is called composition. Where one class contains another class.
 *
 */
/**
 * Car 2
 * -----
 * <b>Modify your car application: Allow the user to create cars</b>
 * <p>
 * Modify your car app so that it contains an ArrayList of cars. You will do this by adding the following line of code to your car app:
 * <p>
 * ArrayList cars = new ArrayList<>();
 * <p>
 * Now get input from the user to create a car. The input from the user should prompt for the characteristics of the car and create the object using those inputs.
 * <p>
 * Next add the car object to the arraylist as follows:
 * <p>
 * Car car = new Car();
 * <p>
 * //prompt from user and populate car class
 * <p>
 * //add car to the cars arraylist
 * <p>
 * cars.add(car);
 * <p>
 * Finally, use an enhanced for loop to display all the cars.
 * <p>
 * for(Car car: cars){
 * System.out.println(car.getDescription); *
 * }
 */

/**
 * <b>Create a Car class and App</b>
 *
 * Create a class called Car. The Car class should inherit from the Vehicle class. Car should contain the following:
 *
 * private member variables
 * a default constructor
 * an overloaded constructor
 * methods which return a string indicating each task the car is performing.
 *
 * For example, the accelerate method will return a string that says "The car is accelerating" and the setSpeed(90)
 * method will return a string that says "The Speed is 90 mph". The application will also contain getters and setters
 * for each private member variable.
 *
 * Create another class called CarApp which contains the main method. In the main method create an instance of a Car.
 *
 * Then print the output of the different methods as the car object is "operated".
 *
 * Your output should look something like this:
 *
 * The red Porsche is starting
 * The red Porsche is accelerating
 * The red Porsche is going 50 mph
 * The red Porsche is stopped
 *
 * Be creative and make up your own methods if you like.
 *
 * Create a second instance of the car once your first car is working. Set its private member variables in the main
 * method. Now you can call the methods of the second car in between the calls to the methods of the first car.
 * Your program will keep the two separate. Here's an example. Your mileage may vary.
 *
 * The red Porsche is starting
 * The blue Jetta is starting
 * The red Porsche is accelerating
 * The blue Jetta is accelerating
 * The blue Jetta has stopped to have its emissions checked
 * The blue Jetta passes its emission test
 * The red Porsche is going 50 mph
 * The red Porsche is stopped
 * The blue Jetta just passed the red Porsche
 */
public class CarApp {

    public static void main(String[] args) {
        Car porsche = new Car("Porsche");
        porsche.setColor("red");
        println(porsche.starting());
        println(porsche.accelerate());
        println(porsche.setSpeed(50));
        println(porsche.stopped());
        println("");

        Car jetta = new Car();
        jetta.setMake("Jetta");
        jetta.setColor("blue");
        println(porsche.starting());
        println(jetta.starting());
        println(porsche.accelerate());
        println(jetta.accelerate());
        println(jetta.emissionChecked());
        println(jetta.passedEmissionTest());
        println(porsche.setSpeed(50));
        println(porsche.stopped());
        println(porsche.passed(jetta, porsche));

        List<Car> cars = new ArrayList<>();
        char choice = 'n';
        do{
            Car car = new Car();
            Scanner keyboard = new Scanner(System.in);
            //prompt from user and populate car class
            print("\nEnter make : ");
            car.setMake(keyboard.next());
            print("Enter model : ");
            car.setModel(keyboard.next());
            print("Enter color : ");
            car.setColor(keyboard.next());
            //add car to the cars arraylist
            cars.add(car);
            print("Do you want to enter another car? (y/n) ");
            choice = keyboard.next().charAt(0);
        } while (choice == 'y');

        //Finally, use an enhanced for loop to display all the cars.
        for (Car c : cars) {
            println(c.getDescription());
        }

        porsche.getDriver().setName("Bob");
        System.out.println(porsche.getDriverDetail());

    }

    public static void print(String string){
        System.out.print(string);
    }

    public static void println(String string){
        System.out.println(string);
    }
}
