package com.amiyasahu.spm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
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
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOrdernumberIsNull() {
            addCriterion("orderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNotNull() {
            addCriterion("orderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberEqualTo(Integer value) {
            addCriterion("orderNumber =", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotEqualTo(Integer value) {
            addCriterion("orderNumber <>", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThan(Integer value) {
            addCriterion("orderNumber >", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderNumber >=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThan(Integer value) {
            addCriterion("orderNumber <", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThanOrEqualTo(Integer value) {
            addCriterion("orderNumber <=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIn(List<Integer> values) {
            addCriterion("orderNumber in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotIn(List<Integer> values) {
            addCriterion("orderNumber not in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberBetween(Integer value1, Integer value2) {
            addCriterion("orderNumber between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotBetween(Integer value1, Integer value2) {
            addCriterion("orderNumber not between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNull() {
            addCriterion("orderDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderdateIsNotNull() {
            addCriterion("orderDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderdateEqualTo(Date value) {
            addCriterionForJDBCDate("orderDate =", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("orderDate <>", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThan(Date value) {
            addCriterionForJDBCDate("orderDate >", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderDate >=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThan(Date value) {
            addCriterionForJDBCDate("orderDate <", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("orderDate <=", value, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateIn(List<Date> values) {
            addCriterionForJDBCDate("orderDate in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("orderDate not in", values, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderDate between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andOrderdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("orderDate not between", value1, value2, "orderdate");
            return (Criteria) this;
        }

        public Criteria andRequireddateIsNull() {
            addCriterion("requiredDate is null");
            return (Criteria) this;
        }

        public Criteria andRequireddateIsNotNull() {
            addCriterion("requiredDate is not null");
            return (Criteria) this;
        }

        public Criteria andRequireddateEqualTo(Date value) {
            addCriterionForJDBCDate("requiredDate =", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("requiredDate <>", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateGreaterThan(Date value) {
            addCriterionForJDBCDate("requiredDate >", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("requiredDate >=", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateLessThan(Date value) {
            addCriterionForJDBCDate("requiredDate <", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("requiredDate <=", value, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateIn(List<Date> values) {
            addCriterionForJDBCDate("requiredDate in", values, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("requiredDate not in", values, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("requiredDate between", value1, value2, "requireddate");
            return (Criteria) this;
        }

        public Criteria andRequireddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("requiredDate not between", value1, value2, "requireddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateIsNull() {
            addCriterion("shippedDate is null");
            return (Criteria) this;
        }

        public Criteria andShippeddateIsNotNull() {
            addCriterion("shippedDate is not null");
            return (Criteria) this;
        }

        public Criteria andShippeddateEqualTo(Date value) {
            addCriterionForJDBCDate("shippedDate =", value, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("shippedDate <>", value, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateGreaterThan(Date value) {
            addCriterionForJDBCDate("shippedDate >", value, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shippedDate >=", value, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateLessThan(Date value) {
            addCriterionForJDBCDate("shippedDate <", value, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shippedDate <=", value, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateIn(List<Date> values) {
            addCriterionForJDBCDate("shippedDate in", values, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("shippedDate not in", values, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shippedDate between", value1, value2, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andShippeddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shippedDate not between", value1, value2, "shippeddate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCustomernumberIsNull() {
            addCriterion("customerNumber is null");
            return (Criteria) this;
        }

        public Criteria andCustomernumberIsNotNull() {
            addCriterion("customerNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernumberEqualTo(Integer value) {
            addCriterion("customerNumber =", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberNotEqualTo(Integer value) {
            addCriterion("customerNumber <>", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberGreaterThan(Integer value) {
            addCriterion("customerNumber >", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("customerNumber >=", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberLessThan(Integer value) {
            addCriterion("customerNumber <", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberLessThanOrEqualTo(Integer value) {
            addCriterion("customerNumber <=", value, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberIn(List<Integer> values) {
            addCriterion("customerNumber in", values, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberNotIn(List<Integer> values) {
            addCriterion("customerNumber not in", values, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberBetween(Integer value1, Integer value2) {
            addCriterion("customerNumber between", value1, value2, "customernumber");
            return (Criteria) this;
        }

        public Criteria andCustomernumberNotBetween(Integer value1, Integer value2) {
            addCriterion("customerNumber not between", value1, value2, "customernumber");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbg.generated do_not_delete_during_merge Sun Sep 18 20:00:15 IST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table orders
     *
     * @mbg.generated Sun Sep 18 20:00:15 IST 2016
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