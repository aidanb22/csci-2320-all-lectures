//
//import java.util.Stack;
//
//public class SolutionTeacherHelp {
//
//    public boolean isValid(String s) {
//        if(s.length() <= 1 ){
//            return false; // cannot be matching
//        }
//
//        Stack<Character> stack = new Stack<Character>();
//
//        for(int i = 0; i <= s.length(); i++){
//            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
//                stack.push(s.charAt(i));
//            }
//            else {
//                if(s.charAt(i) == ')'){ //if certain element is a )
//                    if(stack.pop() != '('){ // if the next element is not a (
//                        return false;   //its wrong
//                    }
//                }
//                if (s.charAt(i) == ']'){
//                    if(stack.pop() != '['){
//                        return false;
//                    }
//                }
//                if(s.charAt(i) == '}'){
//                    if(stack.pop() != '{'){
//                        return false;
//                    }
//                }
//            }
//        }
//    }
//
//}
