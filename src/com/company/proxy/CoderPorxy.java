package com.company.proxy;

/**
 * @ClassName CoderPorxy
 * @Description
 * @Author cgy
 * @Date 2019-08-11 23:58
 * @Version 1.0
 */
public class CoderPorxy implements ICoder {

    private ICoder iCoder;

    public CoderPorxy(ICoder iCoder){
        this.iCoder = iCoder;
    }

    @Override
    public void impldemand(String functionname) {

        System.out.println("项目经理：");
        iCoder.impldemand(functionname);

    }
}
