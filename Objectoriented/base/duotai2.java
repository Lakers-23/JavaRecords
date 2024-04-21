public class duotai2 {
    public static void main(String[] args) {
        // ��һ������ͨ���롢������������ܹ���Ժ���������С�����˰:
        Income[] incomes = new Income[] {
            new Income(3000),
            new Salary(7500),
            new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    }

    //ΪʲôtotalTax��static���͵ķ���
    /**
     * main�Ǿ�̬��������һ����̬�����е�����һ�������������õķ�������Ҳ�Ǿ�̬�ģ�
     * ����ֻ��ͨ�����������÷����������ʵ����ʹ�á���ʵ����.�����÷��������ķ�ʽ���á�
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
        return income * 0.1; // ˰��10%
    }
}

class Salary extends Income {

    public Salary(double income) {
        super(income);  //���ø���Ĺ��췽��
    }

    @Override       //��д
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