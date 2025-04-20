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

# My List Class 

This project is a custom implementation of a generic dynamic array class called `MyList`, similar to Java's built-in `ArrayList`. It supports basic list operations such as adding, removing, retrieving, and checking elements, as well as managing capacity internally.

## 📦 Features

- Add, get, and remove elements
- Automatically resizes the array when needed
- Get list size and capacity
- Check if the list contains an element
- Clear the list
- Convert to array
- Create sublists
- Check if the list is empty
- Find first and last index of an element


## 🔧 How to Use

1. Clone the repository or download the files.
2. Open the project in any Java IDE (e.g., IntelliJ IDEA, Eclipse) or compile via terminal.
3. Run `MyListTest` to test the functionality.

### Example

```java
MyList<Integer> list = new MyList<>();
list.add(10);
list.add(20);
list.add(30);
System.out.println(list.toString()); // Output: [10, 20, 30]

list.remove(1);
System.out.println(list.toString()); // Output: [10, 30]

System.out.println(list.contains(30)); // Output: true
```

## 🧪 Sample Output from MyListTest.java
```
 Number of Elements in the Array : 0
Capacity of the Array : 10
Number of Elements in the Array : 4
Capacity of the Array: 10
Number of Elements in the Array : 11
Capacity of the Array : 20
-------------------------------------------------------------
Value in 2nd index : 30
Value in 2nd index : 40
[100, 20, 40]
-------------------------------------------------------------
List Status : Empty
List Status : Not Empty
Index : 1
Index :-1
Index : 4
First element of the Object array :10
[10, 20, 30]
Value 20 on list : true
Value 20 on list : false
[]
```
## 📘 Notes

- The generic implementation uses Object[] internally, so type casting is done where necessary.
- Capacity doubles automatically when the array is full.

# Character Counter

A simple Java program that counts consecutive repeated characters in a string and summarizes them in the format: **count + character**.  
For example, `"aaabbccccd"` becomes `"3a2b4c1d"`.

## 💡 What It Does

The program takes an input string and compresses it by counting consecutive repeating characters. This is a basic implementation similar to **run-length encoding**.

## 🧪 Example

### Input:
```
aaabbccccd
```

### Output:
```
3a2b4c1d
```

## 📝 Notes
- Only counts consecutive character repetitions.
- Case-sensitive: aaAA becomes 2a2A

# SumFromString

**SumFromString** is a Java program that extracts all numbers from a given string and returns their sum. It processes a user-provided text, finds all the numbers within, and calculates their total.

## Features

- Extracts all numbers from the input string.
- Sums the extracted numbers.
- Displays the total sum.

## Usage

### Steps

1. When the program is run, the user is prompted to enter a text.
2. All numbers in the entered text are identified and summed.
3. The total sum is displayed.

### Example

#### Input:
- abc123def45gh6
#### Output:
- 174


### Running the Code

1. Download or clone this repository to your computer.
2. Open the `SumFromString.java` file in a Java IDE (e.g., IntelliJ IDEA or Eclipse).
3. Run the program.
4. You will be prompted to enter a text, and the program will display the sum of all numbers found in the text.

## Code Explanation

### `findNumbers` Method

This method identifies all the numbers in a given string and sums them.

- **Variables:**
  - `number`: Temporarily stores numbers as they are found.
  - `sum`: Stores the cumulative sum of all numbers found.
  - `isNumber`: Tracks whether the current character is part of a number.
  
- **Loop:**
  - Each character in the string is checked.
  - If the character is a digit (0-9), it is added to `number`.
  - If the character is not a digit, and a number has been formed, that number is added to `sum`.
  
- **Result:**
  - After processing all characters, the total sum (`sum`) is returned.

### `main` Method

- The program prompts the user for a string input.
- The input string is passed to the `findNumbers` method, and the result is printed to the console.




