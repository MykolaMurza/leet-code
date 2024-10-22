package Design_Underground_System;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        UndergroundSystem undergroundSystem = new UndergroundSystem();
    }
}

class UndergroundSystem {
    private Map<Integer, CustomerData> customerDataMap;
    private Map<String, StationsWayData> stationDataMap;

    public UndergroundSystem() {
        customerDataMap = new HashMap<>();
        stationDataMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        customerDataMap.put(id, new CustomerData(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CustomerData customer = customerDataMap.get(id);
        String stationWayKey = customer.checkInStation + '_' + stationName;

        if (stationDataMap.containsKey(stationWayKey)) {
            StationsWayData stationsWay = stationDataMap.get(stationWayKey);
            int diff = t - customer.t;
            stationsWay.sum += diff;
            stationsWay.ctn++;
        } else {
            stationDataMap.put(stationWayKey, new StationsWayData(t - customer.t));
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        StationsWayData stationsWay = stationDataMap.get(startStation + '_' + endStation);
        return stationsWay.sum / stationsWay.ctn;
    }

    private class CustomerData {
        String checkInStation;
        int t;

        public CustomerData(String checkInStation, int t) {
            this.checkInStation = checkInStation;
            this.t = t;
        }
    }

    private class StationsWayData {
        double sum;
        int ctn;

        public StationsWayData(int t) {
            sum = t;
            ctn = 1;
        }

        public void recalculateAverage(int t) {
            sum += t;
            ctn++;
        }
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */