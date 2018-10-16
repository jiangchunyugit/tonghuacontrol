package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;
import java.util.Date;

/**
 * Database Table Remarks:
 *   设计订单表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table design_order
 */
public class DesignOrder extends BaseModel {
    /**
     * Database Column Remarks:
     *   主键id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   公司编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.company_id
     *
     * @mbg.generated
     */
    private Integer companyId;

    /**
     * Database Column Remarks:
     *   项目编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.project_no
     *
     * @mbg.generated
     */
    private String projectNo;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   预约时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.appointment_time
     *
     * @mbg.generated
     */
    private Date appointmentTime;

    /**
     * Database Column Remarks:
     *   订单编号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.order_no
     *
     * @mbg.generated
     */
    private String orderNo;

    /**
     * Database Column Remarks:
     *   装修类型(个性化)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.type
     *
     * @mbg.generated
     */
    private Short type;

    /**
     * Database Column Remarks:
     *   订单状态(施工图待交付)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.order_stage
     *
     * @mbg.generated
     */
    private Short orderStage;

    /**
     * Database Column Remarks:
     *   量房时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.volume_room_time
     *
     * @mbg.generated
     */
    private Date volumeRoomTime;

    /**
     * Database Column Remarks:
     *   量房费用(分)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.volume_room_money
     *
     * @mbg.generated
     */
    private Long volumeRoomMoney;

    /**
     * Database Column Remarks:
     *   设计师ID(用户id)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * Database Column Remarks:
     *   实际支付费用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.actual_pay_money
     *
     * @mbg.generated
     */
    private Long actualPayMoney;

    /**
     * Database Column Remarks:
     *   状态(1,正常  2,失效)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column design_order.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.id
     *
     * @return the value of design_order.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.id
     *
     * @param id the value for design_order.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.company_id
     *
     * @return the value of design_order.company_id
     *
     * @mbg.generated
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.company_id
     *
     * @param companyId the value for design_order.company_id
     *
     * @mbg.generated
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.project_no
     *
     * @return the value of design_order.project_no
     *
     * @mbg.generated
     */
    public String getProjectNo() {
        return projectNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.project_no
     *
     * @param projectNo the value for design_order.project_no
     *
     * @mbg.generated
     */
    public void setProjectNo(String projectNo) {
        this.projectNo = projectNo == null ? null : projectNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.create_time
     *
     * @return the value of design_order.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.create_time
     *
     * @param createTime the value for design_order.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.appointment_time
     *
     * @return the value of design_order.appointment_time
     *
     * @mbg.generated
     */
    public Date getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.appointment_time
     *
     * @param appointmentTime the value for design_order.appointment_time
     *
     * @mbg.generated
     */
    public void setAppointmentTime(Date appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.order_no
     *
     * @return the value of design_order.order_no
     *
     * @mbg.generated
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.order_no
     *
     * @param orderNo the value for design_order.order_no
     *
     * @mbg.generated
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.type
     *
     * @return the value of design_order.type
     *
     * @mbg.generated
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.type
     *
     * @param type the value for design_order.type
     *
     * @mbg.generated
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.order_stage
     *
     * @return the value of design_order.order_stage
     *
     * @mbg.generated
     */
    public Short getOrderStage() {
        return orderStage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.order_stage
     *
     * @param orderStage the value for design_order.order_stage
     *
     * @mbg.generated
     */
    public void setOrderStage(Short orderStage) {
        this.orderStage = orderStage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.volume_room_time
     *
     * @return the value of design_order.volume_room_time
     *
     * @mbg.generated
     */
    public Date getVolumeRoomTime() {
        return volumeRoomTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.volume_room_time
     *
     * @param volumeRoomTime the value for design_order.volume_room_time
     *
     * @mbg.generated
     */
    public void setVolumeRoomTime(Date volumeRoomTime) {
        this.volumeRoomTime = volumeRoomTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.volume_room_money
     *
     * @return the value of design_order.volume_room_money
     *
     * @mbg.generated
     */
    public Long getVolumeRoomMoney() {
        return volumeRoomMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.volume_room_money
     *
     * @param volumeRoomMoney the value for design_order.volume_room_money
     *
     * @mbg.generated
     */
    public void setVolumeRoomMoney(Long volumeRoomMoney) {
        this.volumeRoomMoney = volumeRoomMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.user_id
     *
     * @return the value of design_order.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.user_id
     *
     * @param userId the value for design_order.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.remark
     *
     * @return the value of design_order.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.remark
     *
     * @param remark the value for design_order.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.actual_pay_money
     *
     * @return the value of design_order.actual_pay_money
     *
     * @mbg.generated
     */
    public Long getActualPayMoney() {
        return actualPayMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.actual_pay_money
     *
     * @param actualPayMoney the value for design_order.actual_pay_money
     *
     * @mbg.generated
     */
    public void setActualPayMoney(Long actualPayMoney) {
        this.actualPayMoney = actualPayMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column design_order.status
     *
     * @return the value of design_order.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column design_order.status
     *
     * @param status the value for design_order.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}