package com.cysiv.caching.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CacheDataService {

    @Cacheable(value = "dataCache", key = "#id")
    public String getCacheData(String id) {

        // simulate fetching data from a data source
        return "found data for: " + id;
    }
}
