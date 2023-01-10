public class leet {
    //longest substring without repeating characters
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(q3(s));

    }
    static int q3(String s){
        int ans = 0;
        int count = 1;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length() - 1; j++){
                int a = s.charAt(j);
                int b = s.charAt(j + 1);
                if(b == a + 1){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count > ans){
                ans = count;
            }
            count = 0;
        }
        return ans;

    }
}
