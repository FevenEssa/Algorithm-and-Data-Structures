public class StringPalendrome {
    public static boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();

        int l=0;
        int r=s.length()-1;
        boolean result = true;
        while(l<r){
            if(s.charAt(l) != s.charAt(r))
            {
                result = false;
                break;
            }
            else{
                l++;
                r--;
            }
        }
        return result;
    }

    public static boolean validPalindrome(String s) {
        int l=0;
        int count =0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r) ){
                if(s.charAt(l) == s.charAt(r-1)){
                    r--;
                    count++;
                }
                else if(s.charAt(l+1) == s.charAt(r)){
                    l++;
                    count++;
                }/*else
                    return false;*/
            }
            else{
                l++;
                r--;
            }
        }
        if(count >1)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        String s ="A man, a plan, a canal: Panama";
        String str = "ebcbbececabbacecbbcbe";
       // System.out.println(isPalindrome(s));
        System.out.println(validPalindrome(str));
    }
}
