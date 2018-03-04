package Introduction.NumberFormat;

import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        NumberFormat usCurrency = NumberFormat.getCurrencyInstance();
        String us = usCurrency.format(payment);

        Locale indiaLocal = new Locale("en", "IN");
        NumberFormat indiaCurrency = NumberFormat.getCurrencyInstance(indiaLocal);
        String india = indiaCurrency.format(payment);

        Locale chinaLocal = new Locale("zh", "CN");
        NumberFormat chinaCurrency = NumberFormat.getCurrencyInstance(chinaLocal);
        String china = chinaCurrency.format(payment);

        Locale franceLocal = new Locale("fr", "FR");
        NumberFormat franceCurrency = NumberFormat.getCurrencyInstance(franceLocal);
        String france = franceCurrency.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}