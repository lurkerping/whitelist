package com.xplmc.learning.whitelist.param.service.impl;

import com.xplmc.learning.whitelist.param.dto.WlpMenuDto;
import com.xplmc.learning.whitelist.param.entity.WlpMenu;
import com.xplmc.learning.whitelist.param.repository.WlpMenuRepository;
import com.xplmc.learning.whitelist.param.service.WlpMenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luke
 * @date 2018/4/8
 */
@Service
public class WlpMenuServiceImpl implements WlpMenuService {

    private WlpMenuRepository wlpMenuRepository;

    @Autowired
    public WlpMenuServiceImpl(WlpMenuRepository wlpMenuRepository) {
        this.wlpMenuRepository = wlpMenuRepository;
    }

    @Override
    public List<WlpMenuDto> findSidebarMenu() {
        //find all first level menus
        List<WlpMenu> firstLevelMenuList = wlpMenuRepository.findByMenuPid(WlpMenu.FIRST_LEVEL_MENU_PID);

        //convert wlpMenu to wlpMenuDto
        List<WlpMenuDto> firstLevelMenuDtoList = new ArrayList<>();
        firstLevelMenuList.forEach(wlpMenu -> {
            WlpMenuDto wlpMenuDto = new WlpMenuDto();
            BeanUtils.copyProperties(wlpMenu, wlpMenuDto);

            //find menu's subMenu
            List<WlpMenu> subMenuList = wlpMenuRepository.findByMenuPid(wlpMenu.getMenuId());

            //convert subMenu to subMenuDto
            List<WlpMenuDto> subMenuDtoList = new ArrayList<>();
            subMenuList.forEach(subMenu -> {
                WlpMenuDto subMenuDto = new WlpMenuDto();
                BeanUtils.copyProperties(subMenu, subMenuDto);
                subMenuDtoList.add(subMenuDto);
            });

            wlpMenuDto.setSubMenuDtoList(subMenuDtoList);
            wlpMenuDto.setDropDown(subMenuDtoList.size() > 0);
            firstLevelMenuDtoList.add(wlpMenuDto);
        });
        return firstLevelMenuDtoList;
    }

}
