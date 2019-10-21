package ua.edu.uabs.author.task2;

public class Student {
    String firstname;
    String lastname;
    String surname;
    int age;
    int course;

    public Student() {}

    public Student(String firstname, String lastname, String surname, int age, int course) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.surname = surname;
        setAge(age);
        this.course = course;
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
        if(age>=18 && age <= 70) this.age = age; else System.out.println("Age must be from 18 to 70!");
    }

    public void setCourse(int course) {
        this.course = course;
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

    public int getCourse() {
        return course;
    }

    //виведення інформації у 1 форматі
    public void ShowInfo() {

        System.out.println("Student " + firstname + ' ' + lastname + ' ' + surname
                + " age:" + age + " course: " + course);

    }

    //виведення інформації у 2 форматі
    //добавляємо блок try catch для обробки виключення у випадку коли атрибути об'єкту не було задано
    public void ShowInfoCaps() {

        try {
            System.out.println("Student " + firstname.toUpperCase() + ' ' + lastname.toUpperCase().charAt(0) + ' ' + surname.toUpperCase().charAt(0)
                    + " AGE:" + age + " COURSE: " + course);
        } catch (NullPointerException e) {
            System.out.println("Object is empty!");
        }
    }


}
