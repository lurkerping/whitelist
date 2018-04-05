package com.xplmc.learning.whitelist.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.xplmc.learning.whitelist.common.constant.RequestMappingConstants.*;

/**
 * system config admin controller
 *
 * @author luke
 */
@Controller
@RequestMapping(PATH_CONTROLLER_ADMIN + PATH_MODULE_PARAM + PATH_WLP_CONFIG)
public class WlpConfigAdminController {

    @RequestMapping("/index.html")
    public String index() {
        return "admin-table";
    }

}
