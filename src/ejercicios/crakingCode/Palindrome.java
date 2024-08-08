package ejercicios.crakingCode;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){
        String[] palabras={"edgar", "pepe","occo","cristian","oppo"};
        for(String palabra: palabras){
            System.out.println(palabra+" is palindrome?"+isPalindrome(palabra));
        }

    }

    public static Boolean isPalindrome(String s){
        boolean result;
        if(s.length()==1){
            result=true;
        }else if(s.length()==2){
            result= s.charAt(0)==s.charAt(1) ? true : false;
        }else {
            result=s.charAt(0)==s.charAt(s.length()-1) && isPalindrome(s.substring(1,s.length()-1));//s.substring(1,s.length()-1) significa que se toma la palabra desde el segundo caracter hasta el penultimo
        }
        return result;
    }


}
