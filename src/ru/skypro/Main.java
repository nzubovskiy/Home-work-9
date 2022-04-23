package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Author author0 = new Author("Кэти", "Сьерра");
        Author author1 = new Author("Джордж", "Оруэлл");

        Book book0 = new Book("Изучаем Java", author0, 2012);
        Book book1 = new Book("1984", author1, 2010);

        book0.setYearOfPublication(2016);

    }
}
