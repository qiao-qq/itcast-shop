package com.itheima.shop.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProductDescExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductDescExample() {
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

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsIsNull() {
            addCriterion("specification_items is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsIsNotNull() {
            addCriterion("specification_items is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsEqualTo(String value) {
            addCriterion("specification_items =", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsNotEqualTo(String value) {
            addCriterion("specification_items <>", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsGreaterThan(String value) {
            addCriterion("specification_items >", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsGreaterThanOrEqualTo(String value) {
            addCriterion("specification_items >=", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsLessThan(String value) {
            addCriterion("specification_items <", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsLessThanOrEqualTo(String value) {
            addCriterion("specification_items <=", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsLike(String value) {
            addCriterion("specification_items like", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsNotLike(String value) {
            addCriterion("specification_items not like", value, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsIn(List<String> values) {
            addCriterion("specification_items in", values, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsNotIn(List<String> values) {
            addCriterion("specification_items not in", values, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsBetween(String value1, String value2) {
            addCriterion("specification_items between", value1, value2, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andSpecificationItemsNotBetween(String value1, String value2) {
            addCriterion("specification_items not between", value1, value2, "specificationItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsIsNull() {
            addCriterion("custom_attribute_items is null");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsIsNotNull() {
            addCriterion("custom_attribute_items is not null");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsEqualTo(String value) {
            addCriterion("custom_attribute_items =", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsNotEqualTo(String value) {
            addCriterion("custom_attribute_items <>", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsGreaterThan(String value) {
            addCriterion("custom_attribute_items >", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsGreaterThanOrEqualTo(String value) {
            addCriterion("custom_attribute_items >=", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsLessThan(String value) {
            addCriterion("custom_attribute_items <", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsLessThanOrEqualTo(String value) {
            addCriterion("custom_attribute_items <=", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsLike(String value) {
            addCriterion("custom_attribute_items like", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsNotLike(String value) {
            addCriterion("custom_attribute_items not like", value, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsIn(List<String> values) {
            addCriterion("custom_attribute_items in", values, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsNotIn(List<String> values) {
            addCriterion("custom_attribute_items not in", values, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsBetween(String value1, String value2) {
            addCriterion("custom_attribute_items between", value1, value2, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andCustomAttributeItemsNotBetween(String value1, String value2) {
            addCriterion("custom_attribute_items not between", value1, value2, "customAttributeItems");
            return (Criteria) this;
        }

        public Criteria andProductImagesIsNull() {
            addCriterion("product_images is null");
            return (Criteria) this;
        }

        public Criteria andProductImagesIsNotNull() {
            addCriterion("product_images is not null");
            return (Criteria) this;
        }

        public Criteria andProductImagesEqualTo(String value) {
            addCriterion("product_images =", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesNotEqualTo(String value) {
            addCriterion("product_images <>", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesGreaterThan(String value) {
            addCriterion("product_images >", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesGreaterThanOrEqualTo(String value) {
            addCriterion("product_images >=", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesLessThan(String value) {
            addCriterion("product_images <", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesLessThanOrEqualTo(String value) {
            addCriterion("product_images <=", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesLike(String value) {
            addCriterion("product_images like", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesNotLike(String value) {
            addCriterion("product_images not like", value, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesIn(List<String> values) {
            addCriterion("product_images in", values, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesNotIn(List<String> values) {
            addCriterion("product_images not in", values, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesBetween(String value1, String value2) {
            addCriterion("product_images between", value1, value2, "productImages");
            return (Criteria) this;
        }

        public Criteria andProductImagesNotBetween(String value1, String value2) {
            addCriterion("product_images not between", value1, value2, "productImages");
            return (Criteria) this;
        }

        public Criteria andPackageListIsNull() {
            addCriterion("package_list is null");
            return (Criteria) this;
        }

        public Criteria andPackageListIsNotNull() {
            addCriterion("package_list is not null");
            return (Criteria) this;
        }

        public Criteria andPackageListEqualTo(String value) {
            addCriterion("package_list =", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListNotEqualTo(String value) {
            addCriterion("package_list <>", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListGreaterThan(String value) {
            addCriterion("package_list >", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListGreaterThanOrEqualTo(String value) {
            addCriterion("package_list >=", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListLessThan(String value) {
            addCriterion("package_list <", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListLessThanOrEqualTo(String value) {
            addCriterion("package_list <=", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListLike(String value) {
            addCriterion("package_list like", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListNotLike(String value) {
            addCriterion("package_list not like", value, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListIn(List<String> values) {
            addCriterion("package_list in", values, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListNotIn(List<String> values) {
            addCriterion("package_list not in", values, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListBetween(String value1, String value2) {
            addCriterion("package_list between", value1, value2, "packageList");
            return (Criteria) this;
        }

        public Criteria andPackageListNotBetween(String value1, String value2) {
            addCriterion("package_list not between", value1, value2, "packageList");
            return (Criteria) this;
        }

        public Criteria andSaleServiceIsNull() {
            addCriterion("sale_service is null");
            return (Criteria) this;
        }

        public Criteria andSaleServiceIsNotNull() {
            addCriterion("sale_service is not null");
            return (Criteria) this;
        }

        public Criteria andSaleServiceEqualTo(String value) {
            addCriterion("sale_service =", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceNotEqualTo(String value) {
            addCriterion("sale_service <>", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceGreaterThan(String value) {
            addCriterion("sale_service >", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceGreaterThanOrEqualTo(String value) {
            addCriterion("sale_service >=", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceLessThan(String value) {
            addCriterion("sale_service <", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceLessThanOrEqualTo(String value) {
            addCriterion("sale_service <=", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceLike(String value) {
            addCriterion("sale_service like", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceNotLike(String value) {
            addCriterion("sale_service not like", value, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceIn(List<String> values) {
            addCriterion("sale_service in", values, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceNotIn(List<String> values) {
            addCriterion("sale_service not in", values, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceBetween(String value1, String value2) {
            addCriterion("sale_service between", value1, value2, "saleService");
            return (Criteria) this;
        }

        public Criteria andSaleServiceNotBetween(String value1, String value2) {
            addCriterion("sale_service not between", value1, value2, "saleService");
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