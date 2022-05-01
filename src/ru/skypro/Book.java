package ru.skypro;

import java.util.Objects;

public class Book {
    private String name;
    private Author authorName;
    private int yearOfPublication;

    public Book(String name, Author authorName, int yearOfPublication) {
        this.name = name;
        this.authorName = authorName;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return name + " - " + authorName + ", " + yearOfPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return Objects.equals(name, book.name) && Objects.equals(authorName,  book.authorName) && Objects.equals(yearOfPublication, book.yearOfPublication);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorName, yearOfPublication);
    }

}
