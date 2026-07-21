import java.time.Year;

public class Employee {
    String name;
    double salary;
    int workHour;
    int hireYear;

    public Employee(String name, double salary, int workHour, int hireYear) {
        this.hireYear = hireYear;
        this.name = name;
        this.salary = salary;
        this.workHour = workHour;
    }

    public double tax() {
        if (this.salary <= 1000)
            return 0.0;
        else
            return this.salary*0.03;
    }

    public double bonus() {
        if (this.workHour <= 40)
            return 0.0;
        else
            return (this.workHour-40)*30.0;
    }

    public double raiseSalary() {
        int year = Year.now().getValue();
        int worked = year - this.hireYear;
        if (worked < 10)
            return this.salary*0.05;
        else if (worked < 20) {
            return this.salary*0.1;
        }else
            return this.salary*0.15;
    }

    public String toString() {
        return "Adı : " + this.name +
                "\nMaaşı : " + this.salary +
                "\nÇalışma saati : " + this.workHour +
                "\nBaşlangıç yılı : " + this.hireYear +
                "\nVergi : " + this.tax() +
                "\nBonus : " + this.bonus() +
                "\nMaaş artışı : " + this.raiseSalary() +
                "\nVergi ve bonuslar birlikte maaş : " + (this.salary+this.bonus()-this.tax()) +
                "\nToplam maaş : " + (this.salary+this.bonus()+this.raiseSalary()-this.tax());
    }

    static void main() {
        Employee a = new Employee("Ahmet", 2000.0, 45, 1985);
        System.out.println(a);
    }
}