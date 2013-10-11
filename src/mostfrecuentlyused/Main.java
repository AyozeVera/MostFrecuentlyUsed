
package mostfrecuentlyused;

public class Main {
    
int[]v={2, 3, 5 , 1, 4, 5, 3, 2, 4, 1, 1, 1};
MostFrecuentlyUsed array = new MostFrecuentlyUsed(v); 

    public static void main(String[] args) {
        System.out.println(array.getFrecuentlyUsed());
        
    }
}
