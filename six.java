import java.util.ArrayList;
import java.util.Scanner;

public class six {

    public static boolean isEven(int num){
        return num%2==0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStud = scanner.nextInt(); // Количество учеников
        int[] height = new int[numStud];
        for (int i = 0; i < numStud; i++) {
            height[i] = scanner.nextInt(); // создаем список "ростов"
        }

        ArrayList<Integer> evenOnOdd = new ArrayList<>(); // Четное на не четном
        ArrayList<Integer> oddOnEven = new ArrayList<>(); // Нечетное на четном

        for (int i = 0; i < numStud; i++) {
            if ((isEven(height[i])) && !isEven(i+1)) evenOnOdd.add(height[i]);
            if ((!isEven(height[i]) && isEven(i+1))) oddOnEven.add(height[i]);

        }

        if (evenOnOdd.size() == 1 && oddOnEven.size() == 1) {
            int[] res = new int[2];
            for (int i = 0; i < numStud; i++) {
                if (height[i] == evenOnOdd.get(0)) res[0] = i + 1;
                if (height[i] == oddOnEven.get(0)) res[1] = i + 1;
            }
            System.out.println(res[0] + " " + res[1]);
        } else if (evenOnOdd.isEmpty() && oddOnEven.isEmpty() && height.length > 2) {
            System.out.println("1 3");
        } else {
            System.out.println("-1 -1");
        }
    }
}