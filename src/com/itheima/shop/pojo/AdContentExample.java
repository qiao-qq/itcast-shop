package com.itheima.shop.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdContentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdContentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCategoryid1IsNull() {
            addCriterion("categoryId1 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryid1IsNotNull() {
            addCriterion("categoryId1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryid1EqualTo(Long value) {
            addCriterion("categoryId1 =", value, "categoryid1");
            return (Criteria) this;
        }

        public Criteria andCategoryid1NotEqualTo(Long value) {
            addCriterion("categoryId1 <>", value, "categoryid1");
            return (Criteria) this;
        }

        public Criteria andCategoryid1GreaterThan(Long value) {
            addCriterion("categoryId1 >", value, "categoryid1");
            return (Criteria) this;
        }

        public Criteria andCategoryid1GreaterThanOrEqualTo(Long value) {
            addCriterion("categoryId1 >=", value, "categoryid1");
            return (Criteria) this;
        }

        public Criteria andCategoryid1LessThan(Long value) {
            addCriterion("categoryId1 <", value, "categoryid1");
            return (Criteria) this;
        }

        public Criteria andCategoryid1LessThanOrEqualTo(Long value) {
            addCriterion("categoryId1 <=", value, "categoryid1");
            return (Criteria) this;
        }

        public Criteria andCategoryid1In(List<Long> values) {
            addCriterion("categoryId1 in", values, "categoryid1");
            return (Criteria) this;
        }

        public Criteria andCategoryid1NotIn(List<Long> values) {
            addCriterion("categoryId1 not in", values, "categoryid1");
            return (Criteria) this;
        }

        public Criteria andCategoryid1Between(Long value1, Long value2) {
            addCriterion("categoryId1 between", value1, value2, "categoryid1");
            return (Criteria) this;
        }

        public Criteria andCategoryid1NotBetween(Long value1, Long value2) {
            addCriterion("categoryId1 not between", value1, value2, "categoryid1");
            return (Criteria) this;
        }

        public Criteria andCategoryid2IsNull() {
            addCriterion("categoryId2 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryid2IsNotNull() {
            addCriterion("categoryId2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryid2EqualTo(Long value) {
            addCriterion("categoryId2 =", value, "categoryid2");
            return (Criteria) this;
        }

        public Criteria andCategoryid2NotEqualTo(Long value) {
            addCriterion("categoryId2 <>", value, "categoryid2");
            return (Criteria) this;
        }

        public Criteria andCategoryid2GreaterThan(Long value) {
            addCriterion("categoryId2 >", value, "categoryid2");
            return (Criteria) this;
        }

        public Criteria andCategoryid2GreaterThanOrEqualTo(Long value) {
            addCriterion("categoryId2 >=", value, "categoryid2");
            return (Criteria) this;
        }

        public Criteria andCategoryid2LessThan(Long value) {
            addCriterion("categoryId2 <", value, "categoryid2");
            return (Criteria) this;
        }

        public Criteria andCategoryid2LessThanOrEqualTo(Long value) {
            addCriterion("categoryId2 <=", value, "categoryid2");
            return (Criteria) this;
        }

        public Criteria andCategoryid2In(List<Long> values) {
            addCriterion("categoryId2 in", values, "categoryid2");
            return (Criteria) this;
        }

        public Criteria andCategoryid2NotIn(List<Long> values) {
            addCriterion("categoryId2 not in", values, "categoryid2");
            return (Criteria) this;
        }

        public Criteria andCategoryid2Between(Long value1, Long value2) {
            addCriterion("categoryId2 between", value1, value2, "categoryid2");
            return (Criteria) this;
        }

        public Criteria andCategoryid2NotBetween(Long value1, Long value2) {
            addCriterion("categoryId2 not between", value1, value2, "categoryid2");
            return (Criteria) this;
        }

        public Criteria andCategoryid3IsNull() {
            addCriterion("categoryId3 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryid3IsNotNull() {
            addCriterion("categoryId3 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryid3EqualTo(Long value) {
            addCriterion("categoryId3 =", value, "categoryid3");
            return (Criteria) this;
        }

        public Criteria andCategoryid3NotEqualTo(Long value) {
            addCriterion("categoryId3 <>", value, "categoryid3");
            return (Criteria) this;
        }

        public Criteria andCategoryid3GreaterThan(Long value) {
            addCriterion("categoryId3 >", value, "categoryid3");
            return (Criteria) this;
        }

        public Criteria andCategoryid3GreaterThanOrEqualTo(Long value) {
            addCriterion("categoryId3 >=", value, "categoryid3");
            return (Criteria) this;
        }

        public Criteria andCategoryid3LessThan(Long value) {
            addCriterion("categoryId3 <", value, "categoryid3");
            return (Criteria) this;
        }

        public Criteria andCategoryid3LessThanOrEqualTo(Long value) {
            addCriterion("categoryId3 <=", value, "categoryid3");
            return (Criteria) this;
        }

        public Criteria andCategoryid3In(List<Long> values) {
            addCriterion("categoryId3 in", values, "categoryid3");
            return (Criteria) this;
        }

        public Criteria andCategoryid3NotIn(List<Long> values) {
            addCriterion("categoryId3 not in", values, "categoryid3");
            return (Criteria) this;
        }

        public Criteria andCategoryid3Between(Long value1, Long value2) {
            addCriterion("categoryId3 between", value1, value2, "categoryid3");
            return (Criteria) this;
        }

        public Criteria andCategoryid3NotBetween(Long value1, Long value2) {
            addCriterion("categoryId3 not between", value1, value2, "categoryid3");
            return (Criteria) this;
        }

        public Criteria andCategoryname3IsNull() {
            addCriterion("categoryName3 is null");
            return (Criteria) this;
        }

        public Criteria andCategoryname3IsNotNull() {
            addCriterion("categoryName3 is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryname3EqualTo(String value) {
            addCriterion("categoryName3 =", value, "categoryname3");
            return (Criteria) this;
        }

        public Criteria andCategoryname3NotEqualTo(String value) {
            addCriterion("categoryName3 <>", value, "categoryname3");
            return (Criteria) this;
        }

        public Criteria andCategoryname3GreaterThan(String value) {
            addCriterion("categoryName3 >", value, "categoryname3");
            return (Criteria) this;
        }

        public Criteria andCategoryname3GreaterThanOrEqualTo(String value) {
            addCriterion("categoryName3 >=", value, "categoryname3");
            return (Criteria) this;
        }

        public Criteria andCategoryname3LessThan(String value) {
            addCriterion("categoryName3 <", value, "categoryname3");
            return (Criteria) this;
        }

        public Criteria andCategoryname3LessThanOrEqualTo(String value) {
            addCriterion("categoryName3 <=", value, "categoryname3");
            return (Criteria) this;
        }

        public Criteria andCategoryname3Like(String value) {
            addCriterion("categoryName3 like", value, "categoryname3");
            return (Criteria) this;
        }

        public Criteria andCategoryname3NotLike(String value) {
            addCriterion("categoryName3 not like", value, "categoryname3");
            return (Criteria) this;
        }

        public Criteria andCategoryname3In(List<String> values) {
            addCriterion("categoryName3 in", values, "categoryname3");
            return (Criteria) this;
        }

        public Criteria andCategoryname3NotIn(List<String> values) {
            addCriterion("categoryName3 not in", values, "categoryname3");
            return (Criteria) this;
        }

        public Criteria andCategoryname3Between(String value1, String value2) {
            addCriterion("categoryName3 between", value1, value2, "categoryname3");
            return (Criteria) this;
        }

        public Criteria andCategoryname3NotBetween(String value1, String value2) {
            addCriterion("categoryName3 not between", value1, value2, "categoryname3");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("img not between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgSizeIsNull() {
            addCriterion("img_size is null");
            return (Criteria) this;
        }

        public Criteria andImgSizeIsNotNull() {
            addCriterion("img_size is not null");
            return (Criteria) this;
        }

        public Criteria andImgSizeEqualTo(String value) {
            addCriterion("img_size =", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeNotEqualTo(String value) {
            addCriterion("img_size <>", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeGreaterThan(String value) {
            addCriterion("img_size >", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeGreaterThanOrEqualTo(String value) {
            addCriterion("img_size >=", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeLessThan(String value) {
            addCriterion("img_size <", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeLessThanOrEqualTo(String value) {
            addCriterion("img_size <=", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeLike(String value) {
            addCriterion("img_size like", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeNotLike(String value) {
            addCriterion("img_size not like", value, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeIn(List<String> values) {
            addCriterion("img_size in", values, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeNotIn(List<String> values) {
            addCriterion("img_size not in", values, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeBetween(String value1, String value2) {
            addCriterion("img_size between", value1, value2, "imgSize");
            return (Criteria) this;
        }

        public Criteria andImgSizeNotBetween(String value1, String value2) {
            addCriterion("img_size not between", value1, value2, "imgSize");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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