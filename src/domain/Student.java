package domain;

public class Student {

    public String student;
    public String career;
    public int year;
    public String idCollege;

    public Student() {
    }

    public Student(String student, String career, int incomeYear, String idCollege) {
        this.student = student;
        this.career = career;
        this.year = incomeYear;
        this.idCollege = idCollege;

    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIdCollege() {
        return idCollege;
    }

    public void setIdCollege(String idCollege) {
        this.idCollege = idCollege;
    }

    @Override
    public String toString() {
        return "Student  " + "student=" + student + "\n" + "Career=" + career + "\n" + "Year=" + year + "\n" + "IdCollege=" + idCollege;
    }

    public int sizeBytes() {
        //retorna la suma en bytes de todos los atributos

        return this.getStudent().length() * 2
                + this.getCareer().length() * 2
                + this.getIdCollege().length() * 2 + 4;
    }
}
