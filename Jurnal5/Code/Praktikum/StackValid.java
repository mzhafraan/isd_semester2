import java.util.Stack;
public class StackValid {
    public static void main(String[] args) {
        StackValid solution = new StackValid();
        System.out.println(solution.isValid("[({})]"));
        System.out.println(solution.isValid("[(}"));
        System.out.println(solution.isValid("()"));
        System.out.println(solution.isValid("[{()}]"));
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '('){
                stack.push(')');
            } else if (c == '{'){
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}