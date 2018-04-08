package com.xplmc.learning.whitelist.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.xplmc.learning.whitelist.common.constant.RequestMappingConstants.*;

/**
 * system menu admin controller
 *
 * @author luke
 */
@Controller
@RequestMapping(PATH_CONTROLLER_ADMIN + PATH_MODULE_PARAM + PATH_WLP_MENU)
public class WlpMenuAdminController {

    @GetMapping("/index.html")
    public String index() {
        return "admin-table";
    }

}
