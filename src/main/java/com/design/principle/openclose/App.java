package com.design.principle.openclose;

public class App {
    public static void main(String[] args) {
        IBook javaBook = new JavaBook(1001, "Think in java", 99.8);
        System.out.println("ID：" + javaBook.getName()
                + " 名称：" + javaBook.getName()
                + " 价格：" + javaBook.getPrice() );

        IBook javaDiscountBook = new JavaDiscountBook(1001, "Java多线程开放", 49.8);
        System.out.println("原来价格：" + ((JavaDiscountBook) javaDiscountBook).getOriginPrice());
        System.out.println("折后价格：" + javaDiscountBook.getPrice());
    }
}
