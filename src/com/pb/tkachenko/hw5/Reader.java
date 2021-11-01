package com.pb.tkachenko.hw5;

public class Reader {
    private String fullName;
    private int libraryNumber;
    private String faculty;
    private String birthDate;
    private String phone;

    Reader(String fullName, int libraryNumber, String faculty, String birthDate, String phone){
        this.fullName = fullName;
        this.libraryNumber = libraryNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phone = phone;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(int libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void takeBook(int bookNumber){
        System.out.println(fullName + " взял "+ bookNumber + " книги");
    }

    public void takeBook(String... books){
        String booksList="";
        for(int i=0;i<books.length;i++) {
            if(i == books.length - 1) {
                booksList += books[i] + ".";
            } else {
                booksList += books[i] + ", ";
            }
        }
        System.out.println(fullName + " взял книги: "+booksList);
    }

    public void takeBook(Book... books){
        String booksinfo="";
        for(int i=0;i<books.length;i++) {
            if(i == books.length - 1) {
                booksinfo += books[i].getBookInfo() + ".";
            } else {
                booksinfo += books[i].getName() + " (" +books[i].getAuthor() + " "+ books[i].getYear()+ "), ";
            }
        }
        System.out.println(fullName + " взял книги: "+booksinfo);
    }

    public void returnBook(int bookNumber){
        System.out.println(fullName + " вернул  "+ bookNumber + " книги");
    }

    public void returnBook(String... books){
        String booksList="";
        for(int i=0;i<books.length;i++) {
            if(i == books.length - 1) {
                booksList += books[i] + ".";
            } else {
                booksList += books[i] + ", ";
            }
        }
        System.out.println(fullName + " вернул книги: "+booksList);
    }

    public void returnBook(Book... books){
        String booksinfo="";
        for(int i=0;i<books.length;i++) {
            if(i == books.length - 1) {
                booksinfo += books[i].getBookInfo() + ".";
            } else {
                booksinfo += books[i].getName() + " (" +books[i].getAuthor() + " "+ books[i].getYear()+ "), ";
            }
        }
        System.out.println(fullName + " вернул книги: "+booksinfo);
    }
}
