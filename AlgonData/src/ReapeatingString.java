public class ReapeatingString {
    public static long repeatedString(String s, long n) {
        // Write your code here
        long count=0;
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a')
                count++;
        }
        count=count * (int)(n/s.length());

        for(int i=0; i<(n%s.length()); i++)
        {
            if(s.charAt(i)=='a')
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "abab";

        long n = 1000000000;
        System.out.println(repeatedString(str, n));
    }
}
