package com.xplmc.learning.whitelist.admin.advice;

import com.xplmc.learning.whitelist.param.dto.WlpMenuDto;
import com.xplmc.learning.whitelist.param.service.WlpMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

/**
 * some common work for Admin Controller
 *
 * @author luke
 */
@ControllerAdvice("com.xplmc.learning.whitelist.admin.controller")
public class AdminCommonAdvice {

    private WlpMenuService wlpMenuService;

    @Autowired
    public AdminCommonAdvice(WlpMenuService wlpMenuService) {
        this.wlpMenuService = wlpMenuService;
    }

    /**
     * common sidebar menu
     *
     * @return
     */
    @ModelAttribute("sidebarMenuList")
    public List<WlpMenuDto> sidebarMenuList() {
        return wlpMenuService.findSidebarMenu();
    }

}
