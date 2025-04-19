package ArraysQuestions;

public class EquilibriumPointOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1,3,5,7,9};
		 
		 int left_sum = 0;
		 int right_sum = 0;
		 int total_sum =0;
		 for(int j=0; j < arr.length; j++) {
			 total_sum = total_sum + arr[j];
		 }
		 
		 for(int i=0; i < arr.length ; i++) {
			 
			right_sum = total_sum - left_sum - arr[i];
			
			if(left_sum == right_sum) {
				System.out.println("index of equilibrium is -->"+ i);
				
			} 
			
			left_sum = left_sum + arr[i];
		 }
		 
		 
	}

}
