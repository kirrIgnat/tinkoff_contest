import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class four {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // кол-во чисел
        int k = scanner.nextInt(); // число операций

        int[] a = new int[n]; // числа на листочке

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        ArrayList<Integer> b = new ArrayList();


        for (int i=0;i<n;++i){
            int x=1;
            while (a[i]>0){
                int ch = a[i]%10;
                a[i]/=10;
                b.add((9-ch)*x);
                x=x*10;
            }
        }

        Collections.sort(b);
        Collections.reverse(b);


        long result = 0;

        if (k > b.size())
            k = b.size();

        for (int j = 0; j < k; j++)
            result = result + b.get(j);

        System.out.println(result);



    }
}
