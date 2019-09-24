package arrays;

public class VarArgsDemo {
    /** main method
     */
    public static void main(String[] args){
        //check number of strings pass
        if(args.length!=3){
            System.out.println("Usage:java Caculator operand1 operator operand2");
            System.exit(1);
        }
        //the result of the operation
        int result=0;
        //determine the operator
        switch(args[1].charAt(0)){
            case '+':result=Integer.parseInt(args[0])+Integer.parseInt(args[2]);break;
            case '-':result=Integer.parseInt(args[0])-Integer.parseInt(args[2]);break;
            case '.':result=Integer.parseInt(args[0])*Integer.parseInt(args[2]);break;
            case '/':result=Integer.parseInt(args[0])/Integer.parseInt(args[2]);break;
        }
        //display result
        System.out.println(args[0]+' '+args[1]+' '+args[2]+"="+result);
    }
}