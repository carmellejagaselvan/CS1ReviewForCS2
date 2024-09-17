// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int pNumberOfCups, String pFlavor, boolean pHasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        numberOfCups = pNumberOfCups;
        flavor = pFlavor;
        hasWhippedCream = pHasWhippedCream;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        System.out.println("Number of cups: " + numberOfCups);
        System.out.println("Flavor: " + flavor);
        System.out.println("Has whipped cream: " + hasWhippedCream);
        // Include information stored in each variable.

    }
}
