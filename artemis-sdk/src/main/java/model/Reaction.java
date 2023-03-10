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
import java.time.OffsetDateTime;
import org.openapitools.client.model.AnswerPost;
import org.openapitools.client.model.Post;
import org.openapitools.client.model.User;

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
 * Reaction
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-19T16:35:01.729286Z[Etc/UTC]")
public class Reaction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private User user;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  public static final String SERIALIZED_NAME_EMOJI_ID = "emojiId";
  @SerializedName(SERIALIZED_NAME_EMOJI_ID)
  private String emojiId;

  public static final String SERIALIZED_NAME_POST = "post";
  @SerializedName(SERIALIZED_NAME_POST)
  private Post post;

  public static final String SERIALIZED_NAME_ANSWER_POST = "answerPost";
  @SerializedName(SERIALIZED_NAME_ANSWER_POST)
  private AnswerPost answerPost;

  public Reaction() {
  }

  public Reaction id(Long id) {
    
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


  public Reaction user(User user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable

  public User getUser() {
    return user;
  }


  public void setUser(User user) {
    this.user = user;
  }


  public Reaction creationDate(OffsetDateTime creationDate) {
    
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable

  public OffsetDateTime getCreationDate() {
    return creationDate;
  }


  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public Reaction emojiId(String emojiId) {
    
    this.emojiId = emojiId;
    return this;
  }

   /**
   * Get emojiId
   * @return emojiId
  **/
  @javax.annotation.Nullable

  public String getEmojiId() {
    return emojiId;
  }


  public void setEmojiId(String emojiId) {
    this.emojiId = emojiId;
  }


  public Reaction post(Post post) {
    
    this.post = post;
    return this;
  }

   /**
   * Get post
   * @return post
  **/
  @javax.annotation.Nullable

  public Post getPost() {
    return post;
  }


  public void setPost(Post post) {
    this.post = post;
  }


  public Reaction answerPost(AnswerPost answerPost) {
    
    this.answerPost = answerPost;
    return this;
  }

   /**
   * Get answerPost
   * @return answerPost
  **/
  @javax.annotation.Nullable

  public AnswerPost getAnswerPost() {
    return answerPost;
  }


  public void setAnswerPost(AnswerPost answerPost) {
    this.answerPost = answerPost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reaction reaction = (Reaction) o;
    return Objects.equals(this.id, reaction.id) &&
        Objects.equals(this.user, reaction.user) &&
        Objects.equals(this.creationDate, reaction.creationDate) &&
        Objects.equals(this.emojiId, reaction.emojiId) &&
        Objects.equals(this.post, reaction.post) &&
        Objects.equals(this.answerPost, reaction.answerPost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, creationDate, emojiId, post, answerPost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    emojiId: ").append(toIndentedString(emojiId)).append("\n");
    sb.append("    post: ").append(toIndentedString(post)).append("\n");
    sb.append("    answerPost: ").append(toIndentedString(answerPost)).append("\n");
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
    openapiFields.add("user");
    openapiFields.add("creationDate");
    openapiFields.add("emojiId");
    openapiFields.add("post");
    openapiFields.add("answerPost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Reaction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Reaction.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Reaction is not found in the empty JSON string", Reaction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Reaction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Reaction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        User.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
      if ((jsonObj.get("emojiId") != null && !jsonObj.get("emojiId").isJsonNull()) && !jsonObj.get("emojiId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emojiId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emojiId").toString()));
      }
      // validate the optional field `post`
      if (jsonObj.get("post") != null && !jsonObj.get("post").isJsonNull()) {
        Post.validateJsonObject(jsonObj.getAsJsonObject("post"));
      }
      // validate the optional field `answerPost`
      if (jsonObj.get("answerPost") != null && !jsonObj.get("answerPost").isJsonNull()) {
        AnswerPost.validateJsonObject(jsonObj.getAsJsonObject("answerPost"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Reaction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Reaction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Reaction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Reaction.class));

       return (TypeAdapter<T>) new TypeAdapter<Reaction>() {
           @Override
           public void write(JsonWriter out, Reaction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Reaction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Reaction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Reaction
  * @throws IOException if the JSON string is invalid with respect to Reaction
  */
  public static Reaction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Reaction.class);
  }

 /**
  * Convert an instance of Reaction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

