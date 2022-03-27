public class FillingArray {
    public static void main(String[] args){
        int myArray []= new int[10];

        for (int i=0;i<myArray.length;i++) {
            myArray[i] = 9 - i;
        }
        for (int arr :myArray) {
            // System.out.println(yes);
            System.out.println("Array["+ arr +"] = " + arr);

        }

    }

}
