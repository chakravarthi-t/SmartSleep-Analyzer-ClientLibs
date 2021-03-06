/*
 * SmartSleepAnalyzer
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.philips.ai.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class QuestionDTO 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5106124309784542675L;
    private String identifier;
    private String text;
    private String content;
    private String type;
    private String initialValue;
    private Integer min;
    private String minValidationMessage;
    private Integer max;
    private String maxValidationMessage;
    private String formatValidationMessage;
    private String conversion;
    private String unitsText;
    private Boolean standalone;
    private List<OptionDTO> options;
    private String placeholder;
    private Boolean optional;
    private String likertTextLow;
    private String likertTextHigh;

    /** GETTER
     * The identifier of the question.
     */
    @JsonGetter("identifier")
    public String getIdentifier ( ) { 
        return this.identifier;
    }
    
    /** SETTER
     * The identifier of the question.
     */
    @JsonSetter("identifier")
    public void setIdentifier (String value) { 
        this.identifier = value;
    }
 
    /** GETTER
     * The displayable text of the question.
     */
    @JsonGetter("text")
    public String getText ( ) { 
        return this.text;
    }
    
    /** SETTER
     * The displayable text of the question.
     */
    @JsonSetter("text")
    public void setText (String value) { 
        this.text = value;
    }
 
    /** GETTER
     * Additional content to display with the question text.
     */
    @JsonGetter("content")
    public String getContent ( ) { 
        return this.content;
    }
    
    /** SETTER
     * Additional content to display with the question text.
     */
    @JsonSetter("content")
    public void setContent (String value) { 
        this.content = value;
    }
 
    /** GETTER
     * An identifier indicating the type of the question.
     */
    @JsonGetter("type")
    public String getType ( ) { 
        return this.type;
    }
    
    /** SETTER
     * An identifier indicating the type of the question.
     */
    @JsonSetter("type")
    public void setType (String value) { 
        this.type = value;
    }
 
    /** GETTER
     * An initial value to apply to the question, if no value is yet provided.
     */
    @JsonGetter("initialValue")
    public String getInitialValue ( ) { 
        return this.initialValue;
    }
    
    /** SETTER
     * An initial value to apply to the question, if no value is yet provided.
     */
    @JsonSetter("initialValue")
    public void setInitialValue (String value) { 
        this.initialValue = value;
    }
 
    /** GETTER
     * A min constraint which can be used with numeric type questions.
     */
    @JsonGetter("min")
    public Integer getMin ( ) { 
        return this.min;
    }
    
    /** SETTER
     * A min constraint which can be used with numeric type questions.
     */
    @JsonSetter("min")
    public void setMin (Integer value) { 
        this.min = value;
    }
 
    /** GETTER
     * Custom message to show for min constraint violation.
     */
    @JsonGetter("minValidationMessage")
    public String getMinValidationMessage ( ) { 
        return this.minValidationMessage;
    }
    
    /** SETTER
     * Custom message to show for min constraint violation.
     */
    @JsonSetter("minValidationMessage")
    public void setMinValidationMessage (String value) { 
        this.minValidationMessage = value;
    }
 
    /** GETTER
     * A max constraint which can be used with numeric type questions.
     */
    @JsonGetter("max")
    public Integer getMax ( ) { 
        return this.max;
    }
    
    /** SETTER
     * A max constraint which can be used with numeric type questions.
     */
    @JsonSetter("max")
    public void setMax (Integer value) { 
        this.max = value;
    }
 
    /** GETTER
     * Custom message to show for max constraint violation.
     */
    @JsonGetter("maxValidationMessage")
    public String getMaxValidationMessage ( ) { 
        return this.maxValidationMessage;
    }
    
    /** SETTER
     * Custom message to show for max constraint violation.
     */
    @JsonSetter("maxValidationMessage")
    public void setMaxValidationMessage (String value) { 
        this.maxValidationMessage = value;
    }
 
    /** GETTER
     * Custom message to show for format constraint violation.
     */
    @JsonGetter("formatValidationMessage")
    public String getFormatValidationMessage ( ) { 
        return this.formatValidationMessage;
    }
    
    /** SETTER
     * Custom message to show for format constraint violation.
     */
    @JsonSetter("formatValidationMessage")
    public void setFormatValidationMessage (String value) { 
        this.formatValidationMessage = value;
    }
 
    /** GETTER
     * Conversion identifier indicating the client should convert the unit(s) of the value when generating the question
     * (ie. metric to imperial).
     */
    @JsonGetter("conversion")
    public String getConversion ( ) { 
        return this.conversion;
    }
    
    /** SETTER
     * Conversion identifier indicating the client should convert the unit(s) of the value when generating the question
     * (ie. metric to imperial).
     */
    @JsonSetter("conversion")
    public void setConversion (String value) { 
        this.conversion = value;
    }
 
    /** GETTER
     * Text to show beside an input indicating to the end-user which units are required.
     */
    @JsonGetter("unitsText")
    public String getUnitsText ( ) { 
        return this.unitsText;
    }
    
    /** SETTER
     * Text to show beside an input indicating to the end-user which units are required.
     */
    @JsonSetter("unitsText")
    public void setUnitsText (String value) { 
        this.unitsText = value;
    }
 
    /** GETTER
     * Used for multi-select questions, indicating that this multi-select cannot be answered in conjunction with any other
     * on the page. A good example is "None of the above".
     */
    @JsonGetter("standalone")
    public Boolean getStandalone ( ) { 
        return this.standalone;
    }
    
    /** SETTER
     * Used for multi-select questions, indicating that this multi-select cannot be answered in conjunction with any other
     * on the page. A good example is "None of the above".
     */
    @JsonSetter("standalone")
    public void setStandalone (Boolean value) { 
        this.standalone = value;
    }
 
    /** GETTER
     * List of options to be used with selection based questions.
     */
    @JsonGetter("options")
    public List<OptionDTO> getOptions ( ) { 
        return this.options;
    }
    
    /** SETTER
     * List of options to be used with selection based questions.
     */
    @JsonSetter("options")
    public void setOptions (List<OptionDTO> value) { 
        this.options = value;
    }
 
    /** GETTER
     * Placeholder text to be shown in the question's input when no value is present.
     */
    @JsonGetter("placeholder")
    public String getPlaceholder ( ) { 
        return this.placeholder;
    }
    
    /** SETTER
     * Placeholder text to be shown in the question's input when no value is present.
     */
    @JsonSetter("placeholder")
    public void setPlaceholder (String value) { 
        this.placeholder = value;
    }
 
    /** GETTER
     * Indicates whether the question is optional.
     */
    @JsonGetter("optional")
    public Boolean getOptional ( ) { 
        return this.optional;
    }
    
    /** SETTER
     * Indicates whether the question is optional.
     */
    @JsonSetter("optional")
    public void setOptional (Boolean value) { 
        this.optional = value;
    }
 
    /** GETTER
     * Custom label to show on the high value end of likert questions.
     */
    @JsonGetter("likertTextLow")
    public String getLikertTextLow ( ) { 
        return this.likertTextLow;
    }
    
    /** SETTER
     * Custom label to show on the high value end of likert questions.
     */
    @JsonSetter("likertTextLow")
    public void setLikertTextLow (String value) { 
        this.likertTextLow = value;
    }
 
    /** GETTER
     * Custom label to show on the low value end of likert questions.
     */
    @JsonGetter("likertTextHigh")
    public String getLikertTextHigh ( ) { 
        return this.likertTextHigh;
    }
    
    /** SETTER
     * Custom label to show on the low value end of likert questions.
     */
    @JsonSetter("likertTextHigh")
    public void setLikertTextHigh (String value) { 
        this.likertTextHigh = value;
    }
 
}
