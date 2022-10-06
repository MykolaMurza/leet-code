package Time_Based_Key_Value_Store;

public class TimeMap {
    TimeNode[] nodes;
    int lastElement;

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

    public TimeMap() {
        this.nodes = new TimeNode[10];
        this.lastElement = 0;
    }

    public void set(String key, String value, int timestamp) {
        if (lastElement + 1 == nodes.length) {
            TimeNode[] reload = new TimeNode[(int) (nodes.length * 1.5 + 1)];
            System.arraycopy(nodes, 0, reload, 0, nodes.length);
            nodes = reload;
        }

        TimeNode toReplace = getNode(key, timestamp);
        if (toReplace != null && toReplace.value != null && !toReplace.value.isEmpty()
                && toReplace.timestamp == timestamp) {
            toReplace.value = value;
        } else {
            nodes[++lastElement] = new TimeNode(key, timestamp, value);
        }
    }

    public String get(String key, int timestamp) {
        TimeNode node = getNode(key, timestamp);
        return  node.value == null ? "" : node.value;
    }

    private TimeNode getNode(String key, int timestamp) {
        int[] idByKey = new int[nodes.length];
        int runner = 0;

        for (int i = 0; i < nodes.length; i++) {
            if (nodes[i] == null) continue;
            if (nodes[i].key.equals(key)) idByKey[runner++] = i;
        }

        int[] idByKeyClean = new int[runner];
        System.arraycopy(idByKey, 0, idByKeyClean, 0, runner);

        if (idByKeyClean.length == 0) new TimeNode();
        else if (idByKeyClean.length == 1) {
            assert nodes[idByKeyClean[0]] != null;
            return nodes[idByKeyClean[0]];
        } else {
            int low = 0, high = idByKeyClean.length - 1;
            if (nodes[idByKeyClean[low]] != null
                    && nodes[idByKeyClean[low]].timestamp > timestamp)
                return new TimeNode();
            if (nodes[idByKeyClean[high]] != null
                    && nodes[idByKeyClean[high]].timestamp <= timestamp)
                return nodes[idByKeyClean[high]];

            while (low < high) {
                int mid = (low + high) / 2;
                if (nodes[idByKeyClean[mid]] != null
                        && nodes[idByKeyClean[mid]].timestamp == timestamp)
                    return nodes[idByKeyClean[mid]];
                else if (nodes[idByKeyClean[mid]] != null
                        && nodes[idByKeyClean[mid]].timestamp < timestamp)
                    low = mid + 1;
                else
                    high = mid - 1;
            }

            return nodes[idByKeyClean[low - 1 >= 0 ? low - 1 : low]];
        }

        return new TimeNode();
    }

    public static class TimeNode {
        String key;
        int timestamp;
        String value;

        public TimeNode(String key, int timestamp, String value) {
            this.key = key;
            this.timestamp = timestamp;
            this.value = value;
        }

        public TimeNode() {
            this.key = "";
        }
    }
}
