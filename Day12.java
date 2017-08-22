/*Problem
	You are given two classes, Person and Student, 
	where Person is the base class and Student is 
	the derived class. Completed code for Person and
	a declaration for Student are provided for you in 
	the editor. Observe that Student inherits all the properties of Person.

	Complete the Student class by writing the following:

	A Student class constructor, which has  parameters:
	A string, firstName.
	A string, lastName.
	An integer, id.
	An integer array (or vector) of test scores, scores.
	
	A char calculate() method that calculates a Student 
	object's average and returns the grade character representative
	of their calculated average.
*/

class Student extends Person{
	private int[] testScores;
    

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    //@Override
    Student(String firstName, String lastName, int identification,int[] scores){
            super(firstName, lastName, identification);
            this.testScores = scores;        
    }
     public String calculate(){
         int average = 0;
         for(int j = 0; j<testScores.length; j++){
             average = average + testScores[j];
         }
         int total = testScores.length;
         average = average/(total);
         if(average >= 90 && average <= 100)
             return "O";
         if(average>=80 && average <90)
             return "E";
         if(average>=70 && average <80)
             return "A";
         if(average>=55&&average<70)
             return "P";
         if(average>=40&&average<55)
             return "D";
         else{
             return "T";
         }
     }
}