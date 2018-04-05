package com.xplmc.learning.whitelist.param.repository;

import com.xplmc.learning.whitelist.common.constant.RequestMappingConstants;
import com.xplmc.learning.whitelist.param.entity.WlpConfig;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * system config table repository class
 *
 * @author luke
 */
@RepositoryRestResource(path = RequestMappingConstants.PATH_WLP_CONFIG)
public interface WlpConfigRepository extends PagingAndSortingRepository<WlpConfig, Long> {
}
