package testRequirement;

import java.util.Arrays;

public class Solution {

    public static int greaterWithSameDigits(int n) {
        // Convert the number to an array of digits
        char[] digits = String.valueOf(n).toCharArray();

        // Find the first digit from the right that is smaller than its right neighbor
        int i = digits.length - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // If no such digit is found, it's not possible to find a greater number
        if (i < 0) {
            return -1;
        }

        // Find the smallest digit on the right side of digits[i] that is greater than digits[i]
        int j = digits.length - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Swap digits[i] with digits[j]
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Sort the digits after i in ascending order
        Arrays.sort(digits, i + 1, digits.length);

        // Convert the sorted digits back to a number
        int result = Integer.parseInt(new String(digits));
        return result;
    }


    public static void main(String[] args) {
        int[] numbers = {11, 22, 7, 23, 15, 129};
        for (int number : numbers) {
            System.out.println("El número: " + number + " más grande con los mismos dígitos es: " + greaterWithSameDigits(number));
        }
    }
}
