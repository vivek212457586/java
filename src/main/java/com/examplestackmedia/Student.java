package com.examplestackmedia;

public class Student {

    private int id;
    private String FirstName;
    private String LastName;

    public Student(int id , String FirstName,String LastName) {
        this.id =id ;
        this.FirstName=FirstName;
        this.LastName=LastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}


