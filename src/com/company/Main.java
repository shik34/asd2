package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println ( ( (x<=0) && (x*x+y*y<1) ) || x>0 && (x*x+y*y<1) && y>x  ?"YES_2":"NO_1");
    }
}
