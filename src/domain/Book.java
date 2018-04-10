package domain;

import java.io.Serializable;

public class Book extends Material implements Serializable {

    private String autor;
    private String type;
    private String title;
    private int year;

    public Book() {
        super();
    }

    public Book(String title, String autor, String type, int year, String id, String nombre, int quantity) {
        super(id, nombre, quantity);
        this.autor = autor;
        this.type = type;
        this.year = year;
        this.title = title;
    }

    public Book(String title, String autor, String editor, int year) {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean startsWith(String start) {
        if (start.isEmpty() || start.length() > title.length()) {
            return false;
        }
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != title.charAt(i)) {
                return false;
            }

        }
        return true;

    }

    @Override
    public String toString() {
        return super.toString() + "Book{" + "autor=" + autor + ", type=" + type + ", title=" + title + ", year=" + year + '}';
    }

}
