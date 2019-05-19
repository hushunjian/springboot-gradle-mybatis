package com.hushunjian.gradle.mybatis.domain;

import java.util.ArrayList;
import java.util.List;

public class MeetingPersonRelationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public MeetingPersonRelationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
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
     * This method corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMeetIdIsNull() {
            addCriterion("meet_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetIdIsNotNull() {
            addCriterion("meet_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetIdEqualTo(Long value) {
            addCriterion("meet_id =", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdNotEqualTo(Long value) {
            addCriterion("meet_id <>", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdGreaterThan(Long value) {
            addCriterion("meet_id >", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("meet_id >=", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdLessThan(Long value) {
            addCriterion("meet_id <", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdLessThanOrEqualTo(Long value) {
            addCriterion("meet_id <=", value, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdIn(List<Long> values) {
            addCriterion("meet_id in", values, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdNotIn(List<Long> values) {
            addCriterion("meet_id not in", values, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdBetween(Long value1, Long value2) {
            addCriterion("meet_id between", value1, value2, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetIdNotBetween(Long value1, Long value2) {
            addCriterion("meet_id not between", value1, value2, "meetId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartIsNull() {
            addCriterion("meet_person_depart is null");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartIsNotNull() {
            addCriterion("meet_person_depart is not null");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartEqualTo(String value) {
            addCriterion("meet_person_depart =", value, "meetPersonDepart");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartNotEqualTo(String value) {
            addCriterion("meet_person_depart <>", value, "meetPersonDepart");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartGreaterThan(String value) {
            addCriterion("meet_person_depart >", value, "meetPersonDepart");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartGreaterThanOrEqualTo(String value) {
            addCriterion("meet_person_depart >=", value, "meetPersonDepart");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartLessThan(String value) {
            addCriterion("meet_person_depart <", value, "meetPersonDepart");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartLessThanOrEqualTo(String value) {
            addCriterion("meet_person_depart <=", value, "meetPersonDepart");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartLike(String value) {
            addCriterion("meet_person_depart like", value, "meetPersonDepart");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartNotLike(String value) {
            addCriterion("meet_person_depart not like", value, "meetPersonDepart");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartIn(List<String> values) {
            addCriterion("meet_person_depart in", values, "meetPersonDepart");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartNotIn(List<String> values) {
            addCriterion("meet_person_depart not in", values, "meetPersonDepart");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartBetween(String value1, String value2) {
            addCriterion("meet_person_depart between", value1, value2, "meetPersonDepart");
            return (Criteria) this;
        }

        public Criteria andMeetPersonDepartNotBetween(String value1, String value2) {
            addCriterion("meet_person_depart not between", value1, value2, "meetPersonDepart");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdIsNull() {
            addCriterion("meet_person_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdIsNotNull() {
            addCriterion("meet_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdEqualTo(String value) {
            addCriterion("meet_person_id =", value, "meetPersonId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdNotEqualTo(String value) {
            addCriterion("meet_person_id <>", value, "meetPersonId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdGreaterThan(String value) {
            addCriterion("meet_person_id >", value, "meetPersonId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("meet_person_id >=", value, "meetPersonId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdLessThan(String value) {
            addCriterion("meet_person_id <", value, "meetPersonId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdLessThanOrEqualTo(String value) {
            addCriterion("meet_person_id <=", value, "meetPersonId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdLike(String value) {
            addCriterion("meet_person_id like", value, "meetPersonId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdNotLike(String value) {
            addCriterion("meet_person_id not like", value, "meetPersonId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdIn(List<String> values) {
            addCriterion("meet_person_id in", values, "meetPersonId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdNotIn(List<String> values) {
            addCriterion("meet_person_id not in", values, "meetPersonId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdBetween(String value1, String value2) {
            addCriterion("meet_person_id between", value1, value2, "meetPersonId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonIdNotBetween(String value1, String value2) {
            addCriterion("meet_person_id not between", value1, value2, "meetPersonId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameIsNull() {
            addCriterion("meet_person_name is null");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameIsNotNull() {
            addCriterion("meet_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameEqualTo(String value) {
            addCriterion("meet_person_name =", value, "meetPersonName");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameNotEqualTo(String value) {
            addCriterion("meet_person_name <>", value, "meetPersonName");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameGreaterThan(String value) {
            addCriterion("meet_person_name >", value, "meetPersonName");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("meet_person_name >=", value, "meetPersonName");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameLessThan(String value) {
            addCriterion("meet_person_name <", value, "meetPersonName");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameLessThanOrEqualTo(String value) {
            addCriterion("meet_person_name <=", value, "meetPersonName");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameLike(String value) {
            addCriterion("meet_person_name like", value, "meetPersonName");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameNotLike(String value) {
            addCriterion("meet_person_name not like", value, "meetPersonName");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameIn(List<String> values) {
            addCriterion("meet_person_name in", values, "meetPersonName");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameNotIn(List<String> values) {
            addCriterion("meet_person_name not in", values, "meetPersonName");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameBetween(String value1, String value2) {
            addCriterion("meet_person_name between", value1, value2, "meetPersonName");
            return (Criteria) this;
        }

        public Criteria andMeetPersonNameNotBetween(String value1, String value2) {
            addCriterion("meet_person_name not between", value1, value2, "meetPersonName");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdIsNull() {
            addCriterion("meet_person_open_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdIsNotNull() {
            addCriterion("meet_person_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdEqualTo(String value) {
            addCriterion("meet_person_open_id =", value, "meetPersonOpenId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdNotEqualTo(String value) {
            addCriterion("meet_person_open_id <>", value, "meetPersonOpenId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdGreaterThan(String value) {
            addCriterion("meet_person_open_id >", value, "meetPersonOpenId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("meet_person_open_id >=", value, "meetPersonOpenId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdLessThan(String value) {
            addCriterion("meet_person_open_id <", value, "meetPersonOpenId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdLessThanOrEqualTo(String value) {
            addCriterion("meet_person_open_id <=", value, "meetPersonOpenId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdLike(String value) {
            addCriterion("meet_person_open_id like", value, "meetPersonOpenId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdNotLike(String value) {
            addCriterion("meet_person_open_id not like", value, "meetPersonOpenId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdIn(List<String> values) {
            addCriterion("meet_person_open_id in", values, "meetPersonOpenId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdNotIn(List<String> values) {
            addCriterion("meet_person_open_id not in", values, "meetPersonOpenId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdBetween(String value1, String value2) {
            addCriterion("meet_person_open_id between", value1, value2, "meetPersonOpenId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonOpenIdNotBetween(String value1, String value2) {
            addCriterion("meet_person_open_id not between", value1, value2, "meetPersonOpenId");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleIsNull() {
            addCriterion("meet_person_role is null");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleIsNotNull() {
            addCriterion("meet_person_role is not null");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleEqualTo(String value) {
            addCriterion("meet_person_role =", value, "meetPersonRole");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleNotEqualTo(String value) {
            addCriterion("meet_person_role <>", value, "meetPersonRole");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleGreaterThan(String value) {
            addCriterion("meet_person_role >", value, "meetPersonRole");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleGreaterThanOrEqualTo(String value) {
            addCriterion("meet_person_role >=", value, "meetPersonRole");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleLessThan(String value) {
            addCriterion("meet_person_role <", value, "meetPersonRole");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleLessThanOrEqualTo(String value) {
            addCriterion("meet_person_role <=", value, "meetPersonRole");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleLike(String value) {
            addCriterion("meet_person_role like", value, "meetPersonRole");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleNotLike(String value) {
            addCriterion("meet_person_role not like", value, "meetPersonRole");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleIn(List<String> values) {
            addCriterion("meet_person_role in", values, "meetPersonRole");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleNotIn(List<String> values) {
            addCriterion("meet_person_role not in", values, "meetPersonRole");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleBetween(String value1, String value2) {
            addCriterion("meet_person_role between", value1, value2, "meetPersonRole");
            return (Criteria) this;
        }

        public Criteria andMeetPersonRoleNotBetween(String value1, String value2) {
            addCriterion("meet_person_role not between", value1, value2, "meetPersonRole");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberIsNull() {
            addCriterion("meet_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberIsNotNull() {
            addCriterion("meet_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberEqualTo(String value) {
            addCriterion("meet_phone_number =", value, "meetPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberNotEqualTo(String value) {
            addCriterion("meet_phone_number <>", value, "meetPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberGreaterThan(String value) {
            addCriterion("meet_phone_number >", value, "meetPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("meet_phone_number >=", value, "meetPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberLessThan(String value) {
            addCriterion("meet_phone_number <", value, "meetPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("meet_phone_number <=", value, "meetPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberLike(String value) {
            addCriterion("meet_phone_number like", value, "meetPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberNotLike(String value) {
            addCriterion("meet_phone_number not like", value, "meetPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberIn(List<String> values) {
            addCriterion("meet_phone_number in", values, "meetPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberNotIn(List<String> values) {
            addCriterion("meet_phone_number not in", values, "meetPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberBetween(String value1, String value2) {
            addCriterion("meet_phone_number between", value1, value2, "meetPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andMeetPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("meet_phone_number not between", value1, value2, "meetPhoneNumber");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table meeting_person_relation
     *
     * @mbg.generated do_not_delete_during_merge Sun May 19 10:56:54 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table meeting_person_relation
     *
     * @mbg.generated Sun May 19 10:56:54 CST 2019
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