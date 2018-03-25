package com.xplmc.learning.whitelist.platform.repository;

import com.xplmc.learning.whitelist.WhitelistApplication;
import com.xplmc.learning.whitelist.platform.entity.WlpConfig;
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
 * test class for WlpConfigRepository
 *
 * @author luke
 */
@ActiveProfiles(profiles = "ut")
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WhitelistApplication.class)
@Slf4j
public class WlpConfigRepositoryTest {

    @Autowired
    private WlpConfigRepository wlpConfigRepository;


    @Test
    public void testSave() {
        WlpConfig wlpConfig = WlpConfig.of("single", "count");
        wlpConfig = wlpConfigRepository.save(wlpConfig);
        Assert.assertNotNull(wlpConfig);
        Assert.assertTrue(wlpConfig.getConfigId() > 0);
    }

    @Test
    public void testQuery() {
        String code = "count";
        WlpConfig wlpConfig = WlpConfig.of("single", code);
        wlpConfig = wlpConfigRepository.save(wlpConfig);

        Optional<WlpConfig> optionalWlpConfig = wlpConfigRepository.findById(wlpConfig.getConfigId());
        Assert.assertTrue(optionalWlpConfig.isPresent());
        Assert.assertEquals(code, optionalWlpConfig.get().getConfigCode());

    }

    @Test
    public void testEnableJpaAuditing() {
        WlpConfig wlpConfig = WlpConfig.of("single", "count");
        wlpConfig = wlpConfigRepository.save(wlpConfig);
        log.info("save1: {}", wlpConfig);
        Assert.assertNotNull(wlpConfig.getCreateDate());

        String code = "count2";
        wlpConfig.setConfigCode(code);
        wlpConfig = wlpConfigRepository.save(wlpConfig);
        log.info("save2: {}", wlpConfig);
        Assert.assertNotNull(wlpConfig.getLastModifiedDate());
        Assert.assertEquals(code, wlpConfig.getConfigCode());
    }

}
