# Hangman Game 🕹️

A classic Hangman game built in Java.

The game selects a random word from a text file, and you have to guess it letter by letter. You get 6 wrong guesses before the game ends.

## ✨ Features

- 🔠 **Random Word Selection**

  Words are loaded from a plain text file (`Hangman.txt`).

- 🎨 **ASCII Art Stages**  

  As the player makes mistakes, different stages of the Hangman are drawn in the console using ASCII characters. The game ends with a full stick figure after 6 wrong guesses.

- 💻 **No External Libraries**  

  Entirely built using Java's standard libraries.

## 🚀 How to Run

1. **Download or Clone the Repository**
   ```
   git clone https://github.com/muhammad-mahirr/hangman-java-game.git
   
2. **Edit Word List (Optional)**
   Open Hangman.txt and modify the words as you like. Use one word per line. Like this:
   ```
   apple
   banana
   chicken
   ```
3. **Ensure `Hangman.txt` is in the Same Directory as `HangmanGame.java`.**
4. **Open Command Prompt (Windows) or Terminal (Mac/Linux)**

   Navigate to the directory where HangmanGame.java is located.

   Compile the program:
   ```
   javac HangmanGame.java
   ```
   Run the program:
   ```
   java HangmanGame
   ```
5. **You can also copy the code and paste it into any online Java compiler to run the game easily**

   Just make sure to add or simulate the Hangman.txt word list if the compiler allows file input.   

## 🎮 How to Play

- Run the game in a terminal or console.
- Type one letter at a time to guess the hidden word.
- After 6 wrong guesses, the game ends.


