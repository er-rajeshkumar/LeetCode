class Solution {
    public boolean isValid(String s) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr =='(' || curr ==  '[' || curr ==  '{' ){
                sb.append(curr);
            }else{
                if(sb.isEmpty()){
                    return false;
                }
                if(curr == ')' && sb.charAt(sb.length()-1)!= '(')
                    return false;
                if(curr == ']' && sb.charAt(sb.length()-1)!= '[')
                    return false;
                if(curr == '}' && sb.charAt(sb.length()-1)!= '{')
                    return false;

                sb.deleteCharAt(sb.length() - 1);
            }
        }

        if(sb.isEmpty()){
            return true;
        }
        return false;

        /*
        Stack<Character> stack = new Stack<>();
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

        */
    }
}