package com.xplmc.learning.whitelist.param.entity;

import com.xplmc.learning.whitelist.common.entity.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * system menu table
 *
 * @author luke
 */
@Entity
@NoArgsConstructor
@Data
@RequiredArgsConstructor(staticName = "of")
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class WlpMenu extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 550203084989291526L;

    /**
     * first level menu's parent menu id
     */
    public static final Long FIRST_LEVEL_MENU_PID = -1L;

    /**
     * primary key, auto generated
     */
    @Id
    @GeneratedValue
    private Long menuId;

    /**
     * menu parent id
     * -1 means first level menu
     * default -1
     */
    @NonNull
    private Long menuPid;

    /**
     * menu name
     */
    @NonNull
    private String menuName;

    /**
     * menu description
     */
    private String menuDesc;

    /**
     * menu icon's class
     */
    private String menuIconClass;

    /**
     * menu
     */
    private String menuUrl;

    /**
     * create or update comment
     */
    private String menuComment;

    /**
     * menu priority, smaller goes front
     */
    private Long menuPriority = 100L;

}
