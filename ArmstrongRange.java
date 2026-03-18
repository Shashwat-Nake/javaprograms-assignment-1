public class ArmstrongRange {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            int sum = 0, temp = i;

            while (temp != 0) {
                int d = temp % 10;
                sum += d * d * d;
                temp /= 10;
            }

            if (sum == i)
                System.out.print(i + " ");
        }
    }
}
