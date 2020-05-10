/*
 * SmartSleepAnalyzer
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.philips.ai.models;

import java.util.*;

public class StepStateDTOBuilder {
    //the instance to build
    private StepStateDTO stepStateDTO;

    /**
     * Default constructor to initialize the instance
     */
    public StepStateDTOBuilder() {
        stepStateDTO = new StepStateDTO();
    }

    /**
     * The identifier of the step.
     */
    public StepStateDTOBuilder identifier(String identifier) {
        stepStateDTO.setIdentifier(identifier);
        return this;
    }

    /**
     * The identifier of the section to which the step belongs.
     */
    public StepStateDTOBuilder sectionRef(String sectionRef) {
        stepStateDTO.setSectionRef(sectionRef);
        return this;
    }

    /** SETTER
     * The identifier of a custom client renderer used to display the step.
     */
    public StepStateDTOBuilder renderer(String renderer) { 
    	stepStateDTO.setRenderer(renderer);
    	return this;
    }

    /**
     * List of question identifiers for questions to be displayed on the step.
     */
    public StepStateDTOBuilder questionRefs(List<String> questionRefs) {
        stepStateDTO.setQuestionRefs(questionRefs);
        return this;
    }

    /**
     * Heading text to be displayed on the step. May be null.
     */
    public StepStateDTOBuilder heading(String heading) {
        stepStateDTO.setHeading(heading);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public StepStateDTO build() {
        return stepStateDTO;
    }
}
