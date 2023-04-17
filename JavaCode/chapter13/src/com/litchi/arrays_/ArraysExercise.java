package com.litchi.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 林志贤
 * @version 1.0
 */
public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦四大~", 100);
        books[1] = new Book("金瓶梅~", 90);
        books[2] = new Book("青年文摘~", 5);
        books[3] = new Book("Java从入门到放弃~", 300);
//        bobble02(books, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Integer i1 = (Integer) o1;
//                Integer i2 = (Integer) o2;
////                return i1 - i2;
//                return i2 - i1;
//            }
//        });


        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                return book1.getName().length() - book2.getName().length();
//                return book2.getName().length() - book1.getName().length();
//                return (int) (book2.getPrice() - book1.getPrice());
//                return (int) (book1.getPrice() - book2.getPrice());
            }
        });

        System.out.println(Arrays.toString(books));
    }
//
//    public static void bobble01(Book[] books, Comparator c) {
//        Book temp = null;
//        for (int i = 0; i < books.length - 1; i++) {
//            for (int j = 0; j < books.length - 1 - i; j++) {
//                if (c.compare(books[j].getPrice(), books[j + 1].getPrice()) > 0) {
//                    temp = books[j];
//                    books[j] = books[j + 1];
//                    books[j + 1] = temp;
//                }
//            }
//        }
//    }
//
//    public static void bobble02(Book[] books, Comparator c) {
//        Book temp = null;
//        for (int i = 0; i < books.length - 1; i++) {
//            for (int j = 0; j < books.length - 1 - i; j++) {
//                if (c.compare(books[j].getName().length(), books[j + 1].getName().length()) > 0) {
//                    temp = books[j];
//                    books[j] = books[j + 1];
//                    books[j + 1] = temp;
//                }
//            }
//        }
//    }
}

class Book {
    private String name;
    private Integer price;

    public Book(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
