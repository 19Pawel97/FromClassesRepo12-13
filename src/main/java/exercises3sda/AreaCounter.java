package exercises3sda;

import java.util.List;

public class AreaCounter {
    public static double countArea(List<GetArea> figures) {
        double sum = 0;
        for (GetArea figure : figures) {
            sum += figure.getArea();
        }
        return sum;
    }

    public static boolean checkArea(double area, List<GetArea> figures) {
        double sum = countArea(figures);
        return area >= sum;
    }
}
