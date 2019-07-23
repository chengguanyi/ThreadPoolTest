package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        //文件路径
        String fileName = "D:/Users/服务配置.txt";

        File file =new File(fileName);
        BufferedReader reader = null;
        try {
            System.out.println("以行为单位读取文件内容，一次读一整行：");
            reader = new BufferedReader(new FileReader(fileName));
            String tempString = null;
            int line = 1;
            //一次读入一行知道读入null
            while ((tempString = reader.readLine()) != null){
                System.out.println("line " + line + ": " + tempString);
                line++;
            }
            reader.close();
        } catch (IOException e ) {
            e.printStackTrace();
        }

    }
}
