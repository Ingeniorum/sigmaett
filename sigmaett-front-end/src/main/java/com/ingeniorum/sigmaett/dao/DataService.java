package com.ingeniorum.sigmaett.dao;

import org.springframework.stereotype.Service;

@Service
public interface DataService
{
    String getName();

    void setName(String name);
}
