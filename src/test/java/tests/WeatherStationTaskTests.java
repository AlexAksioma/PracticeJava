package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static tasks.WeatherStationTask.*;

public class WeatherStationTaskTests {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void test() {
        int[] arrayTemp1 = {10, 0, 2, -1, 4};  // 1
        softAssert.assertEquals(solution(arrayTemp1), 1);
        int[] arrayTemp2 = {15, 0, 3, -2, 3, -3, -1}; //1
        softAssert.assertEquals(solution(arrayTemp2), 1);
        int[] arrayTemp3 = {-10, -5, 0, 10, 15, 10, 16};  //2
        softAssert.assertEquals(solution(arrayTemp3), 2);
        int[] arrayTemp4 = {-20, -10, -18};
        softAssert.assertEquals(solution(arrayTemp4), 0);

        int[] arrayTemp6 = {5, -15, 33}; //min length
        softAssert.assertEquals(solution(arrayTemp6), 0);
        int[] arrayTemp8 = {5, -15}; //min length
        softAssert.assertEquals(solution(arrayTemp8), -1);
        int[] arrayTemp7 = {5, -15, 33, 0, 22, -1, 5, -15, 33, 0, 22, -1, 5, -15, 33, 0, 22, -1, 9};
        softAssert.assertNotEquals(solution(arrayTemp7), -1); //max
        int[] arrayTemp9 = {5, -15, 33, 0, 22, -1, 5, -15, 33, 0, 22, -1, 5, -15, 33, 0, 22, -1, 9, 22};
        softAssert.assertEquals(solution(arrayTemp9), -1); //max length

        int[] arrayTemp10 = {5, -15, 33, 0, 22, -1}; //even
        softAssert.assertEquals(solution(arrayTemp10), -1);

        //max and min element
        int[] arrayTemp11 = {-5, 10, -25};
        softAssert.assertEquals(solution(arrayTemp11), 0);
        int[] arrayTemp12 = {40, 10, 11};
        softAssert.assertEquals(solution(arrayTemp12), 0);
        int[] arrayTemp5 = {5, 10, -26};
        softAssert.assertEquals(solution(arrayTemp5), -1);
        int[] arrayTemp13 = {5, 10, 41};
        softAssert.assertEquals(solution(arrayTemp13), -1);

        //array empty and null
        int[] arrayTemp14 = {};
        softAssert.assertEquals(solution(arrayTemp14), -1);
        softAssert.assertEquals(solution(null), -1);

        softAssert.assertAll();
    }
}
