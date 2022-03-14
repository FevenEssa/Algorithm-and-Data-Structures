public class SpecialString {
    static long substrCount(int n, String s) {
        char[] charArray = s.toCharArray();
        long count = n;
        for (int i = 0; i < n; i++) {
            int repeat = 0;
            while (i + 1 < n && charArray[i] == charArray[i + 1]) {
                repeat++;
                i++;
            }
            count += (repeat * (repeat + 1)) / 2;

            int pointer = 1;
            while (i - pointer >= 0 && i + pointer < n && charArray[i - pointer]
                    == charArray[i - 1] && charArray[i + pointer] == charArray[i - 1]) {
                pointer++;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "mnonpopnopoo";
        int n = str.length();
        System.out.println("Total # of substring: " + substrCount(n, str));
    }
}
