package com.example.it.tatang.khadijah.Apps.Model;

/**
 * Created by Administrator on 9/27/2018.
 */

public class M_Hajji {

    private String UrlImage;
    private String TitleHajj;
    private String StatusArivalDeparture;
    private String DateDeparture;
    private String DateArival;
    private String Description;
    private String CompanyName;
    private String Qty;

    public M_Hajji(String urlImage, String statusArivalDeparture, String dateDeparture, String dateArival, String description, String companyName, String Qty, String TitleHajj) {
        this.UrlImage = urlImage;
        this.StatusArivalDeparture = statusArivalDeparture;
        this.DateDeparture = dateDeparture;
        this.DateArival = dateArival;
        this.Description = description;
        this.CompanyName = companyName;
        this.Qty = Qty;
        this.TitleHajj = TitleHajj;
    }

    public String getTitleHajj() {
        return TitleHajj;
    }

    public void setTitleHajj(String titleHajj) {
        TitleHajj = titleHajj;
    }

    public String getUrlImage() {
        return UrlImage;
    }

    public void setUrlImage(String urlImage) {
        UrlImage = urlImage;
    }

    public String getStatusArivalDeparture() {
        return StatusArivalDeparture;
    }

    public void setStatusArivalDeparture(String statusArivalDeparture) {
        StatusArivalDeparture = statusArivalDeparture;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getQty() {
        return Qty;
    }

    public void setQty(String qty) {
        Qty = qty;
    }

}
