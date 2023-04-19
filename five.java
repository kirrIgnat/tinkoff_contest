import java.util.Scanner;

public class five {
    public static int countDigit(long number) {
        int count = 0;
        while (number > 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long l = scanner.nextLong(); // первое число
        long r = scanner.nextLong(); // последнее число

        int result = 0;
        long repDigit;

        int maxLen = countDigit(r);

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= maxLen; j++) {
                try {
                    String letter = String.valueOf(i);
                    String num = "";
                    for (int k = 0; k < j; k++) {
                        num = num + letter;
                    }
                    repDigit = Long.parseLong(num);
                    if (repDigit >= l && repDigit <= r) {
                        result++;
                    }
                } catch (Exception e) {
                    continue;
                }
            }
        }
        System.out.println(result);
    }

}
