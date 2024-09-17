import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;
    public CoffeeDrink Order1;
    public CoffeeDrink Order2;

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 1975;
        System.out.println("We were founded in " + yearFounded + ".");

        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("Pumpkin Spice Latte");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
        Order1 = new CoffeeDrink(1, "caramel", true);
        Order2 = new CoffeeDrink(3, "mocha", false);

        // TODO
        // Print out the order details
        Order1.printInfo();
        System.out.println();
        Order2.printInfo();

    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        int randomInt;
        randomInt = (int)(Math.random()*31);
        System.out.println("We spun the discount wheel and you get " + randomInt + "% off!");
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String special) {
        // TODO
        System.out.println("Today's special is " + special + "!");
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:
        for(int x=1; x<6; x=x+1){
            System.out.println(x);
        }
        System.out.println();
        // Print 1 to 5

        for(int y=2; y<12; y=y+3){
            System.out.println(y);
        }
        System.out.println();
        for(int z=8; z>=0; z=z-1){
            System.out.println(z);
        }
        System.out.println();
        // Print 2, 5, 8, 11


        // Print 8 to 0

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        double randomDecimal = Math.random();
        if(randomDecimal<0.25){
            System.out.println("The barista recommends a Pumpkin Spice Latte");
        }else if(randomDecimal<0.5){
            System.out.println("The barista recommends an Iced Coffee");
        }else if(randomDecimal<0.75){
            System.out.println("The barista recommends an Iced Tea");
        }else{
            System.out.println("The barista recommends a refresher");
        }

        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
    }
}

