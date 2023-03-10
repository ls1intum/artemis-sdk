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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.FeedbackConflict;
import org.openapitools.client.model.GradingInstruction;
import org.openapitools.client.model.Result;

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
 * Feedback
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class Feedback {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_DETAIL_TEXT = "detailText";
  @SerializedName(SERIALIZED_NAME_DETAIL_TEXT)
  private String detailText;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_CREDITS = "credits";
  @SerializedName(SERIALIZED_NAME_CREDITS)
  private Double credits;

  public static final String SERIALIZED_NAME_POSITIVE = "positive";
  @SerializedName(SERIALIZED_NAME_POSITIVE)
  private Boolean positive;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    MANUAL("MANUAL"),
    
    MANUAL_UNREFERENCED("MANUAL_UNREFERENCED"),
    
    AUTOMATIC_ADAPTED("AUTOMATIC_ADAPTED"),
    
    AUTOMATIC("AUTOMATIC");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * Gets or Sets visibility
   */
  @JsonAdapter(VisibilityEnum.Adapter.class)
  public enum VisibilityEnum {
    ALWAYS("ALWAYS"),
    
    AFTER_DUE_DATE("AFTER_DUE_DATE"),
    
    NEVER("NEVER");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<VisibilityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final VisibilityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public VisibilityEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return VisibilityEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityEnum visibility;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Result result;

  public static final String SERIALIZED_NAME_GRADING_INSTRUCTION = "gradingInstruction";
  @SerializedName(SERIALIZED_NAME_GRADING_INSTRUCTION)
  private GradingInstruction gradingInstruction;

  public static final String SERIALIZED_NAME_SUGGESTED_FEEDBACK_REFERENCE = "suggestedFeedbackReference";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_FEEDBACK_REFERENCE)
  private String suggestedFeedbackReference;

  public static final String SERIALIZED_NAME_SUGGESTED_FEEDBACK_ORIGIN_SUBMISSION_REFERENCE = "suggestedFeedbackOriginSubmissionReference";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_FEEDBACK_ORIGIN_SUBMISSION_REFERENCE)
  private Long suggestedFeedbackOriginSubmissionReference;

  public static final String SERIALIZED_NAME_SUGGESTED_FEEDBACK_PARTICIPATION_REFERENCE = "suggestedFeedbackParticipationReference";
  @SerializedName(SERIALIZED_NAME_SUGGESTED_FEEDBACK_PARTICIPATION_REFERENCE)
  private Long suggestedFeedbackParticipationReference;

  public static final String SERIALIZED_NAME_FIRST_CONFLICTS = "firstConflicts";
  @SerializedName(SERIALIZED_NAME_FIRST_CONFLICTS)
  private List<FeedbackConflict> firstConflicts = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECOND_CONFLICTS = "secondConflicts";
  @SerializedName(SERIALIZED_NAME_SECOND_CONFLICTS)
  private List<FeedbackConflict> secondConflicts = new ArrayList<>();

  public Feedback() {
  }

  public Feedback id(Long id) {
    
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


  public Feedback text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public Feedback detailText(String detailText) {
    
    this.detailText = detailText;
    return this;
  }

   /**
   * Get detailText
   * @return detailText
  **/
  @javax.annotation.Nullable

  public String getDetailText() {
    return detailText;
  }


  public void setDetailText(String detailText) {
    this.detailText = detailText;
  }


  public Feedback reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public Feedback credits(Double credits) {
    
    this.credits = credits;
    return this;
  }

   /**
   * Get credits
   * @return credits
  **/
  @javax.annotation.Nullable

  public Double getCredits() {
    return credits;
  }


  public void setCredits(Double credits) {
    this.credits = credits;
  }


  public Feedback positive(Boolean positive) {
    
    this.positive = positive;
    return this;
  }

   /**
   * Get positive
   * @return positive
  **/
  @javax.annotation.Nullable

  public Boolean getPositive() {
    return positive;
  }


  public void setPositive(Boolean positive) {
    this.positive = positive;
  }


  public Feedback type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Feedback visibility(VisibilityEnum visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nullable

  public VisibilityEnum getVisibility() {
    return visibility;
  }


  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }


  public Feedback result(Result result) {
    
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @javax.annotation.Nullable

  public Result getResult() {
    return result;
  }


  public void setResult(Result result) {
    this.result = result;
  }


  public Feedback gradingInstruction(GradingInstruction gradingInstruction) {
    
    this.gradingInstruction = gradingInstruction;
    return this;
  }

   /**
   * Get gradingInstruction
   * @return gradingInstruction
  **/
  @javax.annotation.Nullable

  public GradingInstruction getGradingInstruction() {
    return gradingInstruction;
  }


  public void setGradingInstruction(GradingInstruction gradingInstruction) {
    this.gradingInstruction = gradingInstruction;
  }


  public Feedback suggestedFeedbackReference(String suggestedFeedbackReference) {
    
    this.suggestedFeedbackReference = suggestedFeedbackReference;
    return this;
  }

   /**
   * Get suggestedFeedbackReference
   * @return suggestedFeedbackReference
  **/
  @javax.annotation.Nullable

  public String getSuggestedFeedbackReference() {
    return suggestedFeedbackReference;
  }


  public void setSuggestedFeedbackReference(String suggestedFeedbackReference) {
    this.suggestedFeedbackReference = suggestedFeedbackReference;
  }


  public Feedback suggestedFeedbackOriginSubmissionReference(Long suggestedFeedbackOriginSubmissionReference) {
    
    this.suggestedFeedbackOriginSubmissionReference = suggestedFeedbackOriginSubmissionReference;
    return this;
  }

   /**
   * Get suggestedFeedbackOriginSubmissionReference
   * @return suggestedFeedbackOriginSubmissionReference
  **/
  @javax.annotation.Nullable

  public Long getSuggestedFeedbackOriginSubmissionReference() {
    return suggestedFeedbackOriginSubmissionReference;
  }


  public void setSuggestedFeedbackOriginSubmissionReference(Long suggestedFeedbackOriginSubmissionReference) {
    this.suggestedFeedbackOriginSubmissionReference = suggestedFeedbackOriginSubmissionReference;
  }


  public Feedback suggestedFeedbackParticipationReference(Long suggestedFeedbackParticipationReference) {
    
    this.suggestedFeedbackParticipationReference = suggestedFeedbackParticipationReference;
    return this;
  }

   /**
   * Get suggestedFeedbackParticipationReference
   * @return suggestedFeedbackParticipationReference
  **/
  @javax.annotation.Nullable

  public Long getSuggestedFeedbackParticipationReference() {
    return suggestedFeedbackParticipationReference;
  }


  public void setSuggestedFeedbackParticipationReference(Long suggestedFeedbackParticipationReference) {
    this.suggestedFeedbackParticipationReference = suggestedFeedbackParticipationReference;
  }


  public Feedback firstConflicts(List<FeedbackConflict> firstConflicts) {
    
    this.firstConflicts = firstConflicts;
    return this;
  }

  public Feedback addFirstConflictsItem(FeedbackConflict firstConflictsItem) {
    if (this.firstConflicts == null) {
      this.firstConflicts = new ArrayList<>();
    }
    this.firstConflicts.add(firstConflictsItem);
    return this;
  }

   /**
   * Get firstConflicts
   * @return firstConflicts
  **/
  @javax.annotation.Nullable

  public List<FeedbackConflict> getFirstConflicts() {
    return firstConflicts;
  }


  public void setFirstConflicts(List<FeedbackConflict> firstConflicts) {
    this.firstConflicts = firstConflicts;
  }


  public Feedback secondConflicts(List<FeedbackConflict> secondConflicts) {
    
    this.secondConflicts = secondConflicts;
    return this;
  }

  public Feedback addSecondConflictsItem(FeedbackConflict secondConflictsItem) {
    if (this.secondConflicts == null) {
      this.secondConflicts = new ArrayList<>();
    }
    this.secondConflicts.add(secondConflictsItem);
    return this;
  }

   /**
   * Get secondConflicts
   * @return secondConflicts
  **/
  @javax.annotation.Nullable

  public List<FeedbackConflict> getSecondConflicts() {
    return secondConflicts;
  }


  public void setSecondConflicts(List<FeedbackConflict> secondConflicts) {
    this.secondConflicts = secondConflicts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Feedback feedback = (Feedback) o;
    return Objects.equals(this.id, feedback.id) &&
        Objects.equals(this.text, feedback.text) &&
        Objects.equals(this.detailText, feedback.detailText) &&
        Objects.equals(this.reference, feedback.reference) &&
        Objects.equals(this.credits, feedback.credits) &&
        Objects.equals(this.positive, feedback.positive) &&
        Objects.equals(this.type, feedback.type) &&
        Objects.equals(this.visibility, feedback.visibility) &&
        Objects.equals(this.result, feedback.result) &&
        Objects.equals(this.gradingInstruction, feedback.gradingInstruction) &&
        Objects.equals(this.suggestedFeedbackReference, feedback.suggestedFeedbackReference) &&
        Objects.equals(this.suggestedFeedbackOriginSubmissionReference, feedback.suggestedFeedbackOriginSubmissionReference) &&
        Objects.equals(this.suggestedFeedbackParticipationReference, feedback.suggestedFeedbackParticipationReference) &&
        Objects.equals(this.firstConflicts, feedback.firstConflicts) &&
        Objects.equals(this.secondConflicts, feedback.secondConflicts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, detailText, reference, credits, positive, type, visibility, result, gradingInstruction, suggestedFeedbackReference, suggestedFeedbackOriginSubmissionReference, suggestedFeedbackParticipationReference, firstConflicts, secondConflicts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Feedback {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    detailText: ").append(toIndentedString(detailText)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    positive: ").append(toIndentedString(positive)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    gradingInstruction: ").append(toIndentedString(gradingInstruction)).append("\n");
    sb.append("    suggestedFeedbackReference: ").append(toIndentedString(suggestedFeedbackReference)).append("\n");
    sb.append("    suggestedFeedbackOriginSubmissionReference: ").append(toIndentedString(suggestedFeedbackOriginSubmissionReference)).append("\n");
    sb.append("    suggestedFeedbackParticipationReference: ").append(toIndentedString(suggestedFeedbackParticipationReference)).append("\n");
    sb.append("    firstConflicts: ").append(toIndentedString(firstConflicts)).append("\n");
    sb.append("    secondConflicts: ").append(toIndentedString(secondConflicts)).append("\n");
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
    openapiFields.add("text");
    openapiFields.add("detailText");
    openapiFields.add("reference");
    openapiFields.add("credits");
    openapiFields.add("positive");
    openapiFields.add("type");
    openapiFields.add("visibility");
    openapiFields.add("result");
    openapiFields.add("gradingInstruction");
    openapiFields.add("suggestedFeedbackReference");
    openapiFields.add("suggestedFeedbackOriginSubmissionReference");
    openapiFields.add("suggestedFeedbackParticipationReference");
    openapiFields.add("firstConflicts");
    openapiFields.add("secondConflicts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Feedback
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Feedback.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Feedback is not found in the empty JSON string", Feedback.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Feedback.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Feedback` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("detailText") != null && !jsonObj.get("detailText").isJsonNull()) && !jsonObj.get("detailText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `detailText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("detailText").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("visibility") != null && !jsonObj.get("visibility").isJsonNull()) && !jsonObj.get("visibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `visibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("visibility").toString()));
      }
      // validate the optional field `result`
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
        Result.validateJsonObject(jsonObj.getAsJsonObject("result"));
      }
      // validate the optional field `gradingInstruction`
      if (jsonObj.get("gradingInstruction") != null && !jsonObj.get("gradingInstruction").isJsonNull()) {
        GradingInstruction.validateJsonObject(jsonObj.getAsJsonObject("gradingInstruction"));
      }
      if ((jsonObj.get("suggestedFeedbackReference") != null && !jsonObj.get("suggestedFeedbackReference").isJsonNull()) && !jsonObj.get("suggestedFeedbackReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `suggestedFeedbackReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("suggestedFeedbackReference").toString()));
      }
      if (jsonObj.get("firstConflicts") != null && !jsonObj.get("firstConflicts").isJsonNull()) {
        JsonArray jsonArrayfirstConflicts = jsonObj.getAsJsonArray("firstConflicts");
        if (jsonArrayfirstConflicts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("firstConflicts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `firstConflicts` to be an array in the JSON string but got `%s`", jsonObj.get("firstConflicts").toString()));
          }

          // validate the optional field `firstConflicts` (array)
          for (int i = 0; i < jsonArrayfirstConflicts.size(); i++) {
            FeedbackConflict.validateJsonObject(jsonArrayfirstConflicts.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("secondConflicts") != null && !jsonObj.get("secondConflicts").isJsonNull()) {
        JsonArray jsonArraysecondConflicts = jsonObj.getAsJsonArray("secondConflicts");
        if (jsonArraysecondConflicts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("secondConflicts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `secondConflicts` to be an array in the JSON string but got `%s`", jsonObj.get("secondConflicts").toString()));
          }

          // validate the optional field `secondConflicts` (array)
          for (int i = 0; i < jsonArraysecondConflicts.size(); i++) {
            FeedbackConflict.validateJsonObject(jsonArraysecondConflicts.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Feedback.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Feedback' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Feedback> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Feedback.class));

       return (TypeAdapter<T>) new TypeAdapter<Feedback>() {
           @Override
           public void write(JsonWriter out, Feedback value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Feedback read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Feedback given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Feedback
  * @throws IOException if the JSON string is invalid with respect to Feedback
  */
  public static Feedback fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Feedback.class);
  }

 /**
  * Convert an instance of Feedback to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

