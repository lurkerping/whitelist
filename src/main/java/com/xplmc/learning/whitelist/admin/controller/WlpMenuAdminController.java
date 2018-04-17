package com.xplmc.learning.whitelist.admin.controller;

import com.xplmc.learning.whitelist.param.entity.WlpMenu;
import com.xplmc.learning.whitelist.param.repository.WlpMenuRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

import static com.xplmc.learning.whitelist.common.constant.RequestMappingConstants.*;

/**
 * system menu admin controller
 *
 * @author luke
 */
@Controller
@RequestMapping(PATH_CONTROLLER_ADMIN + PATH_MODULE_PARAM + PATH_WLP_MENU)
@Slf4j
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

    @GetMapping("/update.html/{menuId}")
    public String update(Model model, @PathVariable("menuId") Long menuId) {
        log.info("update menu, menuId: {}", menuId);
        model.addAttribute("wlpMenuList", wlpMenuRepository.findByMenuPid(WlpMenu.FIRST_LEVEL_MENU_PID));
        Optional<WlpMenu> wlpMenuOptional = wlpMenuRepository.findById(menuId);

        //if wlpMenu is not present, using default
        if (wlpMenuOptional.isPresent()) {
            model.addAttribute("wlpMenu", wlpMenuOptional.get());
        } else {
            model.addAttribute("wlpMenu", WlpMenu.of(WlpMenu.FIRST_LEVEL_MENU_PID, "菜单"));
        }
        return "admin-menu-update";
    }

}
