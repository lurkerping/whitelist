package com.xplmc.learning.whitelist.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * system config admin controller
 *
 * @author luke
 */
@Controller
@RequestMapping("/admin/platform/wlp-config")
public class WlpCopnfigAdminController {

    @RequestMapping("/index")
    public String index() {
        return "admin-table";
    }

}
