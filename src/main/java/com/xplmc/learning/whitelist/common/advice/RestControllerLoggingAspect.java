package com.xplmc.learning.whitelist.common.advice;

import com.xplmc.learning.whitelist.common.constant.LogConstants;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

/**
 * common request logging aspect for controller
 *
 * @author luke
 */
@Aspect
@Component
public class RestControllerLoggingAspect {

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(LogConstants.LOGGER_REQUEST_RESPONSE_INFO);

    /**
     * logging request url, queryString, requestBody, etc.
     */
    @Around("com.xplmc.learning.whitelist.common.advice.CommonPointCutConfig.restControllers()")
    public Object loggingRequestResponse(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        // log request body
        logger.info("request body: {}", joinPoint.getArgs());

        boolean success = true;
        try {
            Object result = joinPoint.proceed();

            // log response body
            logger.info("response body: {}", result);
            return result;
        } catch (Throwable t) {
            success = false;

            // log error simple message
            logger.error("response error: {}", t.getMessage());
            throw t;
        } finally {
            // log time cost
            logger.info("signature:{}, success: {}, cost: {}", joinPoint.getSignature().toShortString(),
                    success, System.currentTimeMillis() - start);
        }
    }

}
