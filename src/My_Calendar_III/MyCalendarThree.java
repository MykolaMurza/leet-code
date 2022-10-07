package My_Calendar_III;

import java.util.TreeMap;

public class MyCalendarThree {
    public static void main(String[] args) {
        MyCalendarThree myCalendarThree = new MyCalendarThree();
        System.out.println(myCalendarThree.book(10, 20));
        System.out.println(myCalendarThree.book(50, 60));
        System.out.println(myCalendarThree.book(10, 40));
        System.out.println(myCalendarThree.book(5, 15));
        System.out.println(myCalendarThree.book(5, 10));
        System.out.println(myCalendarThree.book(25, 55));
    }

    TreeMap<Integer, Integer> map;

    public MyCalendarThree() {
        map = new TreeMap<>();
    }

    public int book(int start, int end) {
        map.merge(start, 1, (a, b) -> a + b);
        map.merge(end, -1, (a, b) -> a + b);

        int max = 0;
        int count = 0;
        for (Integer value : map.values()) {
            if (max < (count += value)) max = count;
        }

        return max;
    }
}
