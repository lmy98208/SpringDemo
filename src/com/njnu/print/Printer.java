package com.njnu.print;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Printer{
    @Autowired
    private IBox inBox;
    @Autowired
    private IPaper paper;

//    public IBox getInBox() {
//        return inBox;
//    }
//
//    public void setInBox(IBox inBox) {
//        this.inBox = inBox;
//    }
//
//    public IPaper getPaper() {
//        return paper;
//    }
//
//    public void setPaper(IPaper paper) {
//        this.paper = paper;
//    }

    //    private InBox inBox;
//    private PaperA4 paper;
//
//    public InBox getInBox() {
//        return inBox;
//    }
//
//    public void setInBox(InBox inBox) {
//        this.inBox = inBox;
//    }
//
//    public PaperA4 getPaper() {
//        return paper;
//    }
//
//    public void setPaper(PaperA4 paper) {
//        this.paper = paper;
//    }

    public void print(String content){
        System.out.println("打印机目前墨盒颜色为\t"+inBox.getColor());
        System.out.println("打印机目前采用纸张为\t"+paper.getPaperName());
        System.out.println("打印的内容为\t"+content);

    }
}
