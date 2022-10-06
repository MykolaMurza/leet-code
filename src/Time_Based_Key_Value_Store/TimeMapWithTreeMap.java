package Time_Based_Key_Value_Store;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeMapWithTreeMap {
    HashMap<String, TreeMap<Integer, String>> store;

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        TimeMap timeMap = new TimeMap();
        timeMap.set("rtzoj", "kuexwze", 1);
        timeMap.set("xcywxndnz", "herqmazp", 2);
        System.out.println(timeMap.get("xcywxndnz", 3));
        timeMap.set("rtzoj", "dgpguflin", 4);
        System.out.println(timeMap.get("xcywxndnz", 5));
        timeMap.set("dgpguflin", "lvrexco", 6);
        timeMap.set("xcywxndnz", "dgpguflin", 7);
        System.out.println(timeMap.get("xcywxndnz", 8));
        timeMap.set("rtzoj", "wxqixmxs", 9);
        System.out.println(timeMap.get("xcywxndnz", 10));
        timeMap.set("kuexwze", "lvrexco", 11);
        System.out.println(timeMap.get("dgpguflin", 12));
        timeMap.set("lvrexco", "wxqixmxs", 13);
        System.out.println(timeMap.get("xcywxndnz", 14));
        timeMap.set("herqmazp", "vjfhio", 15);
        System.out.println(timeMap.get("dgpguflin", 16));
        System.out.println(timeMap.get("herqmazp", 17));
        System.out.println(timeMap.get("herqmazp", 18));
        System.out.println(timeMap.get("rtzoj", 19));
        System.out.println(timeMap.get("herqmazp", 20));
        System.out.println(timeMap.get("herqmazp", 21));
        timeMap.set("kuexwze", "vjfhio", 22);
        timeMap.set("dgpguflin", "qrkihrb", 23);
        timeMap.set("kuexwze", "dgpguflin", 24);
        System.out.println(timeMap.get("rtzoj", 25));
        System.out.println(timeMap.get("dgpguflin", 26));
        timeMap.set("herqmazp", "rtzoj", 27);
        timeMap.set("lvrexco", "iztpo", 28);
        System.out.println(timeMap.get("lvrexco", 29));
        timeMap.set("kuexwze", "lvrexco", 30);
        System.out.println(System.currentTimeMillis() - time);
    }

    public TimeMapWithTreeMap() {
        store = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        store.computeIfAbsent(key, s -> new TreeMap<>()).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!store.containsKey(key)) return "";
        Map.Entry<Integer, String> floorEntry = store.get(key).floorEntry(timestamp);

        return floorEntry != null && floorEntry.getValue() != null
                ? floorEntry.getValue() : "";
    }
}
