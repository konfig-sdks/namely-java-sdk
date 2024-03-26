/*
 * Namely API
 * Move your app forward with the Namely API Move your app forward with the Namely API
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Link;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * GetEventsResponseLinks
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetEventsResponseLinks {
  public static final String SERIALIZED_NAME_EVENTS_PROFILE = "events.profile";
  @SerializedName(SERIALIZED_NAME_EVENTS_PROFILE)
  private Link eventsProfile;

  public static final String SERIALIZED_NAME_EVENTS_COMMENTS = "events.comments";
  @SerializedName(SERIALIZED_NAME_EVENTS_COMMENTS)
  private Link eventsComments;

  public static final String SERIALIZED_NAME_EVENTS_FILE = "events.file";
  @SerializedName(SERIALIZED_NAME_EVENTS_FILE)
  private Link eventsFile;

  public static final String SERIALIZED_NAME_COMMENTS_PROFILE = "comments.profile";
  @SerializedName(SERIALIZED_NAME_COMMENTS_PROFILE)
  private Link commentsProfile;

  public static final String SERIALIZED_NAME_PROFILE_IMAGE = "profile.image";
  @SerializedName(SERIALIZED_NAME_PROFILE_IMAGE)
  private Link profileImage;

  public GetEventsResponseLinks() {
  }

  public GetEventsResponseLinks eventsProfile(Link eventsProfile) {
    
    
    
    
    this.eventsProfile = eventsProfile;
    return this;
  }

   /**
   * Get eventsProfile
   * @return eventsProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getEventsProfile() {
    return eventsProfile;
  }


  public void setEventsProfile(Link eventsProfile) {
    
    
    
    this.eventsProfile = eventsProfile;
  }


  public GetEventsResponseLinks eventsComments(Link eventsComments) {
    
    
    
    
    this.eventsComments = eventsComments;
    return this;
  }

   /**
   * Get eventsComments
   * @return eventsComments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getEventsComments() {
    return eventsComments;
  }


  public void setEventsComments(Link eventsComments) {
    
    
    
    this.eventsComments = eventsComments;
  }


  public GetEventsResponseLinks eventsFile(Link eventsFile) {
    
    
    
    
    this.eventsFile = eventsFile;
    return this;
  }

   /**
   * Get eventsFile
   * @return eventsFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getEventsFile() {
    return eventsFile;
  }


  public void setEventsFile(Link eventsFile) {
    
    
    
    this.eventsFile = eventsFile;
  }


  public GetEventsResponseLinks commentsProfile(Link commentsProfile) {
    
    
    
    
    this.commentsProfile = commentsProfile;
    return this;
  }

   /**
   * Get commentsProfile
   * @return commentsProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getCommentsProfile() {
    return commentsProfile;
  }


  public void setCommentsProfile(Link commentsProfile) {
    
    
    
    this.commentsProfile = commentsProfile;
  }


  public GetEventsResponseLinks profileImage(Link profileImage) {
    
    
    
    
    this.profileImage = profileImage;
    return this;
  }

   /**
   * Get profileImage
   * @return profileImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Link getProfileImage() {
    return profileImage;
  }


  public void setProfileImage(Link profileImage) {
    
    
    
    this.profileImage = profileImage;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the GetEventsResponseLinks instance itself
   */
  public GetEventsResponseLinks putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetEventsResponseLinks getEventsResponseLinks = (GetEventsResponseLinks) o;
    return Objects.equals(this.eventsProfile, getEventsResponseLinks.eventsProfile) &&
        Objects.equals(this.eventsComments, getEventsResponseLinks.eventsComments) &&
        Objects.equals(this.eventsFile, getEventsResponseLinks.eventsFile) &&
        Objects.equals(this.commentsProfile, getEventsResponseLinks.commentsProfile) &&
        Objects.equals(this.profileImage, getEventsResponseLinks.profileImage)&&
        Objects.equals(this.additionalProperties, getEventsResponseLinks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventsProfile, eventsComments, eventsFile, commentsProfile, profileImage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetEventsResponseLinks {\n");
    sb.append("    eventsProfile: ").append(toIndentedString(eventsProfile)).append("\n");
    sb.append("    eventsComments: ").append(toIndentedString(eventsComments)).append("\n");
    sb.append("    eventsFile: ").append(toIndentedString(eventsFile)).append("\n");
    sb.append("    commentsProfile: ").append(toIndentedString(commentsProfile)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("events.profile");
    openapiFields.add("events.comments");
    openapiFields.add("events.file");
    openapiFields.add("comments.profile");
    openapiFields.add("profile.image");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetEventsResponseLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetEventsResponseLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetEventsResponseLinks is not found in the empty JSON string", GetEventsResponseLinks.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `events.profile`
      if (jsonObj.get("events.profile") != null && !jsonObj.get("events.profile").isJsonNull()) {
        Link.validateJsonObject(jsonObj.getAsJsonObject("events.profile"));
      }
      // validate the optional field `events.comments`
      if (jsonObj.get("events.comments") != null && !jsonObj.get("events.comments").isJsonNull()) {
        Link.validateJsonObject(jsonObj.getAsJsonObject("events.comments"));
      }
      // validate the optional field `events.file`
      if (jsonObj.get("events.file") != null && !jsonObj.get("events.file").isJsonNull()) {
        Link.validateJsonObject(jsonObj.getAsJsonObject("events.file"));
      }
      // validate the optional field `comments.profile`
      if (jsonObj.get("comments.profile") != null && !jsonObj.get("comments.profile").isJsonNull()) {
        Link.validateJsonObject(jsonObj.getAsJsonObject("comments.profile"));
      }
      // validate the optional field `profile.image`
      if (jsonObj.get("profile.image") != null && !jsonObj.get("profile.image").isJsonNull()) {
        Link.validateJsonObject(jsonObj.getAsJsonObject("profile.image"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetEventsResponseLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetEventsResponseLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetEventsResponseLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetEventsResponseLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<GetEventsResponseLinks>() {
           @Override
           public void write(JsonWriter out, GetEventsResponseLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public GetEventsResponseLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetEventsResponseLinks instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetEventsResponseLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetEventsResponseLinks
  * @throws IOException if the JSON string is invalid with respect to GetEventsResponseLinks
  */
  public static GetEventsResponseLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetEventsResponseLinks.class);
  }

 /**
  * Convert an instance of GetEventsResponseLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

