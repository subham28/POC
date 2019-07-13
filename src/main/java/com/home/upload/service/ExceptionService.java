package com.home.upload.service;

import com.home.upload.exception.CustomException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.servlet.http.Part;

@Service
public class ExceptionService {
    Logger logger = LoggerFactory.getLogger(ExceptionService.class);

    public void throwException(Part part) throws CustomException {
        if (part.getSubmittedFileName() != null) {
            logger.info("Throw Exception...");
            throw new CustomException("Manually throwing Exception...");
        }
    }
}
