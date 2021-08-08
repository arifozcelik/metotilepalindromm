import java.util.Scanner;

public class palindrommetot {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0,lastNumber;
        while(temp != 0){
            System.out.println("===============");
            System.out.println("Sayi => " +temp);

            lastNumber = temp % 10;
            System.out.println("son basamak => " + lastNumber);

            reverseNumber = (reverseNumber*10)+lastNumber;
            System.out.println("yeni sayi => " + reverseNumber);

            temp /= 10;
            System.out.println("yeni temp => " +temp);
        }
        return true;
    }
    public static void main(String[] args) {
        isPalindrom(2476);
    }
}
