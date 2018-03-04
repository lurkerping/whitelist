package com.xplmc.learning.whitelist.platform.repository;

import com.xplmc.learning.whitelist.platform.entity.WlpConfig;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * system config table repository class
 *
 * @author luke
 * @date 2018/3/4
 */
public interface WlpConfigRepository extends PagingAndSortingRepository<WlpConfig, Long> {
}
