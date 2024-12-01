package tasks;

public class WeatherStationTask {

    public static void main(String[] args) {
        int[] arrayTemp1 = {10, 0, 2, -1, 4};  // 1
        int[] arrayTemp2 = {15, 0, 3, -2, 3, -3, -1};
        int[] arrayTemp3 = {-10, -5, 0, 10, 15, 10, 16};
        System.out.println("quantity --> " + solution(arrayTemp1));
        System.out.println("quantity --> " + solution(arrayTemp2));
        System.out.println("quantity --> " + solution(arrayTemp3));
    }

    static int solution(int[] temperatures) {
        int counter = 0;
        for (int i = 1; i < temperatures.length; i += 2) {
            int nightTemp = temperatures[i];
            System.out.println(nightTemp);
            if (nightTemp >= temperatures[i - 1] && (temperatures[i + 1] - nightTemp) <= 5) {
                counter++;
                System.out.println("nightTemp: " + nightTemp);
            } else if ((temperatures[i - 1] - nightTemp) <= 5 && (temperatures[i + 1] - nightTemp) <= 5) {
                counter++;
                System.out.println("nightTemp: " + nightTemp);
            }
        }

        return counter;
    }
}
