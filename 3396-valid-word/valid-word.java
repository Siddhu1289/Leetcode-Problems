class Solution {
    public boolean isValid(String word) {

        if (word.length() <= 2) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char ch : word.toCharArray()) {

            // only allow letters and digits
            if (!Character.isLetterOrDigit(ch)) return false;

            // check only letters for vowel/consonant
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        return hasVowel && hasConsonant;
    }
}