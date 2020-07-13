package com.itzhouq.mybatisexample.domain;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table t_sys_log
 */
public class SysLog {
    /**
     * Database Column Remarks:
     *   日志ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_log.log_id
     *
     * @mbg.generated
     */
    private String logId;

    /**
     * Database Column Remarks:
     *   用户名字
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_log.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     * Database Column Remarks:
     *   用户IP
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_log.user_ip
     *
     * @mbg.generated
     */
    private String userIp;

    /**
     * Database Column Remarks:
     *   请求方法
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_log.request_method
     *
     * @mbg.generated
     */
    private String requestMethod;

    /**
     * Database Column Remarks:
     *   方法描述
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_log.request_desc
     *
     * @mbg.generated
     */
    private String requestDesc;

    /**
     * Database Column Remarks:
     *   记录时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sys_log.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_log.log_id
     *
     * @return the value of t_sys_log.log_id
     *
     * @mbg.generated
     */
    public String getLogId() {
        return logId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_log.log_id
     *
     * @param logId the value for t_sys_log.log_id
     *
     * @mbg.generated
     */
    public void setLogId(String logId) {
        this.logId = logId == null ? null : logId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_log.user_name
     *
     * @return the value of t_sys_log.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_log.user_name
     *
     * @param userName the value for t_sys_log.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_log.user_ip
     *
     * @return the value of t_sys_log.user_ip
     *
     * @mbg.generated
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_log.user_ip
     *
     * @param userIp the value for t_sys_log.user_ip
     *
     * @mbg.generated
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_log.request_method
     *
     * @return the value of t_sys_log.request_method
     *
     * @mbg.generated
     */
    public String getRequestMethod() {
        return requestMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_log.request_method
     *
     * @param requestMethod the value for t_sys_log.request_method
     *
     * @mbg.generated
     */
    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod == null ? null : requestMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_log.request_desc
     *
     * @return the value of t_sys_log.request_desc
     *
     * @mbg.generated
     */
    public String getRequestDesc() {
        return requestDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_log.request_desc
     *
     * @param requestDesc the value for t_sys_log.request_desc
     *
     * @mbg.generated
     */
    public void setRequestDesc(String requestDesc) {
        this.requestDesc = requestDesc == null ? null : requestDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sys_log.create_time
     *
     * @return the value of t_sys_log.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sys_log.create_time
     *
     * @param createTime the value for t_sys_log.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}