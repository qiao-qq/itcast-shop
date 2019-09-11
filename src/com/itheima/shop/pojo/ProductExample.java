package com.itheima.shop.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(String value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(String value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(String value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(String value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(String value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(String value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLike(String value) {
            addCriterion("seller_id like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotLike(String value) {
            addCriterion("seller_id not like", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<String> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<String> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(String value1, String value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(String value1, String value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIdIsNull() {
            addCriterion("default_sku_id is null");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIdIsNotNull() {
            addCriterion("default_sku_id is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIdEqualTo(Long value) {
            addCriterion("default_sku_id =", value, "defaultSkuId");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIdNotEqualTo(Long value) {
            addCriterion("default_sku_id <>", value, "defaultSkuId");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIdGreaterThan(Long value) {
            addCriterion("default_sku_id >", value, "defaultSkuId");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIdGreaterThanOrEqualTo(Long value) {
            addCriterion("default_sku_id >=", value, "defaultSkuId");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIdLessThan(Long value) {
            addCriterion("default_sku_id <", value, "defaultSkuId");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIdLessThanOrEqualTo(Long value) {
            addCriterion("default_sku_id <=", value, "defaultSkuId");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIdIn(List<Long> values) {
            addCriterion("default_sku_id in", values, "defaultSkuId");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIdNotIn(List<Long> values) {
            addCriterion("default_sku_id not in", values, "defaultSkuId");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIdBetween(Long value1, Long value2) {
            addCriterion("default_sku_id between", value1, value2, "defaultSkuId");
            return (Criteria) this;
        }

        public Criteria andDefaultSkuIdNotBetween(Long value1, Long value2) {
            addCriterion("default_sku_id not between", value1, value2, "defaultSkuId");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andIsMarketableIsNull() {
            addCriterion("is_marketable is null");
            return (Criteria) this;
        }

        public Criteria andIsMarketableIsNotNull() {
            addCriterion("is_marketable is not null");
            return (Criteria) this;
        }

        public Criteria andIsMarketableEqualTo(String value) {
            addCriterion("is_marketable =", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableNotEqualTo(String value) {
            addCriterion("is_marketable <>", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableGreaterThan(String value) {
            addCriterion("is_marketable >", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableGreaterThanOrEqualTo(String value) {
            addCriterion("is_marketable >=", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableLessThan(String value) {
            addCriterion("is_marketable <", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableLessThanOrEqualTo(String value) {
            addCriterion("is_marketable <=", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableLike(String value) {
            addCriterion("is_marketable like", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableNotLike(String value) {
            addCriterion("is_marketable not like", value, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableIn(List<String> values) {
            addCriterion("is_marketable in", values, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableNotIn(List<String> values) {
            addCriterion("is_marketable not in", values, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableBetween(String value1, String value2) {
            addCriterion("is_marketable between", value1, value2, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andIsMarketableNotBetween(String value1, String value2) {
            addCriterion("is_marketable not between", value1, value2, "isMarketable");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Long value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNull() {
            addCriterion("caption is null");
            return (Criteria) this;
        }

        public Criteria andCaptionIsNotNull() {
            addCriterion("caption is not null");
            return (Criteria) this;
        }

        public Criteria andCaptionEqualTo(String value) {
            addCriterion("caption =", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotEqualTo(String value) {
            addCriterion("caption <>", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThan(String value) {
            addCriterion("caption >", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionGreaterThanOrEqualTo(String value) {
            addCriterion("caption >=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThan(String value) {
            addCriterion("caption <", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLessThanOrEqualTo(String value) {
            addCriterion("caption <=", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionLike(String value) {
            addCriterion("caption like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotLike(String value) {
            addCriterion("caption not like", value, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionIn(List<String> values) {
            addCriterion("caption in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotIn(List<String> values) {
            addCriterion("caption not in", values, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionBetween(String value1, String value2) {
            addCriterion("caption between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andCaptionNotBetween(String value1, String value2) {
            addCriterion("caption not between", value1, value2, "caption");
            return (Criteria) this;
        }

        public Criteria andCategory1IdIsNull() {
            addCriterion("category1_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory1IdIsNotNull() {
            addCriterion("category1_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory1IdEqualTo(Long value) {
            addCriterion("category1_id =", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdNotEqualTo(Long value) {
            addCriterion("category1_id <>", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdGreaterThan(Long value) {
            addCriterion("category1_id >", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdGreaterThanOrEqualTo(Long value) {
            addCriterion("category1_id >=", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdLessThan(Long value) {
            addCriterion("category1_id <", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdLessThanOrEqualTo(Long value) {
            addCriterion("category1_id <=", value, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdIn(List<Long> values) {
            addCriterion("category1_id in", values, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdNotIn(List<Long> values) {
            addCriterion("category1_id not in", values, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdBetween(Long value1, Long value2) {
            addCriterion("category1_id between", value1, value2, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory1IdNotBetween(Long value1, Long value2) {
            addCriterion("category1_id not between", value1, value2, "category1Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdIsNull() {
            addCriterion("category2_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory2IdIsNotNull() {
            addCriterion("category2_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory2IdEqualTo(Long value) {
            addCriterion("category2_id =", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdNotEqualTo(Long value) {
            addCriterion("category2_id <>", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdGreaterThan(Long value) {
            addCriterion("category2_id >", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdGreaterThanOrEqualTo(Long value) {
            addCriterion("category2_id >=", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdLessThan(Long value) {
            addCriterion("category2_id <", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdLessThanOrEqualTo(Long value) {
            addCriterion("category2_id <=", value, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdIn(List<Long> values) {
            addCriterion("category2_id in", values, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdNotIn(List<Long> values) {
            addCriterion("category2_id not in", values, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdBetween(Long value1, Long value2) {
            addCriterion("category2_id between", value1, value2, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory2IdNotBetween(Long value1, Long value2) {
            addCriterion("category2_id not between", value1, value2, "category2Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdIsNull() {
            addCriterion("category3_id is null");
            return (Criteria) this;
        }

        public Criteria andCategory3IdIsNotNull() {
            addCriterion("category3_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategory3IdEqualTo(Long value) {
            addCriterion("category3_id =", value, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdNotEqualTo(Long value) {
            addCriterion("category3_id <>", value, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdGreaterThan(Long value) {
            addCriterion("category3_id >", value, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdGreaterThanOrEqualTo(Long value) {
            addCriterion("category3_id >=", value, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdLessThan(Long value) {
            addCriterion("category3_id <", value, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdLessThanOrEqualTo(Long value) {
            addCriterion("category3_id <=", value, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdIn(List<Long> values) {
            addCriterion("category3_id in", values, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdNotIn(List<Long> values) {
            addCriterion("category3_id not in", values, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdBetween(Long value1, Long value2) {
            addCriterion("category3_id between", value1, value2, "category3Id");
            return (Criteria) this;
        }

        public Criteria andCategory3IdNotBetween(Long value1, Long value2) {
            addCriterion("category3_id not between", value1, value2, "category3Id");
            return (Criteria) this;
        }

        public Criteria andBigPicIsNull() {
            addCriterion("big_pic is null");
            return (Criteria) this;
        }

        public Criteria andBigPicIsNotNull() {
            addCriterion("big_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBigPicEqualTo(String value) {
            addCriterion("big_pic =", value, "bigPic");
            return (Criteria) this;
        }

        public Criteria andBigPicNotEqualTo(String value) {
            addCriterion("big_pic <>", value, "bigPic");
            return (Criteria) this;
        }

        public Criteria andBigPicGreaterThan(String value) {
            addCriterion("big_pic >", value, "bigPic");
            return (Criteria) this;
        }

        public Criteria andBigPicGreaterThanOrEqualTo(String value) {
            addCriterion("big_pic >=", value, "bigPic");
            return (Criteria) this;
        }

        public Criteria andBigPicLessThan(String value) {
            addCriterion("big_pic <", value, "bigPic");
            return (Criteria) this;
        }

        public Criteria andBigPicLessThanOrEqualTo(String value) {
            addCriterion("big_pic <=", value, "bigPic");
            return (Criteria) this;
        }

        public Criteria andBigPicLike(String value) {
            addCriterion("big_pic like", value, "bigPic");
            return (Criteria) this;
        }

        public Criteria andBigPicNotLike(String value) {
            addCriterion("big_pic not like", value, "bigPic");
            return (Criteria) this;
        }

        public Criteria andBigPicIn(List<String> values) {
            addCriterion("big_pic in", values, "bigPic");
            return (Criteria) this;
        }

        public Criteria andBigPicNotIn(List<String> values) {
            addCriterion("big_pic not in", values, "bigPic");
            return (Criteria) this;
        }

        public Criteria andBigPicBetween(String value1, String value2) {
            addCriterion("big_pic between", value1, value2, "bigPic");
            return (Criteria) this;
        }

        public Criteria andBigPicNotBetween(String value1, String value2) {
            addCriterion("big_pic not between", value1, value2, "bigPic");
            return (Criteria) this;
        }

        public Criteria andMidPicIsNull() {
            addCriterion("mid_pic is null");
            return (Criteria) this;
        }

        public Criteria andMidPicIsNotNull() {
            addCriterion("mid_pic is not null");
            return (Criteria) this;
        }

        public Criteria andMidPicEqualTo(String value) {
            addCriterion("mid_pic =", value, "midPic");
            return (Criteria) this;
        }

        public Criteria andMidPicNotEqualTo(String value) {
            addCriterion("mid_pic <>", value, "midPic");
            return (Criteria) this;
        }

        public Criteria andMidPicGreaterThan(String value) {
            addCriterion("mid_pic >", value, "midPic");
            return (Criteria) this;
        }

        public Criteria andMidPicGreaterThanOrEqualTo(String value) {
            addCriterion("mid_pic >=", value, "midPic");
            return (Criteria) this;
        }

        public Criteria andMidPicLessThan(String value) {
            addCriterion("mid_pic <", value, "midPic");
            return (Criteria) this;
        }

        public Criteria andMidPicLessThanOrEqualTo(String value) {
            addCriterion("mid_pic <=", value, "midPic");
            return (Criteria) this;
        }

        public Criteria andMidPicLike(String value) {
            addCriterion("mid_pic like", value, "midPic");
            return (Criteria) this;
        }

        public Criteria andMidPicNotLike(String value) {
            addCriterion("mid_pic not like", value, "midPic");
            return (Criteria) this;
        }

        public Criteria andMidPicIn(List<String> values) {
            addCriterion("mid_pic in", values, "midPic");
            return (Criteria) this;
        }

        public Criteria andMidPicNotIn(List<String> values) {
            addCriterion("mid_pic not in", values, "midPic");
            return (Criteria) this;
        }

        public Criteria andMidPicBetween(String value1, String value2) {
            addCriterion("mid_pic between", value1, value2, "midPic");
            return (Criteria) this;
        }

        public Criteria andMidPicNotBetween(String value1, String value2) {
            addCriterion("mid_pic not between", value1, value2, "midPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicIsNull() {
            addCriterion("small_pic is null");
            return (Criteria) this;
        }

        public Criteria andSmallPicIsNotNull() {
            addCriterion("small_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSmallPicEqualTo(String value) {
            addCriterion("small_pic =", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotEqualTo(String value) {
            addCriterion("small_pic <>", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicGreaterThan(String value) {
            addCriterion("small_pic >", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicGreaterThanOrEqualTo(String value) {
            addCriterion("small_pic >=", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicLessThan(String value) {
            addCriterion("small_pic <", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicLessThanOrEqualTo(String value) {
            addCriterion("small_pic <=", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicLike(String value) {
            addCriterion("small_pic like", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotLike(String value) {
            addCriterion("small_pic not like", value, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicIn(List<String> values) {
            addCriterion("small_pic in", values, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotIn(List<String> values) {
            addCriterion("small_pic not in", values, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicBetween(String value1, String value2) {
            addCriterion("small_pic between", value1, value2, "smallPic");
            return (Criteria) this;
        }

        public Criteria andSmallPicNotBetween(String value1, String value2) {
            addCriterion("small_pic not between", value1, value2, "smallPic");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdIsNull() {
            addCriterion("type_template_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdIsNotNull() {
            addCriterion("type_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdEqualTo(Long value) {
            addCriterion("type_template_id =", value, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdNotEqualTo(Long value) {
            addCriterion("type_template_id <>", value, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdGreaterThan(Long value) {
            addCriterion("type_template_id >", value, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("type_template_id >=", value, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdLessThan(Long value) {
            addCriterion("type_template_id <", value, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("type_template_id <=", value, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdIn(List<Long> values) {
            addCriterion("type_template_id in", values, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdNotIn(List<Long> values) {
            addCriterion("type_template_id not in", values, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdBetween(Long value1, Long value2) {
            addCriterion("type_template_id between", value1, value2, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andTypeTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("type_template_id not between", value1, value2, "typeTemplateId");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecIsNull() {
            addCriterion("is_enable_spec is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecIsNotNull() {
            addCriterion("is_enable_spec is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecEqualTo(String value) {
            addCriterion("is_enable_spec =", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecNotEqualTo(String value) {
            addCriterion("is_enable_spec <>", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecGreaterThan(String value) {
            addCriterion("is_enable_spec >", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecGreaterThanOrEqualTo(String value) {
            addCriterion("is_enable_spec >=", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecLessThan(String value) {
            addCriterion("is_enable_spec <", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecLessThanOrEqualTo(String value) {
            addCriterion("is_enable_spec <=", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecLike(String value) {
            addCriterion("is_enable_spec like", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecNotLike(String value) {
            addCriterion("is_enable_spec not like", value, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecIn(List<String> values) {
            addCriterion("is_enable_spec in", values, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecNotIn(List<String> values) {
            addCriterion("is_enable_spec not in", values, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecBetween(String value1, String value2) {
            addCriterion("is_enable_spec between", value1, value2, "isEnableSpec");
            return (Criteria) this;
        }

        public Criteria andIsEnableSpecNotBetween(String value1, String value2) {
            addCriterion("is_enable_spec not between", value1, value2, "isEnableSpec");
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

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(String value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("is_delete like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("is_delete not like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<String> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<String> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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