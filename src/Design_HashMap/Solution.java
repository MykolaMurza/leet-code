package Design_HashMap;

public class Solution {

}

class MyHashMap {
    Integer[] data;

    public MyHashMap() {
        data = new Integer[1000001];
    }

    public void put(int key, int value) {
        data[key] = value;
    }

    public int get(int key) {
        return data[key] != null ? data[key] : -1;
    }

    public void remove(int key) {
        data[key] = null;
    }
}
