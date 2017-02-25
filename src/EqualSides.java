/**
 * Created by gabriel on 25/02/2017.
 */
public class EqualSides {
    public static void main(String[] args) {
        int[] testData = {1,100,50,-51,1,1};
        System.out.println(findEvenIndex(testData));
    }

    public static int findEvenIndex(int[] arr){
        int evenIndex = 0;
        boolean found = false;
        //traverse the array
        for(int i = 1; i < arr.length; i++) {
            //get the sum for the first half of the array
            int firstSum = getSum(0, i, arr);
            //get the sum for the second half of the array
            int secondSum = getSum(i+1, arr.length, arr);
            //check equality
            if (firstSum == secondSum) {
                //if both sums are equal, store at evenIndex variable and turn found to TRUE
                evenIndex = i;
                found = true;
            }
        }
        //if you didn't find a even index, return -1
        if(!found){
            return -1;
        }
        return evenIndex;
    }

    public static int getSum(int from, int to, int[] arr){
        int sum = 0;
        for(int i = from; i < to; i++){
            sum += arr[i];
        }
        return sum;
    }
}
