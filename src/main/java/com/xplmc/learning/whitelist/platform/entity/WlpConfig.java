package com.xplmc.learning.whitelist.platform.entity;

import com.xplmc.learning.whitelist.common.entity.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * system config table
 *
 * @author luke
 * @date 2018/3/4
 */
@Entity
@NoArgsConstructor
@Data
@RequiredArgsConstructor(staticName = "of")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class WlpConfig extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1154286229272794616L;

    /**
     * primary key, auto generated
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * config type, single line or multi-line
     */
    @NonNull
    private String type;

    /**
     * config code
     */
    @NonNull
    private String configCode;

    /**
     * config name
     */
    private String configName;

    /**
     * create or update comment
     */
    private String comment;

}
