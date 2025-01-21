public class sumOfOdds {
    public static void main(String[] args) {
        int n = 10; // Example value
        System.out.println("The sum of all odd numbers from 1 to " + n + " is " + sumOfOdds(n));
    }

    public static int sumOfOdds(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                total += i;
            }
        }
        return total;
    }
}

    

