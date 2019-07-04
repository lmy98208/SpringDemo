package com.njnu.test;

import com.njnu.bean.Book;
import com.njnu.print.PaperA3;
import com.njnu.print.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        Book book=(Book)context.getBean("book");
//        System.out.println("书："+book.getCategory().getCategory()+book.getBookName());

        //Printer printer=(Printer)context.getBean("printer");
        Printer printer=context.getBean(Printer.class);
        printer.print("测试内容");

//        PaperA3 paperA3=(PaperA3)context.getBean("paperA3");
//        System.out.println(paperA3.getPaperName());
    }
}
