package pl.sda.map.school;

public class School {
    String name;
    String city;

    public School(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public School() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
