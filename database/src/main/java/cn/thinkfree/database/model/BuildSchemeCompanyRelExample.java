package cn.thinkfree.database.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BuildSchemeCompanyRelExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table build_scheme_company_rel
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table build_scheme_company_rel
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table build_scheme_company_rel
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table build_scheme_company_rel
     *
     * @mbg.generated
     */
    public BuildSchemeCompanyRelExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table build_scheme_company_rel
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table build_scheme_company_rel
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table build_scheme_company_rel
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table build_scheme_company_rel
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table build_scheme_company_rel
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table build_scheme_company_rel
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table build_scheme_company_rel
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
     * This method corresponds to the database table build_scheme_company_rel
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
     * This method corresponds to the database table build_scheme_company_rel
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table build_scheme_company_rel
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
     * This class corresponds to the database table build_scheme_company_rel
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

        public Criteria andBuildSchemeNoIsNull() {
            addCriterion("build_scheme_no is null");
            return (Criteria) this;
        }

        public Criteria andBuildSchemeNoIsNotNull() {
            addCriterion("build_scheme_no is not null");
            return (Criteria) this;
        }

        public Criteria andBuildSchemeNoEqualTo(String value) {
            addCriterion("build_scheme_no =", value, "buildSchemeNo");
            return (Criteria) this;
        }

        public Criteria andBuildSchemeNoNotEqualTo(String value) {
            addCriterion("build_scheme_no <>", value, "buildSchemeNo");
            return (Criteria) this;
        }

        public Criteria andBuildSchemeNoGreaterThan(String value) {
            addCriterion("build_scheme_no >", value, "buildSchemeNo");
            return (Criteria) this;
        }

        public Criteria andBuildSchemeNoGreaterThanOrEqualTo(String value) {
            addCriterion("build_scheme_no >=", value, "buildSchemeNo");
            return (Criteria) this;
        }

        public Criteria andBuildSchemeNoLessThan(String value) {
            addCriterion("build_scheme_no <", value, "buildSchemeNo");
            return (Criteria) this;
        }

        public Criteria andBuildSchemeNoLessThanOrEqualTo(String value) {
            addCriterion("build_scheme_no <=", value, "buildSchemeNo");
            return (Criteria) this;
        }

        public Criteria andBuildSchemeNoLike(String value) {
            addCriterion("build_scheme_no like", value, "buildSchemeNo");
            return (Criteria) this;
        }

        public Criteria andBuildSchemeNoNotLike(String value) {
            addCriterion("build_scheme_no not like", value, "buildSchemeNo");
            return (Criteria) this;
        }

        public Criteria andBuildSchemeNoIn(List<String> values) {
            addCriterion("build_scheme_no in", values, "buildSchemeNo");
            return (Criteria) this;
        }

        public Criteria andBuildSchemeNoNotIn(List<String> values) {
            addCriterion("build_scheme_no not in", values, "buildSchemeNo");
            return (Criteria) this;
        }

        public Criteria andBuildSchemeNoBetween(String value1, String value2) {
            addCriterion("build_scheme_no between", value1, value2, "buildSchemeNo");
            return (Criteria) this;
        }

        public Criteria andBuildSchemeNoNotBetween(String value1, String value2) {
            addCriterion("build_scheme_no not between", value1, value2, "buildSchemeNo");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdIsNull() {
            addCriterion("option_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdIsNotNull() {
            addCriterion("option_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdEqualTo(String value) {
            addCriterion("option_user_id =", value, "optionUserId");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdNotEqualTo(String value) {
            addCriterion("option_user_id <>", value, "optionUserId");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdGreaterThan(String value) {
            addCriterion("option_user_id >", value, "optionUserId");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("option_user_id >=", value, "optionUserId");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdLessThan(String value) {
            addCriterion("option_user_id <", value, "optionUserId");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdLessThanOrEqualTo(String value) {
            addCriterion("option_user_id <=", value, "optionUserId");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdLike(String value) {
            addCriterion("option_user_id like", value, "optionUserId");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdNotLike(String value) {
            addCriterion("option_user_id not like", value, "optionUserId");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdIn(List<String> values) {
            addCriterion("option_user_id in", values, "optionUserId");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdNotIn(List<String> values) {
            addCriterion("option_user_id not in", values, "optionUserId");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdBetween(String value1, String value2) {
            addCriterion("option_user_id between", value1, value2, "optionUserId");
            return (Criteria) this;
        }

        public Criteria andOptionUserIdNotBetween(String value1, String value2) {
            addCriterion("option_user_id not between", value1, value2, "optionUserId");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameIsNull() {
            addCriterion("option_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameIsNotNull() {
            addCriterion("option_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameEqualTo(String value) {
            addCriterion("option_user_name =", value, "optionUserName");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameNotEqualTo(String value) {
            addCriterion("option_user_name <>", value, "optionUserName");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameGreaterThan(String value) {
            addCriterion("option_user_name >", value, "optionUserName");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("option_user_name >=", value, "optionUserName");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameLessThan(String value) {
            addCriterion("option_user_name <", value, "optionUserName");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameLessThanOrEqualTo(String value) {
            addCriterion("option_user_name <=", value, "optionUserName");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameLike(String value) {
            addCriterion("option_user_name like", value, "optionUserName");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameNotLike(String value) {
            addCriterion("option_user_name not like", value, "optionUserName");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameIn(List<String> values) {
            addCriterion("option_user_name in", values, "optionUserName");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameNotIn(List<String> values) {
            addCriterion("option_user_name not in", values, "optionUserName");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameBetween(String value1, String value2) {
            addCriterion("option_user_name between", value1, value2, "optionUserName");
            return (Criteria) this;
        }

        public Criteria andOptionUserNameNotBetween(String value1, String value2) {
            addCriterion("option_user_name not between", value1, value2, "optionUserName");
            return (Criteria) this;
        }

        public Criteria andIsEableIsNull() {
            addCriterion("is_eable is null");
            return (Criteria) this;
        }

        public Criteria andIsEableIsNotNull() {
            addCriterion("is_eable is not null");
            return (Criteria) this;
        }

        public Criteria andIsEableEqualTo(Integer value) {
            addCriterion("is_eable =", value, "isEable");
            return (Criteria) this;
        }

        public Criteria andIsEableNotEqualTo(Integer value) {
            addCriterion("is_eable <>", value, "isEable");
            return (Criteria) this;
        }

        public Criteria andIsEableGreaterThan(Integer value) {
            addCriterion("is_eable >", value, "isEable");
            return (Criteria) this;
        }

        public Criteria andIsEableGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_eable >=", value, "isEable");
            return (Criteria) this;
        }

        public Criteria andIsEableLessThan(Integer value) {
            addCriterion("is_eable <", value, "isEable");
            return (Criteria) this;
        }

        public Criteria andIsEableLessThanOrEqualTo(Integer value) {
            addCriterion("is_eable <=", value, "isEable");
            return (Criteria) this;
        }

        public Criteria andIsEableIn(List<Integer> values) {
            addCriterion("is_eable in", values, "isEable");
            return (Criteria) this;
        }

        public Criteria andIsEableNotIn(List<Integer> values) {
            addCriterion("is_eable not in", values, "isEable");
            return (Criteria) this;
        }

        public Criteria andIsEableBetween(Integer value1, Integer value2) {
            addCriterion("is_eable between", value1, value2, "isEable");
            return (Criteria) this;
        }

        public Criteria andIsEableNotBetween(Integer value1, Integer value2) {
            addCriterion("is_eable not between", value1, value2, "isEable");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table build_scheme_company_rel
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
     * This class corresponds to the database table build_scheme_company_rel
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