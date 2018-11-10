package com.example.it.tatang.khadijah.Apps.Model;

/**
 * Created by Administrator on 9/28/2018.
 */

public class M_Umroh {

    private String Title;
    private String UrlImage;
    private String NameCompany;
    private String Description;
    private String Type;
    private String DateDeparture;
    private String DateArival;
    private String Qty;
    private String training;

    public M_Umroh(String title, String urlImage, String nameCompany, String description, String type, String dateDeparture, String dateArival, String qty, String training) {
        this.Title = title;
        this.UrlImage = urlImage;
        this.NameCompany = nameCompany;
        this.Description = description;
        this.Type = type;
        this.DateDeparture = dateDeparture;
        this.DateArival = dateArival;
        this.Qty = qty;
        this.training = training;
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(String urlImage) {
        UrlImage = urlImage;
    }

    public String getNameCompany() {
        return NameCompany;
    }

    public void setNameCompany(String nameCompany) {
        NameCompany = nameCompany;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getDateDeparture() {
        return DateDeparture;
    }

    public void setDateDeparture(String dateDeparture) {
        DateDeparture = dateDeparture;
    }

    public String getDateArival() {
        return DateArival;
    }

    public void setDateArival(String dateArival) {
        DateArival = dateArival;
    }

    public String getQty() {
        return Qty;
    }

    public void setQty(String qty) {
        Qty = qty;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }


}
