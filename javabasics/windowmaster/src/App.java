import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // declaring variables and scanner

        Scanner sc = new Scanner(System.in);

        String stringHeight;
        String stringWidth;

        float height;
        float width;

        float areaOfWindow;
        float cost;
        float perimeterOfWindow;

        // prompt user for input and scanner parses it

        System.out.println("Please enter height in feet: ");
        stringHeight = sc.nextLine();
        System.out.println("Please enter width in feet");
        stringWidth = sc.nextLine();

        // convert to float values
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);

        // calulate area of the window
        areaOfWindow = height * width;

        // calculate perimeter of window
        perimeterOfWindow = 2 * (height + width);

        // calculate the total cost - use a hard-coded value
        // for material cost
        cost = ((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow));

        // display the results to the user
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost =  " + cost);

    }
}
