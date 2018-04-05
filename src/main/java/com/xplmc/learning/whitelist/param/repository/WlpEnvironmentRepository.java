package com.xplmc.learning.whitelist.param.repository;

import com.xplmc.learning.whitelist.common.constant.RequestMappingConstants;
import com.xplmc.learning.whitelist.param.entity.WlpEnvironment;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * whitelist environment table repository class
 *
 * @author luke
 */
@RepositoryRestResource(path = RequestMappingConstants.PATH_WLP_ENVIRONMENT)
public interface WlpEnvironmentRepository extends PagingAndSortingRepository<WlpEnvironment, Long> {
}
