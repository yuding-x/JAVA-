import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] array = new double[15];

        System.out.print("Enter 10 numbers:");

        for(int i=0;i<10;i++)
            array[i]=input.nextDouble();

        for(int i=0;i<10;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(array[j] >= array[i])
                {
                    double temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }

        for (int i=0;i<10;i++)
        {
            System.out.print(array[i]+" ");

        }
    }
}
