package models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public  class Person {
    private StringProperty firstName = new SimpleStringProperty();
    private StringProperty secondName = new SimpleStringProperty();


    public StringProperty firstNameProperty() {
        return firstName;
    }

    public StringProperty secondNameProperty() {
        return secondName;
    }

    public Person(String firstName, String secondName) {
        this.firstName.set(firstName) ;
        this.secondName.set(secondName);

    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public void setSecondName(String secondName) {
        this.secondName.set(secondName);
    }

    public String getSecondName() {
        return secondName.get();
    }

    @Override

    public String toString(){
        return getSecondName() + " " + getFirstName();

    }
}