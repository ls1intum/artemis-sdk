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
import org.openapitools.client.model.IPAddressNetworkObjectObjectObjectObjectObject;

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
 * IPAddressCreatorObjectObjectObjectObjectObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class IPAddressCreatorObjectObjectObjectObjectObject {
  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private IPAddressNetworkObjectObjectObjectObjectObject network;

  public static final String SERIALIZED_NAME_SEGMENT_CACHING = "segmentCaching";
  @SerializedName(SERIALIZED_NAME_SEGMENT_CACHING)
  private Boolean segmentCaching;

  public IPAddressCreatorObjectObjectObjectObjectObject() {
  }

  public IPAddressCreatorObjectObjectObjectObjectObject network(IPAddressNetworkObjectObjectObjectObjectObject network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @javax.annotation.Nullable

  public IPAddressNetworkObjectObjectObjectObjectObject getNetwork() {
    return network;
  }


  public void setNetwork(IPAddressNetworkObjectObjectObjectObjectObject network) {
    this.network = network;
  }


  public IPAddressCreatorObjectObjectObjectObjectObject segmentCaching(Boolean segmentCaching) {
    
    this.segmentCaching = segmentCaching;
    return this;
  }

   /**
   * Get segmentCaching
   * @return segmentCaching
  **/
  @javax.annotation.Nullable

  public Boolean getSegmentCaching() {
    return segmentCaching;
  }


  public void setSegmentCaching(Boolean segmentCaching) {
    this.segmentCaching = segmentCaching;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAddressCreatorObjectObjectObjectObjectObject ipAddressCreatorObjectObjectObjectObjectObject = (IPAddressCreatorObjectObjectObjectObjectObject) o;
    return Objects.equals(this.network, ipAddressCreatorObjectObjectObjectObjectObject.network) &&
        Objects.equals(this.segmentCaching, ipAddressCreatorObjectObjectObjectObjectObject.segmentCaching);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, segmentCaching);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAddressCreatorObjectObjectObjectObjectObject {\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    segmentCaching: ").append(toIndentedString(segmentCaching)).append("\n");
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
    openapiFields.add("network");
    openapiFields.add("segmentCaching");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IPAddressCreatorObjectObjectObjectObjectObject
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IPAddressCreatorObjectObjectObjectObjectObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IPAddressCreatorObjectObjectObjectObjectObject is not found in the empty JSON string", IPAddressCreatorObjectObjectObjectObjectObject.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IPAddressCreatorObjectObjectObjectObjectObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IPAddressCreatorObjectObjectObjectObjectObject` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `network`
      if (jsonObj.get("network") != null && !jsonObj.get("network").isJsonNull()) {
        IPAddressNetworkObjectObjectObjectObjectObject.validateJsonObject(jsonObj.getAsJsonObject("network"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IPAddressCreatorObjectObjectObjectObjectObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IPAddressCreatorObjectObjectObjectObjectObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IPAddressCreatorObjectObjectObjectObjectObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IPAddressCreatorObjectObjectObjectObjectObject.class));

       return (TypeAdapter<T>) new TypeAdapter<IPAddressCreatorObjectObjectObjectObjectObject>() {
           @Override
           public void write(JsonWriter out, IPAddressCreatorObjectObjectObjectObjectObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IPAddressCreatorObjectObjectObjectObjectObject read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IPAddressCreatorObjectObjectObjectObjectObject given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IPAddressCreatorObjectObjectObjectObjectObject
  * @throws IOException if the JSON string is invalid with respect to IPAddressCreatorObjectObjectObjectObjectObject
  */
  public static IPAddressCreatorObjectObjectObjectObjectObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IPAddressCreatorObjectObjectObjectObjectObject.class);
  }

 /**
  * Convert an instance of IPAddressCreatorObjectObjectObjectObjectObject to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

