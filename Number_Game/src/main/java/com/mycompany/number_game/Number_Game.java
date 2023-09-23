
package com.mycompany.number_game;


import java.util.Random;
import java.util.Scanner;

class NumberGame{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses= noOfGuesses;
    }

    
      NumberGame(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in); 
        inputNumber = sc.nextInt();
        sc.close();

   }
   boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("yes you guessed it right, it was %d\n you guessed it in %d attempts",number,noOfGuesses);
            return true;
        }
        else if (inputNumber < number){
            System.out.println("Too less... ");
            
        }
        else if(inputNumber > number){
            System.out.println("Too high..");
        }
        return false;

        }

    }

public class Number_Game{
    public static void main(String[] args) {
        
        NumberGame ng = new NumberGame();
        boolean b = false;
        while(!b){
        ng.takeUserInput();
        b = ng.isCorrectNumber();
       System.out.println(b);
     }

    

   }
}