package com.xplmc.learning.whitelist.platform.repository;

import com.xplmc.learning.whitelist.platform.entity.WlpEnvironment;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * whitelist environment table repository class
 *
 * @author luke
 */
@RepositoryRestResource(path = "wlp-environment")
public interface WlpEnvironmentRepository extends PagingAndSortingRepository<WlpEnvironment, Long> {
}
