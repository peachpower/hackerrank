/* Problem
	Given n names and phone numbers, assemble a phone book that maps friends' names 
	to their respective phone numbers. You will then be given an unknown number of 
	names to query your phone book for. For each name queried, print the associated entry 
	from your phone book on a new line in the form name=phoneNumber; if an entry for  
	name is not found, print Not found instead.
	
	Note: Your phone book should be a Dictionary/Map/HashMap data structure.
*/

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
		//Creating a HashMap to store keys and values 
        HashMap<String,Integer> dict = new HashMap<String, Integer>();
		//Initializing Scanner
        Scanner in = new Scanner(System.in);
		//Taking in number of names and phone numbers to be stores
        int n = in.nextInt();
		//Looping through the user input and storing them
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            dict.put(name,phone);
        }
		//While values exist, print the entry
        while(in.hasNext()){
            String s = in.next();
            if(dict.containsKey(s)){
                System.out.println(s+"="+dict.get(s));
            }
            else
                System.out.println("Not found");
        }
        in.close();
    }
}

