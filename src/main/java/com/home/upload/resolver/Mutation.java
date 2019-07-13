package com.home.upload.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.home.upload.exception.CustomException;
import com.home.upload.exception.GrapQLException;
import com.home.upload.service.ExceptionService;
import graphql.GraphQLError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.Part;

@Component("com.home.upload.resolver.Mutation")
public class Mutation implements GraphQLMutationResolver
{
    Logger logger = LoggerFactory.getLogger(Mutation.class);

    @Autowired
    ExceptionService exceptionService;

    public boolean singleUpload(Part part) throws CustomException {
        logger.info("File Name: {}",part.getSubmittedFileName());
        exceptionService.throwException(part);
        return true;
    }

    @ExceptionHandler(CustomException.class)
    public GraphQLError exception(CustomException custom) {
        return new GrapQLException(custom.getMessage());
    }
}
