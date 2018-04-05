package com.xplmc.learning.whitelist.param.entity;

import com.xplmc.learning.whitelist.common.entity.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * whitelist environment table
 *
 * @author luke
 */
@Entity
@NoArgsConstructor
@Data
@RequiredArgsConstructor(staticName = "of")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class WlpEnvironment extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1154286229272794616L;

    /**
     * primary key, auto generated
     */
    @Id
    @GeneratedValue
    private Long envId;

    /**
     * environment code, such as: dev/sit/uat
     */
    @NonNull
    private String envCode;

    /**
     * environment desc
     */
    @NonNull
    private String envDesc;

    /**
     * environment comment
     */
    private String envComment;

}
