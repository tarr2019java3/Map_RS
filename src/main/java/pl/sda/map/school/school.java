package pl.sda.map.school;

public class school {
    String name;
    String city;

    public school(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public school() {
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
