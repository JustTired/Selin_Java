package org.example;

import java.util.LinkedList;
import java.util.List;

/*
ООП - книги
*/

public class Test {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ": " + getTitle() + " is a detective";
            String markTwainOutput = getTitle() + " was written by " + author;
            System.out.println(markTwainOutput);

            String output = "output";
            //Add your code here
            return switch (author){
                case "MarkTwain" -> markTwainOutput;
                case "AgathaChristie" -> agathaChristieOutput;
                default -> author + output;
            };
        }

        public String toString() {
            return getOutputByBookType();
        }


    }
    public static class MarkTwainBook extends Book{
        private String author;
        private String title;
        public MarkTwainBook(String title){
            super("MarkTwain");
            this.title = title;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }
    public static class AgathaChristieBook extends Book{
        private String author;
        private String title;
        public AgathaChristieBook(String title){
            super("AgathaChristie");
            this.title = title;
        }
        @Override
        public AgathaChristieBook getBook() {
            return null;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }

}

