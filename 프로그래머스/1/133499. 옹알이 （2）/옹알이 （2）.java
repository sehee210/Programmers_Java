import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        String[] validSounds = {"aya", "ye", "woo", "ma"};
        int count = 0;
        
        for(String word : babbling) {
            String prevSound = "";
            boolean isValid = true;

            while(!word.isEmpty()) {
                boolean found = false;

                for(String sound : validSounds) {
                    if(word.startsWith(sound) && !sound.equals(prevSound)) {
                        prevSound = sound;
                        word = word.substring(sound.length());
                        found = true;
                        break;
                    }
                }

                if(!found) {
                    isValid = false;
                    break;
                }
            }

            if(isValid) {
                count++;
            }
        }
        
        return count;
    }
}
