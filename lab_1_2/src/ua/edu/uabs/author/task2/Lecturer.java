package ua.edu.uabs.author.task2;

public class Lecturer {
    String firstname;
    String lastname;
    String surname;
    int age;
    int numberOfHours;

    public  Lecturer() {}

    public Lecturer(String firstname, String lastname, String surname, int age, int numberOfHours) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.surname = surname;
        setAge(age);
        this.numberOfHours = numberOfHours;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if(age>=23 && age <= 70) this.age = age; else System.out.println("Age must be from 23 to 70!");
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    //виведення інформації у 1 форматі
    public void ShowInfo() {
        System.out.println("Lecturer " + firstname + ' ' + lastname + ' ' + surname
                + " age:" + age + " number of hours: " + numberOfHours);
    }

    //виведення інформації у 2 форматі
    //добавляємо блок try catch для обробки виключення у випадку коли атрибути об'єкту не було задано
    public void ShowInfoCaps() {

        try {
            System.out.println("LECTURER " + firstname.toUpperCase() + ' ' + lastname.toUpperCase().charAt(0) + ' ' + surname.toUpperCase().charAt(0)
                    + " AGE:" + age + " NUMBER OF HOURS: " + numberOfHours);
        } catch (NullPointerException e) {
            System.out.println("Object is empty!");
        }
    }


}
