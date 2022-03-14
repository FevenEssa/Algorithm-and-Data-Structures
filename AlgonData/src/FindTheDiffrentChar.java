import java.util.Arrays;

public class FindTheDiffrentChar {
    public static char findTheDifference(String s, String t) {
        int[] sCount = new int[26];
        int[] tCount = new int[26];

        Arrays.fill(sCount, 0);
        Arrays.fill(tCount, 0);

        for(int i=0; i<s.length(); i++){
            sCount[s.charAt(i)-'a']++;
        }
        for(int j=0; j<t.length(); j++){
            tCount[t.charAt(j)-'a']++;
        }
        for(int k=0; k<26; k++){
            if(tCount[k]>sCount[k]){
                return t.charAt(k);
            }

        }
        return 'e';
    }

    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";

        System.out.println(findTheDifference(s, t));
    }
}
