package com.aashika.bookportal;

public class Member {

    String title;
    String image;
    String author;
    String pdfurl;

    public Member(){

    }

    public Member(String title, String image, String author, String pdfurl){
        if (title.trim().equals("")) {
            title = "No Name";
        }
        if (author.trim().equals("")) {
            author = "Not available";
        }
        this.title=title;
        this.image=image;
        this.pdfurl=pdfurl;
        this.author=author;

    }

    public Member(String pdfurl){
        this.pdfurl=pdfurl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPdfurl() {
        return pdfurl;
    }

    public void setPdfurl(String pdfurl) {
        this.pdfurl = pdfurl;
    }
}