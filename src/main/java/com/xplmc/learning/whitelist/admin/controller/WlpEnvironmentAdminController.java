package com.xplmc.learning.whitelist.admin.controller;

import com.xplmc.learning.whitelist.param.repository.WlpEnvironmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.xplmc.learning.whitelist.common.constant.RequestMappingConstants.*;

/**
 * system environment admin controller
 *
 * @author luke
 */
@Controller
@RequestMapping(PATH_CONTROLLER_ADMIN + PATH_MODULE_PARAM + PATH_WLP_ENVIRONMENT)
@Slf4j
public class WlpEnvironmentAdminController {

    @Autowired
    private WlpEnvironmentRepository wlpEnvironmentRepository;

    @GetMapping("/index.html")
    public String index(Model model) {
        model.addAttribute("wlpEnvironmentList", wlpEnvironmentRepository.findAll());
        return "admin-environment";
    }

}
