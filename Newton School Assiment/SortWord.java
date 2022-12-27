// Sort Words
// easy
// Time Limit: 2 sec
// Memory Limit: 128000 kB
// Problem Statement
// Given a sentence, your task is to print the sentence with its words present in a sorted manner.
// For eg:- The sentence:- "i am a rockstar developer" will be printed as "a am developer i rockstar"
// Input
// The Input contains only a sentence.

// Constraints:-
// Total characters present in the sentence will be less than equal to 1000

// Note:- The sentence will contain only lowercase English letters.
// Output
// Print the given sentence with the words present in the sorted order.
// Example
// Sample Input:-
// i am a rockstar developer

// Sample Output:-
// a am developer i rockstar


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();  //"i am a rockstar devloper"
        String[] result= text.split(" ",-1);
        //split String for space
        Arrays.sort(result);//System.out.print(result=)
        // for(String str:result)
        int n=result.length;
        for(int i=0;i<n;i++){
            System.out.print(result[i]);
            if(i!=n-1)System.out.print(" ");
        }
    }
}