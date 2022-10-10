package exercise7;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        double number1 = 1.2;
        double number2 = 5.2;
        double number3 = -1.2;
        double number4 = 3.2;
        doubleList.add(number1);
        doubleList.add(number2);
        doubleList.add(number3);
        doubleList.add(number4);

        NumberAnalyzer numberAnalyzer = new NumberAnalyzer<>(doubleList);
        System.out.println(numberAnalyzer.lowest());
        System.out.println(numberAnalyzer.highest());
        System.out.println(numberAnalyzer.totalElements());
        System.out.println(numberAnalyzer.average());


    }
}
