class Practice{
    int count=1;
    int sum=0;
    void printName5times(){
     if(count==5){
        return;
     }
     System.out.println("Shruti");
     count++;
     printName5times();
    }

    void printLinearlyFrom0toN(int n){
      if(count>n){
        return;
      }
      System.out.println(count);
      count++;
      printLinearlyFrom0toN(n);
    }

    void printFromNTo1(int n){
      if(n<1){
        return;
      }
      System.out.println(n);
      printFromNTo1(n-1);
    }

    void print1toNBacktracking(int i, int n){
    if(i>n){
        return;
    }
    print1toNBacktracking(i+1, n);
    System.out.println(i);
    }

    int sumOfFirstnNumbers(int i,int n){
     if(i>n){
        return 0;
     }
     return i+sumOfFirstnNumbers(i+1,n);
    }

    int factorialOfnNumber(int i, int n){
        if(i>n){
            return 1;
        }
        return i*factorialOfnNumber(i+1, n);
    }

    void reverseAnArrayUsingRecusrion(int arr[], int left, int right){
    if(left>=right)
    {
        return;
    }
    int temp=arr[left];
    arr[left]=arr[right];
    arr[right]=temp;
    reverseAnArrayUsingRecusrion(arr, left+1, right-1);
    }

    int fibonacciSeries(int n){
        if(n<=1){
            return 1;
        }
        return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }

    double pow(double x, int n){
        if(n==0){
            return 1;
        }
    return x*pow(x, n-1);
    }
}
public class RecursionPractice{
    public static void main(String args[]){
    Practice p = new Practice();
    p.printName5times();
    p.printLinearlyFrom0toN(5);
    p.printFromNTo1(5);
    p.print1toNBacktracking(1,5);
    int sum = p.sumOfFirstnNumbers(1, 5);
    System.out.println(sum);
    int fact=p.factorialOfnNumber(1, 5);
    System.out.println(fact);
    int arr[] = {1, 2, 3, 4, 5};
    System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        p.reverseAnArrayUsingRecusrion(arr, 0, arr.length - 1);  
        System.out.println("\nReversed Array:");
        for (int num : arr) {
            System.out.print(num + " ");
    }
    System.out.println(p.fibonacciSeries(6));
    double pow = p.pow(2.10000, 3);
    System.out.println(pow);
}
}