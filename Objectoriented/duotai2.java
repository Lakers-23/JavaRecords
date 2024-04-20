public class duotai2 {
    public static void main(String[] args) {
        // 给一个有普通收入、工资收入和享受国务院特殊津贴的小伙伴算税:
        Income[] incomes = new Income[] {
            new Income(3000),
            new Salary(7500),
            new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    }

    //为什么totalTax是static类型的方法
    /**
     * main是静态方法，在一个静态方法中调用另一个方法，被调用的方法必须也是静态的，
     * 否则只能通过创建被调用方法所属类的实例，使用“类实例名.被调用方法名”的方式调用。
     */
    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();       //3000 * 0.1 + 2500 * 0.2 + 0 = 800
        }
        return total;
    }
}


class Income {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1; // 税率10%
    }
}

class Salary extends Income {

    public Salary(double income) {
        super(income);  //调用父类的构造方法
    }

    @Override       //覆写
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income){
        super(income);
    }
    
    @Override
    public double getTax() {
        return 0;
    }
}