package ru.skypro;

public class Main {

    public static void main(String[] args) {

        Author author0 = new Author("Кэти", "Сьерра");
        Author author1 = new Author("Джордж", "Оруэлл");

        Book book0 = new Book("Изучаем Java", author0, 2012);
        Book book1 = new Book("1984", author1, 2010);

        book0.setYearOfPublication(2016);

        System.out.println(book0.getName()+" "+book0.getAuthorName().getAuthorName()+ " " +book0.getAuthorName().getAuthorSurname()+ " " +book0.getYearOfPublication());
        System.out.println(book1.getName()+" "+book1.getAuthorName().getAuthorName()+ " " +book1.getAuthorName().getAuthorSurname()+ " " +book1.getYearOfPublication());
    }
}
