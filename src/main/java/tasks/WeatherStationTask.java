package tasks;

public class WeatherStationTask {

    public static void main(String[] args) {
        int[] arrayTemp1 = {10, 0, 2, -1, 4};  // 1
        int[] arrayTemp2 = {15, 0, 3, -2, 3, -3, -1}; //1
        int[] arrayTemp3 = {-10, -5, 0, 10, 15, 10, 16};  //2
        int[] arrayTemp4 = {-20 , -10 , -18};
        int[] arrayTemp5 = {5 , 10 , -35};  //1
        System.out.println("quantity --> " + solution(arrayTemp1));
        System.out.println("====================================");
        System.out.println("quantity --> " + solution(arrayTemp2));
        System.out.println("====================================");
        System.out.println("quantity --> " + solution(arrayTemp3));
        System.out.println("====================================");
        System.out.println("quantity --> " + solution(arrayTemp4));
        System.out.println("====================================");
        System.out.println("quantity --> " + solution(arrayTemp5));
    }

    public static int solution(int[] temperatures) {
        if(temperatures == null){
            System.out.println("array is null");
            return -1;
        }
        int minN = 2, maxN=10; //100
        if(temperatures.length<2*minN-1 || temperatures.length>2*maxN-1){
            System.out.println("temp length false");
            return -1;
        }
        if((temperatures.length%2 == 0)){
            System.out.println("array even");
            return -1;
        }
        for (int i = 0; i < temperatures.length; i++) {
            if(temperatures[i] <-25 || temperatures[i] > 40){
                System.out.println("40 < temp < -25");
                return -1;
            }
        }

        int counter = 0;
        for (int i = 1; i < temperatures.length; i += 2) {
            int nightTemp = temperatures[i];
            System.out.println(nightTemp);            //  -20  -10  -18       -18 - -10 == -18+10
            if (nightTemp >= temperatures[i - 1] && (Math.abs(temperatures[i + 1] - nightTemp)) <= 5) {
                counter++;
                System.out.println("nightTemp: " + nightTemp);
            } else if (Math.abs((temperatures[i - 1] - nightTemp)) <= 5
                    && (Math.abs(temperatures[i + 1] - nightTemp)) <= 5) {
                counter++;
                System.out.println("nightTemp: " + nightTemp);
            }
        }
        return counter;
    }
}
