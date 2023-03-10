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


package model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.client.model.GradingScale;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Bonus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class Bonus {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Double weight;

  public static final String SERIALIZED_NAME_SOURCE_GRADING_SCALE = "sourceGradingScale";
  @SerializedName(SERIALIZED_NAME_SOURCE_GRADING_SCALE)
  private GradingScale sourceGradingScale;

  public static final String SERIALIZED_NAME_BONUS_TO_GRADING_SCALE = "bonusToGradingScale";
  @SerializedName(SERIALIZED_NAME_BONUS_TO_GRADING_SCALE)
  private GradingScale bonusToGradingScale;

  /**
   * Gets or Sets bonusStrategy
   */
  @JsonAdapter(BonusStrategyEnum.Adapter.class)
  public enum BonusStrategyEnum {
    GRADES_DISCRETE("GRADES_DISCRETE"),
    
    GRADES_CONTINUOUS("GRADES_CONTINUOUS"),
    
    POINTS("POINTS");

    private String value;

    BonusStrategyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BonusStrategyEnum fromValue(String value) {
      for (BonusStrategyEnum b : BonusStrategyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BonusStrategyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BonusStrategyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BonusStrategyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BonusStrategyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BONUS_STRATEGY = "bonusStrategy";
  @SerializedName(SERIALIZED_NAME_BONUS_STRATEGY)
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
  @javax.annotation.Nullable

  public Long getId() {
    return id;
  }


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
  @javax.annotation.Nullable

  public Double getWeight() {
    return weight;
  }


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
  @javax.annotation.Nullable

  public GradingScale getSourceGradingScale() {
    return sourceGradingScale;
  }


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
  @javax.annotation.Nullable

  public GradingScale getBonusToGradingScale() {
    return bonusToGradingScale;
  }


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
  @javax.annotation.Nullable

  public BonusStrategyEnum getBonusStrategy() {
    return bonusStrategy;
  }


  public void setBonusStrategy(BonusStrategyEnum bonusStrategy) {
    this.bonusStrategy = bonusStrategy;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("weight");
    openapiFields.add("sourceGradingScale");
    openapiFields.add("bonusToGradingScale");
    openapiFields.add("bonusStrategy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Bonus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Bonus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Bonus is not found in the empty JSON string", Bonus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Bonus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Bonus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `sourceGradingScale`
      if (jsonObj.get("sourceGradingScale") != null && !jsonObj.get("sourceGradingScale").isJsonNull()) {
        GradingScale.validateJsonObject(jsonObj.getAsJsonObject("sourceGradingScale"));
      }
      // validate the optional field `bonusToGradingScale`
      if (jsonObj.get("bonusToGradingScale") != null && !jsonObj.get("bonusToGradingScale").isJsonNull()) {
        GradingScale.validateJsonObject(jsonObj.getAsJsonObject("bonusToGradingScale"));
      }
      if ((jsonObj.get("bonusStrategy") != null && !jsonObj.get("bonusStrategy").isJsonNull()) && !jsonObj.get("bonusStrategy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bonusStrategy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bonusStrategy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Bonus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Bonus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Bonus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Bonus.class));

       return (TypeAdapter<T>) new TypeAdapter<Bonus>() {
           @Override
           public void write(JsonWriter out, Bonus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Bonus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Bonus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Bonus
  * @throws IOException if the JSON string is invalid with respect to Bonus
  */
  public static Bonus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Bonus.class);
  }

 /**
  * Convert an instance of Bonus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

