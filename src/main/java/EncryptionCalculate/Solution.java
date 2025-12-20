package EncryptionCalculate;

public class Solution {
    public static void main(String[] args) {
        int a = 5,b = -1;
        System.out.println(encryptionCalculate(a, b));
    }
    public static int encryptionCalculate(int dataA, int dataB) {
        int a=dataA; int b=dataB;
//        if(dataA < 0){
//            a = dataB;
//            b = ~dataA + 1;
//        }
//        if(dataB < 0){
//            a = dataA;
//            b = ~dataB + 1;
//        }
        int sum; int carry;
        while(b != 0){
            sum = a ^ b;
            carry = (a & b) << 1;

            a=sum;
            b=carry;
        }
        return a;
    }
}
