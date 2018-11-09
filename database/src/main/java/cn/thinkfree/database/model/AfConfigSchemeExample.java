package cn.thinkfree.database.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AfConfigSchemeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table a_f_config_scheme
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table a_f_config_scheme
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table a_f_config_scheme
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_f_config_scheme
     *
     * @mbg.generated
     */
    public AfConfigSchemeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_f_config_scheme
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_f_config_scheme
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_f_config_scheme
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_f_config_scheme
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_f_config_scheme
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_f_config_scheme
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_f_config_scheme
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
     * This method corresponds to the database table a_f_config_scheme
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
     * This method corresponds to the database table a_f_config_scheme
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table a_f_config_scheme
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
     * This class corresponds to the database table a_f_config_scheme
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

        public Criteria andConfigSchemeNoIsNull() {
            addCriterion("config_scheme_no is null");
            return (Criteria) this;
        }

        public Criteria andConfigSchemeNoIsNotNull() {
            addCriterion("config_scheme_no is not null");
            return (Criteria) this;
        }

        public Criteria andConfigSchemeNoEqualTo(String value) {
            addCriterion("config_scheme_no =", value, "configSchemeNo");
            return (Criteria) this;
        }

        public Criteria andConfigSchemeNoNotEqualTo(String value) {
            addCriterion("config_scheme_no <>", value, "configSchemeNo");
            return (Criteria) this;
        }

        public Criteria andConfigSchemeNoGreaterThan(String value) {
            addCriterion("config_scheme_no >", value, "configSchemeNo");
            return (Criteria) this;
        }

        public Criteria andConfigSchemeNoGreaterThanOrEqualTo(String value) {
            addCriterion("config_scheme_no >=", value, "configSchemeNo");
            return (Criteria) this;
        }

        public Criteria andConfigSchemeNoLessThan(String value) {
            addCriterion("config_scheme_no <", value, "configSchemeNo");
            return (Criteria) this;
        }

        public Criteria andConfigSchemeNoLessThanOrEqualTo(String value) {
            addCriterion("config_scheme_no <=", value, "configSchemeNo");
            return (Criteria) this;
        }

        public Criteria andConfigSchemeNoLike(String value) {
            addCriterion("config_scheme_no like", value, "configSchemeNo");
            return (Criteria) this;
        }

        public Criteria andConfigSchemeNoNotLike(String value) {
            addCriterion("config_scheme_no not like", value, "configSchemeNo");
            return (Criteria) this;
        }

        public Criteria andConfigSchemeNoIn(List<String> values) {
            addCriterion("config_scheme_no in", values, "configSchemeNo");
            return (Criteria) this;
        }

        public Criteria andConfigSchemeNoNotIn(List<String> values) {
            addCriterion("config_scheme_no not in", values, "configSchemeNo");
            return (Criteria) this;
        }

        public Criteria andConfigSchemeNoBetween(String value1, String value2) {
            addCriterion("config_scheme_no between", value1, value2, "configSchemeNo");
            return (Criteria) this;
        }

        public Criteria andConfigSchemeNoNotBetween(String value1, String value2) {
            addCriterion("config_scheme_no not between", value1, value2, "configSchemeNo");
            return (Criteria) this;
        }

        public Criteria andConfigNoIsNull() {
            addCriterion("config_no is null");
            return (Criteria) this;
        }

        public Criteria andConfigNoIsNotNull() {
            addCriterion("config_no is not null");
            return (Criteria) this;
        }

        public Criteria andConfigNoEqualTo(String value) {
            addCriterion("config_no =", value, "configNo");
            return (Criteria) this;
        }

        public Criteria andConfigNoNotEqualTo(String value) {
            addCriterion("config_no <>", value, "configNo");
            return (Criteria) this;
        }

        public Criteria andConfigNoGreaterThan(String value) {
            addCriterion("config_no >", value, "configNo");
            return (Criteria) this;
        }

        public Criteria andConfigNoGreaterThanOrEqualTo(String value) {
            addCriterion("config_no >=", value, "configNo");
            return (Criteria) this;
        }

        public Criteria andConfigNoLessThan(String value) {
            addCriterion("config_no <", value, "configNo");
            return (Criteria) this;
        }

        public Criteria andConfigNoLessThanOrEqualTo(String value) {
            addCriterion("config_no <=", value, "configNo");
            return (Criteria) this;
        }

        public Criteria andConfigNoLike(String value) {
            addCriterion("config_no like", value, "configNo");
            return (Criteria) this;
        }

        public Criteria andConfigNoNotLike(String value) {
            addCriterion("config_no not like", value, "configNo");
            return (Criteria) this;
        }

        public Criteria andConfigNoIn(List<String> values) {
            addCriterion("config_no in", values, "configNo");
            return (Criteria) this;
        }

        public Criteria andConfigNoNotIn(List<String> values) {
            addCriterion("config_no not in", values, "configNo");
            return (Criteria) this;
        }

        public Criteria andConfigNoBetween(String value1, String value2) {
            addCriterion("config_no between", value1, value2, "configNo");
            return (Criteria) this;
        }

        public Criteria andConfigNoNotBetween(String value1, String value2) {
            addCriterion("config_no not between", value1, value2, "configNo");
            return (Criteria) this;
        }

        public Criteria andSchemeNoIsNull() {
            addCriterion("scheme_no is null");
            return (Criteria) this;
        }

        public Criteria andSchemeNoIsNotNull() {
            addCriterion("scheme_no is not null");
            return (Criteria) this;
        }

        public Criteria andSchemeNoEqualTo(String value) {
            addCriterion("scheme_no =", value, "schemeNo");
            return (Criteria) this;
        }

        public Criteria andSchemeNoNotEqualTo(String value) {
            addCriterion("scheme_no <>", value, "schemeNo");
            return (Criteria) this;
        }

        public Criteria andSchemeNoGreaterThan(String value) {
            addCriterion("scheme_no >", value, "schemeNo");
            return (Criteria) this;
        }

        public Criteria andSchemeNoGreaterThanOrEqualTo(String value) {
            addCriterion("scheme_no >=", value, "schemeNo");
            return (Criteria) this;
        }

        public Criteria andSchemeNoLessThan(String value) {
            addCriterion("scheme_no <", value, "schemeNo");
            return (Criteria) this;
        }

        public Criteria andSchemeNoLessThanOrEqualTo(String value) {
            addCriterion("scheme_no <=", value, "schemeNo");
            return (Criteria) this;
        }

        public Criteria andSchemeNoLike(String value) {
            addCriterion("scheme_no like", value, "schemeNo");
            return (Criteria) this;
        }

        public Criteria andSchemeNoNotLike(String value) {
            addCriterion("scheme_no not like", value, "schemeNo");
            return (Criteria) this;
        }

        public Criteria andSchemeNoIn(List<String> values) {
            addCriterion("scheme_no in", values, "schemeNo");
            return (Criteria) this;
        }

        public Criteria andSchemeNoNotIn(List<String> values) {
            addCriterion("scheme_no not in", values, "schemeNo");
            return (Criteria) this;
        }

        public Criteria andSchemeNoBetween(String value1, String value2) {
            addCriterion("scheme_no between", value1, value2, "schemeNo");
            return (Criteria) this;
        }

        public Criteria andSchemeNoNotBetween(String value1, String value2) {
            addCriterion("scheme_no not between", value1, value2, "schemeNo");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNull() {
            addCriterion("describe is null");
            return (Criteria) this;
        }

        public Criteria andDescribeIsNotNull() {
            addCriterion("describe is not null");
            return (Criteria) this;
        }

        public Criteria andDescribeEqualTo(String value) {
            addCriterion("describe =", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotEqualTo(String value) {
            addCriterion("describe <>", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThan(String value) {
            addCriterion("describe >", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("describe >=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThan(String value) {
            addCriterion("describe <", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLessThanOrEqualTo(String value) {
            addCriterion("describe <=", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeLike(String value) {
            addCriterion("describe like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotLike(String value) {
            addCriterion("describe not like", value, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeIn(List<String> values) {
            addCriterion("describe in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotIn(List<String> values) {
            addCriterion("describe not in", values, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeBetween(String value1, String value2) {
            addCriterion("describe between", value1, value2, "describe");
            return (Criteria) this;
        }

        public Criteria andDescribeNotBetween(String value1, String value2) {
            addCriterion("describe not between", value1, value2, "describe");
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

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(String value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(String value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(String value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(String value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLike(String value) {
            addCriterion("create_user_id like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotLike(String value) {
            addCriterion("create_user_id not like", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<String> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<String> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(String value1, String value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(String value1, String value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andUsableIsNull() {
            addCriterion("usable is null");
            return (Criteria) this;
        }

        public Criteria andUsableIsNotNull() {
            addCriterion("usable is not null");
            return (Criteria) this;
        }

        public Criteria andUsableEqualTo(Integer value) {
            addCriterion("usable =", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableNotEqualTo(Integer value) {
            addCriterion("usable <>", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableGreaterThan(Integer value) {
            addCriterion("usable >", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableGreaterThanOrEqualTo(Integer value) {
            addCriterion("usable >=", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableLessThan(Integer value) {
            addCriterion("usable <", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableLessThanOrEqualTo(Integer value) {
            addCriterion("usable <=", value, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableIn(List<Integer> values) {
            addCriterion("usable in", values, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableNotIn(List<Integer> values) {
            addCriterion("usable not in", values, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableBetween(Integer value1, Integer value2) {
            addCriterion("usable between", value1, value2, "usable");
            return (Criteria) this;
        }

        public Criteria andUsableNotBetween(Integer value1, Integer value2) {
            addCriterion("usable not between", value1, value2, "usable");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdIsNull() {
            addCriterion("first_role_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdIsNotNull() {
            addCriterion("first_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdEqualTo(String value) {
            addCriterion("first_role_id =", value, "firstRoleId");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdNotEqualTo(String value) {
            addCriterion("first_role_id <>", value, "firstRoleId");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdGreaterThan(String value) {
            addCriterion("first_role_id >", value, "firstRoleId");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("first_role_id >=", value, "firstRoleId");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdLessThan(String value) {
            addCriterion("first_role_id <", value, "firstRoleId");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdLessThanOrEqualTo(String value) {
            addCriterion("first_role_id <=", value, "firstRoleId");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdLike(String value) {
            addCriterion("first_role_id like", value, "firstRoleId");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdNotLike(String value) {
            addCriterion("first_role_id not like", value, "firstRoleId");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdIn(List<String> values) {
            addCriterion("first_role_id in", values, "firstRoleId");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdNotIn(List<String> values) {
            addCriterion("first_role_id not in", values, "firstRoleId");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdBetween(String value1, String value2) {
            addCriterion("first_role_id between", value1, value2, "firstRoleId");
            return (Criteria) this;
        }

        public Criteria andFirstRoleIdNotBetween(String value1, String value2) {
            addCriterion("first_role_id not between", value1, value2, "firstRoleId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table a_f_config_scheme
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
     * This class corresponds to the database table a_f_config_scheme
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