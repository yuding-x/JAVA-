import java.util.*;

public class eleven1117 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter an integer m: ");
        int m=input.nextInt();
        int flag=m;
        int i=2;
        int n=1;
        ArrayList<Integer> list=new ArrayList<Integer>();
        ArrayList<Integer> list1=new ArrayList<Integer>();
        int []a=new int[1000];
        while(m!=1) {
            if(m%i==0) {
                list.add(i);
                m=m/i;
                a[i]++;
            }
            else
                i++;

        }
        for(int j=0;j<1000;j++)
        {
            if(a[j]!=0&&(a[j]%2==1))
                n=n*j;
        }
        System.out.println("The smallest number n for m to be a perfect square is " + n);
        System.out.println("m * n is " + n*flag);
    }

}
