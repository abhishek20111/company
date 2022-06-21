package com.company;

import com.sun.source.tree.BreakTree;

//class Library_1{
//    String [] books;
//    int no_of_books;
//    Library_1(){
//
//        this.books = new String[100];
//        this.no_of_books = 0;
//    }
//    void add_book(String book){
//        this.books[no_of_books] = book;
//        System.out.println(book+" book as been added\n ");
//        no_of_books++;
//    }
//    void display_book(){
//        System.out.println("Available books are ---");
//        for (String book :this.books) {
//            if (book == null){
//                continue;
//            }
//            System.out.println("@ "+book);
//        }
//    }
//    void issue_book(String book){
//        for (int i=0; i<this.books.length; i++){
//            String b = this.books[i];
//            if (b == book){
//                System.out.println("The "+book+" book has been issued --");
//                this.books[i] = null;
//                return;
//            }
//        }
//        System.out.println("This book not exist");
//
//    }
//    void return_book(String book){
//        for (int i=0; i< this.books.length; i++){
////            if (this.books[i].equals(book)){
//            if (this.books[i]==book){
//                    System.out.println("there is already existed book of same name - "+book);
//                    break;
//                }
//                else if(this.books[i] == null){
//                    System.out.println("your book is submitted --"+book);
//                    this.books[i] = book;
//                    break;
//
//                }
//
//        }
//    }
//}




interface Library_order{
    void add_book(String name);

    void display_book();

    void return_book(String name);

    void issue_book(String name);
}
class Library_1 implements Library_order{
    String [] book_name;
    protected int no_of_books;

    Library_1(){
        this.book_name = new String[3];
        this.no_of_books = 0;
    }

    @Override
    public void add_book(String book){
        if (book_name[no_of_books] == null){
            book_name[no_of_books] = book;

        }
        no_of_books++;

    }
    @Override
    public void display_book(){
        System.out.println("\t\t\t\t\t\t\t\t--------Welcome--------");
        System.out.println("Avilable book in liberary is --");
        for (String book:book_name) {
            if (book == null){
                continue;
            }
            System.out.println("* "+book);
        }
    }
    @Override
    public void return_book(String name){
        for (int i = 0; i < book_name.length; i++) {
            if (this.book_name[i] == name){
                System.out.println("Sorry book is already present");
            }
            else if(this.book_name[i] == null){
                this.book_name[i] = name;
            }
        }
    }
    @Override
    public void issue_book(String name){
        for (int i = 0; i < book_name.length; i++) {
            if(this.book_name[i] != name){
                System.out.println("book is not present");
            }
            else if(this.book_name[i] == name){
                System.out.println("The "+name+ " has been issued");
                this.book_name[i] = null;
                return;

            }
            else{
                System.out.println("Some wrong input");
            }
        }
    }
}

public class Library {
    public static void main(String[] args) {

        Library_1 central_library = new Library_1();
        central_library.add_book("harry-potter");
        central_library.add_book("harry-potter and legend of mick tisone");
        central_library.add_book("the deep of earth");
        central_library.display_book();
        central_library.issue_book("harry-potter");
        central_library.display_book();
        central_library.return_book("harry-potter");
        central_library.return_book("c++ ");
        central_library.return_book("the deep of earth");
        central_library.display_book();


    }
}
