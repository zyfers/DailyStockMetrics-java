package com.bfm.app.config;

import com.bfm.app.model.Stock;
import org.apache.ignite.Ignite;
import org.apache.ignite.Ignition;
import org.apache.ignite.cache.CacheMode;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.springdata.repository.config.EnableIgniteRepositories;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableIgniteRepositories
public class IgniteAppConfig {
    @Bean
    public Ignite igniteInstance() {
        IgniteConfiguration cfg = new IgniteConfiguration();
        cfg.setIgniteInstanceName("springDataNode");
        cfg.setPeerClassLoadingEnabled(true);
        CacheConfiguration ccfg = new CacheConfiguration("StockCache");
        ccfg.setCacheMode(CacheMode.PARTITIONED);
        ccfg.setIndexedTypes(Long.class, Stock.class);
        cfg.setCacheConfiguration(new CacheConfiguration[]{ccfg});
        return Ignition.start(cfg);
    }
}
