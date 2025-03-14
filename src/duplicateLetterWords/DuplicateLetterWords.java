package duplicateLetterWords;

import java.util.Scanner;

public class DuplicateLetterWords {

    public static String findDublicateLetter(String text){

        String[] words = text.split(" ");

        for(String word : words){
            for(int i = 0 ; i <= word.length();i++){
                for(int j = i+1 ; j < word.length(); j++){
                    if(word.charAt(i) == word.charAt(j)){
                        return word;
                    }
                }
            }
        }

        return "None";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter text ");
        String text = scanner.nextLine();
        System.out.println(findDublicateLetter(text));


    }
}
