class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;
        int mid = s.length() / 2;

        for (int i = 0; i < mid; i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if ("aeiou".indexOf(ch) != -1) {
                count1++;
            }
        }

        for (int i = mid; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if ("aeiou".indexOf(ch) != -1) {
                count2++;
            }
        }

        return count1 == count2;
    }
}