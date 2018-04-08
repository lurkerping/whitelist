package com.xplmc.learning.whitelist.param.service;

import com.xplmc.learning.whitelist.param.entity.WlpMenu;

import java.util.List;

/**
 * @author luke
 * @date 2018/4/8
 */
public interface IWlpMenuService {

    /**
     * find all first level menus
     *
     * @return
     */
    List<WlpMenu> findAllFirstLevelMenu();


}
