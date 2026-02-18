/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.smallbusinessrev;
import java.util.Scanner;

/**
 *
 * @author syaza_szoqrgp
 */
public class SmallBusinessRev {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double price, quantity, totalRev = 0;
        String name;
        int count = 0;
        char choice;
        
        String[] nameProduct = new String[100];
        double[] priceProduct = new double[100];
        double[] quantityProduct = new double[100];
        
        do {
        System.out.print ("Name of the product: ");
        name = input.nextLine();
        
        System.out.print ("Price of the product:RM ");
        price = input.nextDouble();
        
        System.out.print ("Total of item sold: ");
        quantity = input.nextDouble();
        
        input.nextLine();
        
        nameProduct[count] = name;
        priceProduct[count] = price;
        quantityProduct[count] = quantity;
        
        totalRev += priceProduct[count] * quantityProduct[count];
        
        System.out.print ("Add another product? (yes/no): ");
        choice = input.next().charAt(0);
        input.nextLine();
        
        count++;
        } while ((choice == 'Y' || choice == 'y') && count < 100);
        
        System.out.print ("Cost of Goods Sold (COGS):RM ");
        double cogs = input.nextDouble();
        
        System.out.print ("Operating Expense - Rent:RM ");
        double rent = input.nextDouble();
        
        System.out.print ("Operating Expense - Marketing:RM ");
        double marketing = input.nextDouble();
        
        double totalOperatingExpenses = rent + marketing;
        double totalExpenses = totalOperatingExpenses + cogs;
        double grossProfit = totalRev - cogs;
        double operatingIncome = grossProfit - totalOperatingExpenses;
        
        System.out.print ("Enter tax rate: ");
        double taxRatePercent = input.nextDouble();
        
        double taxRate = taxRatePercent / 100.0;
        double taxAmount = operatingIncome * taxRate;
        double netIncome = operatingIncome - taxAmount;
        
        System.out.println("\n--- INCOME STATEMENT ---");
        System.out.printf("Total Revenue:      RM %10.2f\n", totalRev);
        System.out.printf("Total Expenses:    -RM %10.2f\n", totalExpenses);
        System.out.println("-------------------------------");
        System.out.printf("Net Income:         RM %10.2f\n", netIncome);

    }
}
