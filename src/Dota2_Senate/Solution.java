package Dota2_Senate;

class Solution {
    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RD")); // R
        System.out.println(predictPartyVictory("RDD")); // Dire
        System.out.println(predictPartyVictory("RDR")); // R
        System.out.println(predictPartyVictory("RDRDRDRDRDDDR")); // R
        System.out.println(predictPartyVictory("DRRDDRRDD")); // Dire
        System.out.println(predictPartyVictory("DDR")); // Dire
        System.out.println(predictPartyVictory("DDRRR")); // Dire
        System.out.println(predictPartyVictory("RDRDRDRDDDDD")); // Dire
    }

    public static String predictPartyVictory(String senate) {
        if (senate.length() == 1) {
            return senate.equals("D") ? "Dire" : "Radiant";
        }

        char[] senators = senate.toCharArray();
        int toBeBannedDire = 0, toBeBannedRadiant = 0;
        boolean metD, metR;
        do {
            metD = false;
            metR = false;

            for (int i = 0; i < senators.length; i++) {
                if (senators[i] == 'D') {
                    if (toBeBannedDire > 0) {
                        senators[i] = 'X';
                        toBeBannedDire--;
                    } else {
                        toBeBannedRadiant++;
                    }
                } else if (senators[i] == 'R') {
                    if (toBeBannedRadiant > 0) {
                        senators[i] = 'X';
                        toBeBannedRadiant--;
                    } else {
                        toBeBannedDire++;
                    }
                }
            }

            for (char senator : senators) {
                if (senator == 'D') {
                    metD = true;
                }
                if (senator == 'R') {
                    metR = true;
                }
            }

            if (metD ^ metR) {
                return metD ? "Dire" : "Radiant";
            }
        } while (metD);

        return "Radiant";
    }
}