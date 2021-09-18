import java.util.Scanner;

public class ques2 {
    public static void main(String[] args) {
//        float [] marks = {45.3f, 45.3f, 25.7f, 78.6f, 100.0f};
//        float sum = 0;
//        for(float element:marks){
//            sum = sum + element;
//        }
//        System.out.println(sum);


        float [] marks = {45.3f, 45.3f, 25.7f, 78.6f, 100.0f};
        float num = 45.7f;
        boolean isInarray=false;
        for(float element:marks){
            if(num==element){
                isInarray = true;
                break;
            }
        }
        if(isInarray) {
            System.out.println("the value is present in array");
        }
        else{
            System.out.println("the value is not present in array");
        }


        /*float [] marks = {45.3f, 45.3f, 25.7f, 78.6f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println(sum/ marks.length);*/


        /*System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter data for mat1");
        int [][] mat1 = {{sc.nextInt()},
                         {sc.nextInt()}};
        System.out.println("enter data for mat2");
        int [][] mat2 = {{sc.nextInt(),},
                         {sc.nextInt()}};
        int [][] result = {{0,0,0},
                           {0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat2[i].length;j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");

            }
            System.out.println("");
        }*/


        /*int [] arr = {1,2,3,7,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;
        for(int i=0;i<n;i++){
            temp = arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element: arr){
            System.out.println(element);
        }*/


        /*int [] arr = {1,2,3,4,5,6};
        int max=0;
        for(int element:arr){
            if(element>max){
                max = element;
            }
        }
        System.out.println(""+ max);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);*/

        /*boolean isSorted = true;
        int [] arr = {2,42,5,3,65,98};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
       if(isSorted){
           System.out.println("the array is sorted");
       }
       else{
           System.out.println("the array is not sorted");
       }*/
    }
}
