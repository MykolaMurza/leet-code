package Recent_Counter;

import java.util.ArrayList;

class RecentCounter {
    int countMem, outdated;
    ArrayList<Integer> list = new ArrayList<>();

    public RecentCounter() {
        countMem = 0;
        outdated = 0;
    }

    public int ping(int t) {
        list.add(t);
        for (int i = outdated; i < list.size(); i++) {
            if (list.get(i) < t - 3000) {
                outdated++;
            } else break;
        }
        return list.size() - outdated;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */