import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number for seconds:");

        int seconds=input.nextInt();

        int mintes=seconds/60;
        int remainingSeconds=seconds%60;
        System.out.println(seconds+" seconds is "+mintes+" minutes and "+remainingSeconds+" seconds");
    }
}
