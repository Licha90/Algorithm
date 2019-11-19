package algorithm;

import java.util.Scanner;

public class ReverseNumber {

    public int reverse(int x){

        int reverseNumber = 0;


        while (x != 0){

                reverseNumber = reverseNumber * 10 + x % 10;//1模除100等于1 1模除50等于1 1模除2等于1 一个数 模除 比自身大的数 都等于它自身
                                                            //所以 1 % 10 = 1

                x /= 10;
            }

//            else if (x % 10 != (int)(Math.random()*10)){
        return reverseNumber;
    }

    public static void main(String[] args) {

        ReverseNumber reverseNumber = new ReverseNumber();

        int value = reverseNumber.reverse(-123);

        System.out.println(value);
    }
}
