public class Chapter04 {
    public static void main(String[] args) {
        // 3번
        int sum = 0;

        for (var i=0; i<=100; i++) {
            if (i%3 == 0) sum += i;
        }
        System.out.println(sum);
    }
}
