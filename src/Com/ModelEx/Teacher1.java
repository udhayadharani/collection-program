package Com.ModelEx;

import java.util.List;

public class Teacher1 {
    String name;
    String degree;
    String location;
    int standard;
    int age;

    public Teacher1(String name, String degree, String location, int standard, int age) {
        this.name = name;
        this.degree = degree;
        this.location = location;
        this.standard = standard;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}