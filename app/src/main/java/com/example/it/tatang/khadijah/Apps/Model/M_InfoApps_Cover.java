package com.example.it.tatang.khadijah.Apps.Model;

/**
 * Created by Administrator on 9/18/2018.
 */

public class M_InfoApps_Cover {


    private String name;
    private String imageSource;

    public M_InfoApps_Cover(String imageSource, String name) {
        this.name = name;
        this.imageSource = imageSource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

}
