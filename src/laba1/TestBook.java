package laba1;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book bo1 = new Book("Winnie-the-Pooh", 20);
        Book bo2 = new Book("Jane Eyre", 100);
        Book bo3 = new Book("Airport");
        bo3.setNumberOfPages(10);
        System.out.println(bo1);
        bo1.totals();
        bo2.totals();
        bo3.totals();
    }
}
