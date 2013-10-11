package mostfrecuentlyused;

import java.util.*;

public class MostFrecuentlyUsed {
    
    private HashMap<Integer, Integer>frecuencyMap = new HashMap <Integer, Integer>();
    private int[] array;
    private final HashMap<Integer, Integer> frecuencyHashMap;
   
    public MostFrecuentlyUsed(int[]array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }
    
    public HashMap<Integer, Integer> getFrecuencyMap() {
        return frecuencyMap;
    }
    
    public void toHashMap(){
        for (int value : array) {
            frecuencyMap.put(value, getFrequency(value) + 1);
        }
    }

    private int getFrequency(int value) {
        if (frecuencyMap.containsKey(value)){
            return frecuencyMap.get(value);
        }
        return 0;
    }
    
    public int[] getFrecuentlyUsed(){
        toHashMap(); 
       
        int actualValue = -1;
        for (Integer value : frecuencyMap.keySet()) {
            if (frecuencyMap.get(value)> actualValue) actualValue = frecuencyMap.get(value);            
        }
        int[] mostUsed = {actualValue, frecuencyMap.get(actualValue)};
          
        return mostUsed;
    
    }
    
    
}
