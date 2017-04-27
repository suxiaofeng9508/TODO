package com.loveqh.todo.pojo;

/**
 * Created by WL on 2017-04-24.
 */
public class Project {

    private int id;
    private String intro;
    private String createTime;
    private String deadline;
    private String userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", intro='" + intro + '\'' +
                ", createTime='" + createTime + '\'' +
                ", deadline='" + deadline + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
