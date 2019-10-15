public class Circle {
    public static void main(String[] args){
                //create a circle with radius 1
                Circle circle1=new Circle();
                System.out.println("The area of the circle of radius "+circle1.radius+" is "+circle1.getArea());

                //create a circle with radius 25
                Circle circle2=new Circle(25);
                System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());

                //create a circle with radius 125
                Circle circle3=new Circle(125);
                System.out.println("The area of the circle of radius "+circle3.radius+" is "+circle3.getArea());

                //modify circle radius
                circle2.radius=100;
                System.out.println("The area of the circle of radius "+circle2.radius+" is "+circle2.getArea());
    }

            double radius;

            /**construct circle with radius 1*/
            Circle(){
                radius=1;
            }
            /**construct circle with a specified radius*/
            Circle(double newRadius){
                radius=newRadius;
            }

            /**return the area of this circle*/
            double getArea(){
                return radius*radius*Math.PI;
            }

            /**return the perimeter of this circle*/
            double getPerimeter(){
                return 2*radius*Math.PI;
            }

            /**set a new radius for this circle*/
            void setRadius(double newRadius){
                radius=newRadius;
            }
}
