/* Problem:
	Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), 
	and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost.
*/

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		//Cost of the meal
        double mealCost = scan.nextDouble();
		//Percentage of tip given for the meal
        int tipPercent = scan.nextInt(); 
		//Percentage of tax in the region
        int taxPercent = scan.nextInt(); 
		//Closing scanner, finishing the task of taking inputs from the user
        scan.close();
        // Calculating the total cost for the meal.
        double tax = (taxPercent/100.0)*mealCost;
        double tip = (tipPercent/100.0)*mealCost;
        mealCost = mealCost + tip + tax;
        // Casting the result of the rounding operation to an int and saving it as totalCost 
        int totalCost = (int) Math.round(mealCost);
        // Printing the total cost of the meal
        System.out.println("The total meal cost is"+" "+ totalCost +" " + "dollars.");
    }
}
