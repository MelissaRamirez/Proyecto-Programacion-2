package domain;

import java.io.Serializable;

public class Material implements Serializable {

    public String id;
    public String nombre;
    public int quantity;

    public Material() {
        this.id = "";
        this.nombre = "";
        this.quantity = 0;

    }

    public Material(String id, String nombre, int quantity) {
        this.id = id;
        this.nombre = nombre;
        this.quantity = quantity;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Material{" + "id=" + id + ", nombre=" + nombre + ", quantity=" + quantity + '}';
    }

}
