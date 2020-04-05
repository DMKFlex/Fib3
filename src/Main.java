import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<Integer>();
        nums.add(1);
        nums.add(1);
        Scanner sc=new Scanner(System.in);
        int k= sc.nextInt();

        if(k==1 | k==2){
            System.out.println(nums.get(k-1));
        }else {
            for(int i=2;i<k;i++){
                nums.add(i, nums.get(i - 1) + nums.get(i - 2));
            }
            System.out.println(nums.get(k - 1));
        }

    }
}
