package datastructures.recursion.codingbat;

public class SumNumbers {

    public static int sumNums(int num){
        if(num == 1){
            return 1;
        }
        return num + sumNums(num -1) ;
    }

    public static void main(String[] args) {
        System.out.println(sumNums(5));
    }
}