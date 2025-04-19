package ArraysQuestions;

public class NextGreaterElement {
    public static void main(String[] args) {
        int [] arr2= {1, 3, 2, 4};
        nextGreaterElement(arr2);
    }
    private static void nextGreaterElement(int[] arr2) {
        //find the next greater element for each element in the array in the order of their appearance.
        //The next greater element of an element in the array is the
        // nearest element on the right that is greater than the current element.
        //If there does not exist a next greater element for the current element, then the next greater element for that element is -1.
        int [] newArr= new int[arr2.length];
        for(int i=0; i < arr2.length; i++){
            newArr[i] = -1; // Default to -1
            for(int j = i+1; j < arr2.length; j++){
                if(arr2[j] > arr2[i]) {
                    newArr[i] = arr2[j];
                    break;
                }
            }
        }
        System.out.println("Next Greater Elements:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }

        //If a greater element is found, you should break the loop immediately instead of continuing.
        //Otherwise, newArr[i] will store only the last greater element encountered instead of the first next greater element.
    }
}
