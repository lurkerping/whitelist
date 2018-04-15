package com.xplmc.learning.whitelist.param.dto;

import com.xplmc.learning.whitelist.param.entity.WlpMenu;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * wlp menu dto
 *
 * @author luke
 */
@Getter
@Setter
@ToString(callSuper = true)
public class WlpMenuDto extends WlpMenu {

    /**
     * is selected menu
     */
    private boolean selected = false;

    /**
     * is drop down menu
     */
    private boolean dropDown = false;

    /**
     * sub menu list
     */
    private List<WlpMenuDto> subMenuDtoList;

}
