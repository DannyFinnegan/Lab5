package Lab5;

import jdk.swing.interop.SwingInterOpUtils;

public class ReverseWord {
    public static void main(String[] args) {
        String word = "Hello!";
        String word1 = wordReverse(word);
        System.out.println(word1);//!olleH
        word = "!";
        word1 = wordReverse(word);
        System.out.println(word1);//!
        word = "";
        word1 = wordReverse(word);
        System.out.println(word1);// no output
    }


    public static String wordReverse(String word) {
        if (word.length() > 0) {
            return wordReverse(word.substring(1)) + word.charAt(0);
        }
        return "";
    }
}