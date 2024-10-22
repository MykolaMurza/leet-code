package Valid_Word_Square;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public boolean validWordSquare(List<String> words) {
        int elementsCount = words.size();
        List<StringBuilder> horizontalWords = new ArrayList<>(elementsCount);
        for (int i = 0; i < elementsCount; i++) {
            char[] wordChars = words.get(i).toCharArray();
            for (int j = 0; j < wordChars.length; j++) {
                if (i == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(wordChars[j]);
                    horizontalWords.add(sb);
                } else {
                    horizontalWords.get(j).append(wordChars.length > j ? wordChars[j] : "");
                }
            }

            if (i == 0) {
                for (int j = elementsCount - horizontalWords.size(); j < elementsCount; j++) {
                    horizontalWords.add(new StringBuilder());
                }
            }
        }

        for (int i = 0; i < words.size(); i++) {
            if (!words.get(i)
                    .equals(horizontalWords.get(i).toString())) {
                System.out.println(words.get(i));
                System.out.println(horizontalWords.get(i).toString());
                return false;
            }
        }

        return true;
    }
}
