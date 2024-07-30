
public class JavaSalary {

    public static void main(String[] args) {
        Employee worker = new Employee("kemal", 2000.0, 45, 1985);

        System.out.println(worker.toString());
    }
}

class Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if (getSalary() > 1000) {
            tax = salary * 0.03;
        }
        return tax;
    }

    public double bonus() {
        double bonuss = 0;
        if (getWorkHours() > 40) {
            bonuss = (getWorkHours() - 40) * 30;
        }
        return bonuss;
    }

    public double raiseSalary() {
        double raise = 0;
        int year = 2021 - hireYear;
        if (year > 19) {
            raise = getSalary() * 0.15;
        } else if (year > 9 && year < 20) {
            raise = getSalary() * 0.1;
        } else if (year < 10) {
            raise = getSalary() * 0.05;
        }
        return raise;
    }

    double rate() {
        return getSalary() + bonus() + raiseSalary() - tax();
    }

    @Override
    public String toString() {
        return "Adı: " + getName() + "\nMaaşı: " + getSalary() + " \nÇalışma Saati: " + getWorkHours() + "\nBaşlangıç Yılı: " + getHireYear()
                + "\nVergi: " + tax() + "\nBonus: " + bonus() + "\nMaaş Artışı: " + raiseSalary() + "\nToplam maaş: " + rate();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

}
