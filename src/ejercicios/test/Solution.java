package ejercicios.test;

public class Solution {
 /*
 * */
    public static boolean solution(String S) {
        int countA = 0;
        int countB = 0;

        for (char c : S.toCharArray()) {
            if (c == 'a' && countB == 0 ) {
                countA++;
            } else if (c == 'b') {
                countB++;
                if(S.length()<=1) {
                    return true;
                }  else if (countA == 0) {
                    return false; // 'b' occurred before 'a'
                }
            } else {
                return false; // String contains characters other than 'a' and 'b'
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(solution("aabbb")); // true
        System.out.println(solution("ba")); // false
        System.out.println(solution("aaa")); // true
        System.out.println(solution("b")); // true
        System.out.println(solution("abba")); // false
    }
}
