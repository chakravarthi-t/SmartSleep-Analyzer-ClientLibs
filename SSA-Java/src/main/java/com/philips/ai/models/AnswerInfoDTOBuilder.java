/*
 * SmartSleepAnalyzer
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.philips.ai.models;

import java.util.*;

public class AnswerInfoDTOBuilder {
    //the instance to build
    private AnswerInfoDTO answerInfoDTO;

    /**
     * Default constructor to initialize the instance
     */
    public AnswerInfoDTOBuilder() {
        answerInfoDTO = new AnswerInfoDTO();
    }

    /**
     * Answer info type name
     */
    public AnswerInfoDTOBuilder type(String type) {
        answerInfoDTO.setType(type);
        return this;
    }

    /**
     * Answer info details
     */
    public AnswerInfoDTOBuilder info(LinkedHashMap<String, Object> info) {
        answerInfoDTO.setInfo(info);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AnswerInfoDTO build() {
        return answerInfoDTO;
    }
}