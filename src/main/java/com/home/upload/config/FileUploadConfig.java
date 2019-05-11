package com.home.upload.config;

import graphql.schema.GraphQLScalarType;
import graphql.servlet.ApolloScalars;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileUploadConfig
{
    @Bean
    GraphQLScalarType upload()
    {
        return ApolloScalars.Upload;
    }
}
