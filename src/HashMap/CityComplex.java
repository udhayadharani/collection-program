package HashMap;

public class CityComplex {
    private String name;
    private int pinCode;

    @Override
    public boolean equals(Object o) {

        CityComplex city = (CityComplex) o;
        return city.getName().equals(this.name) && city.getPinCode()==this.getPinCode();
    }

    @Override
    public int hashCode() {
        return 50;
    }

    public CityComplex(String name, int pinCode) {
        this.name = name;
        this.pinCode = pinCode;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;


    }
}
