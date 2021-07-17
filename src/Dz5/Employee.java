package Dz5;

public class Employee {
    public static void main(String[] args) {
        double tarif = 5.85;
        String name = "Ivan";
        int hour = 135;
        String position = "водитель";
        int id = 314;
    }

    public static double getSalary(double tarif, int hour) {
        return tarif * hour;
    }
}
