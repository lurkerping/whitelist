package com.xplmc.learning.whitelist.param.service.impl;

import com.xplmc.learning.whitelist.WhitelistApplication;
import com.xplmc.learning.whitelist.param.dto.WlpMenuDto;
import com.xplmc.learning.whitelist.param.entity.WlpMenu;
import com.xplmc.learning.whitelist.param.repository.WlpMenuRepository;
import com.xplmc.learning.whitelist.param.service.WlpMenuService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * unit test for WlpMenuService
 *
 * @author luke
 */
@ActiveProfiles(profiles = "ut")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WhitelistApplication.class)
@Slf4j
public class WlpMenuServiceTest {

    @Autowired
    private WlpMenuService wlpMenuService;

    @Autowired
    private WlpMenuRepository wlpMenuRepository;

    @Test
    public void testFindAllFirstLevelMenu() {
        String code = "count";
        WlpMenu wlpMenu = WlpMenu.of(WlpMenu.FIRST_LEVEL_MENU_PID, code);
        wlpMenuRepository.save(wlpMenu);

        List<WlpMenu> wlpMenuList = wlpMenuRepository.findByMenuPidOrderByMenuPriorityAsc(WlpMenu.FIRST_LEVEL_MENU_PID);
        Assert.assertTrue(wlpMenuList.size() > 0);
    }

    @Test
    public void testFindSidebarMenu() {
        String code = "count";
        WlpMenu wlpMenu = WlpMenu.of(WlpMenu.FIRST_LEVEL_MENU_PID, code);
        wlpMenuRepository.save(wlpMenu);

        WlpMenu wlpMenu2 = WlpMenu.of(wlpMenu.getMenuId(), "yes");
        wlpMenuRepository.save(wlpMenu2);

        List<WlpMenuDto> wlpMenuDtoList = wlpMenuService.findSidebarMenu();
        Assert.assertTrue(wlpMenuDtoList.size() > 0);
    }

}
