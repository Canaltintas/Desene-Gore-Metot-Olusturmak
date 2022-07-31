import java.util.Scanner;

public class main {
    static int fraktal(int a,boolean isNegative,int temp){
        System.out.println(a);
        if (a <= 0){
            return fraktal(a+5,true,temp);

        }

        if (isNegative){
            if (a !=temp){
                return fraktal(a+5,true,temp);
            }else {
                return temp;
            }

        }else {
            return fraktal(a-5,false,temp);
        }



    }

    public static void main(String[] args) {
        int number;
        Scanner input =new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        number=input.nextInt();
        fraktal(number,false,number);
    }
}
