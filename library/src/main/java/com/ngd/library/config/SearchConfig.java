package com.ngd.library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ngd.library.search.SearchService;
import com.ngd.library.search.impl.Search;

@Configuration
public class SearchConfig {
    
    @Bean
    public SearchService searchService() {
        return new Search();
    }

    // not sure if correctly setup...figure out later :P
    
}
