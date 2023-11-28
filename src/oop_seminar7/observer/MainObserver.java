package oop_seminar7.observer;

public class MainObserver {
    public static void main(String[] args) {
        Publisher jobAgency = new JobAgency();
        Company google = new Company(jobAgency, "Google", 500);
        Company geekBrains = new Company(jobAgency, "GeekBrains", 1000);
        Student petrov = new Student("Petrov");
        Master ivanov = new Master("Ivanov");
        Junior sidorov = new Junior("Sidorov");
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);

        for(int i = 0; i< 10; i++){
            google.needEmployee();
            geekBrains.needEmployee();
        }
    }
}
