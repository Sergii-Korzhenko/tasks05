package Dz5;

public class Employee {
    public static void main(String[] args) {
        double tarif = 15.85;
        String name = "Ivan";
        int hour = 135;
        System.out.println(getBonus(tarif, hour));
        String position = "водитель";

        System.out.println("Имя: " + name + "Должность: " + position
                +"\n Зарплата: " + getSalary(tarif, hour) );
        int id = 314;
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
