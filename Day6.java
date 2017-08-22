/*Problem

	Given a string,S, of length N that is indexed from 0 to N-1 , 
	print its even-indexed and odd-indexed characters as 2 space-separated 
	strings on a single line.

	Note: 0 is considered to be an even index.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] arr = new String[num+1];
		//Taking inputs and storing them into an array
        for(int i=0;i<=num;i++){
            arr[i]=scan.nextLine();
        }
		//Looping through array and printing even-indexed characters
        for(int i=1; i<=num;i++){
            for(int j=0;j<arr[i].length();j=j+2){
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
		//Looping through array and printing even-indexed characters
            for(int j=1;j<arr[i].length();j=j+2){
                System.out.print(arr[i].charAt(j));
            }
            System.out.println(" ");
        }
        
    }
}