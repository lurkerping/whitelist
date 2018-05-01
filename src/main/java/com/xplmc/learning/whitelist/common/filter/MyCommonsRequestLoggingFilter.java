package com.xplmc.learning.whitelist.common.filter;

import com.xplmc.learning.whitelist.common.constant.LogConstants;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

import javax.servlet.http.HttpServletRequest;

/**
 * use CommonsRequestLoggingFilter for http url and query string
 *
 * @author luke
 */
@Component
public class MyCommonsRequestLoggingFilter extends CommonsRequestLoggingFilter {

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(LogConstants.LOGGER_REQUEST_RESPONSE_INFO);

    public MyCommonsRequestLoggingFilter() {
        setIncludeQueryString(true);
        setIncludePayload(false);
        setBeforeMessagePrefix(LogConstants.EMPTY_STRING);
        setBeforeMessageSuffix(LogConstants.EMPTY_STRING);
    }

    @Override
    protected boolean shouldLog(HttpServletRequest request) {
        return logger.isInfoEnabled();
    }

    @Override
    protected void beforeRequest(HttpServletRequest request, String message) {
        logger.info(message);
    }

    @Override
    protected void afterRequest(HttpServletRequest request, String message) {
        // do nothing
    }

}
