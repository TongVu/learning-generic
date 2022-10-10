package exercise7;

import java.util.ArrayList;
import java.util.List;

public class NumberAnalyzer <T extends Number>{
    List<T> numberList = new ArrayList();


    public NumberAnalyzer(List<T> numberList) {
        this.numberList = numberList;
    }

    public T highest(){
        T max = numberList.get(0);
        for (T element : numberList) {
            if((max.doubleValue() - element.doubleValue()) < 0){
                max = element;
            }
        }

        return max;
    }

    public T lowest(){
        T min = numberList.get(0);
        for (T element : numberList) {
            if((min.doubleValue() - element.doubleValue()) > 0){
                min = element;
            }
        }

        return min;
    }

    public int totalElements(){
        return numberList.size();
    }

    public double average(){
        double total = 0;
        for (T element : numberList ) {
            total += element.doubleValue();
        }
        return total/totalElements();
    }
}
