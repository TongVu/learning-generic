package exercise6;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

class GenericComparable<T extends Comparable<T>> {
    private List<T> genericArray = new ArrayList<>();

    public GenericComparable(List<T>arrayInput){
        genericArray = arrayInput;
    }

    public T highest(){
        T highest = genericArray.get(0);

        for(int i = 1; i < genericArray.size(); i++){
            if(highest.compareTo(genericArray.get(i)) < 0){
                highest = genericArray.get(i);
            }
        }

        return highest;
    }

    public T lowest(){
        T lowest = genericArray.get(0);

        for(int i = 1; i < genericArray.size(); i++){
            if(lowest.compareTo(genericArray.get(i)) > 0){
                lowest = genericArray.get(i);
            }
        }

        return lowest;
    }
}
