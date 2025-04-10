package sumFromString;

import java.util.Scanner;

public class SumFromString {

    public static int findNumbers(String str){
        int number = 0;
        int sum = 0;
        boolean isNumber=false;

        for(int i= 0; i<str.length();i++){
            char ch = str.charAt(i);

            //ASCII
            if(ch>='0' && ch <= '9'){
                number = number * 10 + (ch - '0');
                isNumber=true;
            }else {
                if(isNumber){
                    sum+= number;
                    number=0;
                    isNumber=false;
                }
            }
        }
        if(isNumber){
            sum+=number;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a text:  ");
        System.out.println(findNumbers(scanner.nextLine()));
    }
}
