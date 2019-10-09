import java.util.ArrayList;
import java.util.Scanner;

public class stuSort {
    public static void main(String[] args)
    {
        String[] stu = new String[120];
//        ArrayList<String>strArray = new ArrayList<String>();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of students :");
        int totNum = input.nextInt();
        for(int i=0;i<totNum;i++)
        {
            System.out.print("Enter the score of the student :");
            int score = input.nextInt();
            System.out.print("Enter the name of the student :");
            String name = input.next();
            stu[score]=name;
        }

        for(int i=stu.length-19;i>=0;i--)
        {
            if(stu[i]==null)
                continue;
            System.out.println(stu[i]);
        }

    }
}
