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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import de.tum.cit.ase.artemis.sdk.model.PointCounter;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * QuizPointStatistic
 */
@JsonPropertyOrder({
  QuizPointStatistic.JSON_PROPERTY_ID,
  QuizPointStatistic.JSON_PROPERTY_PARTICIPANTS_RATED,
  QuizPointStatistic.JSON_PROPERTY_PARTICIPANTS_UNRATED,
  QuizPointStatistic.JSON_PROPERTY_POINT_COUNTERS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class QuizPointStatistic {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_PARTICIPANTS_RATED = "participantsRated";
  private Integer participantsRated;

  public static final String JSON_PROPERTY_PARTICIPANTS_UNRATED = "participantsUnrated";
  private Integer participantsUnrated;

  public static final String JSON_PROPERTY_POINT_COUNTERS = "pointCounters";
  private Set<PointCounter> pointCounters = new LinkedHashSet<>();

  public QuizPointStatistic() { 
  }

  public QuizPointStatistic id(Long id) {
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


  public QuizPointStatistic participantsRated(Integer participantsRated) {
    this.participantsRated = participantsRated;
    return this;
  }

   /**
   * Get participantsRated
   * @return participantsRated
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPANTS_RATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getParticipantsRated() {
    return participantsRated;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPANTS_RATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipantsRated(Integer participantsRated) {
    this.participantsRated = participantsRated;
  }


  public QuizPointStatistic participantsUnrated(Integer participantsUnrated) {
    this.participantsUnrated = participantsUnrated;
    return this;
  }

   /**
   * Get participantsUnrated
   * @return participantsUnrated
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PARTICIPANTS_UNRATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getParticipantsUnrated() {
    return participantsUnrated;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPANTS_UNRATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipantsUnrated(Integer participantsUnrated) {
    this.participantsUnrated = participantsUnrated;
  }


  public QuizPointStatistic pointCounters(Set<PointCounter> pointCounters) {
    this.pointCounters = pointCounters;
    return this;
  }

  public QuizPointStatistic addPointCountersItem(PointCounter pointCountersItem) {
    if (this.pointCounters == null) {
      this.pointCounters = new LinkedHashSet<>();
    }
    this.pointCounters.add(pointCountersItem);
    return this;
  }

   /**
   * Get pointCounters
   * @return pointCounters
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POINT_COUNTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<PointCounter> getPointCounters() {
    return pointCounters;
  }


  @JsonDeserialize(as = LinkedHashSet.class)
  @JsonProperty(JSON_PROPERTY_POINT_COUNTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPointCounters(Set<PointCounter> pointCounters) {
    this.pointCounters = pointCounters;
  }


  /**
   * Return true if this QuizPointStatistic object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuizPointStatistic quizPointStatistic = (QuizPointStatistic) o;
    return Objects.equals(this.id, quizPointStatistic.id) &&
        Objects.equals(this.participantsRated, quizPointStatistic.participantsRated) &&
        Objects.equals(this.participantsUnrated, quizPointStatistic.participantsUnrated) &&
        Objects.equals(this.pointCounters, quizPointStatistic.pointCounters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, participantsRated, participantsUnrated, pointCounters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuizPointStatistic {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    participantsRated: ").append(toIndentedString(participantsRated)).append("\n");
    sb.append("    participantsUnrated: ").append(toIndentedString(participantsUnrated)).append("\n");
    sb.append("    pointCounters: ").append(toIndentedString(pointCounters)).append("\n");
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

