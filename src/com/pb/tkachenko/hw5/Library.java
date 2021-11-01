package com.pb.tkachenko.hw5;

public class Library {
    public static void main(String[] args) {
        Book[] book = new Book[3];
        book[0] = new Book("Властелин колец", "Дж. Толкиен", 1966);
        book[1] = new Book("Перступление и наказание", "Ф. Достоевский", 1977);
        book[2] = new Book("Человек разумный", "Ю. Харари", 2018);

        Reader[] reader = new Reader[3];
        reader[0] = new Reader("Птущкин И.В.",12,"банковские технологии","10.01.1999","0963332233");
        reader[1] = new Reader("Ткаченко И.В.",1,"банковские технологии","13.04.1988","0961122312");
        reader[2] =new Reader("Ильченко О.В.",15,"международное право","22.08.1975","0931112322");


        printReaders(reader);
        printBooks(book);

        reader[0].takeBook(3);
        reader[0].takeBook(book[0].getName(), book[1].getName(),book[2].getName());
        reader[2].takeBook(book[0], book[2]);

        reader[1].returnBook(2);
        reader[1].returnBook(book[1].getName(), book[2].getName());
        reader[0].returnBook(book[1], book[2]);
    }

    static void printReaders(Reader[] readers){
        System.out.println("Список читаталей:");
        for(Reader reader: readers) {
            System.out.println(reader.getFullName());
        }
    }

    static void printBooks(Book[] books){
        System.out.println("Список книг:");
        for(Book book: books) {
            System.out.println(book.getName());
        }
    }

}
