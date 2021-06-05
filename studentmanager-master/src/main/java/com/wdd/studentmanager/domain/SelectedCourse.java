package com.wdd.studentmanager.domain;

/**
 * @Classname SelectedCourse
 * @Description 选课信息实体类

 */
public class SelectedCourse {
    private Integer id;
    private Integer studentId;
    private Integer courseId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}
