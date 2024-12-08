package tasks;


public class HistoricalPrices {
    public static void main(String[] args) {
        int[] priceArray1 = {4, 1, 2, 3};  //6   +4-1+3
        int[] priceArray2 = {1, 2, 3, 3, 2, 1, 5}; //7  +3 -1 +5
        int[] priceArray3 = {1, 2, 3, 1, 5, 1}; //7  +3 -1 +5
        System.out.println("--> " + solution(priceArray3));


    }

    public static int solution(int[] pricesArray) {  //{1, 2, 3, 3, 2, 1, 5}; =7  +3 -1 +5
        int result = 0;                               //1 2 3 1 5 1      +3 -1 +5
        int number = 0;                                // {4, 1, 2, 3};  //6   +4-1+3
        int maxPrice, minPrice;
        boolean flag = true;
        for (int j = number; j < pricesArray.length; j++) {
            if (flag) {
                for (int i = number; i < pricesArray.length - 1; i++) {
                    if (pricesArray[i] > pricesArray[i + 1]) {
                        maxPrice = pricesArray[i];
                        System.out.println("maxPrice:" + maxPrice);
                        result += maxPrice;
                        System.out.println("result:" + result);
                        number = i + 1;
                        System.out.println("number:" + number);
                        flag = false;
                        break;
                    }
                }
            }
            if (!flag) {
                for (int i = number; i < pricesArray.length - 1; i++) {
                    if (pricesArray[i] < pricesArray[i + 1]) {
                        minPrice = pricesArray[i];
                        System.out.println("minPrice:" + minPrice);
                        result -= minPrice;
                        System.out.println("result:" + result);
                        number = i + 1;
                        System.out.println("number:" + number);
                        flag = true;
                        break;
                    }
                }
            }
        }
        if (flag) {
            result = result + pricesArray[pricesArray.length - 1];
        }
        return result;
    }
}
