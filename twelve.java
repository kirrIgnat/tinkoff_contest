import java.util.*;

public class twelve {
    public static void main(String[] args) {
        //int lim= 15;
        //int[] nums={4,7,9};
        Scanner scanner = new Scanner(System.in);
        int lim= scanner.nextInt();
        int[] nums=new int[3];

        for(int i = 0; i < nums.length; i++)
            nums[i]=scanner.nextInt();
        int count=0;
        for (int i=0; i<=lim;++i){
            for (int j=0;j<=lim-nums[0]*i;++j){
                for (int k=0;k<=lim-nums[0]*i-nums[1]*j;++k){
                    if (nums[0]*i+nums[1]*j+nums[2]*k<=lim-1)
                        count++;
                }
            }
        }
        System.out.println(count);
    }
}
