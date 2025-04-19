package ArraysQuestions;

public class ReverseCharacter {
    public static void main(String[] args) {
        char[] charArr = {'d','h','r','u','v','a'};
        char[] charTemp = new char[charArr.length];
        reverseCharacter(charArr, charTemp);
    }

    private static void reverseCharacter(char[] charArr, char[] charTemp) {
        for(int i = 0; i < charArr.length; i++){
            charTemp[i] = charArr[charArr.length - 1 -i];
        }

        for(char charVal : charTemp){
            System.out.print(charTemp);
            break;
        }
    }
}
