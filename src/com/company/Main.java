package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        //�ļ�·��
        String fileName = "D:/Users/��������.txt";

        File file =new File(fileName);
        BufferedReader reader = null;
        try {
            System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");
            reader = new BufferedReader(new FileReader(fileName));
            String tempString = null;
            int line = 1;
            //һ�ζ���һ��֪������null
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
