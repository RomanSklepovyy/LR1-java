package ua.edu.uabs.author.task2;

public class Main {

    public static void main(String[] args) {

	    Student S1 = new Student("Ivan", "Antonenko", "Grigorovich", 17, 1);
        Student S2 = new Student("Viktor", "Velyanik", "Andriyovich", 20, 4);
        Student S3 = new Student();

        Lecturer L1 = new Lecturer("Artur", "Khomenets", "Vasylovych", 17, 120);
        Lecturer L2 = new Lecturer();

        Dean D = new Dean("Anatoliy", "Shevchenko", "Mikhailovich", 57, "2015-10-05");


        S1.ShowInfo();
        S1.ShowInfoCaps();
        S2.ShowInfo();
        S2.ShowInfoCaps();
        S3.ShowInfo();
        S3.ShowInfoCaps();

        L1.ShowInfo();
        L1.ShowInfoCaps();
        L2.ShowInfo();
        L2.ShowInfoCaps();

        D.ShowInfo();
        D.ShowInfoCaps();
    }
}
