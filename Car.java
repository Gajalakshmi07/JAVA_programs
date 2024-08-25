 package ex;

public class Car {
	    // Attributes of the Car class
	    String model;
	    String color;

	    // Constructor to initialize the Car object
	    public Car(String model, String color) {
	        this.model = model;
	        this.color = color;
	    }

	    // Method to start the car
	    public void start() {
	        System.out.println("The " + color + " " + model + " is starting.");
	    }

	    // Method to stop the car
	    public void stop() {
	        System.out.println("The " + color + " " + model + " is stopping.");
	    }

	    // Main method to demonstrate the Car class
	    public static void main(String[] args) {
	        // Create a new Car object
	        Car myCar = new Car("Toyota Corolla", "Red");

	        // Start the car
	        myCar.start();

	        // Stop the car
	        myCar.stop();
	    }
	}
