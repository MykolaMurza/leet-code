package Design_Parking_System;

public class Solution {
    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(5, 20, 5);
    }
}

class ParkingSystem {
    private int xlCarSlots;
    private int mdCarSlots;
    private int smCarSlots;

    public ParkingSystem(int big, int medium, int small) {
        xlCarSlots = big;
        mdCarSlots = medium;
        smCarSlots = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1 -> {
                if (xlCarSlots > 0) {
                    xlCarSlots--;
                    return true;
                }
                break;
            }
            case 2 -> {
                if (mdCarSlots > 0) {
                    mdCarSlots--;
                    return true;
                }
                break;
            }
            default -> {
                if (smCarSlots > 0) {
                    smCarSlots--;
                    return true;
                }
                break;
            }
        }
        return false;
    }
}
