package ArraysQuestions;

public class ContiguousArray {
    public static void main(String[] args) {
        int arr[] = {0,1,1,1,1,1,0,0,0};
      int result =0;
        for(int i=0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int countOnes = 0;
                int countZeros = 0;

                for(int k = i; k <= j; k++){
                    if(arr[k] == 0){
                        countZeros++;
                    }
                    if(arr[k] == 1){
                        countOnes++;
                    }
                }

                if(countZeros == countOnes){
                    result = Math.max(result, j-i+1);
                }
            }
        }

        System.out.println("contigious array : "+result);
    }
}
