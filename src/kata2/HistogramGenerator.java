package kata2;

import java.util.HashMap;
import java.util.Map;

public class HistogramGenerator<T> {
    private final T[] data;

    public HistogramGenerator(T[] data) {
        this.data = data;
    }

    public T[] getData() {
        return data;
    }

    public Map<T, Integer> getHistogram() {
        Map<T, Integer> map = new HashMap<T, Integer>();
        for (int i = 0; i < this.data.length; i++) {
            map.put(this.data[i], map.containsKey(this.data[i]) ? map.get(this.data[i]) + 1 : 1);
        }
        return map;
    }
    
}
