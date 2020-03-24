package models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Discipline {
    private StringProperty name = new SimpleStringProperty();;

    public StringProperty nameProperty() {
        return name;
    }

    public Discipline(String name){
        this.name.set(name);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String firstName) {
        this.name.set(firstName);
    }

    public String toString(){
        return getName();
    }


}
