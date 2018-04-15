package com.xplmc.learning.whitelist.admin.controller;

import com.xplmc.learning.whitelist.param.entity.WlpMenu;
import com.xplmc.learning.whitelist.param.repository.WlpMenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

    @Autowired
    private WlpMenuRepository wlpMenuRepository;

    @GetMapping("/index.html")
    public String index(Model model) {
        model.addAttribute("wlpMenuList", wlpMenuRepository.findAll());
        return "admin-menu";
    }

    @GetMapping("/add.html")
    public String add(Model model) {
        model.addAttribute("wlpMenuList", wlpMenuRepository.findByMenuPid(WlpMenu.FIRST_LEVEL_MENU_PID));
        return "admin-menu-add";
    }

}
