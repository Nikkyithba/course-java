package com.nikky.javabasics;

public class Book extends Product{

    private String author;

    public Book( String co, String de, double pr, String au){

        super("AAAA", "product",0.0);
        author=au;
        count ++;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
