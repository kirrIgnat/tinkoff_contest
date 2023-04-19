import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long step = 1;
        int N = 0;

        while (n>step){
            step *= 2;
            N++;
        }

        System.out.println(N);
    }
}
