package Baseball_Game;

public class Solution {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5", "2", "C", "D", "+"}));
        System.out.println(calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));
        System.out.println(calPoints(new String[]{"1", "C"}));
    }

    public static int calPoints(String[] operations) {
        int[] scores = new int[operations.length];
        int scoresIterator = 0;
        for (int i = 0; i < operations.length; i++) {
            String operation = operations[i];
            switch (operation) {
                case "+" -> {
                    // Record a new score that is the sum of the previous two scores
                    scores[scoresIterator] = scores[scoresIterator - 1] + scores[scoresIterator - 2];
                    scoresIterator++;
                }
                case "D" -> {
                    // Record a new score that is the double of the previous score
                    scores[scoresIterator] = scores[scoresIterator - 1] * 2;
                    scoresIterator++;
                }
                case "C" -> {
                    // Invalidate the previous score, removing it from the record
                    scoresIterator--;
                    scores[scoresIterator] = 0;
                }
                default -> {
                    // Record a new score of current value (an integer)
                    scores[scoresIterator] = Integer.parseInt(operation);
                    scoresIterator++;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < scores.length; i++) {
            result += scores[i];
        }

        return result;
    }
}
