import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*



        int t = 1;//время через сколько уйдет
        int[] all_floors = {2,7}; // все этажи с стор

        int num_t =2; //номер этажа с сотрудником

*/


        int n = scanner.nextInt();//кол во сотрудников к кот надо зайти
        int t = scanner.nextInt();//время через сколько уйдет
        int[] all_floors = new int[n]; // все этажи с стор
        for (int i=0;i<n;++i){
            all_floors[i] = scanner.nextInt();
        }
        int num_t =scanner.nextInt(); //номер этажа с сотрудником


        int floor_t = all_floors[num_t-1]; // этаж с сотр
        int floor_max = all_floors[all_floors.length-1];
        int floor_min = all_floors[0];
        int time_t;


        if (floor_t-floor_min<=floor_max-floor_t){
            time_t=floor_t-floor_min;
        } else{
            time_t=floor_max-floor_t;
        }

        if (time_t <= t){
            System.out.println(floor_max - floor_min);
        }
        else {
            System.out.println(time_t + (floor_max - floor_min));
        }
    }
}