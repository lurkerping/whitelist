package com.xplmc.learning.whitelist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@ActiveProfiles(profiles = "ut")
@RunWith(SpringRunner.class)
@SpringBootTest
public class WhitelistApplicationTests {

    @Test
    public void contextLoads() {
    }

}
