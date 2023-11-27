package oop_seminar6_1.ocp1;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<ShapeV2> shapes = new ArrayList<>();
        shapes.add(new RightTriangleV2(2, 3));
        shapes.add(new SquareV2(4));
        shapes.add(new CircleV2(5));

        CalcAreaServiceV2 calcAreaService = new CalcAreaServiceV2(shapes);
        calcAreaService.processAll();

    }


}
