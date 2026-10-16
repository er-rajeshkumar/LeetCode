class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] open = {'(', '[', '{'};
        char[] close = {')', ']', '}'};
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr =='(' || curr ==  '[' || curr ==  '{' ){
                stack.push(curr);
            }else {
                if(stack.empty()){
                    return false;
                }
                if(curr == ')' && stack.pop() != '(')
                    return false;
                if(curr == ']' && stack.pop() != '[')
                    return false;
                if(curr == '}' && stack.pop() != '{')
                    return false;
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}