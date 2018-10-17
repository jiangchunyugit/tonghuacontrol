package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pc_base_dic
 */
public class BaseDic extends BaseModel {
    /**
     * Database Column Remarks:
     *   主键id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_base_dic.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   0 设计公司 1 装修公司
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_base_dic.dic_type
     *
     * @mbg.generated
     */
    private String dicType;

    /**
     * Database Column Remarks:
     *   字典编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_base_dic.dic_code
     *
     * @mbg.generated
     */
    private String dicCode;

    /**
     * Database Column Remarks:
     *   字典value值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_base_dic.dic_value
     *
     * @mbg.generated
     */
    private String dicValue;

    /**
     * Database Column Remarks:
     *   排序
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_base_dic.dic_sort
     *
     * @mbg.generated
     */
    private String dicSort;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_base_dic.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_base_dic.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   备注
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_base_dic.remarks
     *
     * @mbg.generated
     */
    private String remarks;

    /**
     * Database Column Remarks:
     *   0户型结构字典 1 房屋类型字典 2房屋属性 3计费项目类型（设计）4计费项目设置（施工）5施工阶段设置 6项目阶段设置 
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_base_dic.dic_category
     *
     * @mbg.generated
     */
    private String dicCategory;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_base_dic.id
     *
     * @return the value of pc_base_dic.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_base_dic.id
     *
     * @param id the value for pc_base_dic.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_base_dic.dic_type
     *
     * @return the value of pc_base_dic.dic_type
     *
     * @mbg.generated
     */
    public String getDicType() {
        return dicType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_base_dic.dic_type
     *
     * @param dicType the value for pc_base_dic.dic_type
     *
     * @mbg.generated
     */
    public void setDicType(String dicType) {
        this.dicType = dicType == null ? null : dicType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_base_dic.dic_code
     *
     * @return the value of pc_base_dic.dic_code
     *
     * @mbg.generated
     */
    public String getDicCode() {
        return dicCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_base_dic.dic_code
     *
     * @param dicCode the value for pc_base_dic.dic_code
     *
     * @mbg.generated
     */
    public void setDicCode(String dicCode) {
        this.dicCode = dicCode == null ? null : dicCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_base_dic.dic_value
     *
     * @return the value of pc_base_dic.dic_value
     *
     * @mbg.generated
     */
    public String getDicValue() {
        return dicValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_base_dic.dic_value
     *
     * @param dicValue the value for pc_base_dic.dic_value
     *
     * @mbg.generated
     */
    public void setDicValue(String dicValue) {
        this.dicValue = dicValue == null ? null : dicValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_base_dic.dic_sort
     *
     * @return the value of pc_base_dic.dic_sort
     *
     * @mbg.generated
     */
    public String getDicSort() {
        return dicSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_base_dic.dic_sort
     *
     * @param dicSort the value for pc_base_dic.dic_sort
     *
     * @mbg.generated
     */
    public void setDicSort(String dicSort) {
        this.dicSort = dicSort == null ? null : dicSort.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_base_dic.create_time
     *
     * @return the value of pc_base_dic.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_base_dic.create_time
     *
     * @param createTime the value for pc_base_dic.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_base_dic.update_time
     *
     * @return the value of pc_base_dic.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_base_dic.update_time
     *
     * @param updateTime the value for pc_base_dic.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_base_dic.remarks
     *
     * @return the value of pc_base_dic.remarks
     *
     * @mbg.generated
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_base_dic.remarks
     *
     * @param remarks the value for pc_base_dic.remarks
     *
     * @mbg.generated
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_base_dic.dic_category
     *
     * @return the value of pc_base_dic.dic_category
     *
     * @mbg.generated
     */
    public String getDicCategory() {
        return dicCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_base_dic.dic_category
     *
     * @param dicCategory the value for pc_base_dic.dic_category
     *
     * @mbg.generated
     */
    public void setDicCategory(String dicCategory) {
        this.dicCategory = dicCategory == null ? null : dicCategory.trim();
    }
}