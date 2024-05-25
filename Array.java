import java.util.*;
public class Array {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        arr[0]=new int [2];
        arr[1]=new int[2];
        arr[2]= new int[2];
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Enter the array");
                arr[i][j]=sc.nextInt();
                // arr[i][j] = count++;
            }
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
               if(arr[i][j]%2==0){
                  sum = sum+arr[i][j];
               }  
            }
        }
        System.out.println("the sum is "+sum);
      
    }
}
