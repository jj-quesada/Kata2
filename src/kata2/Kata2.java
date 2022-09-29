package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        // Integer[] data = {1, 6, 2, 8, 3, 8, 2, 7, 3, 4, 2, 9, 0, 6};
        String[] data = {"Itamar", "Álvaro", "Gema", "Álvaro", "Sol", "Álvaro", "Itamar", "Pepe"};
        
        HistogramGenerator histogramGenerator = new HistogramGenerator(data);
        
        Map<String, Integer> histogram = histogramGenerator.getHistogram();
        
        
        for (Map.Entry<String, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
        
    }
    
}
