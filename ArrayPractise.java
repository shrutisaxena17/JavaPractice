import java.util.Arrays;

class Main{
    void arrangeNegOnLeft(){
        int arr[]={-1,8,-2,9,10,-5,4};
        int result[]=new int[arr.length];
        int neg=0;
        int pos=arr.length-1;
        for (int i = 0; i < arr.length && neg < pos; i++) {
             if(arr[i]<0){
                result[neg]=arr[i];
                neg++;
             }
             else{
                result[pos]=arr[i];
                pos--;
             }
        }
        for(int item: result){
            System.out.println(item);
        }
    }

    void arrangeNegOnRight(){
        int arr[]={-1,8,-2,9,10,-5,4};
        int result[]=new int[arr.length];
        int pos=0;
        int neg=arr.length-1;
        for (int i = 0; i < arr.length && neg > pos; i++) {
             if(arr[i]<0){
                result[neg]=arr[i];
                neg--;
             }
             else{
                result[pos]=arr[i];
                pos++;
             }
        }
        for(int item: result){
            System.out.println(item);
        }
    }

    void arrangeZeroesToLeft(){
        int arr[]={0,5,4,10,0,2,0,0};
        int result[]=new int[arr.length];
        int zeroes=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                result[zeroes]=0;
                zeroes++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                result[zeroes] = arr[i];
                zeroes++;
            }
        }
        for(int item: result){
            System.out.println(item);
        }
    }
    
    void removeDuplicatesAndCountDistinct(){
        int arr[]={1,1,1,2,2,2,3,3,3,4,4,4,4,5};
        int j=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i+1];
                j++;
            }
        }
        for(int i=0;i<j;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Distinct Elements: "+j);
    }

    void rotateArrayandFindMin(){
        int arr[]={1,2,3,4,5,6,7};
        int k=2;
        reverseArray(arr,0,arr.length-1);
        reverseArray(arr, 0, k);
        reverseArray(arr, k+1, arr.length-1);
        System.out.println(Arrays.toString(arr));
        findMinRotatedArray(arr);
            }
        
   void findMinRotatedArray(int[] arr) {
    
    }
        
    void reverseArray(int arr[],int start,int end){
        while(start<end)
        { 
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    void lowerBound(){
        int arr[]={3,5,8,15,19};
        int x=9;
        int low=0;
        int high=arr.length-1;
        int ans=0;
        while (low <= high) {
            int mid = (low + high)/ 2;
            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("Index:- "+ans+" The element:- "+arr[ans]);
    }

    void upperBound(){
        int arr[]={4,5,8,10,13,17,19,21};
        int x=18;
        int low=0;
        int high=arr.length-1;
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println("Index:- "+ans+" The element:- "+arr[ans]);
    }

    void searchInsertPosition(){
        int arr[]={1,2,4,7,9,10,11,12,15,18};
        int x=17;
        int low=0;
        int high=arr.length-1;
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println("Index:- "+ans+"After The element:- "+arr[ans-1]);
    }

    void floor(){
        int arr[]={1,2,4,7,9,10,11,12,15,18};
        int x=17;
        int low=0;
        int high=arr.length-1;
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                ans=mid;
                low=mid+1;
            }else{
                high=high-1;
            }
        }
        System.out.println("Floor is: "+arr[ans]);
    }

    void findTheLastOccurenceOfAnElement(){
        int arr[]={3,4,8,9,13,13,13,13,13,20,40};
        int x=13;
        int low=0;
        int high=arr.length-1;
        int ans=0;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println("Last occurence is at index : "+ans);

    }

   int searchElementInARotatedSortedArray(){
    int arr[]={7,8,9,1,2,3,4,5,6};
    int element=2;
    int low=0;
    int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==element){
                return mid;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=element && element<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(arr[mid]<=element && element<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
   }
   return -1;
}
}
public class ArrayPractise{
public static void main(String[] args) {
    Main m = new Main();
    m.arrangeNegOnLeft();
    System.out.println("Next Answer:");
    m.arrangeNegOnRight(); 
    System.out.println("Next Answer:");
    m.arrangeZeroesToLeft();
    System.out.println("Next Answer:");
    m.removeDuplicatesAndCountDistinct();
    System.out.println("Next Answer:");
    m.rotateArrayandFindMin();
    System.out.println("Next Answer:");
    m.lowerBound();
    System.out.println("Next Answer:");
    m.upperBound();
    System.out.println("Next Answer:");
    m.searchInsertPosition();
    System.out.println("Next Answer:");
    m.floor();
    System.out.println("Next Answer:");
    m.findTheLastOccurenceOfAnElement();
    System.out.println("Next Answer:");
    int ans = m.searchElementInARotatedSortedArray();
    System.out.println("Element found at index : " +ans);
}
}