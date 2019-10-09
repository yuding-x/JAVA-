import java.util.Scanner;

public class isSortes {
    public static boolean isSorted(int[] list)
    {
        for(int i=1;i<list.length;i++)
        {
            if(list[i]==0&&list[i+1]==0)
                break;
            else if(list[i]<list[i-1])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        int[] array = new int[105];
        System.out.print("Enter the size of the list: ");
        Scanner input = new Scanner(System.in);
        int tot=input.nextInt();
        System.out.print("Enter the contents of the list: ");

        for(int i=0;i<tot;i++)
        {
            array[i]=input.nextInt();
        }

        System.out.print(" the list have "+tot+" integers ");
        for(int i=0;i<tot;i++)
        {
            System.out.print(array[i]+" ");
        }

        if(isSorted(array))
            System.out.println("The list is already sorted");
        else
            System.out.print("The list is not sorted");


    }
}
