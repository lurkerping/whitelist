package com.xplmc.learning.whitelist.param.service.impl;

import com.xplmc.learning.whitelist.param.entity.WlpMenu;
import com.xplmc.learning.whitelist.param.repository.WlpMenuRepository;
import com.xplmc.learning.whitelist.param.service.IWlpMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author luke
 * @date 2018/4/8
 */
@Service
public class WlpMenuService implements IWlpMenuService {

    @Autowired
    private WlpMenuRepository wlpMenuRepository;

    @Override
    public List<WlpMenu> findAllFirstLevelMenu() {
        return wlpMenuRepository.findByMenuPid(WlpMenu.FIRST_LEVEL_MENU_PID);
    }

}
