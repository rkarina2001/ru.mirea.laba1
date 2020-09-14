package laba1;

import java.lang.*;
public class Book {
    private String name;
    private int NumberOfPages;

    public Book(String n, int a) {
        name = n;
        NumberOfPages = a;
    }
    public Book(String n){
        name=n;
        NumberOfPages = 5;
    }
    public Book(){
        name="Studen book";
        NumberOfPages = 5;
    }
    public void setNumberOfPages(int NumberOfPages){
        this.NumberOfPages = NumberOfPages;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(String Name){
        return name;
    }
    public int getNumberOfPages(){
        return NumberOfPages;
    }
    public void totals()
    {
        System.out.println("A book titled "+name+" has "+NumberOfPages*3+" multiplied by 3");
    }
}
