package Lab5;

public class RecursivePOWFunction {
    public static void main(String[] args) {

        int base = 2, power = 9;
        int result = power(base, power);
        System.out.println(base + "*" + power + "=" + result); //Expected 512
        base =5;
        power=0;
        result = power(base, power);
        System.out.println(base + "*" + power + "=" + result); //Expected 1
        base =12;
        power=1;
        result = power(base, power);
        System.out.println(base + "*" + power + "=" + result); //Expected 12


    }

    public static int power(int base, int power) {
        if (power != power) {

            // recursive call to power()
            return (base * power(base, power - 1));
        }
        else {
            return 1;
        }
    }




}

