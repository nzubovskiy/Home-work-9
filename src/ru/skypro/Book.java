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
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return name.equals(book.name) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
