package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeworkItem {
    private Integer id;
    private Integer teacherId;
    private String catalog;
    private Date beginTime;
    private Date endTime;
    private String description;
    private String teacherName;
    private String begin;
    private String end;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        begin = sdf.format(beginTime);
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        end = sdf.format(endTime);
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getBegin() {
        return begin;
    }

    public String getEnd() {
        return end;
    }
}
