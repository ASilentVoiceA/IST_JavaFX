package models;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Teacher extends Person {
    private IntegerProperty WorkExp = new SimpleIntegerProperty();

    public IntegerProperty WorkExpProperty() {
        return WorkExp;
    }

    public Teacher(String firstName, String secondName, Integer WorkExp) {
        super(firstName, secondName);
        this.WorkExp.set(WorkExp);
    }

    public void setWorkExp(Integer WorkExp) {
        this.WorkExp.set(WorkExp);
    }

    public Integer getWorkExp() {
        return WorkExp.get();
    }
}