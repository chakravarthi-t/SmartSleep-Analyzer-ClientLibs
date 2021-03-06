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
public class ConditionResult 
        implements java.io.Serializable {
    private static final long serialVersionUID = -2097608831313480067L;
    private String title;
    private String diagnosis;
    private String explanation;
    private String description;
    private String living;
    private String videoLiving;
    private String iconAbout;
    private String iconRisks;
    private String iconWhatYouCanDo;
    private String videoWhatYouCanDo;
    private String recommendation;
    private String risksHeader;
    private List<String> risks;
    private String benefitsHeader;
    private List<String> benefits;
    private String whileWaiting;
    private String identifier;
    private Integer riskRating;
    private String classification;
    private List<String> tipIdentifiers;
    private List<String> tidbitIdentifiers;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("title")
    public String getTitle ( ) { 
        return this.title;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("title")
    public void setTitle (String value) { 
        this.title = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("diagnosis")
    public String getDiagnosis ( ) { 
        return this.diagnosis;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("diagnosis")
    public void setDiagnosis (String value) { 
        this.diagnosis = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("explanation")
    public String getExplanation ( ) { 
        return this.explanation;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("explanation")
    public void setExplanation (String value) { 
        this.explanation = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("description")
    public String getDescription ( ) { 
        return this.description;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("description")
    public void setDescription (String value) { 
        this.description = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("living")
    public String getLiving ( ) { 
        return this.living;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("living")
    public void setLiving (String value) { 
        this.living = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("videoLiving")
    public String getVideoLiving ( ) { 
        return this.videoLiving;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("videoLiving")
    public void setVideoLiving (String value) { 
        this.videoLiving = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("iconAbout")
    public String getIconAbout ( ) { 
        return this.iconAbout;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("iconAbout")
    public void setIconAbout (String value) { 
        this.iconAbout = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("iconRisks")
    public String getIconRisks ( ) { 
        return this.iconRisks;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("iconRisks")
    public void setIconRisks (String value) { 
        this.iconRisks = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("iconWhatYouCanDo")
    public String getIconWhatYouCanDo ( ) { 
        return this.iconWhatYouCanDo;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("iconWhatYouCanDo")
    public void setIconWhatYouCanDo (String value) { 
        this.iconWhatYouCanDo = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("videoWhatYouCanDo")
    public String getVideoWhatYouCanDo ( ) { 
        return this.videoWhatYouCanDo;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("videoWhatYouCanDo")
    public void setVideoWhatYouCanDo (String value) { 
        this.videoWhatYouCanDo = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("recommendation")
    public String getRecommendation ( ) { 
        return this.recommendation;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("recommendation")
    public void setRecommendation (String value) { 
        this.recommendation = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("risksHeader")
    public String getRisksHeader ( ) { 
        return this.risksHeader;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("risksHeader")
    public void setRisksHeader (String value) { 
        this.risksHeader = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("risks")
    public List<String> getRisks ( ) { 
        return this.risks;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("risks")
    public void setRisks (List<String> value) { 
        this.risks = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("benefitsHeader")
    public String getBenefitsHeader ( ) { 
        return this.benefitsHeader;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("benefitsHeader")
    public void setBenefitsHeader (String value) { 
        this.benefitsHeader = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("benefits")
    public List<String> getBenefits ( ) { 
        return this.benefits;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("benefits")
    public void setBenefits (List<String> value) { 
        this.benefits = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("whileWaiting")
    public String getWhileWaiting ( ) { 
        return this.whileWaiting;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("whileWaiting")
    public void setWhileWaiting (String value) { 
        this.whileWaiting = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("identifier")
    public String getIdentifier ( ) { 
        return this.identifier;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("identifier")
    public void setIdentifier (String value) { 
        this.identifier = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("riskRating")
    public Integer getRiskRating ( ) { 
        return this.riskRating;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("riskRating")
    public void setRiskRating (Integer value) { 
        this.riskRating = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("classification")
    public String getClassification ( ) { 
        return this.classification;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("classification")
    public void setClassification (String value) { 
        this.classification = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("tipIdentifiers")
    public List<String> getTipIdentifiers ( ) { 
        return this.tipIdentifiers;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tipIdentifiers")
    public void setTipIdentifiers (List<String> value) { 
        this.tipIdentifiers = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("tidbitIdentifiers")
    public List<String> getTidbitIdentifiers ( ) { 
        return this.tidbitIdentifiers;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("tidbitIdentifiers")
    public void setTidbitIdentifiers (List<String> value) { 
        this.tidbitIdentifiers = value;
    }
 
}
