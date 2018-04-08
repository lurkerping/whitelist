package com.xplmc.learning.whitelist.param.service.impl;

import com.xplmc.learning.whitelist.WhitelistApplication;
import com.xplmc.learning.whitelist.param.entity.WlpMenu;
import com.xplmc.learning.whitelist.param.repository.WlpMenuRepository;
import com.xplmc.learning.whitelist.param.service.IWlpMenuService;
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
    private IWlpMenuService wlpMenuService;

    @Autowired
    private WlpMenuRepository wlpMenuRepository;

    @Test
    public void testFindAllFirstLevelMenu() {
        String code = "count";
        WlpMenu wlpMenu = WlpMenu.of(WlpMenu.FIRST_LEVEL_MENU_PID, code);
        wlpMenuRepository.save(wlpMenu);

        List<WlpMenu> wlpMenuList = wlpMenuService.findAllFirstLevelMenu();
        Assert.assertTrue(wlpMenuList.size() > 0);
    }

}
