package cn.thinkfree.database.model;

import cn.thinkfree.core.model.BaseModel;
import cn.thinkfree.core.security.model.SecurityResource;

/**
 * Database Table Remarks:
 *   后台系统资源
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pc_system_resource
 */
public class SystemResource extends  SecurityResource {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_system_resource.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * Database Column Remarks:
     *   所属模块
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_system_resource.module
     *
     * @mbg.generated
     */
    private String module;

    /**
     * Database Column Remarks:
     *   资源名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_system_resource.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * Database Column Remarks:
     *   资源编码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_system_resource.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     * Database Column Remarks:
     *   资源路径
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_system_resource.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     * Database Column Remarks:
     *   资源类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_system_resource.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     * Database Column Remarks:
     *   排序号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_system_resource.sort_num
     *
     * @mbg.generated
     */
    private Integer sortNum;

    /**
     * Database Column Remarks:
     *   父节点
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pc_system_resource.pid
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_system_resource.id
     *
     * @return the value of pc_system_resource.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_system_resource.id
     *
     * @param id the value for pc_system_resource.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_system_resource.module
     *
     * @return the value of pc_system_resource.module
     *
     * @mbg.generated
     */
    public String getModule() {
        return module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_system_resource.module
     *
     * @param module the value for pc_system_resource.module
     *
     * @mbg.generated
     */
    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_system_resource.name
     *
     * @return the value of pc_system_resource.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_system_resource.name
     *
     * @param name the value for pc_system_resource.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_system_resource.code
     *
     * @return the value of pc_system_resource.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_system_resource.code
     *
     * @param code the value for pc_system_resource.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_system_resource.url
     *
     * @return the value of pc_system_resource.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_system_resource.url
     *
     * @param url the value for pc_system_resource.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_system_resource.type
     *
     * @return the value of pc_system_resource.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_system_resource.type
     *
     * @param type the value for pc_system_resource.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_system_resource.sort_num
     *
     * @return the value of pc_system_resource.sort_num
     *
     * @mbg.generated
     */
    public Integer getSortNum() {
        return sortNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_system_resource.sort_num
     *
     * @param sortNum the value for pc_system_resource.sort_num
     *
     * @mbg.generated
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pc_system_resource.pid
     *
     * @return the value of pc_system_resource.pid
     *
     * @mbg.generated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pc_system_resource.pid
     *
     * @param pid the value for pc_system_resource.pid
     *
     * @mbg.generated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String getResouce() {
        return this.url;
    }

    @Override
    public String getRoleCode() {
        return this.code;
    }

    @Override
    public String getAuthority() {
        return this.code;
    }
}