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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * MentionNotificationLinks
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MentionNotificationLinks {
  public static final String SERIALIZED_NAME_PROFILE_ID = "profile_id";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public static final String SERIALIZED_NAME_COMMENT_ID = "comment_id";
  @SerializedName(SERIALIZED_NAME_COMMENT_ID)
  private String commentId;

  public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private String eventId;

  public static final String SERIALIZED_NAME_TEAM_IDS = "team_ids";
  @SerializedName(SERIALIZED_NAME_TEAM_IDS)
  private List<String> teamIds = null;

  public MentionNotificationLinks() {
  }

  public MentionNotificationLinks profileId(String profileId) {
    
    
    
    
    this.profileId = profileId;
    return this;
  }

   /**
   * id of the profile that created the post or comment
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "id of the profile that created the post or comment")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    
    
    
    this.profileId = profileId;
  }


  public MentionNotificationLinks commentId(String commentId) {
    
    
    
    
    this.commentId = commentId;
    return this;
  }

   /**
   * only present if the notification is in re: a comment; id of the comment you were mentioned in (can&#39;t be appreciated in a comment)
   * @return commentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "only present if the notification is in re: a comment; id of the comment you were mentioned in (can't be appreciated in a comment)")

  public String getCommentId() {
    return commentId;
  }


  public void setCommentId(String commentId) {
    
    
    
    this.commentId = commentId;
  }


  public MentionNotificationLinks eventId(String eventId) {
    
    
    
    
    this.eventId = eventId;
    return this;
  }

   /**
   * id of the event you were mentioned/appreciated in or the event that the comment you were mentioned in is associated with
   * @return eventId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "id of the event you were mentioned/appreciated in or the event that the comment you were mentioned in is associated with")

  public String getEventId() {
    return eventId;
  }


  public void setEventId(String eventId) {
    
    
    
    this.eventId = eventId;
  }


  public MentionNotificationLinks teamIds(List<String> teamIds) {
    
    
    
    
    this.teamIds = teamIds;
    return this;
  }

  public MentionNotificationLinks addTeamIdsItem(String teamIdsItem) {
    if (this.teamIds == null) {
      this.teamIds = new ArrayList<>();
    }
    this.teamIds.add(teamIdsItem);
    return this;
  }

   /**
   * only present if team was mentioned (teams can&#39;t be appreciated); id of any teams that were mentioned in the post/comment
   * @return teamIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "only present if team was mentioned (teams can't be appreciated); id of any teams that were mentioned in the post/comment")

  public List<String> getTeamIds() {
    return teamIds;
  }


  public void setTeamIds(List<String> teamIds) {
    
    
    
    this.teamIds = teamIds;
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
   * @return the MentionNotificationLinks instance itself
   */
  public MentionNotificationLinks putAdditionalProperty(String key, Object value) {
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
    MentionNotificationLinks mentionNotificationLinks = (MentionNotificationLinks) o;
    return Objects.equals(this.profileId, mentionNotificationLinks.profileId) &&
        Objects.equals(this.commentId, mentionNotificationLinks.commentId) &&
        Objects.equals(this.eventId, mentionNotificationLinks.eventId) &&
        Objects.equals(this.teamIds, mentionNotificationLinks.teamIds)&&
        Objects.equals(this.additionalProperties, mentionNotificationLinks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileId, commentId, eventId, teamIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MentionNotificationLinks {\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
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
    openapiFields.add("profile_id");
    openapiFields.add("comment_id");
    openapiFields.add("event_id");
    openapiFields.add("team_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MentionNotificationLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MentionNotificationLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MentionNotificationLinks is not found in the empty JSON string", MentionNotificationLinks.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("profile_id") != null && !jsonObj.get("profile_id").isJsonNull()) && !jsonObj.get("profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_id").toString()));
      }
      if ((jsonObj.get("comment_id") != null && !jsonObj.get("comment_id").isJsonNull()) && !jsonObj.get("comment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment_id").toString()));
      }
      if ((jsonObj.get("event_id") != null && !jsonObj.get("event_id").isJsonNull()) && !jsonObj.get("event_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `event_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("event_id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("team_ids") != null && !jsonObj.get("team_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `team_ids` to be an array in the JSON string but got `%s`", jsonObj.get("team_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MentionNotificationLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MentionNotificationLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MentionNotificationLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MentionNotificationLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<MentionNotificationLinks>() {
           @Override
           public void write(JsonWriter out, MentionNotificationLinks value) throws IOException {
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
           public MentionNotificationLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MentionNotificationLinks instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MentionNotificationLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MentionNotificationLinks
  * @throws IOException if the JSON string is invalid with respect to MentionNotificationLinks
  */
  public static MentionNotificationLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MentionNotificationLinks.class);
  }

 /**
  * Convert an instance of MentionNotificationLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

