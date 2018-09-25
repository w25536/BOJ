import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void bitOperatorsExamples() {

        byte a = 10;  // 00001010
        byte b = 9;   // 00001001
        byte c = 1;  //시프트할 칸수


        System.out.println(a + " & " + b + " = " + (a & b));

        /**
         * 논리곱
         *
         * 1010
         * 1001
         * ----
         * 1000 = 8
         */


        System.out.println(a + " | " + b + " = " + (a | b));

        /**
         * 논리합
         *
         * 1010
         * 1001
         * ----
         * 1011 = 11
         */

        System.out.println(a + " ^ " + b + " = " + (a ^ b));

        /**
         * 배타적 논리합 (exclusive or)은 수리 논리학에서 주어진 2개의 명제 가운데 1개만 참일 경우를 판단하는 논리 연산이다. 약칭으로 XOR, EOR, EXOR라고도 쓴다.
         *
         * 1010
         * 1001
         * ----
         * 0011 = 3
         */

        System.out.println("~10 = " + (~a));  //a 의 보수(반전)

        /**
         * 11111111 11111111 11111111 11110101 = -11
         *
         *
         */


        System.out.println(a + " << " + c + " = " + (a << c));  //왼쪽 1비트 시프트(뒤를 0 으로 채움)

        /**
         *     1010
         * <<)    1
         *   ---------
         *    10100 = 20
         */

        System.out.println(a + " >> " + c + " = " + (a >> c));  //오른쪽 1비트 시프트(앞을 밀리기전 첫째자리와 동일한 비트로 채움)

        /**
         *     1010
         * >>)    1
         *   ---------
         *    0101 = 5
         */


        System.out.println(a + " >>> " + c + " = " + (a >>> c)); //오른쪽 1비트 논리 시프트(앞을 0 으로 채움)
        System.out.println(-1 * a + " >> " + c + " = " + (-1 * a >> c));

    }

    public static void main(String[] args) throws IOException {


        int[] arr1 = {9, 20, 28, 18, 11}; //first input numbers
        int[] arr2 = {30, 1, 21, 17, 28}; //second input numbers

        /**
         * arr1 = {01001, 10100, 11100, 10010, 01011}
         * arr2 = {11110, 00001, 10101, 10001, 11100}
         */

        int n = 5; // size of array
        String[] arr3 = new String[n]; //creates n numbers of array that stores the values of resulted  bit OR "|" operator of the two arr1 and arr2.

        /**
         * arr3 = {11111, 10101, 11101, 10011, 11111}
         *
         */


        for (int i = 0; i < n; i++) {

            arr3[i] = Integer.toBinaryString(arr1[i] | arr2[i]);


        }

//                    .replaceAll("1", "#").replaceAll("0", " ");



        /**
         *     01001 10100 11100 10010 01011
         * |)  11110 00001 10101 10001 11100
         *   --------------------------------
         *     11111 10101 11101 10011 11111
         */




    }
}