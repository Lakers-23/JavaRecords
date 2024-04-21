/**
 * 用抽象类给一个有工资收入和稿费收入的小伙伴算税
 */
public class abstractClass2 {
    public static void main(String[] args) {
        Income[] incomes  = new Income[] {
            new Salary(7000),
            new Gaofei(12000),
        };

        System.out.println(totalTax(incomes));  //2000 * 0.1 + 7000 * 0.2 = 1600
    }

    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax(); 
        }
        return total;
    }
}

abstract class Income {
    protected double income;

    public abstract double getTax();
}

class Salary extends Income {

    public Salary(double income) {
        this.income = income;
    }

    @Override       //覆写
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.1;
    }
}

class Gaofei extends Income {

    public Gaofei(double income) {
        this.income = income;
    }

    @Override       //覆写
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}
