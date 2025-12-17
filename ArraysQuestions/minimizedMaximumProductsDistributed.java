package ArraysQuestions;

public class minimizedMaximumProductsDistributed {
    public static void main(String[] args) {
        int[] arr = {1,3,5}; int maxBatch = 8;

        // batch one - sum all of them if it increased more than maxBatch then reject

        // increase the batch two - ceil of (1/2) + (3/2) + (5/1) - <= max batch return the minimum of batch required to
        //downsize to maxBatch

        int result =0;
        int minBatch = -1;
        int batch = 1;
        while(batch <= maxBatch){
            int sum =0;

            for(int i=0; i < arr.length; i++){
                sum = (int) (sum + Math.ceil((double) arr[i]/batch));
            }

            if(sum <= maxBatch && minBatch < batch){
                result = sum;
               minBatch = batch;
               break;
            }
            batch++;
        }

        System.out.println(minBatch);


    }
}
