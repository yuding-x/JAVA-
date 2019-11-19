import java.util.Arrays;
import java.util.Scanner;

public class pakage {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int cnt = 0;

        System.out.print("Enter the number of objects:");
        int number = input.nextInt();

        int[] myObj = new int[number];
        int[] box = new int[number];
        int[][] boxnum = new int[number][];
        System.out.print("Enter the weights of the objects:");
        for(int i = 0; i < number; i++){
            myObj[i]=input.nextInt();
        }
        Arrays.sort(myObj,0,number);
        //遍历myObj数组，逐个判断
        for(int i = number-1;i>=0;i--){
            //是第一个
            if(i==number-1){
                cnt = 1;
                box[cnt]=myObj[i];
            }
            else{//否则
                for(int j = 1;j<=cnt;j++) {//遍历箱子
                    if (box[j] + myObj[i] <= 10) {//如果装得下 当前这个箱子就装入数据
                        box[j] += myObj[i];
                        //把数据装入boxnum数组
                        int len = boxnum[j].length;
                        boxnum[j][len] = myObj[i];
                    } else {//装不下就 新建一个箱子 装数据
                        box[++cnt] = myObj[i];
                        boxnum[j][0] = myObj[i];
                    }
                }
            }
        }
        for(int i = 0;i<cnt;i++){//第几个箱子123
            int len = boxnum[i].length;
            for(int j = 0;j<len;j++){//输出箱子里的数0123
                System.out.println("Container " + (i+1) +"contains objects with weight " + boxnum[i][j]);
            }

        }
    }
}
