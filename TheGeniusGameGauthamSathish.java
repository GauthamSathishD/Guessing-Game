/*Gautham Sathish-The Genius Game
The purpose of this assignment is to demonstrate my knowledge and understanding of arrays.
 */
package thegeniusgame.gauthamsathish;

import java.util.Scanner;
import java.lang.Math.*;//Imports the java math class


public class TheGeniusGameGauthamSathish {

     private static int updateBoard(char[] secretCode, char[] userGuessArray, int codeLength) {//Method for finding how many matches there are between the guess and the secretcode
         int counter = 0;//Sets a counter to 0
         for (int x = 0; x < codeLength; x++) {//Creates a variable 'x' that counts up by 1 until it reaches the value of 'codeLength'
                if(userGuessArray[x] == secretCode[x]){//If the users guess at the index position is equal to the secret code at that position:
                    counter++;//Adds one to the counter
                }
            }
        return counter;//Returns 'counter' variable to be used anywhere in the program
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char gameDecision = 'y';//To start the game, the variable 'gameDecision' is set to 'y'
        while (gameDecision == 'y') {//All the code that occurs inside this while statement, happens when 'gameDecision' is set to 'y'
            System.out.println("***THE GENIUS GAME***");
            System.out.println("How Many Letters In A Guess?");//Asks how many letters the user would like in their guess
            int codeLength = keyboard.nextInt();//Player enters how many letters they would like the secret code to be, this is assigned to the 'codeLength' variable
            char[] secretCode = new char[codeLength];//Creates a char array for the secret code
            for (int index = 0; index < codeLength; index++) {// Creates an index integer that adds one to itself, until it is equal to the length of the secret code
                int randomNumber = (int) (Math.random() * 3);//Creates a random number between 0 and 2, and assigns it to 'randomNumber'
                char randomChar = 0;//Sets a variable named 'randomChar' to 0
                if (randomNumber == 0) {//If the random number is 0, 'randomChar' is set to 'b'
                    randomChar = 'b';
                }
                if (randomNumber == 1) {//If the random number is 1, 'randomChar' is set to 'g'
                    randomChar = 'g';
                }
                if (randomNumber == 2) {//If the random number is 2, 'randomChar' is set to 'r'
                    randomChar = 'r';
                }
                secretCode[index] = randomChar;//Sets the index slot to the 'randomChar' value
            }
            System.out.println(secretCode);//Prints out the secret code for marking purposes
            
            char[] userGuessArray = new char[codeLength];//Creates a char array containing the users guess
            int round = 1;//Sets a 'round' variable to 1
            
            while(updateBoard(secretCode,  userGuessArray, codeLength)!=codeLength){//While the value of this method is not equal to the length of the secret code, execute all the code below
            int correct = updateBoard(secretCode,  userGuessArray, codeLength);//Sets an integer named 'correct' to the return value of the method: updateBoard(secretCode,  userGuessArray, codeLength)
            int incorrect = codeLength-correct; //Sets an integer named 'incorrect' to the value of 'codeLength' subtract the value of 'correct' 
            for(int m = 0; m<50; m++){//Sets an integer named 'm' to 0 and adds one to the variable until it reaches the value of 59
            System.out.print(" ");//Prints out " " 
                    }
            if(userGuessArray.length==0){//This code executes if the value of the 'userGuessArray' is 0
            for(int r = 0; r<codeLength; r++){//Sets an integer named 'r' to 0, and adds one to the variable until it reaches the value of 'codeLength'
            System.out.printf("| ");//Prints out "|" 
                    }System.out.print("|");//Prints out "|" for the end
            }
            for (int u=0; u<userGuessArray.length; u++){//Sets an integer named 'u' to 0 and adds one to the variable until it reaches the value of 'userGuessArray'
                System.out.printf("| %c ", userGuessArray[u]);//Prints out a '|' then fills in the corresponding character                 
            }System.out.print("|");//Prints out a '|' for the end
            System.out.printf("%7d correct, %d incorrect",correct, incorrect);//Prints out the amount of correct and incorrect guesses
            System.out.println();//Empty println 
            System.out.printf("Round: %d Please guess %d characters rgb:",round, codeLength);//Prints out "Round: x Please guess x characters rgb:"
            
            String userGuess = keyboard.next();//Allows the user to type in their guess
            round++;//Adds one to the variable 'round' 
            for (int i = 0; i < codeLength; i++) {//Sets an integer named 'r' to 0 and adds one to the variable until it reaches the value of 'codeLength'
                userGuessArray[i] = userGuess.charAt(i);//Updates the value of the array to the latest guess
            }}
            round--;//Keeps the round value to the last round
             for(int m = 0; m<50; m++){//Sets an integer named 'm' to 0 and adds one to the variable until it reaches the value of 59
            System.out.print(" ");//Prints out " " 
                    }
             for (int u=0; u<userGuessArray.length; u++){//Sets an integer named 'u' to 0 and adds one to the variable until it reaches the value of 'userGuessArray'
                System.out.printf("| %c ", userGuessArray[u]);//Prints out a '|' then fills in the corresponding character                 
            }System.out.print("|");//Prints out a '|' for the end
            System.out.printf("%7d correct, %d incorrect",codeLength, 0);//Prints out the amount of correct and incorrect guesses
            System.out.println();//Empty println 
            System.out.println("You won in "+round+" rounds!");//Prints out how many rounds the player has won in
            System.out.println("Would you like to play again?(y/n)");// Asks the player if they would like to play again
            gameDecision = keyboard.next().charAt(0);//They enter 'y' if they like to play again and 'n' if not
            if (gameDecision == 'n') {//if they say no
                System.out.print("Thanks For Playing!");//end of game
            }//if(gameDecision == 'n')
        }//while (gameDecision == 'y')
    }//public static void main(String[] args)
}//public class TheGeniusGameGauthamSathish


