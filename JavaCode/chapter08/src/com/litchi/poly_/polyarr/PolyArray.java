package com.litchi.poly_.polyarr;

public class PolyArray {
    public static void main(String[] args) {
        Person[] peoples = new Person[5];
        peoples[0] = new Person("jack", 20);
        peoples[1] = new Student("jack", 18, 100);
        peoples[2] = new Student("smith", 19, 30.1);
        peoples[3] = new Teacher("scott", 30, 20000);
        peoples[4] = new Teacher("king", 50, 25000);

        for (int i = 0; i < peoples.length; i++) {
            System.out.println(peoples[i].say());
            if (peoples[i] instanceof Student) {
                Student s = (Student) peoples[i];
                s.study();
            } else if (peoples[i] instanceof Teacher) {
                Teacher t = (Teacher) peoples[i];
                t.teach();
            }
        }
        System.out.println("========================");
        for (Person p : peoples) {
            if (p instanceof Student) {
                ((Student) p).study();
            } else if (p instanceof Teacher) {
                ((Teacher) p).teach();
            }
            System.out.println(p.say());
        }


    }
}
