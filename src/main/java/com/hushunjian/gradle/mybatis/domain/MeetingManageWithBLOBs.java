package com.hushunjian.gradle.mybatis.domain;

public class MeetingManageWithBLOBs extends MeetingManage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting_manage.meet_adjunct_address
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    private String meetAdjunctAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting_manage.meet_agenda
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    private String meetAgenda;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting_manage.meet_general
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    private String meetGeneral;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting_manage.meet_img
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    private String meetImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column meeting_manage.meet_summary
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    private String meetSummary;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting_manage.meet_adjunct_address
     *
     * @return the value of meeting_manage.meet_adjunct_address
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public String getMeetAdjunctAddress() {
        return meetAdjunctAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting_manage.meet_adjunct_address
     *
     * @param meetAdjunctAddress the value for meeting_manage.meet_adjunct_address
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public void setMeetAdjunctAddress(String meetAdjunctAddress) {
        this.meetAdjunctAddress = meetAdjunctAddress == null ? null : meetAdjunctAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting_manage.meet_agenda
     *
     * @return the value of meeting_manage.meet_agenda
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public String getMeetAgenda() {
        return meetAgenda;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting_manage.meet_agenda
     *
     * @param meetAgenda the value for meeting_manage.meet_agenda
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public void setMeetAgenda(String meetAgenda) {
        this.meetAgenda = meetAgenda == null ? null : meetAgenda.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting_manage.meet_general
     *
     * @return the value of meeting_manage.meet_general
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public String getMeetGeneral() {
        return meetGeneral;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting_manage.meet_general
     *
     * @param meetGeneral the value for meeting_manage.meet_general
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public void setMeetGeneral(String meetGeneral) {
        this.meetGeneral = meetGeneral == null ? null : meetGeneral.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting_manage.meet_img
     *
     * @return the value of meeting_manage.meet_img
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public String getMeetImg() {
        return meetImg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting_manage.meet_img
     *
     * @param meetImg the value for meeting_manage.meet_img
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public void setMeetImg(String meetImg) {
        this.meetImg = meetImg == null ? null : meetImg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column meeting_manage.meet_summary
     *
     * @return the value of meeting_manage.meet_summary
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public String getMeetSummary() {
        return meetSummary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column meeting_manage.meet_summary
     *
     * @param meetSummary the value for meeting_manage.meet_summary
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public void setMeetSummary(String meetSummary) {
        this.meetSummary = meetSummary == null ? null : meetSummary.trim();
    }
}