package collections;

import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Object> listObj = new ArrayList<>();
        listObj.add("str");
        listObj.add('a');
        listObj.add(1);
        listObj.add(12.2);
        listObj.add(true);
        listObj.add(null);
        listObj.add(2, "element2");
        System.out.println(listObj);
        //listObj.add(9, "element2");
        List<Object> listObj1 = new ArrayList<>();
        listObj1.add("obj1");
        listObj1.add("obj2");
        listObj.addAll(0, listObj1);
        System.out.println(listObj);
        System.out.println("==========================================");
        //System.out.println(listObj.size());
        //System.out.println(listObj.isEmpty());
        //===================================================
        Car car1 = new Car(4, "black", true);
        Car car2 = new Car(5, "green", false);
        Car car3 = new Car(2, "white", true);
        Car car4 = new Car(4, "black", false);
        Car car5 = new Car(5, "green", true);
        List<Car> carsList = new ArrayList<>();
        carsList.add(car1);
        carsList.add(car2);
        carsList.add(car3);
        carsList.add(car4);
        carsList.add(car3);
        carsList.add(car5);
        System.out.println("carList: " + carsList);
        Car carDelete = new Car(2, "white", true);
        carsList.remove(carDelete);
        System.out.println("carList: " + carsList);
        carsList.remove(0);
        System.out.println("carList: " + carsList);
        List<Car> carsListDelete = new ArrayList<>();
        carsListDelete.add(car1);
        carsListDelete.add(car2);
        carsListDelete.add(car3);
        carsListDelete.add(new Car(10, "red", false));
        System.out.println("carDelete: " + carsListDelete);
        //carsList.removeAll(carsListDelete);
        carsList.retainAll(carsListDelete);
        System.out.println("carList: " + carsList);
        carsList.clear();
        System.out.println("carList: " + carsList);
        System.out.println("==========================");
        List<Car> carsListNew = new ArrayList<>();
        carsListNew.add(car1);
        carsListNew.add(car2);
        carsListNew.add(car3);
        carsListNew.add(car4);
        carsListNew.add(car3);
        carsListNew.add(car5);
        System.out.println("carListNew: " + carsListNew);
        carsListNew.set(1, new Car(2, "blue", true));
        System.out.println("carListNew: " + carsListNew);
        Car carFind = new Car(2, "white", true);
        System.out.println("index = " + carsListNew.indexOf(carFind));
        System.out.println("index = " + carsListNew.lastIndexOf(carFind));
        System.out.println("is contains " + carsListNew.contains(carFind));
        List<Car> subList = new ArrayList<>();
        subList = carsListNew.subList(1,3);
        System.out.println("subList: " + subList);
        subList.add(new Car(11, "", false));
        System.out.println("subList: " + subList);
        System.out.println("carListNew " + carsListNew);
        //========================================================
        System.out.println("===================================");
        List<Integer> listInt = List.of(2,4,5,6,7);
        List<Integer> listInt1 = List.copyOf(listInt);
        //listInt.add(10);
        System.out.println(listInt);
        System.out.println(listInt1);
    }
}

class Car {
    int seats;
    String color;
    boolean isElectric;

    public Car(int seats, String color, boolean isElectric) {
        this.seats = seats;
        this.color = color;
        this.isElectric = isElectric;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return seats == car.seats
                && isElectric == car.isElectric
                && Objects.equals(color, car.color);
    }

    @Override
    public String toString() {
        return "Car{" + seats + "-" + color + "-" + isElectric +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(seats, color, isElectric);
    }
}
