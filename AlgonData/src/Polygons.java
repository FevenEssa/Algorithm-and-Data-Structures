public class Polygons {
    public static int polygons(int n){
        if (n == 1)
            return 1;
        return 2*(n + 1) + n -1 + n + polygons(n-1);
    }

    public static void main(String[] args) {
        System.out.println(polygons(2));
    }
}
