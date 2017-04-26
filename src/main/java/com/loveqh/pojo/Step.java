package com.loveqh.pojo;

/**
 * Created by WL on 2017-04-26.
 */
public class Step {

    private int id;
    private String intro;
    private String createTime;
    private String deadline;
    private int projectId;

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

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "Step{" +
                "id=" + id +
                ", intro='" + intro + '\'' +
                ", createTime='" + createTime + '\'' +
                ", deadline='" + deadline + '\'' +
                ", projectId=" + projectId +
                '}';
    }
}
