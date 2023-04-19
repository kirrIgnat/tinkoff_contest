import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // стоимость тарифа
        int b = scanner.nextInt(); // размер тарифа
        int c = scanner.nextInt(); // стоимость каждого лишнего мегабайта
        int d = scanner.nextInt(); // размер интернет-трафика в следующем месяце

        System.out.println(count(a,b,c,d));

    }


    public static int count (int a,int b, int c, int  d){
        if (d <= b){
            return a;
        }
        return  a + (c * (d-b));
    }
}
