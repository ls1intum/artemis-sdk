/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.tum.cit.ase.artemis.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import de.tum.cit.ase.artemis.sdk.model.GradingScale;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * Bonus
 */
@JsonPropertyOrder({
  Bonus.JSON_PROPERTY_ID,
  Bonus.JSON_PROPERTY_WEIGHT,
  Bonus.JSON_PROPERTY_SOURCE_GRADING_SCALE,
  Bonus.JSON_PROPERTY_BONUS_TO_GRADING_SCALE,
  Bonus.JSON_PROPERTY_BONUS_STRATEGY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-03-30T13:56:33.435320Z[Etc/UTC]")
public class Bonus {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private Double weight;

  public static final String JSON_PROPERTY_SOURCE_GRADING_SCALE = "sourceGradingScale";
  private GradingScale sourceGradingScale;

  public static final String JSON_PROPERTY_BONUS_TO_GRADING_SCALE = "bonusToGradingScale";
  private GradingScale bonusToGradingScale;

  /**
   * Gets or Sets bonusStrategy
   */
  public enum BonusStrategyEnum {
    GRADES_DISCRETE("GRADES_DISCRETE"),
    
    GRADES_CONTINUOUS("GRADES_CONTINUOUS"),
    
    POINTS("POINTS");

    private String value;

    BonusStrategyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BonusStrategyEnum fromValue(String value) {
      for (BonusStrategyEnum b : BonusStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BONUS_STRATEGY = "bonusStrategy";
  private BonusStrategyEnum bonusStrategy;

  public Bonus() { 
  }

  public Bonus id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public Bonus weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(Double weight) {
    this.weight = weight;
  }


  public Bonus sourceGradingScale(GradingScale sourceGradingScale) {
    this.sourceGradingScale = sourceGradingScale;
    return this;
  }

   /**
   * Get sourceGradingScale
   * @return sourceGradingScale
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE_GRADING_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GradingScale getSourceGradingScale() {
    return sourceGradingScale;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_GRADING_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceGradingScale(GradingScale sourceGradingScale) {
    this.sourceGradingScale = sourceGradingScale;
  }


  public Bonus bonusToGradingScale(GradingScale bonusToGradingScale) {
    this.bonusToGradingScale = bonusToGradingScale;
    return this;
  }

   /**
   * Get bonusToGradingScale
   * @return bonusToGradingScale
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BONUS_TO_GRADING_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GradingScale getBonusToGradingScale() {
    return bonusToGradingScale;
  }


  @JsonProperty(JSON_PROPERTY_BONUS_TO_GRADING_SCALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBonusToGradingScale(GradingScale bonusToGradingScale) {
    this.bonusToGradingScale = bonusToGradingScale;
  }


  public Bonus bonusStrategy(BonusStrategyEnum bonusStrategy) {
    this.bonusStrategy = bonusStrategy;
    return this;
  }

   /**
   * Get bonusStrategy
   * @return bonusStrategy
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BONUS_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BonusStrategyEnum getBonusStrategy() {
    return bonusStrategy;
  }


  @JsonProperty(JSON_PROPERTY_BONUS_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBonusStrategy(BonusStrategyEnum bonusStrategy) {
    this.bonusStrategy = bonusStrategy;
  }


  /**
   * Return true if this Bonus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bonus bonus = (Bonus) o;
    return Objects.equals(this.id, bonus.id) &&
        Objects.equals(this.weight, bonus.weight) &&
        Objects.equals(this.sourceGradingScale, bonus.sourceGradingScale) &&
        Objects.equals(this.bonusToGradingScale, bonus.bonusToGradingScale) &&
        Objects.equals(this.bonusStrategy, bonus.bonusStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, weight, sourceGradingScale, bonusToGradingScale, bonusStrategy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bonus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    sourceGradingScale: ").append(toIndentedString(sourceGradingScale)).append("\n");
    sb.append("    bonusToGradingScale: ").append(toIndentedString(bonusToGradingScale)).append("\n");
    sb.append("    bonusStrategy: ").append(toIndentedString(bonusStrategy)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

