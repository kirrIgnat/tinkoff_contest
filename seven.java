import java.util.*;

public class seven {
    public static void main(String[] args) {
        int N = (int) (1e5+1);
        Scanner scanner = new Scanner(System.in);
        int numStud= scanner.nextInt();
        int[] santa=new int[N];
        for (int i = 0; i < numStud; i++) {
            santa[i] = scanner.nextInt();
        }




        HashMap<Integer, Integer> used=new HashMap<>(numStud+1);
        //used [кто дарит подарки, кому дарят подарки]

        for (int i=1;i<=numStud;++i)
            used.put(i, santa[i-1]);

        int countEq = 0;
        for(Map.Entry<Integer, Integer> entry : used.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (key==value)
                ++countEq;
        }

        if (countEq==1){
            for(Map.Entry<Integer, Integer> entry : used.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (key==value)
                    if (key+1>numStud) {
                        System.out.println(key + " 1");
                        return;
                    } else{
                        int newKey =key+1;
                        System.out.println(key+" "+newKey);
                        return;
                    }
            }
        }else if(countEq==numStud-1){
            for(Map.Entry<Integer, Integer> entry : used.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();
                if (key!=value) {
                    System.out.println(key + " " + key);
                    return;
                }

            }
        }else
            System.out.println("-1 -1");


    }
}
