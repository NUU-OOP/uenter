package org.example;

abstract class Account {
    private int id;
    private String password;
    private AccountStatus status;
    private Person person;

    // Getters

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public Person getPerson() {
        return person;
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        if (password.length()>=8) {
            this.password = password;
        }
        else {
            System.out.println("Password should be more than 8 characters");
        }
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    // method

    public static boolean resetPassword() {

        return true;
    }

}
