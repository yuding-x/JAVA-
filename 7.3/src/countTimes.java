import java.util.Scanner;

public class countTimes {
    public static void main(String[] args)
    {
        System.out.print("Enter the integers between 1 and 100:");

        int[] count = new int[110];

        Scanner input = new Scanner(System.in);

        //读入第一个num
        int num=input.nextInt();
        while(num!=0)//不等于0
        {
            count[num]++;
            num=input.nextInt();
        }

        //输出
        for (int i=1;i<=100;i++)
        {
            if(count[i]==0)
                continue;
            else
            {
                if(count[i]==1)
                    System.out.println(i+" occurs "+count[i]+" time");
                else
                    System.out.println(i+" occurs "+count[i]+" times");
            }

        }
    }
}
