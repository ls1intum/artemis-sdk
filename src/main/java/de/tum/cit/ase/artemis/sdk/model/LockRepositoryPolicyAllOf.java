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
import de.tum.cit.ase.artemis.sdk.model.ProgrammingExercise;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.tum.cit.ase.artemis.sdk.JSON;


/**
 * LockRepositoryPolicyAllOf
 */
@JsonPropertyOrder({
  LockRepositoryPolicyAllOf.JSON_PROPERTY_PROGRAMMING_EXERCISE
})
@JsonTypeName("LockRepositoryPolicy_allOf")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T10:41:24.492016Z[Etc/UTC]")
public class LockRepositoryPolicyAllOf {
  public static final String JSON_PROPERTY_PROGRAMMING_EXERCISE = "programmingExercise";
  private ProgrammingExercise programmingExercise;

  public LockRepositoryPolicyAllOf() { 
  }

  public LockRepositoryPolicyAllOf programmingExercise(ProgrammingExercise programmingExercise) {
    this.programmingExercise = programmingExercise;
    return this;
  }

   /**
   * Get programmingExercise
   * @return programmingExercise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROGRAMMING_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ProgrammingExercise getProgrammingExercise() {
    return programmingExercise;
  }


  @JsonProperty(JSON_PROPERTY_PROGRAMMING_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProgrammingExercise(ProgrammingExercise programmingExercise) {
    this.programmingExercise = programmingExercise;
  }


  /**
   * Return true if this LockRepositoryPolicy_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LockRepositoryPolicyAllOf lockRepositoryPolicyAllOf = (LockRepositoryPolicyAllOf) o;
    return Objects.equals(this.programmingExercise, lockRepositoryPolicyAllOf.programmingExercise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programmingExercise);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LockRepositoryPolicyAllOf {\n");
    sb.append("    programmingExercise: ").append(toIndentedString(programmingExercise)).append("\n");
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
