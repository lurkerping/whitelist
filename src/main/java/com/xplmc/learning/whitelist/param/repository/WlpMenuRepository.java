package com.xplmc.learning.whitelist.param.repository;

import com.xplmc.learning.whitelist.common.constant.RequestMappingConstants;
import com.xplmc.learning.whitelist.param.entity.WlpMenu;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * system menu table repository class
 *
 * @author luke
 */
@RepositoryRestResource(path = RequestMappingConstants.PATH_WLP_MENU)
public interface WlpMenuRepository extends PagingAndSortingRepository<WlpMenu, Long> {

    /**
     * find by menu pid
     *
     * @param menuPid
     * @return
     */
    List<WlpMenu> findByMenuPid(Long menuPid);

}
