package pack;


import java.util.*;

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }

    public void testMath(){
        Scanner scanner = new Scanner(System.in);
        boolean b = false;
        int num1 = 0;
        int num2 = 0;
        System.out.println("Введіть перше число:");
        while(!b){
             num1 = 233;
            if(num1 != 0){
                b = true;
            }else System.out.println("Число має бути відмінним від нуля");
        }
        b = false;
        System.out.println("Введіть друге число:");
        while(!b){
            num2 = 689;
            if(num2 != 0){
                b = true;
            }else System.out.println("Число має бути відмінним від нуля");
        }
        System.out.println((num1 + num2) + " " + (num1-num2) + " " + (num1*num2) + " " + (num1/num2));
    }

    //Test output on 24, 4 standard input
    public static void main(String[] args) {
        new MoonComputerTests().testMath();
    }
}

//233 689