package com.tanghuachun.demo.entity;

import java.io.Serializable;

/**
 * company
 * @author 
 */
public class Company implements Serializable {
    /**
     * 自增，与业务无关
     */
    private Integer acid;

    /**
     * 统一信用代码作为主键
     */
    private String id;

    /**
     * 公司名称
     */
    private String name;

    /**
     * 公司logo url
     */
    private String logo;

    /**
     * 公司描述
     */
    private String description;

    /**
     * 公司联系电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 公司网站
     */
    private String website;

    /**
     * 行业
     */
    private String industry;

    /**
     * 公司地址
     */
    private String address;

    /**
     * 分类
     */
    private String type;

    /**
     * 公司状态 逗号分隔
     */
    private String status;

    /**
     * 知识产权-专利数
     */
    private Integer knowledgeZlNum;

    /**
     * 知识产权-商标数
     */
    private Integer knowledgeSbNum;

    /**
     * 知识产权-著作权数
     */
    private Integer knowledgeZzqNum;

    /**
     * 知识产权-icp数量
     */
    private Integer knowledgeIcpNum;

    /**
     * 百度经度
     */
    private Double bdLongitude;

    /**
     * 百度纬度
     */
    private Double bdLatitude;

    /**
     * 高德经度
     */
    private Double gdLongitude;

    /**
     * 高德纬度
     */
    private Double gdLatitude;

    /**
     * 最后一次操作标记,只可以从这些中取值：bd_insert / bd_update / qx_sync
     */
    private String opLatest;

    /**
     * 备注
     */
    private String remark;

    /**
     * 添加人
     */
    private String createUser;

    /**
     * 添加时间
     */
    private Long createTime;

    /**
     * 更新人
     */
    private String updateUser;

    /**
     * 添加时间
     */
    private Long updateTime;

    /**
     * 删除标志0	未删除1已删除
     */
    private Boolean isDeleted;

    private static final long serialVersionUID = 1L;

    public Integer getAcid() {
        return acid;
    }

    public void setAcid(Integer acid) {
        this.acid = acid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getKnowledgeZlNum() {
        return knowledgeZlNum;
    }

    public void setKnowledgeZlNum(Integer knowledgeZlNum) {
        this.knowledgeZlNum = knowledgeZlNum;
    }

    public Integer getKnowledgeSbNum() {
        return knowledgeSbNum;
    }

    public void setKnowledgeSbNum(Integer knowledgeSbNum) {
        this.knowledgeSbNum = knowledgeSbNum;
    }

    public Integer getKnowledgeZzqNum() {
        return knowledgeZzqNum;
    }

    public void setKnowledgeZzqNum(Integer knowledgeZzqNum) {
        this.knowledgeZzqNum = knowledgeZzqNum;
    }

    public Integer getKnowledgeIcpNum() {
        return knowledgeIcpNum;
    }

    public void setKnowledgeIcpNum(Integer knowledgeIcpNum) {
        this.knowledgeIcpNum = knowledgeIcpNum;
    }

    public Double getBdLongitude() {
        return bdLongitude;
    }

    public void setBdLongitude(Double bdLongitude) {
        this.bdLongitude = bdLongitude;
    }

    public Double getBdLatitude() {
        return bdLatitude;
    }

    public void setBdLatitude(Double bdLatitude) {
        this.bdLatitude = bdLatitude;
    }

    public Double getGdLongitude() {
        return gdLongitude;
    }

    public void setGdLongitude(Double gdLongitude) {
        this.gdLongitude = gdLongitude;
    }

    public Double getGdLatitude() {
        return gdLatitude;
    }

    public void setGdLatitude(Double gdLatitude) {
        this.gdLatitude = gdLatitude;
    }

    public String getOpLatest() {
        return opLatest;
    }

    public void setOpLatest(String opLatest) {
        this.opLatest = opLatest;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Company other = (Company) that;
        return (this.getAcid() == null ? other.getAcid() == null : this.getAcid().equals(other.getAcid()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getMail() == null ? other.getMail() == null : this.getMail().equals(other.getMail()))
            && (this.getWebsite() == null ? other.getWebsite() == null : this.getWebsite().equals(other.getWebsite()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getKnowledgeZlNum() == null ? other.getKnowledgeZlNum() == null : this.getKnowledgeZlNum().equals(other.getKnowledgeZlNum()))
            && (this.getKnowledgeSbNum() == null ? other.getKnowledgeSbNum() == null : this.getKnowledgeSbNum().equals(other.getKnowledgeSbNum()))
            && (this.getKnowledgeZzqNum() == null ? other.getKnowledgeZzqNum() == null : this.getKnowledgeZzqNum().equals(other.getKnowledgeZzqNum()))
            && (this.getKnowledgeIcpNum() == null ? other.getKnowledgeIcpNum() == null : this.getKnowledgeIcpNum().equals(other.getKnowledgeIcpNum()))
            && (this.getBdLongitude() == null ? other.getBdLongitude() == null : this.getBdLongitude().equals(other.getBdLongitude()))
            && (this.getBdLatitude() == null ? other.getBdLatitude() == null : this.getBdLatitude().equals(other.getBdLatitude()))
            && (this.getGdLongitude() == null ? other.getGdLongitude() == null : this.getGdLongitude().equals(other.getGdLongitude()))
            && (this.getGdLatitude() == null ? other.getGdLatitude() == null : this.getGdLatitude().equals(other.getGdLatitude()))
            && (this.getOpLatest() == null ? other.getOpLatest() == null : this.getOpLatest().equals(other.getOpLatest()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateUser() == null ? other.getCreateUser() == null : this.getCreateUser().equals(other.getCreateUser()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateUser() == null ? other.getUpdateUser() == null : this.getUpdateUser().equals(other.getUpdateUser()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getIsDeleted() == null ? other.getIsDeleted() == null : this.getIsDeleted().equals(other.getIsDeleted()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAcid() == null) ? 0 : getAcid().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
        result = prime * result + ((getWebsite() == null) ? 0 : getWebsite().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getKnowledgeZlNum() == null) ? 0 : getKnowledgeZlNum().hashCode());
        result = prime * result + ((getKnowledgeSbNum() == null) ? 0 : getKnowledgeSbNum().hashCode());
        result = prime * result + ((getKnowledgeZzqNum() == null) ? 0 : getKnowledgeZzqNum().hashCode());
        result = prime * result + ((getKnowledgeIcpNum() == null) ? 0 : getKnowledgeIcpNum().hashCode());
        result = prime * result + ((getBdLongitude() == null) ? 0 : getBdLongitude().hashCode());
        result = prime * result + ((getBdLatitude() == null) ? 0 : getBdLatitude().hashCode());
        result = prime * result + ((getGdLongitude() == null) ? 0 : getGdLongitude().hashCode());
        result = prime * result + ((getGdLatitude() == null) ? 0 : getGdLatitude().hashCode());
        result = prime * result + ((getOpLatest() == null) ? 0 : getOpLatest().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateUser() == null) ? 0 : getCreateUser().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateUser() == null) ? 0 : getUpdateUser().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getIsDeleted() == null) ? 0 : getIsDeleted().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", acid=").append(acid);
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", logo=").append(logo);
        sb.append(", description=").append(description);
        sb.append(", phone=").append(phone);
        sb.append(", mail=").append(mail);
        sb.append(", website=").append(website);
        sb.append(", industry=").append(industry);
        sb.append(", address=").append(address);
        sb.append(", type=").append(type);
        sb.append(", status=").append(status);
        sb.append(", knowledgeZlNum=").append(knowledgeZlNum);
        sb.append(", knowledgeSbNum=").append(knowledgeSbNum);
        sb.append(", knowledgeZzqNum=").append(knowledgeZzqNum);
        sb.append(", knowledgeIcpNum=").append(knowledgeIcpNum);
        sb.append(", bdLongitude=").append(bdLongitude);
        sb.append(", bdLatitude=").append(bdLatitude);
        sb.append(", gdLongitude=").append(gdLongitude);
        sb.append(", gdLatitude=").append(gdLatitude);
        sb.append(", opLatest=").append(opLatest);
        sb.append(", remark=").append(remark);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}