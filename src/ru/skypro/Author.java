package ru.skypro;

import java.util.Objects;

public class Author {
                    private String authorName;
                    private String authorSurname;

                    public Author(String authorName, String authorSurname) {
                        this.authorName = authorName;
                        this.authorSurname = authorSurname;
                    }

                    public String getAuthorName() {
                        return authorName;
                    }

                    public String getAuthorSurname() {
                        return authorSurname;
                    }

                    @Override
                    public String toString() {
                        return authorName + " " + authorSurname;
                    }

                    @Override
                    public boolean equals(Object other) {
                        if (this.getClass() != other.getClass()) {
                            return false;
                        }
                        Author author = (Author) other;
                        return author.equals(author.authorName) && author.equals(author.authorSurname);
                    }

    @Override
    public int hashCode() {
        return Objects.hash(authorSurname);
    }

    }



