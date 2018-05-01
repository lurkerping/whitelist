package com.xplmc.learning.whitelist.common.advice;

import org.aspectj.lang.annotation.Pointcut;

/**
 * common point cut config class
 * managing all the point cuts in one place
 *
 * @author luke
 */
public class CommonPointCutConfig {

    /**
     * point cut for @RequestMapping
     */
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void requestMappings() {
    }

    /**
     * point cut for @Controller, not including RestController
     */
    @Pointcut("@within(org.springframework.stereotype.Controller) && requestMappings()")
    public void controllers() {
    }

    /**
     * point cut for @RestController
     */
    @Pointcut("@within(org.springframework.web.bind.annotation.RestController) && requestMappings()")
    public void restControllers() {
    }

    /**
     * point cut for all controllers, including RestController
     */
    @Pointcut("controllers() || restControllers()")
    public void allControllers() {
    }

}
