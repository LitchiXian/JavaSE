package com.litchi.list_;

import java.util.*;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ListExercise02 {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        List list = new Vector();
        List list = new LinkedList();

//        Book[] books = new Book[3];
//        books[0] = new Book("三国演义", 28.8, "罗贯中");
//        books[1] = new Book("jacklove", 19.9, "jack");
//        books[2] = new Book("肩带", 37.8, "小黑子");
//
//        Arrays.sort(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book b1 = (Book) o1;
//                Book b2 = (Book) o2;
//                return (int) (b1.getPrice() - b2.getPrice());
//            }
//        });
//
//        for (Book book : books) {
//            list.add(book);
//        }

        list.add(new Book("三国演义", 28.8, "罗贯中"));
        list.add(new Book("jacklove", 19.9, "jack"));
        list.add(new Book("肩带", 7.8, "小黑子"));
        list.add(new Book("肩带2", 17.8, "小黑子"));

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                Book o1 = (Book) list.get(j);
                Book o2 = (Book) list.get(j + 1);
                if (o1.getPrice() > o2.getPrice()){
//                    Object o = list.get(j);
//                    list.remove(j);
//                    list.add(j + 1, o);
                    list.set(j, o2);
                    list.set(j + 1, o1);
                }
            }
        }

        for (Object o : list) {
            Book book = (Book) o;
            System.out.println("名称: " + book.getName() + "\t价格: " + book.getPrice() + "\t作者: " + book.getAuthor());
        }
    }
}

class Book {
    private String name;
    private double price;
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }
}