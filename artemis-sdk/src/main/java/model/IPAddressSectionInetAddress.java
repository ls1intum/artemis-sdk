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
 * IPAddressSectionInetAddress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class IPAddressSectionInetAddress {
  public static final String SERIALIZED_NAME_CANONICAL_HOST_NAME = "canonicalHostName";
  @SerializedName(SERIALIZED_NAME_CANONICAL_HOST_NAME)
  private String canonicalHostName;

  public static final String SERIALIZED_NAME_HOST_ADDRESS = "hostAddress";
  @SerializedName(SERIALIZED_NAME_HOST_ADDRESS)
  private String hostAddress;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private List<byte[]> address = new ArrayList<>();

  public static final String SERIALIZED_NAME_HOST_NAME = "hostName";
  @SerializedName(SERIALIZED_NAME_HOST_NAME)
  private String hostName;

  public static final String SERIALIZED_NAME_LINK_LOCAL_ADDRESS = "linkLocalAddress";
  @SerializedName(SERIALIZED_NAME_LINK_LOCAL_ADDRESS)
  private Boolean linkLocalAddress;

  public static final String SERIALIZED_NAME_MULTICAST_ADDRESS = "multicastAddress";
  @SerializedName(SERIALIZED_NAME_MULTICAST_ADDRESS)
  private Boolean multicastAddress;

  public static final String SERIALIZED_NAME_ANY_LOCAL_ADDRESS = "anyLocalAddress";
  @SerializedName(SERIALIZED_NAME_ANY_LOCAL_ADDRESS)
  private Boolean anyLocalAddress;

  public static final String SERIALIZED_NAME_LOOPBACK_ADDRESS = "loopbackAddress";
  @SerializedName(SERIALIZED_NAME_LOOPBACK_ADDRESS)
  private Boolean loopbackAddress;

  public static final String SERIALIZED_NAME_SITE_LOCAL_ADDRESS = "siteLocalAddress";
  @SerializedName(SERIALIZED_NAME_SITE_LOCAL_ADDRESS)
  private Boolean siteLocalAddress;

  public static final String SERIALIZED_NAME_MCGLOBAL = "mcglobal";
  @SerializedName(SERIALIZED_NAME_MCGLOBAL)
  private Boolean mcglobal;

  public static final String SERIALIZED_NAME_MCNODE_LOCAL = "mcnodeLocal";
  @SerializedName(SERIALIZED_NAME_MCNODE_LOCAL)
  private Boolean mcnodeLocal;

  public static final String SERIALIZED_NAME_MCLINK_LOCAL = "mclinkLocal";
  @SerializedName(SERIALIZED_NAME_MCLINK_LOCAL)
  private Boolean mclinkLocal;

  public static final String SERIALIZED_NAME_MCSITE_LOCAL = "mcsiteLocal";
  @SerializedName(SERIALIZED_NAME_MCSITE_LOCAL)
  private Boolean mcsiteLocal;

  public static final String SERIALIZED_NAME_MCORG_LOCAL = "mcorgLocal";
  @SerializedName(SERIALIZED_NAME_MCORG_LOCAL)
  private Boolean mcorgLocal;

  public IPAddressSectionInetAddress() {
  }

  public IPAddressSectionInetAddress canonicalHostName(String canonicalHostName) {
    
    this.canonicalHostName = canonicalHostName;
    return this;
  }

   /**
   * Get canonicalHostName
   * @return canonicalHostName
  **/
  @javax.annotation.Nullable

  public String getCanonicalHostName() {
    return canonicalHostName;
  }


  public void setCanonicalHostName(String canonicalHostName) {
    this.canonicalHostName = canonicalHostName;
  }


  public IPAddressSectionInetAddress hostAddress(String hostAddress) {
    
    this.hostAddress = hostAddress;
    return this;
  }

   /**
   * Get hostAddress
   * @return hostAddress
  **/
  @javax.annotation.Nullable

  public String getHostAddress() {
    return hostAddress;
  }


  public void setHostAddress(String hostAddress) {
    this.hostAddress = hostAddress;
  }


  public IPAddressSectionInetAddress address(List<byte[]> address) {
    
    this.address = address;
    return this;
  }

  public IPAddressSectionInetAddress addAddressItem(byte[] addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<>();
    }
    this.address.add(addressItem);
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable

  public List<byte[]> getAddress() {
    return address;
  }


  public void setAddress(List<byte[]> address) {
    this.address = address;
  }


  public IPAddressSectionInetAddress hostName(String hostName) {
    
    this.hostName = hostName;
    return this;
  }

   /**
   * Get hostName
   * @return hostName
  **/
  @javax.annotation.Nullable

  public String getHostName() {
    return hostName;
  }


  public void setHostName(String hostName) {
    this.hostName = hostName;
  }


  public IPAddressSectionInetAddress linkLocalAddress(Boolean linkLocalAddress) {
    
    this.linkLocalAddress = linkLocalAddress;
    return this;
  }

   /**
   * Get linkLocalAddress
   * @return linkLocalAddress
  **/
  @javax.annotation.Nullable

  public Boolean getLinkLocalAddress() {
    return linkLocalAddress;
  }


  public void setLinkLocalAddress(Boolean linkLocalAddress) {
    this.linkLocalAddress = linkLocalAddress;
  }


  public IPAddressSectionInetAddress multicastAddress(Boolean multicastAddress) {
    
    this.multicastAddress = multicastAddress;
    return this;
  }

   /**
   * Get multicastAddress
   * @return multicastAddress
  **/
  @javax.annotation.Nullable

  public Boolean getMulticastAddress() {
    return multicastAddress;
  }


  public void setMulticastAddress(Boolean multicastAddress) {
    this.multicastAddress = multicastAddress;
  }


  public IPAddressSectionInetAddress anyLocalAddress(Boolean anyLocalAddress) {
    
    this.anyLocalAddress = anyLocalAddress;
    return this;
  }

   /**
   * Get anyLocalAddress
   * @return anyLocalAddress
  **/
  @javax.annotation.Nullable

  public Boolean getAnyLocalAddress() {
    return anyLocalAddress;
  }


  public void setAnyLocalAddress(Boolean anyLocalAddress) {
    this.anyLocalAddress = anyLocalAddress;
  }


  public IPAddressSectionInetAddress loopbackAddress(Boolean loopbackAddress) {
    
    this.loopbackAddress = loopbackAddress;
    return this;
  }

   /**
   * Get loopbackAddress
   * @return loopbackAddress
  **/
  @javax.annotation.Nullable

  public Boolean getLoopbackAddress() {
    return loopbackAddress;
  }


  public void setLoopbackAddress(Boolean loopbackAddress) {
    this.loopbackAddress = loopbackAddress;
  }


  public IPAddressSectionInetAddress siteLocalAddress(Boolean siteLocalAddress) {
    
    this.siteLocalAddress = siteLocalAddress;
    return this;
  }

   /**
   * Get siteLocalAddress
   * @return siteLocalAddress
  **/
  @javax.annotation.Nullable

  public Boolean getSiteLocalAddress() {
    return siteLocalAddress;
  }


  public void setSiteLocalAddress(Boolean siteLocalAddress) {
    this.siteLocalAddress = siteLocalAddress;
  }


  public IPAddressSectionInetAddress mcglobal(Boolean mcglobal) {
    
    this.mcglobal = mcglobal;
    return this;
  }

   /**
   * Get mcglobal
   * @return mcglobal
  **/
  @javax.annotation.Nullable

  public Boolean getMcglobal() {
    return mcglobal;
  }


  public void setMcglobal(Boolean mcglobal) {
    this.mcglobal = mcglobal;
  }


  public IPAddressSectionInetAddress mcnodeLocal(Boolean mcnodeLocal) {
    
    this.mcnodeLocal = mcnodeLocal;
    return this;
  }

   /**
   * Get mcnodeLocal
   * @return mcnodeLocal
  **/
  @javax.annotation.Nullable

  public Boolean getMcnodeLocal() {
    return mcnodeLocal;
  }


  public void setMcnodeLocal(Boolean mcnodeLocal) {
    this.mcnodeLocal = mcnodeLocal;
  }


  public IPAddressSectionInetAddress mclinkLocal(Boolean mclinkLocal) {
    
    this.mclinkLocal = mclinkLocal;
    return this;
  }

   /**
   * Get mclinkLocal
   * @return mclinkLocal
  **/
  @javax.annotation.Nullable

  public Boolean getMclinkLocal() {
    return mclinkLocal;
  }


  public void setMclinkLocal(Boolean mclinkLocal) {
    this.mclinkLocal = mclinkLocal;
  }


  public IPAddressSectionInetAddress mcsiteLocal(Boolean mcsiteLocal) {
    
    this.mcsiteLocal = mcsiteLocal;
    return this;
  }

   /**
   * Get mcsiteLocal
   * @return mcsiteLocal
  **/
  @javax.annotation.Nullable

  public Boolean getMcsiteLocal() {
    return mcsiteLocal;
  }


  public void setMcsiteLocal(Boolean mcsiteLocal) {
    this.mcsiteLocal = mcsiteLocal;
  }


  public IPAddressSectionInetAddress mcorgLocal(Boolean mcorgLocal) {
    
    this.mcorgLocal = mcorgLocal;
    return this;
  }

   /**
   * Get mcorgLocal
   * @return mcorgLocal
  **/
  @javax.annotation.Nullable

  public Boolean getMcorgLocal() {
    return mcorgLocal;
  }


  public void setMcorgLocal(Boolean mcorgLocal) {
    this.mcorgLocal = mcorgLocal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAddressSectionInetAddress ipAddressSectionInetAddress = (IPAddressSectionInetAddress) o;
    return Objects.equals(this.canonicalHostName, ipAddressSectionInetAddress.canonicalHostName) &&
        Objects.equals(this.hostAddress, ipAddressSectionInetAddress.hostAddress) &&
        Objects.equals(this.address, ipAddressSectionInetAddress.address) &&
        Objects.equals(this.hostName, ipAddressSectionInetAddress.hostName) &&
        Objects.equals(this.linkLocalAddress, ipAddressSectionInetAddress.linkLocalAddress) &&
        Objects.equals(this.multicastAddress, ipAddressSectionInetAddress.multicastAddress) &&
        Objects.equals(this.anyLocalAddress, ipAddressSectionInetAddress.anyLocalAddress) &&
        Objects.equals(this.loopbackAddress, ipAddressSectionInetAddress.loopbackAddress) &&
        Objects.equals(this.siteLocalAddress, ipAddressSectionInetAddress.siteLocalAddress) &&
        Objects.equals(this.mcglobal, ipAddressSectionInetAddress.mcglobal) &&
        Objects.equals(this.mcnodeLocal, ipAddressSectionInetAddress.mcnodeLocal) &&
        Objects.equals(this.mclinkLocal, ipAddressSectionInetAddress.mclinkLocal) &&
        Objects.equals(this.mcsiteLocal, ipAddressSectionInetAddress.mcsiteLocal) &&
        Objects.equals(this.mcorgLocal, ipAddressSectionInetAddress.mcorgLocal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canonicalHostName, hostAddress, address, hostName, linkLocalAddress, multicastAddress, anyLocalAddress, loopbackAddress, siteLocalAddress, mcglobal, mcnodeLocal, mclinkLocal, mcsiteLocal, mcorgLocal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAddressSectionInetAddress {\n");
    sb.append("    canonicalHostName: ").append(toIndentedString(canonicalHostName)).append("\n");
    sb.append("    hostAddress: ").append(toIndentedString(hostAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    linkLocalAddress: ").append(toIndentedString(linkLocalAddress)).append("\n");
    sb.append("    multicastAddress: ").append(toIndentedString(multicastAddress)).append("\n");
    sb.append("    anyLocalAddress: ").append(toIndentedString(anyLocalAddress)).append("\n");
    sb.append("    loopbackAddress: ").append(toIndentedString(loopbackAddress)).append("\n");
    sb.append("    siteLocalAddress: ").append(toIndentedString(siteLocalAddress)).append("\n");
    sb.append("    mcglobal: ").append(toIndentedString(mcglobal)).append("\n");
    sb.append("    mcnodeLocal: ").append(toIndentedString(mcnodeLocal)).append("\n");
    sb.append("    mclinkLocal: ").append(toIndentedString(mclinkLocal)).append("\n");
    sb.append("    mcsiteLocal: ").append(toIndentedString(mcsiteLocal)).append("\n");
    sb.append("    mcorgLocal: ").append(toIndentedString(mcorgLocal)).append("\n");
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
    openapiFields.add("canonicalHostName");
    openapiFields.add("hostAddress");
    openapiFields.add("address");
    openapiFields.add("hostName");
    openapiFields.add("linkLocalAddress");
    openapiFields.add("multicastAddress");
    openapiFields.add("anyLocalAddress");
    openapiFields.add("loopbackAddress");
    openapiFields.add("siteLocalAddress");
    openapiFields.add("mcglobal");
    openapiFields.add("mcnodeLocal");
    openapiFields.add("mclinkLocal");
    openapiFields.add("mcsiteLocal");
    openapiFields.add("mcorgLocal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IPAddressSectionInetAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IPAddressSectionInetAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IPAddressSectionInetAddress is not found in the empty JSON string", IPAddressSectionInetAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IPAddressSectionInetAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IPAddressSectionInetAddress` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("canonicalHostName") != null && !jsonObj.get("canonicalHostName").isJsonNull()) && !jsonObj.get("canonicalHostName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `canonicalHostName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("canonicalHostName").toString()));
      }
      if ((jsonObj.get("hostAddress") != null && !jsonObj.get("hostAddress").isJsonNull()) && !jsonObj.get("hostAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostAddress").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be an array in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if ((jsonObj.get("hostName") != null && !jsonObj.get("hostName").isJsonNull()) && !jsonObj.get("hostName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hostName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hostName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IPAddressSectionInetAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IPAddressSectionInetAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IPAddressSectionInetAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IPAddressSectionInetAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<IPAddressSectionInetAddress>() {
           @Override
           public void write(JsonWriter out, IPAddressSectionInetAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IPAddressSectionInetAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IPAddressSectionInetAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IPAddressSectionInetAddress
  * @throws IOException if the JSON string is invalid with respect to IPAddressSectionInetAddress
  */
  public static IPAddressSectionInetAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IPAddressSectionInetAddress.class);
  }

 /**
  * Convert an instance of IPAddressSectionInetAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

