package com.xplmc.learning.whitelist.common.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * common entity attributes
 *
 * @author luke
 * @date 2018/3/4
 */
@Data
@MappedSuperclass
@EntityListeners(value = AuditingEntityListener.class)
public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1140552189385989469L;

    /**
     * create by who
     */
    @CreatedBy
    protected String createBy;

    /**
     * create time
     */
    @CreatedDate
    protected Long createDate;

    /**
     * update by who
     */
    @LastModifiedBy
    protected String lastModifiedBy;

    /**
     * update time
     */
    @LastModifiedDate
    protected Long lastModifiedDate;

}
