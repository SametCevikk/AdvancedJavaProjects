# Duplicate Letter Words

This Java program finds the first word in a given text that contains duplicate letters.

## How It Works
- The program takes a sentence as input.
- It splits the sentence into individual words.
- It checks each word for duplicate letters.
- If a word with duplicate letters is found, it returns that word.
- If no word contains duplicate letters, it returns `"None"`.

## Usage
1. Run the program.
2. Enter a sentence when prompted.
3. The program will return the first word with duplicate letters.

## Example
### Input:
Please enter text: Hello world
### Output :
Hello

## Notes
- This implementation returns only the first word that contains duplicate letters.
- The check is case-sensitive (e.g., "Hello" is different from "hello").
- If no word contains duplicate letters, the output is "None".
