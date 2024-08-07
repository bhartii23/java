public class array_operation {
    public static void main(String[] args) {
        //length
        int [] marks ={98,45,67,99};
        System.out.println(marks.length);

        //displaying array
        for(int i =0;i<marks.length;i++){
        System.out.println(marks[i]);

        for(int element: marks)
        {
            System.out.println(element);
        }
        }
    }
}
