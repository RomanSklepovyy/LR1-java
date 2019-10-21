package ua.edu.uabs.author.task2;

public class Dean {
    String firstname;
    String lastname;
    String surname;
    int age;
    String dateOfElection;

    public Dean() {}

    public Dean(String firstname, String lastname, String surname, int age, String dateOfElection) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.surname = surname;
        setAge(age);
        this.dateOfElection = dateOfElection;
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
        if(age>=25 && age <= 70) this.age = age; else System.out.println("Age must be from 25 to 70!");
    }

    public void setDateOfElection(String dateOfElection) {
        this.dateOfElection = dateOfElection;
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

    public String getDateOfElection() {
        return dateOfElection;
    }

    //виведення інформації у 1 форматі
    public void ShowInfo() {
        System.out.println("Dean " + firstname + ' ' + lastname + ' ' + surname
                + " age:" + age + " date of election: " + dateOfElection);
    }

    //виведення інформації у 2 форматі
    //добавляємо блок try catch для обробки виключення у випадку коли атрибути об'єкту не було задано
    public void ShowInfoCaps() {

        try {
            System.out.println("DEAN " + firstname.toUpperCase() + ' ' + lastname.toUpperCase().charAt(0) + ' ' + surname.toUpperCase().charAt(0)
                    + " AGE:" + age + " DATE OF ELECTION: " + dateOfElection);
        } catch (NullPointerException e) {
            System.out.println("Object is empty!");
        }
    }

}
