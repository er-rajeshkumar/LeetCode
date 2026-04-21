class Solution {
    public static void result(String digits, String letters, List<String> res){
        if(digits == ""){
            res.add(letters);
            return;
        }
        String newStr = digits.substring(1, digits.length());
        if(digits.charAt(0) == '2'){
            result(newStr, letters + "a", res);
            result(newStr, letters + "b", res);
            result(newStr, letters + "c", res);
        }else if(digits.charAt(0) == '3'){
            result(newStr, letters + "d", res);
            result(newStr, letters + "e", res);
            result(newStr, letters + "f", res);
        }else if(digits.charAt(0) == '4'){
            result(newStr, letters + "g", res);
            result(newStr, letters + "h", res);
            result(newStr, letters + "i", res);
        }else if(digits.charAt(0) == '5'){
            result(newStr, letters + "j", res);
            result(newStr, letters + "k", res);
            result(newStr, letters + "l", res);
        }else if(digits.charAt(0) == '6'){
            result(newStr, letters + "m", res);
            result(newStr, letters + "n", res);
            result(newStr, letters + "o", res);
        }else if(digits.charAt(0) == '7'){
            result(newStr, letters + "p", res);
            result(newStr, letters + "q", res);
            result(newStr, letters + "r", res);
            result(newStr, letters + "s", res);
        }else if(digits.charAt(0) == '8'){
            result(newStr, letters + "t", res);
            result(newStr, letters + "u", res);
            result(newStr, letters + "v", res);
        }else if(digits.charAt(0) == '9'){
            result(newStr, letters + "w", res);
            result(newStr, letters + "x", res);
            result(newStr, letters + "y", res);
            result(newStr, letters + "z", res);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        result(digits, "", res);
        return res;
    }
}