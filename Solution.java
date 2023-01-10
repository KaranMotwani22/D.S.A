class Solution {
    public static void main(String[] args) {
        String s = "a man      is si nama";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
       s = s.toLowerCase();
        s = s.replaceAll("\\p{Punct}", "");
        s = s.replaceAll("\\s", "");
        int i = 0;
        while(i <= s.length()/2){
            if(s == null || s.length() == 0){
                return true;
            }
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)){
             return false;   
            }
            i++;
        }
        return true;
        
    }
}