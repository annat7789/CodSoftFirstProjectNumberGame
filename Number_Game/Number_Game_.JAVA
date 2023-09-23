
import java.util.Random;
import java.util.Scanner;


class NumberGame{
    public int number;
    public int inputNumber;
    public int noOfGuesses;

    public int getNoofGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses= noOfGuesses;
    }

    
      NumberGame(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    int takeUserInput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
        return inputNumber;


    }
    boolean isCorrectNumber(int num){
        if (num==number){
            return true;
        }
        else if (num<number){
            System.out.println("Too less... ");
            
        }
        else if(num>number){
            System.out.println("Too high..");
        }
        return false;

        }

    }
}
public class Number_Game{
    public static void main(String[] args) {
        
        NumberGame ng = new NumberGame();
        int userInput = ng.takeUserInput();
       boolean b = ng.isCorrectNumber(userInput);
       System.out.println(b);
        
    }
}