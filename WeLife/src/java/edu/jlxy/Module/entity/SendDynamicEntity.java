/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jlxy.Module.entity;

import java.sql.Date;

/**
 *
 * @author 16221
 */
public class SendDynamicEntity {

    private String uid;
    private String did;
    private String title;
    private String content;
    private String photo;
    private String date;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAll(String uid, String did, String title, String content, String photo, String date) {
        this.uid = uid;
        this.did = did;
        this.title = title;
        this.content = content;
        this.photo = photo;

        this.date = date;

    }

    public void setAll_withoutdid(String uid, String title, String content, String photo, String date) {
        this.uid = uid;
        this.title = title;
        this.content = content;
        this.photo = photo;
        this.date = date;

    }

}
