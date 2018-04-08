package com.xplmc.learning.whitelist.param.repository;

import com.xplmc.learning.whitelist.common.constant.RequestMappingConstants;
import com.xplmc.learning.whitelist.param.entity.WlpMenu;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * system menu table repository class
 *
 * @author luke
 */
@RepositoryRestResource(path = RequestMappingConstants.PATH_WLP_MENU)
public interface WlpMenuRepository extends PagingAndSortingRepository<WlpMenu, Long> {
}
