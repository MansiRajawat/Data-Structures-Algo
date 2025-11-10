package StringsQuestions;

public class ToggleCaseOfStringCharacters {
    public static void main(String[] args) {
        String s = "geeksForgEeks";
        //"GEEKSfORGeEKS"

        //a-z - 97 to 122 //A-Z - 65 - 90

        char[] arr = s.toCharArray();
        for(int i=0; i < s.length(); i++){

            if(arr[i] >= 'a' && arr[i] <= 'z'){
                arr[i] = (char)(arr[i] - 32);
            } else if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] = (char)(arr[i] + 32);
            }
        }

        System.out.println(new String(arr));
    }
}
