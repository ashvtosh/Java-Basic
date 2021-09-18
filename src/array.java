public class array {
    public static void main(String[] args) {
//        int [] marks = new int[3];
//        marks[0]=100;
//        marks[1]=87;
//        marks[2]=56;
//        System.out.println(marks[2]);

        int [] marks ={100, 70, 80, 71};
//        float [] marks ={24,78,56,90};
//        String [] students= {"ashu","hello","fuck"};
//        System.out.println(marks[3]);
        System.out.println(marks.length);
//        for(int i=0;i<marks.length;i++){              // array traversal
//            System.out.print(marks[i]);

//            for(int i=marks.length -1;i>=0;i--){
//                System.out.println(marks[i]);
//           }
//    }

        for(int element: marks){
            System.out.println(element);
        }
    }
}
