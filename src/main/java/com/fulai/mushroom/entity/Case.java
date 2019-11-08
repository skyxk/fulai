package com.fulai.mushroom.entity;

/**
 * @author ：chen
 * @date ：Created in 2019/11/7 16:47
 */
public class Case {
    private String CId;
    private String title;
    private String imgBase64;

    public String getCId() {
        return CId;
    }

    public void setCId(String CId) {
        this.CId = CId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgBase64() {
        return imgBase64;
    }

    public void setImgBase64(String imgBase64) {
        this.imgBase64 = imgBase64;
    }
}
