
/**
 * Write a description of class SecretWord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class SecretWord
{
    String[] words = { "bike", "door", "flower", "coffee", "table" };
    String secretWord;                  // randomly chosen secret word
    char[] guessedLetters;              // letters array to record guesses (max 100)
    int guesses;                        // total number of guesses
    int badGuesses;                     // total number of guesses that are not in secret word
    int maxGuesses;                     // maximum bad guesses allowed
    

    // Create new SecretWord object
    // set secretWord, guessedLetters, guesses, maxGuesses and badGuesses
    SecretWord()
    {
        // TODO
    }

    // return true if the given letter is in secretWord
    boolean letterInSecretWord(char letter)
    {
        // TODO
        return false;
    }
    
    // return true if given letter is already in guessedLetters
    boolean letterAlreadyGuessed(char c)
    {
        // TODO
        return false;
    }

    // return true if all the letters in the secretWord
    // are also in the array guessedLetters
    boolean gotAllLetters()
    {
        // TODO
        return true;
    }

    // print the secret word using blanks
    // door is printed as _ _ _ _
    // when 'o' has been guessed, it is printed as _ o o _
    void displaySecretWithBlanks()
    {
        // TODO
    }

    // prompt the user and return a single char
    // make sure the char is in the range a-z
    // prompt user multiple times if input is bad
    char promptAndGetLetter()
    {
        // TODO - fix return
        return 'a';
    }

    // play the SecretWord game
    void play()
    {
        System.out.println("Welcome to SecretWord");
        while ((badGuesses < maxGuesses) && (! gotAllLetters()))
        {
            displaySecretWithBlanks();
            System.out.println(maxGuesses - badGuesses + " guesses left");;
            char letter = promptAndGetLetter();
            if (letterInSecretWord(letter))
            {
                System.out.println("Good guess, " + letter);
                // TODO
            }
            else
            {
                System.out.println("Bad guess, " + letter);
                // TODO
            }
        }
        System.out.println("The answer was: " + secretWord);
        if (gotAllLetters())
            System.out.println("Congratulations!!!");
        if (badGuesses == maxGuesses)
            System.out.println("You lost :-(");

    }

    public static void main(String[] args)
    {
        SecretWord game = new SecretWord();
        game.play();
    }
}
