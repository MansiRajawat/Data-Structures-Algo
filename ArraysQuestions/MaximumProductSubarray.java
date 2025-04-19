package ArraysQuestions;

public class MaximumProductSubarray {

	public static void main(String[] args) {
        int [] num = {1,2,-3,0,-4,-5};
        
        //brute force 
        int result = Integer.MIN_VALUE;
        for(int i=0; i < num.length; i++) {
        	for(int j = i+1 ; j < num.length; j++) {
        		
        		int temp = 1;
        		
        		for(int k = i ; k <= j ; k++ ) {
        			temp *= num[k];
        			
        			result = Math.max(result, temp);
        		}
        	}
        }
        
        System.out.println("result --->"+ result);
	}

}
