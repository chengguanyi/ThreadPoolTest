package com.company.imageTest;

import net.coobird.thumbnailator.Thumbnails;

import java.io.IOException;


/**
 * @author chengguanyi
 * @date 2019/8/20 11:21
 */
public class ImageTest {


    public static void main(String[] args) {

         String source = "D:/Users/chengguanyi/Desktop/efa7b252-29ed-4a52-ada8-df7519ed5a0e.jpg";

         String target = "D:/Users/chengguanyi/Desktop/11.jpg";

        try {
            Thumbnails.of(source)
                    .width(1024)
//                    .scale(1f)
                    .outputQuality(0.20f)
                    .toFile(target);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
