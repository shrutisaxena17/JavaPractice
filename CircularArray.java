public class CircularArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int size=arr.length;
        int start=0;
        for(int i=0;i<10;i++){
            int index=(start+i)%size;
            System.out.println(arr[index] + " ");
        }
    }
}

class MaximumSumCircularArray{
    public int maxSum(int arr[]){
        int maxSum=arr[0];
        int curMax=arr[0];
        for(int i=0;i<arr.length;i++){
           curMax=Math.max(arr[i],curMax+arr[i]);
           maxSum=Math.max(maxSum, curMax);
        }
        return maxSum;
    }
}
