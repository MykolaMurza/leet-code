package Valid_Number;

class Solution {
    // Digits, dots, signs (+/-), an exponent - in the sequence of the supposed frequence.
    // Then: Dot seen, Exponent seen - to keep a history of once-in-a-lifetime elements use.
    // Then: Trailing dot, Trailing exponent, Leading dot - to handle single-dot/single-exponent cases.
    private final boolean[] SETTINGS =
            new boolean[]{true, true, true, false, false, false, false, false, false};

    public boolean isNumber(String s) {
        short digitsBeforeExponentCount = 0;
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                if (SETTINGS[0]) {
                    SETTINGS[1] = true;
                    SETTINGS[2] = false; // We can't have a sign after the digit
                    SETTINGS[3] = true;

                    SETTINGS[6] = false; // Track that number is used and does not need anymore
                    SETTINGS[7] = false; // Track that number is used and does not need anymore
                    SETTINGS[8] = false; // Track that number is used and does not need anymore

                    if (!SETTINGS[5]) {
                        digitsBeforeExponentCount++;
                    }
                } else
                    return false;
            } else if (chars[i] == '.') {
                if (SETTINGS[1] && !SETTINGS[4] && !SETTINGS[5]) {
                    SETTINGS[1] = false; // We can't have another dot after the dot
                    SETTINGS[2] = false; // We can't have a sign after the dot
                    SETTINGS[3] = true;

                    SETTINGS[4] = true; // Track that a dot was used
                    SETTINGS[6] = true; // Track that a digit is possibly needed after the trailing dot
                    SETTINGS[8] = i == 0;
                } else
                    return false;
            } else if (chars[i] == '-' || chars[i] == '+') {
                if (SETTINGS[2]) {
                    SETTINGS[1] = true;
                    SETTINGS[2] = false; // We can't have another sign after the sign
                    SETTINGS[3] = false; // We can't have an exponent after the sign

                    SETTINGS[6] = true; // Track that a digit is needed
                } else
                    return false;
            } else if (chars[i] == 'e' || chars[i] == 'E') {
                if (SETTINGS[3] && !SETTINGS[5] && !SETTINGS[8] && digitsBeforeExponentCount > 0) {
                    SETTINGS[1] = false; // We can't have a sign after the exponent
                    SETTINGS[2] = true;
                    SETTINGS[3] = false; // We can't have another exponent after the exponent

                    SETTINGS[5] = true; // Track that an e/E was used
                    SETTINGS[7] = true; // Track that a digit is needed after the trailing exponent
                } else
                    return false;
            } else
                return false;
        }

        return !SETTINGS[7] && !(SETTINGS[6] && digitsBeforeExponentCount == 0);
    }
}
