package cn.thinkfree.database.model;

import java.util.ArrayList;
import java.util.List;

public class ApprovalFlowFormDataExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table approval_flow_form_data
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table approval_flow_form_data
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table approval_flow_form_data
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_form_data
     *
     * @mbg.generated
     */
    public ApprovalFlowFormDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_form_data
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_form_data
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_form_data
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_form_data
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_form_data
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_form_data
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_form_data
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
     * This method corresponds to the database table approval_flow_form_data
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
     * This method corresponds to the database table approval_flow_form_data
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table approval_flow_form_data
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
     * This class corresponds to the database table approval_flow_form_data
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

        public Criteria andDataResourceIdIsNull() {
            addCriterion("data_resource_id is null");
            return (Criteria) this;
        }

        public Criteria andDataResourceIdIsNotNull() {
            addCriterion("data_resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataResourceIdEqualTo(Integer value) {
            addCriterion("data_resource_id =", value, "dataResourceId");
            return (Criteria) this;
        }

        public Criteria andDataResourceIdNotEqualTo(Integer value) {
            addCriterion("data_resource_id <>", value, "dataResourceId");
            return (Criteria) this;
        }

        public Criteria andDataResourceIdGreaterThan(Integer value) {
            addCriterion("data_resource_id >", value, "dataResourceId");
            return (Criteria) this;
        }

        public Criteria andDataResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_resource_id >=", value, "dataResourceId");
            return (Criteria) this;
        }

        public Criteria andDataResourceIdLessThan(Integer value) {
            addCriterion("data_resource_id <", value, "dataResourceId");
            return (Criteria) this;
        }

        public Criteria andDataResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("data_resource_id <=", value, "dataResourceId");
            return (Criteria) this;
        }

        public Criteria andDataResourceIdIn(List<Integer> values) {
            addCriterion("data_resource_id in", values, "dataResourceId");
            return (Criteria) this;
        }

        public Criteria andDataResourceIdNotIn(List<Integer> values) {
            addCriterion("data_resource_id not in", values, "dataResourceId");
            return (Criteria) this;
        }

        public Criteria andDataResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("data_resource_id between", value1, value2, "dataResourceId");
            return (Criteria) this;
        }

        public Criteria andDataResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("data_resource_id not between", value1, value2, "dataResourceId");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeIsNull() {
            addCriterion("external_unique_code is null");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeIsNotNull() {
            addCriterion("external_unique_code is not null");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeEqualTo(String value) {
            addCriterion("external_unique_code =", value, "externalUniqueCode");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeNotEqualTo(String value) {
            addCriterion("external_unique_code <>", value, "externalUniqueCode");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeGreaterThan(String value) {
            addCriterion("external_unique_code >", value, "externalUniqueCode");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeGreaterThanOrEqualTo(String value) {
            addCriterion("external_unique_code >=", value, "externalUniqueCode");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeLessThan(String value) {
            addCriterion("external_unique_code <", value, "externalUniqueCode");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeLessThanOrEqualTo(String value) {
            addCriterion("external_unique_code <=", value, "externalUniqueCode");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeLike(String value) {
            addCriterion("external_unique_code like", value, "externalUniqueCode");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeNotLike(String value) {
            addCriterion("external_unique_code not like", value, "externalUniqueCode");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeIn(List<String> values) {
            addCriterion("external_unique_code in", values, "externalUniqueCode");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeNotIn(List<String> values) {
            addCriterion("external_unique_code not in", values, "externalUniqueCode");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeBetween(String value1, String value2) {
            addCriterion("external_unique_code between", value1, value2, "externalUniqueCode");
            return (Criteria) this;
        }

        public Criteria andExternalUniqueCodeNotBetween(String value1, String value2) {
            addCriterion("external_unique_code not between", value1, value2, "externalUniqueCode");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeIsNull() {
            addCriterion("form_data_code is null");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeIsNotNull() {
            addCriterion("form_data_code is not null");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeEqualTo(String value) {
            addCriterion("form_data_code =", value, "formDataCode");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeNotEqualTo(String value) {
            addCriterion("form_data_code <>", value, "formDataCode");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeGreaterThan(String value) {
            addCriterion("form_data_code >", value, "formDataCode");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeGreaterThanOrEqualTo(String value) {
            addCriterion("form_data_code >=", value, "formDataCode");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeLessThan(String value) {
            addCriterion("form_data_code <", value, "formDataCode");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeLessThanOrEqualTo(String value) {
            addCriterion("form_data_code <=", value, "formDataCode");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeLike(String value) {
            addCriterion("form_data_code like", value, "formDataCode");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeNotLike(String value) {
            addCriterion("form_data_code not like", value, "formDataCode");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeIn(List<String> values) {
            addCriterion("form_data_code in", values, "formDataCode");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeNotIn(List<String> values) {
            addCriterion("form_data_code not in", values, "formDataCode");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeBetween(String value1, String value2) {
            addCriterion("form_data_code between", value1, value2, "formDataCode");
            return (Criteria) this;
        }

        public Criteria andFormDataCodeNotBetween(String value1, String value2) {
            addCriterion("form_data_code not between", value1, value2, "formDataCode");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainIsNull() {
            addCriterion("form_data_explain is null");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainIsNotNull() {
            addCriterion("form_data_explain is not null");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainEqualTo(String value) {
            addCriterion("form_data_explain =", value, "formDataExplain");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainNotEqualTo(String value) {
            addCriterion("form_data_explain <>", value, "formDataExplain");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainGreaterThan(String value) {
            addCriterion("form_data_explain >", value, "formDataExplain");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainGreaterThanOrEqualTo(String value) {
            addCriterion("form_data_explain >=", value, "formDataExplain");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainLessThan(String value) {
            addCriterion("form_data_explain <", value, "formDataExplain");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainLessThanOrEqualTo(String value) {
            addCriterion("form_data_explain <=", value, "formDataExplain");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainLike(String value) {
            addCriterion("form_data_explain like", value, "formDataExplain");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainNotLike(String value) {
            addCriterion("form_data_explain not like", value, "formDataExplain");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainIn(List<String> values) {
            addCriterion("form_data_explain in", values, "formDataExplain");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainNotIn(List<String> values) {
            addCriterion("form_data_explain not in", values, "formDataExplain");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainBetween(String value1, String value2) {
            addCriterion("form_data_explain between", value1, value2, "formDataExplain");
            return (Criteria) this;
        }

        public Criteria andFormDataExplainNotBetween(String value1, String value2) {
            addCriterion("form_data_explain not between", value1, value2, "formDataExplain");
            return (Criteria) this;
        }

        public Criteria andIsEditIsNull() {
            addCriterion("is_edit is null");
            return (Criteria) this;
        }

        public Criteria andIsEditIsNotNull() {
            addCriterion("is_edit is not null");
            return (Criteria) this;
        }

        public Criteria andIsEditEqualTo(Integer value) {
            addCriterion("is_edit =", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotEqualTo(Integer value) {
            addCriterion("is_edit <>", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditGreaterThan(Integer value) {
            addCriterion("is_edit >", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_edit >=", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditLessThan(Integer value) {
            addCriterion("is_edit <", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditLessThanOrEqualTo(Integer value) {
            addCriterion("is_edit <=", value, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditIn(List<Integer> values) {
            addCriterion("is_edit in", values, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotIn(List<Integer> values) {
            addCriterion("is_edit not in", values, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditBetween(Integer value1, Integer value2) {
            addCriterion("is_edit between", value1, value2, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsEditNotBetween(Integer value1, Integer value2) {
            addCriterion("is_edit not between", value1, value2, "isEdit");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeIsNull() {
            addCriterion("record_unique_code is null");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeIsNotNull() {
            addCriterion("record_unique_code is not null");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeEqualTo(String value) {
            addCriterion("record_unique_code =", value, "recordUniqueCode");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeNotEqualTo(String value) {
            addCriterion("record_unique_code <>", value, "recordUniqueCode");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeGreaterThan(String value) {
            addCriterion("record_unique_code >", value, "recordUniqueCode");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeGreaterThanOrEqualTo(String value) {
            addCriterion("record_unique_code >=", value, "recordUniqueCode");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeLessThan(String value) {
            addCriterion("record_unique_code <", value, "recordUniqueCode");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeLessThanOrEqualTo(String value) {
            addCriterion("record_unique_code <=", value, "recordUniqueCode");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeLike(String value) {
            addCriterion("record_unique_code like", value, "recordUniqueCode");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeNotLike(String value) {
            addCriterion("record_unique_code not like", value, "recordUniqueCode");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeIn(List<String> values) {
            addCriterion("record_unique_code in", values, "recordUniqueCode");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeNotIn(List<String> values) {
            addCriterion("record_unique_code not in", values, "recordUniqueCode");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeBetween(String value1, String value2) {
            addCriterion("record_unique_code between", value1, value2, "recordUniqueCode");
            return (Criteria) this;
        }

        public Criteria andRecordUniqueCodeNotBetween(String value1, String value2) {
            addCriterion("record_unique_code not between", value1, value2, "recordUniqueCode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table approval_flow_form_data
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
     * This class corresponds to the database table approval_flow_form_data
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