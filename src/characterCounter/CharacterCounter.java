package characterCounter;

import java.util.Scanner;

public class CharacterCounter {

    public static String countCharacter(String str){
        StringBuffer sb = new StringBuffer();
        int counter=1;
        char currentChar=str.charAt(0);
        for(int i=0;i<str.length();i++){
            if(currentChar==str.charAt(i)){
                counter++;
            }else{
                sb.append(counter).append(currentChar);
                counter=1;
                currentChar=str.charAt(i);
            }
        }
        sb.append(counter).append(currentChar);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter string: ");
        System.out.println(countCharacter(scanner.nextLine()));
    }
}
