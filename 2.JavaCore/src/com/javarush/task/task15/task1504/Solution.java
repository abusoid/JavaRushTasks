package com.javarush.task.task15.task1504;

import java.util.LinkedList;
import java.util.List;

/* 
ООП - книги
*/

public class Solution {
    public static void main(String[] args) {
        List<Book> books = new LinkedList<Book>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
    }

    public static class MarkTwainBook extends Book{
        private String author;
        private String title;
        public MarkTwainBook(String name) {
            super("Mark Twain");
            this.author = name;
            this.title = name;
        }

        public MarkTwainBook getBook() {
            return this;
        }

        public String getTitle() {
            return this.title;
        }

        public String toString() {
            return super.toString();
        }
    }

    public static class AgathaChristieBook extends Book {
        private String author;
        private String title;
        public AgathaChristieBook(String name) {
            super("Agatha Christie");
            this.author = name;
            this.title = name;
        }
        public AgathaChristieBook getBook() {
            return this;
        }

        public String getTitle() {
            return this.title;
        }

        public String toString() {
            return super.toString();
        }
    }

    abstract static class Book {
        private String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutputByBookType() {
            String agathaChristieOutput = author + ", " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " book was written by " + author;

            String output = "output";
            if (getBook() instanceof MarkTwainBook) {
                output = markTwainOutput;
            } else {
                output = agathaChristieOutput;
            }

            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }
}
