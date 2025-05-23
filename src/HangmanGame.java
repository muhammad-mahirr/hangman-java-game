import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
	public static void main(String[]args){
		
		String filePath = "assets/Hangman.txt";
		ArrayList<String> words = new ArrayList<>();
		
		try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line;
			
			while((line = reader.readLine()) != null){
				words.add(line.trim());
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Couldn't found the file");
		}
		catch(IOException e){
			System.out.println("Something went wrong");
		}
		
		Random random = new Random();
		
		String word = words.get(random.nextInt(words.size()));
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Character> wordState = new ArrayList<>();
		int wrongGuesses = 0;
		
		for(int i = 0; i < word.length(); i++){
		    wordState.add('_');
		}
		
		System.out.println("Welcome To Hangman Game");
		
		while(wrongGuesses < 6){
		
		System.out.print(getHangmanArt(wrongGuesses));
		
		System.out.print("Word: ");
		
		for(char c : wordState){
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		if(!wordState.contains('_')){
			System.out.println("Winner Winner!! Hurraaahhhhh");
			break;
		}
		
		System.out.print("Guess a word: ");
		char guess =scanner.next().toLowerCase().charAt(0);
		
		if(word.indexOf(guess) >= 0){
			
			for(int i = 0; i < word.length(); i++){
				if(word.charAt(i) == guess){
					wordState.set(i, guess);
				}
			}
			
		}
		else{
			wrongGuesses++;
			System.out.println("\nWrong Answer!!");
		}
		}
		
		if(wrongGuesses == 6){
			System.out.print(getHangmanArt(6));
			System.out.println("Game Over!!");
			System.out.println("Correct word is " + word);
		}
		
		scanner.close();
	}
	static String getHangmanArt(int wrongGuesses){
		return switch(wrongGuesses){
			case 0 ->"""


			
			         """;
			case 1 ->"""
			          o
			
			
			         """;
			case 2 ->"""
			          o
			          |
			           
			         """;
			case 3 ->"""
			          o
			         /|
			           
			         """;
			case 4 ->"""
			          o
			         /|\\
			           
			         """;
			case 5 ->"""
			          o
			         /|\\
			         / 
			         """;
			case 6 ->"""
			          o
			         /|\\
			         / \\ 
			         """;					 
			default ->"";		 
		};
	}
}