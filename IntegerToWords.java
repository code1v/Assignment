import java.util.*;

public class IntegerToWords {
    String[] belowTen={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};

    String[] belowTwenty={"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

    String[] belowHundred={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public String numberToWords(int num){
        if(num==0) return "Zero";

        if(num<0) return "Negative " + numberToWords(-num);

        if(num<10){
            return belowTen[num];
        }
        if(num<20){
            return belowTwenty[num-10];
        }
        if(num<100){
            return belowHundred[num/10]+(num%10!=0 ? " "+ belowTen[num%10]:"");
        }
        if(num<1000){
            return belowTen[num/100] + " Hundred" + (num%100!=0 ? " "+ numberToWords(num%100):"");
        }
        if(num<1000000){
            return numberToWords(num/1000) + " Thousand" + (num%1000!=0 ? " "+ numberToWords(num%1000):"");
        }
        if(num<1000000000){
            return numberToWords(num/1000000) + " Million" + (num%1000000!=0 ? " "+ numberToWords(num%1000000):"");
        }
        return numberToWords(num/1000000000) + " Billion" + (num%1000000000!=0 ? " "+ numberToWords(num%1000000000):"");
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        System.out.println("The number in words is: " + new IntegerToWords().numberToWords(num));
    }
}