package model;

public class TeacherStudent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_student.teacher_id
     *
     * @mbggenerated Sun Jan 06 23:12:26 CST 2019
     */
    private Integer teacherId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_student.student_id
     *
     * @mbggenerated Sun Jan 06 23:12:26 CST 2019
     */
    private Integer studentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column teacher_student.mark
     *
     * @mbggenerated Sun Jan 06 23:12:26 CST 2019
     */
    private Integer mark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_student.teacher_id
     *
     * @return the value of teacher_student.teacher_id
     *
     * @mbggenerated Sun Jan 06 23:12:26 CST 2019
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_student.teacher_id
     *
     * @param teacherId the value for teacher_student.teacher_id
     *
     * @mbggenerated Sun Jan 06 23:12:26 CST 2019
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_student.student_id
     *
     * @return the value of teacher_student.student_id
     *
     * @mbggenerated Sun Jan 06 23:12:26 CST 2019
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_student.student_id
     *
     * @param studentId the value for teacher_student.student_id
     *
     * @mbggenerated Sun Jan 06 23:12:26 CST 2019
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column teacher_student.mark
     *
     * @return the value of teacher_student.mark
     *
     * @mbggenerated Sun Jan 06 23:12:26 CST 2019
     */
    public Integer getMark() {
        return mark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column teacher_student.mark
     *
     * @param mark the value for teacher_student.mark
     *
     * @mbggenerated Sun Jan 06 23:12:26 CST 2019
     */
    public void setMark(Integer mark) {
        this.mark = mark;
    }
}