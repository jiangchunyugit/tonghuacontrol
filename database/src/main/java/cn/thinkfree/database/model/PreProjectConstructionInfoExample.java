package cn.thinkfree.database.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PreProjectConstructionInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pre_project_construction_info
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pre_project_construction_info
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pre_project_construction_info
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_construction_info
     *
     * @mbg.generated
     */
    public PreProjectConstructionInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_construction_info
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_construction_info
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_construction_info
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_construction_info
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_construction_info
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_construction_info
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_construction_info
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
     * This method corresponds to the database table pre_project_construction_info
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
     * This method corresponds to the database table pre_project_construction_info
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pre_project_construction_info
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
     * This class corresponds to the database table pre_project_construction_info
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

        public Criteria andProjectNoIsNull() {
            addCriterion("project_no is null");
            return (Criteria) this;
        }

        public Criteria andProjectNoIsNotNull() {
            addCriterion("project_no is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNoEqualTo(String value) {
            addCriterion("project_no =", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotEqualTo(String value) {
            addCriterion("project_no <>", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThan(String value) {
            addCriterion("project_no >", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("project_no >=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThan(String value) {
            addCriterion("project_no <", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLessThanOrEqualTo(String value) {
            addCriterion("project_no <=", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoLike(String value) {
            addCriterion("project_no like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotLike(String value) {
            addCriterion("project_no not like", value, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoIn(List<String> values) {
            addCriterion("project_no in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotIn(List<String> values) {
            addCriterion("project_no not in", values, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoBetween(String value1, String value2) {
            addCriterion("project_no between", value1, value2, "projectNo");
            return (Criteria) this;
        }

        public Criteria andProjectNoNotBetween(String value1, String value2) {
            addCriterion("project_no not between", value1, value2, "projectNo");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoIsNull() {
            addCriterion("construcion_project_no is null");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoIsNotNull() {
            addCriterion("construcion_project_no is not null");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoEqualTo(String value) {
            addCriterion("construcion_project_no =", value, "construcionProjectNo");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoNotEqualTo(String value) {
            addCriterion("construcion_project_no <>", value, "construcionProjectNo");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoGreaterThan(String value) {
            addCriterion("construcion_project_no >", value, "construcionProjectNo");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoGreaterThanOrEqualTo(String value) {
            addCriterion("construcion_project_no >=", value, "construcionProjectNo");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoLessThan(String value) {
            addCriterion("construcion_project_no <", value, "construcionProjectNo");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoLessThanOrEqualTo(String value) {
            addCriterion("construcion_project_no <=", value, "construcionProjectNo");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoLike(String value) {
            addCriterion("construcion_project_no like", value, "construcionProjectNo");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoNotLike(String value) {
            addCriterion("construcion_project_no not like", value, "construcionProjectNo");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoIn(List<String> values) {
            addCriterion("construcion_project_no in", values, "construcionProjectNo");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoNotIn(List<String> values) {
            addCriterion("construcion_project_no not in", values, "construcionProjectNo");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoBetween(String value1, String value2) {
            addCriterion("construcion_project_no between", value1, value2, "construcionProjectNo");
            return (Criteria) this;
        }

        public Criteria andConstrucionProjectNoNotBetween(String value1, String value2) {
            addCriterion("construcion_project_no not between", value1, value2, "construcionProjectNo");
            return (Criteria) this;
        }

        public Criteria andExplainInfoIsNull() {
            addCriterion("explain_info is null");
            return (Criteria) this;
        }

        public Criteria andExplainInfoIsNotNull() {
            addCriterion("explain_info is not null");
            return (Criteria) this;
        }

        public Criteria andExplainInfoEqualTo(String value) {
            addCriterion("explain_info =", value, "explainInfo");
            return (Criteria) this;
        }

        public Criteria andExplainInfoNotEqualTo(String value) {
            addCriterion("explain_info <>", value, "explainInfo");
            return (Criteria) this;
        }

        public Criteria andExplainInfoGreaterThan(String value) {
            addCriterion("explain_info >", value, "explainInfo");
            return (Criteria) this;
        }

        public Criteria andExplainInfoGreaterThanOrEqualTo(String value) {
            addCriterion("explain_info >=", value, "explainInfo");
            return (Criteria) this;
        }

        public Criteria andExplainInfoLessThan(String value) {
            addCriterion("explain_info <", value, "explainInfo");
            return (Criteria) this;
        }

        public Criteria andExplainInfoLessThanOrEqualTo(String value) {
            addCriterion("explain_info <=", value, "explainInfo");
            return (Criteria) this;
        }

        public Criteria andExplainInfoLike(String value) {
            addCriterion("explain_info like", value, "explainInfo");
            return (Criteria) this;
        }

        public Criteria andExplainInfoNotLike(String value) {
            addCriterion("explain_info not like", value, "explainInfo");
            return (Criteria) this;
        }

        public Criteria andExplainInfoIn(List<String> values) {
            addCriterion("explain_info in", values, "explainInfo");
            return (Criteria) this;
        }

        public Criteria andExplainInfoNotIn(List<String> values) {
            addCriterion("explain_info not in", values, "explainInfo");
            return (Criteria) this;
        }

        public Criteria andExplainInfoBetween(String value1, String value2) {
            addCriterion("explain_info between", value1, value2, "explainInfo");
            return (Criteria) this;
        }

        public Criteria andExplainInfoNotBetween(String value1, String value2) {
            addCriterion("explain_info not between", value1, value2, "explainInfo");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaIsNull() {
            addCriterion("acceptance_criteria is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaIsNotNull() {
            addCriterion("acceptance_criteria is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaEqualTo(String value) {
            addCriterion("acceptance_criteria =", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaNotEqualTo(String value) {
            addCriterion("acceptance_criteria <>", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaGreaterThan(String value) {
            addCriterion("acceptance_criteria >", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaGreaterThanOrEqualTo(String value) {
            addCriterion("acceptance_criteria >=", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaLessThan(String value) {
            addCriterion("acceptance_criteria <", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaLessThanOrEqualTo(String value) {
            addCriterion("acceptance_criteria <=", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaLike(String value) {
            addCriterion("acceptance_criteria like", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaNotLike(String value) {
            addCriterion("acceptance_criteria not like", value, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaIn(List<String> values) {
            addCriterion("acceptance_criteria in", values, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaNotIn(List<String> values) {
            addCriterion("acceptance_criteria not in", values, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaBetween(String value1, String value2) {
            addCriterion("acceptance_criteria between", value1, value2, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andAcceptanceCriteriaNotBetween(String value1, String value2) {
            addCriterion("acceptance_criteria not between", value1, value2, "acceptanceCriteria");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceIsNull() {
            addCriterion("standard_place is null");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceIsNotNull() {
            addCriterion("standard_place is not null");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceEqualTo(String value) {
            addCriterion("standard_place =", value, "standardPlace");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceNotEqualTo(String value) {
            addCriterion("standard_place <>", value, "standardPlace");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceGreaterThan(String value) {
            addCriterion("standard_place >", value, "standardPlace");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("standard_place >=", value, "standardPlace");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceLessThan(String value) {
            addCriterion("standard_place <", value, "standardPlace");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceLessThanOrEqualTo(String value) {
            addCriterion("standard_place <=", value, "standardPlace");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceLike(String value) {
            addCriterion("standard_place like", value, "standardPlace");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceNotLike(String value) {
            addCriterion("standard_place not like", value, "standardPlace");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceIn(List<String> values) {
            addCriterion("standard_place in", values, "standardPlace");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceNotIn(List<String> values) {
            addCriterion("standard_place not in", values, "standardPlace");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceBetween(String value1, String value2) {
            addCriterion("standard_place between", value1, value2, "standardPlace");
            return (Criteria) this;
        }

        public Criteria andStandardPlaceNotBetween(String value1, String value2) {
            addCriterion("standard_place not between", value1, value2, "standardPlace");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Short value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Short value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Short value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Short value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Short value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Short value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Short> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Short> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Short value1, Short value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Short value1, Short value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table pre_project_construction_info
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
     * This class corresponds to the database table pre_project_construction_info
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