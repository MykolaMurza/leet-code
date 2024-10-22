package Design_Browser_History;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("google.com");
    }
}

class BrowserHistory {
    private List<String> history;
    private int historyDepth;
    private int maxHistoryDepth;

    public BrowserHistory(String homepage) {
        history = new ArrayList<>();
        history.add(homepage);
    }

    public void visit(String url) {
        historyDepth++;
        if (history.size() > historyDepth) {
            history.set(historyDepth, url);
        } else {
            history.add(url);
        }
        maxHistoryDepth = historyDepth;
    }

    public String back(int steps) {
        historyDepth = Math.max(0, historyDepth - steps);
        return history.get(historyDepth);
    }

    public String forward(int steps) {
        historyDepth = Math.min(maxHistoryDepth, historyDepth + steps);
        return history.get(historyDepth);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */