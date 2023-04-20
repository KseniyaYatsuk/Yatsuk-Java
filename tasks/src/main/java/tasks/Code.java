package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Code {

    public String reverseString(String str) {
        String[] symbols = str.split("");
        String reverseSymbols = "";
        for (int i = symbols.length - 1; i >= 0; i--) {
            reverseSymbols += symbols[i];
        }
        return reverseSymbols;
    }

    public String reverseStringWithoutMethodsOfString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public int getCountOfWorlds(String str) {
        HashMap<String, String> map = new HashMap<>();
        String[] strings = str.split(" ");
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], "");
        }
        return map.size();
    }

    public String replaceSymbols(String str, String originSymbol, String symbolForReplace) {
        return str.replace(originSymbol, symbolForReplace);
    }

    public String deleteSymbols(String str, String deleteSymbol) {
        return str.replace(deleteSymbol, "");
    }

    public int countOfSymbol(String str, String symbol) {
        return str.length() - str.toUpperCase().replace(symbol.toUpperCase(), "").length();
    }

    public void stringWithSeparator(String str, String separator, int count) {
        for (int i = 1; i < count; i++) {
            System.out.print(str + separator);
        }
        System.out.println(str);
    }

    public boolean isStringPalindrome(String str) {
        String stringWithoutSpaces = str.replace(" ", "").toLowerCase();
        return new StringBuilder(stringWithoutSpaces).reverse().toString().equals(stringWithoutSpaces);
    }

    public boolean isAnagram(String originalStr, String str) {
        String[] originalSymbols = originalStr.split("");
        Arrays.sort(originalSymbols);
        String[] symbols = str.split("");
        Arrays.sort(symbols);
        return Arrays.equals(originalSymbols, symbols);
    }

    public int getFibonacciNumber(int number) {
        int firstNumber = 0;
        int secondNumber = 1;
        int fibonacciNumber = 0;
        if (number < 2) {
            fibonacciNumber = number;
        } else {
            for (int i = 2; i <= number; i++) {
                fibonacciNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = fibonacciNumber;
            }
        }
        return fibonacciNumber;
    }

    public long getFactorial(int number) {
        long factorial = 1;
        while (number > 1) {
            factorial *= number;
            number -= 1;
        }
        return factorial;
    }

    public List<String> convertNumber(int number) {
        List<String> results = new ArrayList<>();
        if (number % 2 == 0) {
            results.add("Это четное число");
        }
        if (number % 10 == 0) {
            results.add(String.valueOf(number / 10));
        }
        if (number % 3 == 0) {
            results.add(String.valueOf(getFactorial(number)));
        }
        return results;
    }
}
