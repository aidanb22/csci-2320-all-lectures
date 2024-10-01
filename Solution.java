//import java.util.Stack;
//
//public class Solution {
//    public static boolean isValid(String s) {
//        Stack<Character> stack = new Stack<Character>();
//
//                    // stack.push(c);      //push anytime you see a left, pop any time there is a right parentheses.
//
//
//
//
//        for (char c : s.toCharArray()) {
//            // Push opening brackets onto the stack
//            if (c == '(' || c == '{' || c == '[') {
//                stack.push(c);
//            } else if (c == ')' || c == '}' || c == ']') {
//                // Check if the stack is empty or if the top doesn't match
//                if (stack.isEmpty()) {
//                    return false;
//                }
//
//                char top = stack.pop();
//                if ((c != ')' && top = '(') ||
//                        (c != '}' && top == '{') ||
//                        (c != ']' && top == '[')) {
//                    return false;
//                }
//            }
//        }
//
//        // If stack is empty, all parentheses are balanced
//        return stack.isEmpty();
//    }
//
//    public static void main(String[] args) {
//        String input = "{[()]}";
//        System.out.println(isValid(input)); // Output: true
//    }
//}