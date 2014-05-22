package com.ingeniorum.sigmaett.dao.internal;

import org.springframework.stereotype.Service;

import com.ingeniorum.sigmaett.dao.DataService;

@Service
public class DataServiceImpl implements DataService
{
    private String name = "UNDEFINED";

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }
}
