import java.util.Scanner;

public class SubtracionQuiz {
    public static void main(String[] args)
    {
        int number1=(int)(Math.random()*10);
        int number2=(int)(Math.random()*10);

        if(number1<number2)
        {
            int temp=number1;
            number1=number2;
            number2=temp;
        }

        System.out.print("What is "+number1+" - "+number2+" ? ");
        Scanner input = new Scanner(System.in);

        int answer=input.nextInt();

        if(number1-number2 == answer)
            System.out.println("you are correct!");
        else
        {
            System.out.println("you are wrong");
            System.out.print(number1+" - "+number2+" should be "+ (number1-number2));
        }

    }
}
