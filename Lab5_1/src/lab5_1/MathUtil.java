package lab5_1;
import java.lang.Math;
        
public class MathUtil {
    public double cubedRoot(int num)
    {
        return (Math.cbrt(num));
    }
    public double circumference(double radius)
    {
        return (2 * Math.PI * radius);
    }
    
    public double area(double radius)
    {
        return (Math.PI * Math.pow(radius, 2.0));
    }
}
