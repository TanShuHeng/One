package com.tsh.one.model;

/**
 * Created by captain on 16/11/17.
 */
public class HomeDetail {
    private String hpcontent_id;
    private String hp_title;
    private String author_id;
    private String hp_img_url;
    private String hp_img_original_url;
    private String hp_author;
    private String ipad_url;
    private String hp_content;
    private String hp_makettime;
    private String last_update_date;
    private String web_url;
    private String wb_img_url;
    private int praisenum;
    private int sharenum;
    private int commentnum;

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public int getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(int commentnum) {
        this.commentnum = commentnum;
    }

    public String getHp_author() {
        return hp_author;
    }

    public void setHp_author(String hp_author) {
        this.hp_author = hp_author;
    }

    public String getHp_content() {
        return hp_content;
    }

    public void setHp_content(String hp_content) {
        this.hp_content = hp_content;
    }

    public String getHp_img_original_url() {
        return hp_img_original_url;
    }

    public void setHp_img_original_url(String hp_img_original_url) {
        this.hp_img_original_url = hp_img_original_url;
    }

    public String getHp_img_url() {
        return hp_img_url;
    }

    public void setHp_img_url(String hp_img_url) {
        this.hp_img_url = hp_img_url;
    }

    public String getHp_makettime() {
        return hp_makettime;
    }

    public void setHp_makettime(String hp_makettime) {
        this.hp_makettime = hp_makettime;
    }

    public String getHp_title() {
        return hp_title;
    }

    public void setHp_title(String hp_title) {
        this.hp_title = hp_title;
    }

    public String getHpcontent_id() {
        return hpcontent_id;
    }

    public void setHpcontent_id(String hpcontent_id) {
        this.hpcontent_id = hpcontent_id;
    }

    public String getIpad_url() {
        return ipad_url;
    }

    public void setIpad_url(String ipad_url) {
        this.ipad_url = ipad_url;
    }

    public String getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(String last_update_date) {
        this.last_update_date = last_update_date;
    }

    public int getPraisenum() {
        return praisenum;
    }

    public void setPraisenum(int praisenum) {
        this.praisenum = praisenum;
    }

    public int getSharenum() {
        return sharenum;
    }

    public void setSharenum(int sharenum) {
        this.sharenum = sharenum;
    }

    public String getWb_img_url() {
        return wb_img_url;
    }

    public void setWb_img_url(String wb_img_url) {
        this.wb_img_url = wb_img_url;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }
}
