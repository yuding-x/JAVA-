public class Test {
    public static void main(String args[]){
        RegularPolygon r1= new RegularPolygon();
        RegularPolygon r2= new RegularPolygon(6,4);
        RegularPolygon r3= new RegularPolygon(10,4,5.6,7.8);
        r1.draw();
        r2.draw();
        r3.draw();
    }
}
class RegularPolygon{
    private int n=3;
    private double side=1;
    private double x=0,y=0;
    final static double PI=3.14159265;
    //默认无参构造法
    public RegularPolygon(){}
    //指定边数和边长，在中心（0,0）的构造法
    public RegularPolygon(int n,double side){
        this.n=n;
        this.side=side;
    }
    //指定边数和边长，中心在(x,y)的构造方法
    public RegularPolygon(int n,double side,double x,double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    public int getN(){
        return n;
    }
    public double getSide(){
        return side;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public  void setN(int n){
        this.n=n;
    }
    public  void setSide(double side){
        this.side=side;
    }
    public  void setX(double x){
        this.x=x;
    }
    public  void setY(double y){
        this.y=y;
    }
    public double getPerimeter(){
        return n*side;
    }
    public double getArea(){
        return n*side*side/(4* Math.tan(PI/n));
    }
    public void draw(){
        System.out.println("该"+n+"边形周长为"+getPerimeter()+" 面积为"+getArea());
    }
}
