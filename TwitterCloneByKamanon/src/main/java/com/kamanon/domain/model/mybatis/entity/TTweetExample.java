package com.kamanon.domain.model.mybatis.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TTweetExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public TTweetExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
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
     * This method corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
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

        public Criteria andTweetIdIsNull() {
            addCriterion("tweet_id is null");
            return (Criteria) this;
        }

        public Criteria andTweetIdIsNotNull() {
            addCriterion("tweet_id is not null");
            return (Criteria) this;
        }

        public Criteria andTweetIdEqualTo(Long value) {
            addCriterion("tweet_id =", value, "tweetId");
            return (Criteria) this;
        }

        public Criteria andTweetIdNotEqualTo(Long value) {
            addCriterion("tweet_id <>", value, "tweetId");
            return (Criteria) this;
        }

        public Criteria andTweetIdGreaterThan(Long value) {
            addCriterion("tweet_id >", value, "tweetId");
            return (Criteria) this;
        }

        public Criteria andTweetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tweet_id >=", value, "tweetId");
            return (Criteria) this;
        }

        public Criteria andTweetIdLessThan(Long value) {
            addCriterion("tweet_id <", value, "tweetId");
            return (Criteria) this;
        }

        public Criteria andTweetIdLessThanOrEqualTo(Long value) {
            addCriterion("tweet_id <=", value, "tweetId");
            return (Criteria) this;
        }

        public Criteria andTweetIdIn(List<Long> values) {
            addCriterion("tweet_id in", values, "tweetId");
            return (Criteria) this;
        }

        public Criteria andTweetIdNotIn(List<Long> values) {
            addCriterion("tweet_id not in", values, "tweetId");
            return (Criteria) this;
        }

        public Criteria andTweetIdBetween(Long value1, Long value2) {
            addCriterion("tweet_id between", value1, value2, "tweetId");
            return (Criteria) this;
        }

        public Criteria andTweetIdNotBetween(Long value1, Long value2) {
            addCriterion("tweet_id not between", value1, value2, "tweetId");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTweetIsNull() {
            addCriterion("tweet is null");
            return (Criteria) this;
        }

        public Criteria andTweetIsNotNull() {
            addCriterion("tweet is not null");
            return (Criteria) this;
        }

        public Criteria andTweetEqualTo(String value) {
            addCriterion("tweet =", value, "tweet");
            return (Criteria) this;
        }

        public Criteria andTweetNotEqualTo(String value) {
            addCriterion("tweet <>", value, "tweet");
            return (Criteria) this;
        }

        public Criteria andTweetGreaterThan(String value) {
            addCriterion("tweet >", value, "tweet");
            return (Criteria) this;
        }

        public Criteria andTweetGreaterThanOrEqualTo(String value) {
            addCriterion("tweet >=", value, "tweet");
            return (Criteria) this;
        }

        public Criteria andTweetLessThan(String value) {
            addCriterion("tweet <", value, "tweet");
            return (Criteria) this;
        }

        public Criteria andTweetLessThanOrEqualTo(String value) {
            addCriterion("tweet <=", value, "tweet");
            return (Criteria) this;
        }

        public Criteria andTweetLike(String value) {
            addCriterion("tweet like", value, "tweet");
            return (Criteria) this;
        }

        public Criteria andTweetNotLike(String value) {
            addCriterion("tweet not like", value, "tweet");
            return (Criteria) this;
        }

        public Criteria andTweetIn(List<String> values) {
            addCriterion("tweet in", values, "tweet");
            return (Criteria) this;
        }

        public Criteria andTweetNotIn(List<String> values) {
            addCriterion("tweet not in", values, "tweet");
            return (Criteria) this;
        }

        public Criteria andTweetBetween(String value1, String value2) {
            addCriterion("tweet between", value1, value2, "tweet");
            return (Criteria) this;
        }

        public Criteria andTweetNotBetween(String value1, String value2) {
            addCriterion("tweet not between", value1, value2, "tweet");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgIsNull() {
            addCriterion("retweet_flg is null");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgIsNotNull() {
            addCriterion("retweet_flg is not null");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgEqualTo(String value) {
            addCriterion("retweet_flg =", value, "retweetFlg");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgNotEqualTo(String value) {
            addCriterion("retweet_flg <>", value, "retweetFlg");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgGreaterThan(String value) {
            addCriterion("retweet_flg >", value, "retweetFlg");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgGreaterThanOrEqualTo(String value) {
            addCriterion("retweet_flg >=", value, "retweetFlg");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgLessThan(String value) {
            addCriterion("retweet_flg <", value, "retweetFlg");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgLessThanOrEqualTo(String value) {
            addCriterion("retweet_flg <=", value, "retweetFlg");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgLike(String value) {
            addCriterion("retweet_flg like", value, "retweetFlg");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgNotLike(String value) {
            addCriterion("retweet_flg not like", value, "retweetFlg");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgIn(List<String> values) {
            addCriterion("retweet_flg in", values, "retweetFlg");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgNotIn(List<String> values) {
            addCriterion("retweet_flg not in", values, "retweetFlg");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgBetween(String value1, String value2) {
            addCriterion("retweet_flg between", value1, value2, "retweetFlg");
            return (Criteria) this;
        }

        public Criteria andRetweetFlgNotBetween(String value1, String value2) {
            addCriterion("retweet_flg not between", value1, value2, "retweetFlg");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNull() {
            addCriterion("created is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIsNotNull() {
            addCriterion("created is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedEqualTo(LocalDateTime value) {
            addCriterion("created =", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotEqualTo(LocalDateTime value) {
            addCriterion("created <>", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThan(LocalDateTime value) {
            addCriterion("created >", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("created >=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThan(LocalDateTime value) {
            addCriterion("created <", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("created <=", value, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedIn(List<LocalDateTime> values) {
            addCriterion("created in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotIn(List<LocalDateTime> values) {
            addCriterion("created not in", values, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created between", value1, value2, "created");
            return (Criteria) this;
        }

        public Criteria andCreatedNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("created not between", value1, value2, "created");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_tweet
     *
     * @mbg.generated do_not_delete_during_merge Sun Jul 14 10:27:17 JST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_tweet
     *
     * @mbg.generated Sun Jul 14 10:27:17 JST 2019
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