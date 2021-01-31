package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"Rosa", "Juan", "María", "Pepe", "Pepe", "Rosa", "Rosa", "Juan"};
        
        Histogram histo = new Histogram(data);
        
        Map<String, Integer> histogr = histo.getHistogram();
        
        histogr.keySet().forEach(key -> {
            System.out.println(key + " ==> " + histogr.get(key));
        });
    }
}
