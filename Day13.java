/*Problem

	Given a Book class and a Solution class, write a MyBook class that does the following:

		Inherits from Book
		Has a parameterized constructor taking these  parameters:
			a. string title
			b. string author
			c. int price
		Implements the Book class' abstract display() method so it prints these  lines:
			a. Title:, a space, and then the current instance's title.
			b. Author:, a space, and then the current instance's author.
			c. Price, a space, and then the current instance's price.
*/

// Declaring class.
class MyBook extends Book{
// Declaring the price instance variable
    int price = 0;
    /**   
    *   Class Constructor
    *   
    *   @param title The book's title.
    *   @param author The book's author.
    *   @param price The book's price.
    **/
    MyBook(String title, String author, int price){
        super(title, author);
        this.price = price;
    }    
    /**   
    *   Method Name: display
    *   
    *   Print the title, author, and price in the specified format.
    **/
    void display(){
        System.out.println("Title:"+" "+title);
        System.out.println("Author:"+" "+author);
        System.out.println("Price:"+" "+price);
    }
    
}