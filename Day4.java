/* Problem
	Write a Person class with an instance variable, age, and a constructor that takes an integer,initialAge , as a parameter. 
	The constructor must assign initialAge to age after confirming the argument passed as initialAge is not negative; 
	if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0.
	In addition, you must write the following instance methods:

	1.yearPasses() should increase the  instance variable by .
	2.amIOld() should perform the following conditional actions:
		If age < 13 , print You are young..
		If age >= 13 and age < 18, print You are a teenager..
		Otherwise, print You are old.
*/

public class Person {
    private int age;

	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        this.age=initialAge;
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        if(this.age<0)
          { System.out.println("Age is not valid, setting age to 0.");
           this.age=0;
           amIOld();
          }
        else if(this.age<13)
            System.out.println("You are young.");
        else if(this.age<18)
            System.out.println("You are a teenager.");
        else if(this.age>=18)
            System.out.println("You are old.");
	}

	public void yearPasses() {
  		// Increment this person's age.
        this.age+=1;
	}