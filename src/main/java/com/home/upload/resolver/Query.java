package com.home.upload.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver
{
    public boolean check()
    {
        return true;
    }
}
