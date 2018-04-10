package domain;

import java.io.Serializable;

public class Audiovisual extends Material implements Serializable {

    private String description;
    private String brand;

    public Audiovisual(String description, String brand, String id, String nombre, int quantity) {
        super(id, nombre, quantity);
        this.description = description;
        this.brand = brand;
    }

    public Audiovisual(String description, String brand) {
        this.description = description;
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean startsWith(String start) {
        if (start.isEmpty() || start.length() > nombre.length()) {
            return false;
        }
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != nombre.charAt(i)) {
                return false;
            }

        }
        return true;

    }

    @Override
    public String toString() {
        return "Audiovisual{" + "description=" + description + ", brand=" + brand + '}';
    }

}
