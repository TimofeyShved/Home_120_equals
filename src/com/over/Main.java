package com.over;

public class Main {

    public static void main(String[] args) {
	    Book x = new Book("One");
        Book y = new Book("One");
        Book z = new Book("One");

        //reflexive
        System.out.println("reflexive");
        System.out.println(x.equals(x));
        System.out.println("---");

        //symmetric
        System.out.println("symmetric");
        System.out.println(x.equals(y));
        System.out.println(y.equals(x));
        System.out.println("---");

        //transitive
        System.out.println("transitive");
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));
        System.out.println("---");

        //consistent
        System.out.println("transitive");
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println(x.equals(y));
        System.out.println("---");

        //not null
        System.out.println("not null");
        System.out.println(x.equals(null));
    }
}

class Book{
    String title;

    public Book(String title){
        this.title=title;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        if (this==obj)return true;
        if (obj==null || getClass()!=obj.getClass())return false;
        Book book = (Book) obj;
        return title.equals(book.title);
    }

     */


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book){
            return obj != null && this.title.equals(((Book)obj).title);
        }
        return false;
    }

}

