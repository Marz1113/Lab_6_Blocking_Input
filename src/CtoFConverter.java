import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double temp = 0;
        String trash = "";
        boolean done = false;
        double celsius = 0;
        double fahrenheit = 0;

        do {
            System.out.print("Enter your value in celsius: ");
            if (in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine();
                fahrenheit = celsius * 1.8 + 32;
                System.out.println("the temp in fahrenheit is " + fahrenheit);
                done = true;
            } else
            {
                trash = in.nextLine();
                System.out.println("i do not know the celsius: " + trash);
                System.out.println("please enter a valid temp");
            }

        }while(!done);

    }
}