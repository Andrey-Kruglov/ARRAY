import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] number1 = new int[12];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(number1[i]);
        }
        float[] number2 = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }
        double[] mumber3 = {1_222_0002, 12, -1, -112, 14, 11111, -66};
        for (int i = 0; i < mumber3.length; i++) {
            System.out.println(mumber3[i]);
        }
        System.out.println("Задача 2");
        int[] number11 = new int[3];
        number11[0] = 1;
        number11[1] = 2;
        number11[2] = 3;
        for (int i = 0; i < number11.length; i++) {
            System.out.print(number11[i]);
            if (i != number11.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        float[] number22 = {1.57f, 7.654f, 9.986f};
        for ( int i = 0; i < number22.length; i++) {
            if (i < number22.length - 1) {
                System.out.print(number22[i] + ", ");
            } else {
                System.out.print(number22[i]);
            }
        }
            System.out.println();
            double[] number33 = {1_222_0002, 12, -1, -112, 14, 11111, -66};
            for (int i = 0; i < number33.length; i++){
                if (i < number33.length - 1) {
                    System.out.print(number33[i] + ", ");
                } else {
                    System.out.print(number33[i]);}
                }
        System.out.println();
        System.out.println("Задача 3");
        int[] number111 = new int[3];
        number111[0] = 1;
        number111[1] = 2;
        number111[2] = 3;
        for (int i = number111.length - 1; i >=0; --i) {
            if (i > 0) {
                System.out.print(number111[i] + ", ");
            } else {
                System.out.print(number111[i]);}

            }
        System.out.println();
        float[] number222 = {1.57f, 7.654f, 9.986f};
        for (int i = number222.length - 1; i >= 0; i--){
            if (i > 0){
                System.out.print(number222[i] + ", ");}
            else {
                System.out.print(number222[i]);

            }
        }
        System.out.println();
        double[] number333 = {1_222_0002, 12, -1, -112, 14, 11111, -66};
        for (int i = number333.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(number333[i] + ", ");
            } else {
                System.out.print(number333[i]);
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        int[] number = {1, 2, 3};
        for (int i : number) {
        }
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i]++;
            }
        }
        System.out.println(Arrays.toString(number));




        }




    }


