package domain;

import java.io.Serializable;

//funcione como una lista de materiales con la que se hace el pedido
public class Lending implements Serializable {
    
    private int quantityDays;
    private String indate;
    private String outdate;
    private double fine;
    private String materialID;
    private String studentID;

    public Lending(int quantityDays, String indate, String outdate, double fine, String materialID, String studentID) {
        this.quantityDays = quantityDays;
        this.indate = indate;
        this.outdate = outdate;
        this.fine = fine;
        this.materialID = materialID;
        this.studentID = studentID;
    }
    public Lending() {
        this.quantityDays =0;
        this.indate = "";
        this.outdate = "";
        this.fine = 0.0;
        this.materialID = "";
        this.studentID = "";
    }

    public int getQuantityDays() {
        return quantityDays;
    }

    public void setQuantityDays(int quantityDays) {
        this.quantityDays = quantityDays;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public String getOutdate() {
        return outdate;
    }

    public void setOutdate(String outdate) {
        this.outdate = outdate;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public String getMaterialID() {
        return materialID;
    }

    public void setMaterialID(String materialID) {
        this.materialID = materialID;
    }

    public String getStudentID() {
        return studentID;
        
    }
    
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

}

    
