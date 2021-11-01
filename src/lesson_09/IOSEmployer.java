package lesson_09;

public class IOSEmployer extends AbstractEmployer implements Employer {
    @Override
    public void doWork() {
        System.out.println("Пишу код");
    }

    @Override
    public void keepSalary() {
        this.setMoney(2000+this.getMoney());
    }


}