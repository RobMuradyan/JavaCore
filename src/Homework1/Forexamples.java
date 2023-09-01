package Homework1;

public class Forexamples {
    //examle 1
    public static void main(String[] args) {
        for (int i = 1; i <=1000; i++) {
            System.out.print("-"+i);


        }
        System.out.println();
        System.out.println();
    int count=2;
        for (int j = count; j <51 ; j++) {
        int num=count%100;
        {
            System.out.print(num+" ");


            count = count + 2;
        }}
        System.out.println();
        System.out.println();
        int[] array = {2, 5, 8, 4, 9, 3, 7};


        int largestNumber = array[0];


        for (int i = 1; i < array.length; i++) {
            if (array[i] > largestNumber) {
                largestNumber = array[i];
            }
        }
        System.out.println(largestNumber);



    }}



