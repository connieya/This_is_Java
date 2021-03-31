package chap11.sec06.exam02_reflection;

public class Car {

    String company;
    String model;

    public Car(String company, String model) {
        this.company = company;
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
