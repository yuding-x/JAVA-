public class Circle {
    double radius;

    //    the number of objects created
    static int numberOfObjects = 0;

//    construct a circle with radius
    Circle() {
        radius=1;
        numberOfObjects++;
    }

    Circle(double newRadius){
        radius = newRadius;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    double getArea(){
        return radius * radius * Math.PI;
    }

}
