package lab5_1;
import java.util.*;

public class Lab5_1 {
    public static void main(String[] args) {
        MathUtil math = new MathUtil();
        Scanner sc = new Scanner(System.in);
        double num;
        
        System.out.println("Enter a number: ");
        num = Double.parseDouble(sc.nextLine());
        
        System.out.println("Cuberoot of " + num + " : " + math.cubedRoot((int)num));
        System.out.println("Circumference of circle with radius " + num + " : " + math.circumference(num));
        System.out.println("Area of circle with radius " + num + " : " + math.area(num));
    }
}
