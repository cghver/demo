package com.tanghuachun.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public CompanyExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andAcidIsNull() {
            addCriterion("acid is null");
            return (Criteria) this;
        }

        public Criteria andAcidIsNotNull() {
            addCriterion("acid is not null");
            return (Criteria) this;
        }

        public Criteria andAcidEqualTo(Integer value) {
            addCriterion("acid =", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidNotEqualTo(Integer value) {
            addCriterion("acid <>", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidGreaterThan(Integer value) {
            addCriterion("acid >", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidGreaterThanOrEqualTo(Integer value) {
            addCriterion("acid >=", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidLessThan(Integer value) {
            addCriterion("acid <", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidLessThanOrEqualTo(Integer value) {
            addCriterion("acid <=", value, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidIn(List<Integer> values) {
            addCriterion("acid in", values, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidNotIn(List<Integer> values) {
            addCriterion("acid not in", values, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidBetween(Integer value1, Integer value2) {
            addCriterion("acid between", value1, value2, "acid");
            return (Criteria) this;
        }

        public Criteria andAcidNotBetween(Integer value1, Integer value2) {
            addCriterion("acid not between", value1, value2, "acid");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
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

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNull() {
            addCriterion("website is null");
            return (Criteria) this;
        }

        public Criteria andWebsiteIsNotNull() {
            addCriterion("website is not null");
            return (Criteria) this;
        }

        public Criteria andWebsiteEqualTo(String value) {
            addCriterion("website =", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotEqualTo(String value) {
            addCriterion("website <>", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThan(String value) {
            addCriterion("website >", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("website >=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThan(String value) {
            addCriterion("website <", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLessThanOrEqualTo(String value) {
            addCriterion("website <=", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteLike(String value) {
            addCriterion("website like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotLike(String value) {
            addCriterion("website not like", value, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteIn(List<String> values) {
            addCriterion("website in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotIn(List<String> values) {
            addCriterion("website not in", values, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteBetween(String value1, String value2) {
            addCriterion("website between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andWebsiteNotBetween(String value1, String value2) {
            addCriterion("website not between", value1, value2, "website");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("`type` like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("`type` not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("`status` like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("`status` not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZlNumIsNull() {
            addCriterion("knowledge_zl_num is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZlNumIsNotNull() {
            addCriterion("knowledge_zl_num is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZlNumEqualTo(Integer value) {
            addCriterion("knowledge_zl_num =", value, "knowledgeZlNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZlNumNotEqualTo(Integer value) {
            addCriterion("knowledge_zl_num <>", value, "knowledgeZlNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZlNumGreaterThan(Integer value) {
            addCriterion("knowledge_zl_num >", value, "knowledgeZlNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZlNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("knowledge_zl_num >=", value, "knowledgeZlNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZlNumLessThan(Integer value) {
            addCriterion("knowledge_zl_num <", value, "knowledgeZlNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZlNumLessThanOrEqualTo(Integer value) {
            addCriterion("knowledge_zl_num <=", value, "knowledgeZlNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZlNumIn(List<Integer> values) {
            addCriterion("knowledge_zl_num in", values, "knowledgeZlNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZlNumNotIn(List<Integer> values) {
            addCriterion("knowledge_zl_num not in", values, "knowledgeZlNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZlNumBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_zl_num between", value1, value2, "knowledgeZlNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZlNumNotBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_zl_num not between", value1, value2, "knowledgeZlNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeSbNumIsNull() {
            addCriterion("knowledge_sb_num is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeSbNumIsNotNull() {
            addCriterion("knowledge_sb_num is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeSbNumEqualTo(Integer value) {
            addCriterion("knowledge_sb_num =", value, "knowledgeSbNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeSbNumNotEqualTo(Integer value) {
            addCriterion("knowledge_sb_num <>", value, "knowledgeSbNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeSbNumGreaterThan(Integer value) {
            addCriterion("knowledge_sb_num >", value, "knowledgeSbNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeSbNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("knowledge_sb_num >=", value, "knowledgeSbNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeSbNumLessThan(Integer value) {
            addCriterion("knowledge_sb_num <", value, "knowledgeSbNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeSbNumLessThanOrEqualTo(Integer value) {
            addCriterion("knowledge_sb_num <=", value, "knowledgeSbNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeSbNumIn(List<Integer> values) {
            addCriterion("knowledge_sb_num in", values, "knowledgeSbNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeSbNumNotIn(List<Integer> values) {
            addCriterion("knowledge_sb_num not in", values, "knowledgeSbNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeSbNumBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_sb_num between", value1, value2, "knowledgeSbNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeSbNumNotBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_sb_num not between", value1, value2, "knowledgeSbNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZzqNumIsNull() {
            addCriterion("knowledge_zzq_num is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZzqNumIsNotNull() {
            addCriterion("knowledge_zzq_num is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZzqNumEqualTo(Integer value) {
            addCriterion("knowledge_zzq_num =", value, "knowledgeZzqNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZzqNumNotEqualTo(Integer value) {
            addCriterion("knowledge_zzq_num <>", value, "knowledgeZzqNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZzqNumGreaterThan(Integer value) {
            addCriterion("knowledge_zzq_num >", value, "knowledgeZzqNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZzqNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("knowledge_zzq_num >=", value, "knowledgeZzqNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZzqNumLessThan(Integer value) {
            addCriterion("knowledge_zzq_num <", value, "knowledgeZzqNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZzqNumLessThanOrEqualTo(Integer value) {
            addCriterion("knowledge_zzq_num <=", value, "knowledgeZzqNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZzqNumIn(List<Integer> values) {
            addCriterion("knowledge_zzq_num in", values, "knowledgeZzqNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZzqNumNotIn(List<Integer> values) {
            addCriterion("knowledge_zzq_num not in", values, "knowledgeZzqNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZzqNumBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_zzq_num between", value1, value2, "knowledgeZzqNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeZzqNumNotBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_zzq_num not between", value1, value2, "knowledgeZzqNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIcpNumIsNull() {
            addCriterion("knowledge_icp_num is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIcpNumIsNotNull() {
            addCriterion("knowledge_icp_num is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIcpNumEqualTo(Integer value) {
            addCriterion("knowledge_icp_num =", value, "knowledgeIcpNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIcpNumNotEqualTo(Integer value) {
            addCriterion("knowledge_icp_num <>", value, "knowledgeIcpNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIcpNumGreaterThan(Integer value) {
            addCriterion("knowledge_icp_num >", value, "knowledgeIcpNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIcpNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("knowledge_icp_num >=", value, "knowledgeIcpNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIcpNumLessThan(Integer value) {
            addCriterion("knowledge_icp_num <", value, "knowledgeIcpNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIcpNumLessThanOrEqualTo(Integer value) {
            addCriterion("knowledge_icp_num <=", value, "knowledgeIcpNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIcpNumIn(List<Integer> values) {
            addCriterion("knowledge_icp_num in", values, "knowledgeIcpNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIcpNumNotIn(List<Integer> values) {
            addCriterion("knowledge_icp_num not in", values, "knowledgeIcpNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIcpNumBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_icp_num between", value1, value2, "knowledgeIcpNum");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIcpNumNotBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_icp_num not between", value1, value2, "knowledgeIcpNum");
            return (Criteria) this;
        }

        public Criteria andBdLongitudeIsNull() {
            addCriterion("bd_longitude is null");
            return (Criteria) this;
        }

        public Criteria andBdLongitudeIsNotNull() {
            addCriterion("bd_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andBdLongitudeEqualTo(Double value) {
            addCriterion("bd_longitude =", value, "bdLongitude");
            return (Criteria) this;
        }

        public Criteria andBdLongitudeNotEqualTo(Double value) {
            addCriterion("bd_longitude <>", value, "bdLongitude");
            return (Criteria) this;
        }

        public Criteria andBdLongitudeGreaterThan(Double value) {
            addCriterion("bd_longitude >", value, "bdLongitude");
            return (Criteria) this;
        }

        public Criteria andBdLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("bd_longitude >=", value, "bdLongitude");
            return (Criteria) this;
        }

        public Criteria andBdLongitudeLessThan(Double value) {
            addCriterion("bd_longitude <", value, "bdLongitude");
            return (Criteria) this;
        }

        public Criteria andBdLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("bd_longitude <=", value, "bdLongitude");
            return (Criteria) this;
        }

        public Criteria andBdLongitudeIn(List<Double> values) {
            addCriterion("bd_longitude in", values, "bdLongitude");
            return (Criteria) this;
        }

        public Criteria andBdLongitudeNotIn(List<Double> values) {
            addCriterion("bd_longitude not in", values, "bdLongitude");
            return (Criteria) this;
        }

        public Criteria andBdLongitudeBetween(Double value1, Double value2) {
            addCriterion("bd_longitude between", value1, value2, "bdLongitude");
            return (Criteria) this;
        }

        public Criteria andBdLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("bd_longitude not between", value1, value2, "bdLongitude");
            return (Criteria) this;
        }

        public Criteria andBdLatitudeIsNull() {
            addCriterion("bd_latitude is null");
            return (Criteria) this;
        }

        public Criteria andBdLatitudeIsNotNull() {
            addCriterion("bd_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andBdLatitudeEqualTo(Double value) {
            addCriterion("bd_latitude =", value, "bdLatitude");
            return (Criteria) this;
        }

        public Criteria andBdLatitudeNotEqualTo(Double value) {
            addCriterion("bd_latitude <>", value, "bdLatitude");
            return (Criteria) this;
        }

        public Criteria andBdLatitudeGreaterThan(Double value) {
            addCriterion("bd_latitude >", value, "bdLatitude");
            return (Criteria) this;
        }

        public Criteria andBdLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("bd_latitude >=", value, "bdLatitude");
            return (Criteria) this;
        }

        public Criteria andBdLatitudeLessThan(Double value) {
            addCriterion("bd_latitude <", value, "bdLatitude");
            return (Criteria) this;
        }

        public Criteria andBdLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("bd_latitude <=", value, "bdLatitude");
            return (Criteria) this;
        }

        public Criteria andBdLatitudeIn(List<Double> values) {
            addCriterion("bd_latitude in", values, "bdLatitude");
            return (Criteria) this;
        }

        public Criteria andBdLatitudeNotIn(List<Double> values) {
            addCriterion("bd_latitude not in", values, "bdLatitude");
            return (Criteria) this;
        }

        public Criteria andBdLatitudeBetween(Double value1, Double value2) {
            addCriterion("bd_latitude between", value1, value2, "bdLatitude");
            return (Criteria) this;
        }

        public Criteria andBdLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("bd_latitude not between", value1, value2, "bdLatitude");
            return (Criteria) this;
        }

        public Criteria andGdLongitudeIsNull() {
            addCriterion("gd_longitude is null");
            return (Criteria) this;
        }

        public Criteria andGdLongitudeIsNotNull() {
            addCriterion("gd_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andGdLongitudeEqualTo(Double value) {
            addCriterion("gd_longitude =", value, "gdLongitude");
            return (Criteria) this;
        }

        public Criteria andGdLongitudeNotEqualTo(Double value) {
            addCriterion("gd_longitude <>", value, "gdLongitude");
            return (Criteria) this;
        }

        public Criteria andGdLongitudeGreaterThan(Double value) {
            addCriterion("gd_longitude >", value, "gdLongitude");
            return (Criteria) this;
        }

        public Criteria andGdLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("gd_longitude >=", value, "gdLongitude");
            return (Criteria) this;
        }

        public Criteria andGdLongitudeLessThan(Double value) {
            addCriterion("gd_longitude <", value, "gdLongitude");
            return (Criteria) this;
        }

        public Criteria andGdLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("gd_longitude <=", value, "gdLongitude");
            return (Criteria) this;
        }

        public Criteria andGdLongitudeIn(List<Double> values) {
            addCriterion("gd_longitude in", values, "gdLongitude");
            return (Criteria) this;
        }

        public Criteria andGdLongitudeNotIn(List<Double> values) {
            addCriterion("gd_longitude not in", values, "gdLongitude");
            return (Criteria) this;
        }

        public Criteria andGdLongitudeBetween(Double value1, Double value2) {
            addCriterion("gd_longitude between", value1, value2, "gdLongitude");
            return (Criteria) this;
        }

        public Criteria andGdLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("gd_longitude not between", value1, value2, "gdLongitude");
            return (Criteria) this;
        }

        public Criteria andGdLatitudeIsNull() {
            addCriterion("gd_latitude is null");
            return (Criteria) this;
        }

        public Criteria andGdLatitudeIsNotNull() {
            addCriterion("gd_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andGdLatitudeEqualTo(Double value) {
            addCriterion("gd_latitude =", value, "gdLatitude");
            return (Criteria) this;
        }

        public Criteria andGdLatitudeNotEqualTo(Double value) {
            addCriterion("gd_latitude <>", value, "gdLatitude");
            return (Criteria) this;
        }

        public Criteria andGdLatitudeGreaterThan(Double value) {
            addCriterion("gd_latitude >", value, "gdLatitude");
            return (Criteria) this;
        }

        public Criteria andGdLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("gd_latitude >=", value, "gdLatitude");
            return (Criteria) this;
        }

        public Criteria andGdLatitudeLessThan(Double value) {
            addCriterion("gd_latitude <", value, "gdLatitude");
            return (Criteria) this;
        }

        public Criteria andGdLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("gd_latitude <=", value, "gdLatitude");
            return (Criteria) this;
        }

        public Criteria andGdLatitudeIn(List<Double> values) {
            addCriterion("gd_latitude in", values, "gdLatitude");
            return (Criteria) this;
        }

        public Criteria andGdLatitudeNotIn(List<Double> values) {
            addCriterion("gd_latitude not in", values, "gdLatitude");
            return (Criteria) this;
        }

        public Criteria andGdLatitudeBetween(Double value1, Double value2) {
            addCriterion("gd_latitude between", value1, value2, "gdLatitude");
            return (Criteria) this;
        }

        public Criteria andGdLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("gd_latitude not between", value1, value2, "gdLatitude");
            return (Criteria) this;
        }

        public Criteria andOpLatestIsNull() {
            addCriterion("op_latest is null");
            return (Criteria) this;
        }

        public Criteria andOpLatestIsNotNull() {
            addCriterion("op_latest is not null");
            return (Criteria) this;
        }

        public Criteria andOpLatestEqualTo(String value) {
            addCriterion("op_latest =", value, "opLatest");
            return (Criteria) this;
        }

        public Criteria andOpLatestNotEqualTo(String value) {
            addCriterion("op_latest <>", value, "opLatest");
            return (Criteria) this;
        }

        public Criteria andOpLatestGreaterThan(String value) {
            addCriterion("op_latest >", value, "opLatest");
            return (Criteria) this;
        }

        public Criteria andOpLatestGreaterThanOrEqualTo(String value) {
            addCriterion("op_latest >=", value, "opLatest");
            return (Criteria) this;
        }

        public Criteria andOpLatestLessThan(String value) {
            addCriterion("op_latest <", value, "opLatest");
            return (Criteria) this;
        }

        public Criteria andOpLatestLessThanOrEqualTo(String value) {
            addCriterion("op_latest <=", value, "opLatest");
            return (Criteria) this;
        }

        public Criteria andOpLatestLike(String value) {
            addCriterion("op_latest like", value, "opLatest");
            return (Criteria) this;
        }

        public Criteria andOpLatestNotLike(String value) {
            addCriterion("op_latest not like", value, "opLatest");
            return (Criteria) this;
        }

        public Criteria andOpLatestIn(List<String> values) {
            addCriterion("op_latest in", values, "opLatest");
            return (Criteria) this;
        }

        public Criteria andOpLatestNotIn(List<String> values) {
            addCriterion("op_latest not in", values, "opLatest");
            return (Criteria) this;
        }

        public Criteria andOpLatestBetween(String value1, String value2) {
            addCriterion("op_latest between", value1, value2, "opLatest");
            return (Criteria) this;
        }

        public Criteria andOpLatestNotBetween(String value1, String value2) {
            addCriterion("op_latest not between", value1, value2, "opLatest");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
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

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
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

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }
    }

    /**
     */
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