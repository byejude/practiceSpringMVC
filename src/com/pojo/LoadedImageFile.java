package com.pojo;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by byebyejude on 2017/9/15.
 */
public class LoadedImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
