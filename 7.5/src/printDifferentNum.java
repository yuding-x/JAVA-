import java.util.Scanner;

public class printDifferentNum {
    public static void main(String[] args)
    {
        System.out.print("Enter 10 numbers:");
        Scanner input = new Scanner(System.in);
        int[] count = new int[15];

//        int totNum = input.nextInt();
        int cntNum=0;


        for(int i = 0; i < 10; i++) {
            boolean flag = true;
            int nowNum = input.nextInt();
            for (int j = 0; j < cntNum; j++) {
                if (count[j] == nowNum) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count[cntNum++] = nowNum;
            }
        }
        System.out.println("The number of distinct numbers is "+cntNum);
        System.out.print("The distinct numbers are: ");
        for (int e=0;e<cntNum;e++) {
             System.out.print(count[e]+" ");
        }

    }
}
