//import java.util.Calendar;
import java.text.NumberFormat;
//import java.util.Locale;
//import java.util.Scanner;
//import java.util.Currency;
import java.util.*;
import java.io.*;
public class Inr_to_Usd_Converter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        Locale INDIA = new Locale("en", "IN");

        NumberFormat inr = NumberFormat.getCurrencyInstance(INDIA);
       // inr.setCurrency(Currency.getInstance("INR"));

        NumberFormat usd = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat fran = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat chin = NumberFormat.getCurrencyInstance(Locale.CHINA);
        

        String amount1 = usd.format(amount);
        String amount2 = inr.format(amount);
        String amount3 = chin.format(amount);
        String amount4 = fran.format(amount);

        System.out.println("USD " + amount1);
        System.out.println("INDIA:Rs." + amount2);
        System.out.println("CHINA " + amount3);
        System.out.println("FRANCE " + amount4);
    }
}