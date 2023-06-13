package classes;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Deque;
import java.util.ArrayDeque;

public class BraceCompiler {
    public static List<String> braces(String[] values) {
        List<String> result = new ArrayList<>();

        for (String value : values) {
            if (isBalanced(value)) {
                result.add("YES");
            } else {
                result.add("NO");
            }
        }

        return result;
    }

    private static boolean isBalanced(String value) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : value.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        String[] values = {"{}[]", "()", "{[]}"};
        List<String> result = braces(values);
        for (String str : result) {
            System.out.println(str);
        }
    }
}

