public class Main {

    public static void main(String[] args) {
        // check whether both the arrays are equal oe not
//        int arr[] = {35, 26, 78, 34, 23, 67};
//        int arr2[] = {35, 26, 78, 34, 23, 67};
//        int count=0;
//        if (arr.length == arr2.length) {
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < arr2.length; j++) {
//                    if (i == j) {
//                        if (arr[i] == arr2[j]) {
//                           count++;
//                        } else {
//                            System.out.println("both are not equal");
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//        if(count==arr.length){
//            System.out.println("both the arrays are equal");
//        }


        // Bubble shot
        int arr[] = {34,45,72,67,38,92,48};

        int temp = 2;
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j< arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                   temp =arr[j+1];
                   arr[j+1]= arr[j];
                   arr[j]= temp;
                }
            }

        }
        for(int a: arr) {
            System.out.println(a);
        }

    }
}


