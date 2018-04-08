package com.xplmc.learning.whitelist.param.repository;

import com.xplmc.learning.whitelist.WhitelistApplication;
import com.xplmc.learning.whitelist.param.entity.WlpMenu;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * test class for WlpMenuRepository
 *
 * @author luke
 */
@ActiveProfiles(profiles = "ut")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WhitelistApplication.class)
@Slf4j
public class WlpMenuRepositoryTest {

    @Autowired
    private WlpMenuRepository wlpMenuRepository;


    @Test
    public void testSave() {
        WlpMenu wlpMenu = WlpMenu.of(WlpMenu.FIRST_LEVEL_MENU_PID, "count");
        wlpMenu = wlpMenuRepository.save(wlpMenu);
        Assert.assertNotNull(wlpMenu);
        Assert.assertTrue(wlpMenu.getMenuId() > 0);
    }

    @Test
    public void testQuery() {
        String code = "count";
        WlpMenu wlpMenu = WlpMenu.of(WlpMenu.FIRST_LEVEL_MENU_PID, code);
        wlpMenu = wlpMenuRepository.save(wlpMenu);

        Optional<WlpMenu> optionalWlpMenu = wlpMenuRepository.findById(wlpMenu.getMenuId());
        Assert.assertTrue(optionalWlpMenu.isPresent());
        Assert.assertEquals(code, optionalWlpMenu.get().getMenuName());
    }

}
