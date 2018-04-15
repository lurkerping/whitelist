package com.xplmc.learning.whitelist.param.service;

import com.xplmc.learning.whitelist.param.dto.WlpMenuDto;

import java.util.List;

/**
 * @author luke
 * @date 2018/4/8
 */
public interface WlpMenuService {

    /**
     * get sidebar menu
     *
     * @return
     */
    List<WlpMenuDto> findSidebarMenu();

}
