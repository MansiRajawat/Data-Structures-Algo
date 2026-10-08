package Maths;

import java.security.SecureRandom;

public class UniqueIdGenerator {

        private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        private static final SecureRandom RANDOM = new SecureRandom();



        public static String generateID(String prefix, int targetLength){

            int remainingLength = targetLength - prefix.length();
            StringBuilder sb = new StringBuilder(remainingLength);
            for(int i=0; i < remainingLength; i++){
                int index = RANDOM.nextInt(CHARACTERS.length());
                sb.append(CHARACTERS.charAt(index));
            }

            return prefix + sb.toString();
        }

    public static void main(String[] args) {
        String prefix = "ORD";
        int length = 15;

        System.out.println("generated ID - "+ generateID(prefix,length));
    }

}
