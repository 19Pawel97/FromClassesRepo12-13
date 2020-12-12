package exercises3sda;

import java.util.List;

public class AreaCounter {
    public static double countArea(List<GetArea> figures) {
        double sum = 0;
        for (GetArea figure: figures) {
            sum += figure.getArea();
        }
        return sum;
    }
}
