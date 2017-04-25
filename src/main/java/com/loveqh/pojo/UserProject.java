package com.loveqh.pojo;

/**
 * Created by WL on 2017-04-25.
 */
public class UserProject {

    private int id;
    private int userId;
    private int projectId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "UserProject{" +
                "id=" + id +
                ", userId=" + userId +
                ", projectId=" + projectId +
                '}';
    }
}
