public class TotalArea {
    public static void main(String[] args)
    {
        Circle[] circleArray;

        circleArray = createCircleArray();

        printCircleArray(circleArray);
    }

    public static Circle[] createCircleArray()
    {
        Circle[] circleArray = new Circle[5];

        for(int i = 0;i < circleArray.length;i++)
            circleArray[i] = new Circle(Math.random() * 100);

        return circleArray;
    }

    public static void printCircleArray(Circle[] circleArray)
    {
        System.out.printf("%-30s%-15s\n", "Radius","Area");
        for(int i = 0;i < circleArray.length;i++)
        {
            System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(),circleArray[i].getArea());
        }
        System.out.println("_____________________________________");

        System.out.printf("%-30s%-15s\n","The total area of circles is",sum(circleArray));
    }

    public static double sum(Circle[] circleArray)
    {
        double sum = 0;
        for(int i=0;i<circleArray.length;i++)
        {
            sum+=circleArray[i].getArea();
        }
        return sum;
    }
}

