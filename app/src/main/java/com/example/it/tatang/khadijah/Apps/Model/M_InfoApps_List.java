package com.example.it.tatang.khadijah.Apps.Model;

/**
 * Created by Administrator on 9/18/2018.
 */

public class M_InfoApps_List {

    private String ProjectNameProject;
    private String ProjectStatusProject;
    private String ProjectDescription;
    private String ProjectUrlImage;
    private String ProjectDate;
    private String ProjectType;
    private String ProjectUrl;

    public M_InfoApps_List(String projectNameProject, String projectStatusProject, String projectDescription, String projectUrlImage, String projectDate, String projectType, String projectUrl) {
        this.ProjectNameProject = projectNameProject;
        this.ProjectStatusProject = projectStatusProject;
        this.ProjectDescription = projectDescription;
        this.ProjectUrlImage = projectUrlImage;
        this.ProjectDate = projectDate;
        this.ProjectType = projectType;
        this.ProjectUrl = projectUrl;
    }

    public String getProjectNameProject() {
        return ProjectNameProject;
    }

    public void setProjectNameProject(String projectNameProject) {
        ProjectNameProject = projectNameProject;
    }

    public String getProjectStatusProject() {
        return ProjectStatusProject;
    }

    public void setProjectStatusProject(String projectStatusProject) {
        ProjectStatusProject = projectStatusProject;
    }

    public String getProjectDescription() {
        return ProjectDescription;
    }

    public void setProjectDescription(String projectDescription) {
        ProjectDescription = projectDescription;
    }

    public String getProjectUrlImage() {
        return ProjectUrlImage;
    }

    public void setProjectUrlImage(String projectUrlImage) {
        ProjectUrlImage = projectUrlImage;
    }

    public String getProjectDate() {
        return ProjectDate;
    }

    public void setProjectDate(String projectDate) {
        ProjectDate = projectDate;
    }

    public String getProjectType() {
        return ProjectType;
    }

    public void setProjectType(String projectType) {
        ProjectType = projectType;
    }

    public String getProjectUrl() {
        return ProjectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        ProjectUrl = projectUrl;
    }

}
