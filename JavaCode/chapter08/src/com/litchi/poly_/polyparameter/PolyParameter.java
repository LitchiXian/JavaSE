package com.litchi.poly_.polyparameter;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("Tom", 2500);
        Manager milan = new Manager("milan", 5000, 200000);

        PolyParameter polyParameter = new PolyParameter();
//        tom.work();
//        milan.manage();
        polyParameter.testWork(tom);
        polyParameter.testWork(milan);
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(milan);
    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) ((Worker) e).work();
        else if (e instanceof Manager) {
            ((Manager) e).manage();
        }
    }
}
