package cn.thinkfree.database.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompanyUserSetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    public CompanyUserSetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andIsJobIsNull() {
            addCriterion("is_job is null");
            return (Criteria) this;
        }

        public Criteria andIsJobIsNotNull() {
            addCriterion("is_job is not null");
            return (Criteria) this;
        }

        public Criteria andIsJobEqualTo(Short value) {
            addCriterion("is_job =", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobNotEqualTo(Short value) {
            addCriterion("is_job <>", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobGreaterThan(Short value) {
            addCriterion("is_job >", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobGreaterThanOrEqualTo(Short value) {
            addCriterion("is_job >=", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobLessThan(Short value) {
            addCriterion("is_job <", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobLessThanOrEqualTo(Short value) {
            addCriterion("is_job <=", value, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobIn(List<Short> values) {
            addCriterion("is_job in", values, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobNotIn(List<Short> values) {
            addCriterion("is_job not in", values, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobBetween(Short value1, Short value2) {
            addCriterion("is_job between", value1, value2, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsJobNotBetween(Short value1, Short value2) {
            addCriterion("is_job not between", value1, value2, "isJob");
            return (Criteria) this;
        }

        public Criteria andIsBindIsNull() {
            addCriterion("is_bind is null");
            return (Criteria) this;
        }

        public Criteria andIsBindIsNotNull() {
            addCriterion("is_bind is not null");
            return (Criteria) this;
        }

        public Criteria andIsBindEqualTo(Short value) {
            addCriterion("is_bind =", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindNotEqualTo(Short value) {
            addCriterion("is_bind <>", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindGreaterThan(Short value) {
            addCriterion("is_bind >", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindGreaterThanOrEqualTo(Short value) {
            addCriterion("is_bind >=", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindLessThan(Short value) {
            addCriterion("is_bind <", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindLessThanOrEqualTo(Short value) {
            addCriterion("is_bind <=", value, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindIn(List<Short> values) {
            addCriterion("is_bind in", values, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindNotIn(List<Short> values) {
            addCriterion("is_bind not in", values, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindBetween(Short value1, Short value2) {
            addCriterion("is_bind between", value1, value2, "isBind");
            return (Criteria) this;
        }

        public Criteria andIsBindNotBetween(Short value1, Short value2) {
            addCriterion("is_bind not between", value1, value2, "isBind");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("role_id like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("role_id not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andActivationCodeIsNull() {
            addCriterion("activation_code is null");
            return (Criteria) this;
        }

        public Criteria andActivationCodeIsNotNull() {
            addCriterion("activation_code is not null");
            return (Criteria) this;
        }

        public Criteria andActivationCodeEqualTo(String value) {
            addCriterion("activation_code =", value, "activationCode");
            return (Criteria) this;
        }

        public Criteria andActivationCodeNotEqualTo(String value) {
            addCriterion("activation_code <>", value, "activationCode");
            return (Criteria) this;
        }

        public Criteria andActivationCodeGreaterThan(String value) {
            addCriterion("activation_code >", value, "activationCode");
            return (Criteria) this;
        }

        public Criteria andActivationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("activation_code >=", value, "activationCode");
            return (Criteria) this;
        }

        public Criteria andActivationCodeLessThan(String value) {
            addCriterion("activation_code <", value, "activationCode");
            return (Criteria) this;
        }

        public Criteria andActivationCodeLessThanOrEqualTo(String value) {
            addCriterion("activation_code <=", value, "activationCode");
            return (Criteria) this;
        }

        public Criteria andActivationCodeLike(String value) {
            addCriterion("activation_code like", value, "activationCode");
            return (Criteria) this;
        }

        public Criteria andActivationCodeNotLike(String value) {
            addCriterion("activation_code not like", value, "activationCode");
            return (Criteria) this;
        }

        public Criteria andActivationCodeIn(List<String> values) {
            addCriterion("activation_code in", values, "activationCode");
            return (Criteria) this;
        }

        public Criteria andActivationCodeNotIn(List<String> values) {
            addCriterion("activation_code not in", values, "activationCode");
            return (Criteria) this;
        }

        public Criteria andActivationCodeBetween(String value1, String value2) {
            addCriterion("activation_code between", value1, value2, "activationCode");
            return (Criteria) this;
        }

        public Criteria andActivationCodeNotBetween(String value1, String value2) {
            addCriterion("activation_code not between", value1, value2, "activationCode");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameIsNull() {
            addCriterion("custom_role_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameIsNotNull() {
            addCriterion("custom_role_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameEqualTo(String value) {
            addCriterion("custom_role_name =", value, "customRoleName");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameNotEqualTo(String value) {
            addCriterion("custom_role_name <>", value, "customRoleName");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameGreaterThan(String value) {
            addCriterion("custom_role_name >", value, "customRoleName");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("custom_role_name >=", value, "customRoleName");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameLessThan(String value) {
            addCriterion("custom_role_name <", value, "customRoleName");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameLessThanOrEqualTo(String value) {
            addCriterion("custom_role_name <=", value, "customRoleName");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameLike(String value) {
            addCriterion("custom_role_name like", value, "customRoleName");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameNotLike(String value) {
            addCriterion("custom_role_name not like", value, "customRoleName");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameIn(List<String> values) {
            addCriterion("custom_role_name in", values, "customRoleName");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameNotIn(List<String> values) {
            addCriterion("custom_role_name not in", values, "customRoleName");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameBetween(String value1, String value2) {
            addCriterion("custom_role_name between", value1, value2, "customRoleName");
            return (Criteria) this;
        }

        public Criteria andCustomRoleNameNotBetween(String value1, String value2) {
            addCriterion("custom_role_name not between", value1, value2, "customRoleName");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNull() {
            addCriterion("bind_time is null");
            return (Criteria) this;
        }

        public Criteria andBindTimeIsNotNull() {
            addCriterion("bind_time is not null");
            return (Criteria) this;
        }

        public Criteria andBindTimeEqualTo(Date value) {
            addCriterion("bind_time =", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotEqualTo(Date value) {
            addCriterion("bind_time <>", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThan(Date value) {
            addCriterion("bind_time >", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bind_time >=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThan(Date value) {
            addCriterion("bind_time <", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeLessThanOrEqualTo(Date value) {
            addCriterion("bind_time <=", value, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeIn(List<Date> values) {
            addCriterion("bind_time in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotIn(List<Date> values) {
            addCriterion("bind_time not in", values, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeBetween(Date value1, Date value2) {
            addCriterion("bind_time between", value1, value2, "bindTime");
            return (Criteria) this;
        }

        public Criteria andBindTimeNotBetween(Date value1, Date value2) {
            addCriterion("bind_time not between", value1, value2, "bindTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeIsNull() {
            addCriterion("quit_time is null");
            return (Criteria) this;
        }

        public Criteria andQuitTimeIsNotNull() {
            addCriterion("quit_time is not null");
            return (Criteria) this;
        }

        public Criteria andQuitTimeEqualTo(Date value) {
            addCriterion("quit_time =", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeNotEqualTo(Date value) {
            addCriterion("quit_time <>", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeGreaterThan(Date value) {
            addCriterion("quit_time >", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("quit_time >=", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeLessThan(Date value) {
            addCriterion("quit_time <", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeLessThanOrEqualTo(Date value) {
            addCriterion("quit_time <=", value, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeIn(List<Date> values) {
            addCriterion("quit_time in", values, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeNotIn(List<Date> values) {
            addCriterion("quit_time not in", values, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeBetween(Date value1, Date value2) {
            addCriterion("quit_time between", value1, value2, "quitTime");
            return (Criteria) this;
        }

        public Criteria andQuitTimeNotBetween(Date value1, Date value2) {
            addCriterion("quit_time not between", value1, value2, "quitTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table company_user_set
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table company_user_set
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}