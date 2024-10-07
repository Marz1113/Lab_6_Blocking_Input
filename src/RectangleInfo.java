import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
       Scanner in = new Scanner(System.in);
       double width = 0, height = 0;
       boolean correctInput;

       do {
           System.out.print("what is the width of the rectangle?: ");
           if (in.hasNextDouble()) {
               width = in.nextDouble();
               correctInput = true;
           } else {
               String trash = in.nextLine();
               System.out.println("invalid: " + trash);
               correctInput = false;
           }
       } while (!correctInput);

       do {
           System.out.print("what is the height of the rectangle?: ");
           if (in.hasNextDouble()) {
               height = in.nextDouble();
               correctInput = true;
           } else {
               String trash = in.nextLine();
               System.out.println("invalid: " + trash);
               correctInput = false;
           }
       } while (!correctInput);

       double area = width * height;
       double perimeter = 2 * (width + height);
       double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));

        System.out.println("Area: " + area);
        System.out.println("perimiter: " + perimeter);
        System.out.println("diagonal: " + diagonal);

    }
}
