package tasks;

import java.util.Arrays;

public class HistoricalPrices {
    public static void main(String[] args) {
        int[] priceArray1 = {4, 1, 2, 3};  //6   +4-1+3
        int[] priceArray2 = {1, 2, 3, 3, 2, 1, 5}; //7  +3 -1 +5
        System.out.println("--> " + solution(priceArray2));


    }

    public static int solution(int[] pricesArray) {
        int result = 0;
        int number = 0;
        int maxPrice, minPrice;
        while (number < pricesArray.length - 1) {
            for (int i = number; i < pricesArray.length-1; i++) {
                if (pricesArray[i] > pricesArray[i + 1]) {
                    maxPrice = pricesArray[i];
                    System.out.println("maxPrice" + maxPrice);
                    result += maxPrice;
                    System.out.println("result:" + result);
                    number = i;
                    System.out.println("number:" + number);
                    break;
                }
            }
            for (int i = number; i < pricesArray.length-1; i++) {
                if (pricesArray[i] < pricesArray[i + 1]) {
                    minPrice = pricesArray[i];
                    System.out.println("minPrice: " + minPrice);
                    result -= minPrice;
                    System.out.println("result:" + result);
                    number = i;
                    System.out.println("number:" + number);
                    break;
                }
            }

        }

        return result;
    }
}
