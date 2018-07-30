package com.soul.example.wc.core;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
public abstract class VersionEntity<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    protected String createdBy;
    protected Date createdDate;
    protected String delFlag;
    protected String id;
    protected String remarks;
    protected String updatedBy;
    protected Date updatedDate;
    private int optCounter;

    public VersionEntity() {
        this.delFlag = "0";
        this.updatedDate = new Date();
    }

    @JsonIgnore
    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createBy) {
        this.createdBy = createBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createDate) {
        this.createdDate = createDate;
    }

    @Length(min = 1, max = 1)
    public String getDelFlag() {
        return this.delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Id
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Version
    public int getOptCounter() {
        return this.optCounter;
    }

    public void setOptCounter(int optCounter) {
        this.optCounter = optCounter;
    }

    @Length(min = 0, max = 255)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updateBy) {
        this.updatedBy = updateBy;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(Date updateDate) {
        this.updatedDate = updateDate;
    }

    @PrePersist
    public void prePersist() {
        if ((this.id == null) || (this.id.equals(""))) {
            this.id = UUID.randomUUID().toString().replaceAll("-", "");
        }
    }
}