import java.util.Scanner;

public class Location {
    public int row,column;
    public double maxValue;
    public static Location locateLargest(double[][] a){
        Location n=new Location();
        n.maxValue=a[0][0];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]>n.maxValue){
                    n.maxValue=a[i][j];
                    n.row=i;
                    n.column=j;
                }
            }
        }
     return n;
    }
    public static void  main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns in the array:");
        int r=input.nextInt(),c=input.nextInt();
        System.out.println("Enter the arrays:");
        double array[][]=new double[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                array[i][j]=input.nextDouble();
            }
        }
        Location n=Location.locateLargest(array);
        System.out.println("The location of the largest element is"+n.maxValue+"at ("+n.row+","+n.column+")");
    }
}
