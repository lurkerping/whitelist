package com.xplmc.learning.whitelist.platform.repository;

        import com.xplmc.learning.whitelist.platform.entity.WlpConfig;
        import org.springframework.data.repository.PagingAndSortingRepository;
        import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * system config table repository class
 *
 * @author luke
 */
@RepositoryRestResource(path = "wlp-config")
public interface WlpConfigRepository extends PagingAndSortingRepository<WlpConfig, Long> {
}
