package Homework1;

public class FigurePainter {
    public static void main(String[] args) {
        //Patker 1
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("* ");
            }
            System.out.println();
            count++;


        }
        System.out.println();
        System.out.println();
        //patker2
        count = 5;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print("* ");


            }
            System.out.println();
            count--;
        }
        System.out.println();
        System.out.println();
        //Patker3
        int num = 5;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println();
        //patker4
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k <= num; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();

        //patker5


        int count1 = 1;
        int count3 = 4;
        for (int i = 0; i < 5; i++) {
            for (int k = 1; k <= count3; k++) {
                System.out.print(" ");

            }
            {
                for (int j = 0; j < count1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
                count1++;
                count3--;
            }
        }
        int count4 = 5;
        int count2 = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print(" ");

            for (int k = 0; k < count2; k++) {
                System.out.print(" ");

            }
            for (int j = 1; j < count4; j++) {
                System.out.print("* ");


            }
            System.out.println();
            count4--;
            count2++;
        }

    }
}




























