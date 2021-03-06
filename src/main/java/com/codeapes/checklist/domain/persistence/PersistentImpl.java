package com.codeapes.checklist.domain.persistence;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@MappedSuperclass
public class PersistentImpl implements Persistent {

    private static final long serialVersionUID = -8307158062541223940L;

    private Long objectKey;
    private Timestamp modifiedTimestamp;
    private String modifiedBy;
    private Timestamp createdTimestamp;
    private String createdBy;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "object_key", updatable = false, nullable = false)
    public Long getObjectKey() {
        return objectKey;
    }

    @Version
    @Column(name = "modified_ts", nullable = false)
    public Timestamp getModifiedTimestamp() {
        return modifiedTimestamp;
    }

    @Column(name = "modified_by", length = 50, nullable = false)
    public String getModifiedBy() {
        return modifiedBy;
    }

    @Column(name = "created_ts", nullable = false)
    public Timestamp getCreatedTimestamp() {
        return createdTimestamp;
    }

    @Column(name = "created_by", length = 50, nullable = false)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setObjectKey(Long objectKey) {
        this.objectKey = objectKey;
    }

    public void setModifiedTimestamp(Timestamp modifiedTimestamp) {
        this.modifiedTimestamp = modifiedTimestamp;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public void setCreatedTimestamp(Timestamp createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

}
