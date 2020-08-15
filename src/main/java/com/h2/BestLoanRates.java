package com.h2;
import java.util.Scanner;

public class BestLoanRates {
    public static final Map<Integer, Float> bestRates = Map.of(
            k1:1, v1: 5.50f,
            k2:2, v2: 3.45f,
            k3:3, v3: 2.67f
    );
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        System.out.println("Enter the loan term (in years)");
        int loanTermInYears = scanner.nextInt();
        float bestRate = getRates(loanTermInYears);
        if(bestRate == 0.0f ) {
            System.out.println("No available rate for term: " + loanTermInYears + "years");
        } else {
            System.out.println("Best Available Rate: " + getRates(loanTermInYears) + "%");
        }
    }

    public static float getRates(int loanTermInYears) {
        if(bestRates.containsKey(loanTermInYears)) {
            return bestRates.get(loanTermInYears);
        }
        return 0.0f;
    }
}
