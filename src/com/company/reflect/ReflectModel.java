package com.company.reflect;

/**
 * @ClassName ReflectModel
 * @Description 实体类
 * @Author cgy
 * @Date 2019-07-30 22:49
 * @Version 1.0
 */
public class ReflectModel {

    private String name;

    private int age;

    private long iDCard;

    private String father;

    private String mother;


    public ReflectModel(String name, String father, String mother) {
        this.name = name;
        this.father = father;
        this.mother = mother;
    }

    public ReflectModel(int age, long iDCard) {
        this.age = age;
        this.iDCard = iDCard;
    }


    public String family() {
        return "my family is" + name + "--" + father + "--" + mother;
    }

    public boolean compareTo() {
        if (iDCard > age) {
            return true;
        }
        return false;
    }

}
