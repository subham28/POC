package com.home.upload.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.Part;

@Component
public class Mutation implements GraphQLMutationResolver
{
    Logger logger = LoggerFactory.getLogger(Mutation.class);

    public boolean singleUpload(Part part)
    {
        logger.info("File Name: {}",part.getSubmittedFileName());
        return true;
    }
}
