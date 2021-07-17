package Dz5;

public class Employee {
    public static void main(String[] args) {
        double tarif = 15.85;
        String name = "Ivan";
        int hour = 135;
    }

    public static double getSalary(double tarif, int hour) {
        return tarif * hour;
    }

    public static double getBonus(double tarif, int hour) {
        double salary = tarif * hour;
        if (salary > 2000) {
            return salary * 1.2;
        } else {
            return salary;
        }
    }
}
