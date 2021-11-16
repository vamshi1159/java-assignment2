package Assignment2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        System.out.println("Is the input contains all letters of alphabets ?: "+IsContainsAllAlphabets(input.toLowerCase()));
    }
    public static boolean IsContainsAllAlphabets(String input) {

        boolean[] visited = new boolean[26];

        for (int index = 0; index < input.length(); index++) {
            if(Character.isAlphabetic(input.charAt(index))) {
                visited[input.charAt(index) - 'a'] = true;    //checks for index of the alphabet and points true
            }
        }
        for (int index = 0; index < 26; index++) {
            if (!visited[index]) {
                return false;
            }
        }
        return true;
    }
}
//space complexity is o(n) and time complexity o(n)