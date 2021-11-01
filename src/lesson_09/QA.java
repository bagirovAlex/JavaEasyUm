package lesson_09;

public class QA extends AbstractEmployer{

    @Override
    public void doWork() {

    }

    @Override
    public void keepSalary() {
        this.setMoney(this.getMoney()+1500);
    }
}
