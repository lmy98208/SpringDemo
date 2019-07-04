package com.njnu.print;

import org.springframework.stereotype.Component;

@Component
//依赖注入
public class PaperA3 implements IPaper {
    @Override
    public String getPaperName(){
        return "A3纸张";
    }
}
