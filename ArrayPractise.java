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
}
}