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
 * NotificationLinks
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NotificationLinks {
  public static final String SERIALIZED_NAME_TIME_OFF_REQUEST_ID = "time_off_request_id";
  @SerializedName(SERIALIZED_NAME_TIME_OFF_REQUEST_ID)
  private String timeOffRequestId;

  public static final String SERIALIZED_NAME_PROFILE_ID = "profile_id";
  @SerializedName(SERIALIZED_NAME_PROFILE_ID)
  private String profileId;

  public static final String SERIALIZED_NAME_REQUESTER_ID = "requester_id";
  @SerializedName(SERIALIZED_NAME_REQUESTER_ID)
  private String requesterId;

  public static final String SERIALIZED_NAME_RESPONDER_ID = "responder_id";
  @SerializedName(SERIALIZED_NAME_RESPONDER_ID)
  private String responderId;

  public NotificationLinks() {
  }

  public NotificationLinks timeOffRequestId(String timeOffRequestId) {
    
    
    
    
    this.timeOffRequestId = timeOffRequestId;
    return this;
  }

   /**
   * unique identifier of the time off request mentioned in the notification
   * @return timeOffRequestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unique identifier of the time off request mentioned in the notification")

  public String getTimeOffRequestId() {
    return timeOffRequestId;
  }


  public void setTimeOffRequestId(String timeOffRequestId) {
    
    
    
    this.timeOffRequestId = timeOffRequestId;
  }


  public NotificationLinks profileId(String profileId) {
    
    
    
    
    this.profileId = profileId;
    return this;
  }

   /**
   * id of the profile associated with the time off request mentioned in the notification
   * @return profileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "id of the profile associated with the time off request mentioned in the notification")

  public String getProfileId() {
    return profileId;
  }


  public void setProfileId(String profileId) {
    
    
    
    this.profileId = profileId;
  }


  public NotificationLinks requesterId(String requesterId) {
    
    
    
    
    this.requesterId = requesterId;
    return this;
  }

   /**
   * id of the profile that requested the time off mentioned in the notification; requester_id does not have to be the same as profile_id if time off was requested on someone else&#39;s behalf
   * @return requesterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "id of the profile that requested the time off mentioned in the notification; requester_id does not have to be the same as profile_id if time off was requested on someone else's behalf")

  public String getRequesterId() {
    return requesterId;
  }


  public void setRequesterId(String requesterId) {
    
    
    
    this.requesterId = requesterId;
  }


  public NotificationLinks responderId(String responderId) {
    
    
    
    
    this.responderId = responderId;
    return this;
  }

   /**
   * only present if the request has been responded to; id of the profile that responded to the time off request mentioned in the notification
   * @return responderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "only present if the request has been responded to; id of the profile that responded to the time off request mentioned in the notification")

  public String getResponderId() {
    return responderId;
  }


  public void setResponderId(String responderId) {
    
    
    
    this.responderId = responderId;
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
   * @return the NotificationLinks instance itself
   */
  public NotificationLinks putAdditionalProperty(String key, Object value) {
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
    NotificationLinks notificationLinks = (NotificationLinks) o;
    return Objects.equals(this.timeOffRequestId, notificationLinks.timeOffRequestId) &&
        Objects.equals(this.profileId, notificationLinks.profileId) &&
        Objects.equals(this.requesterId, notificationLinks.requesterId) &&
        Objects.equals(this.responderId, notificationLinks.responderId)&&
        Objects.equals(this.additionalProperties, notificationLinks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffRequestId, profileId, requesterId, responderId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationLinks {\n");
    sb.append("    timeOffRequestId: ").append(toIndentedString(timeOffRequestId)).append("\n");
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    requesterId: ").append(toIndentedString(requesterId)).append("\n");
    sb.append("    responderId: ").append(toIndentedString(responderId)).append("\n");
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
    openapiFields.add("time_off_request_id");
    openapiFields.add("profile_id");
    openapiFields.add("requester_id");
    openapiFields.add("responder_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NotificationLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NotificationLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationLinks is not found in the empty JSON string", NotificationLinks.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("time_off_request_id") != null && !jsonObj.get("time_off_request_id").isJsonNull()) && !jsonObj.get("time_off_request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `time_off_request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("time_off_request_id").toString()));
      }
      if ((jsonObj.get("profile_id") != null && !jsonObj.get("profile_id").isJsonNull()) && !jsonObj.get("profile_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profile_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profile_id").toString()));
      }
      if ((jsonObj.get("requester_id") != null && !jsonObj.get("requester_id").isJsonNull()) && !jsonObj.get("requester_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requester_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requester_id").toString()));
      }
      if ((jsonObj.get("responder_id") != null && !jsonObj.get("responder_id").isJsonNull()) && !jsonObj.get("responder_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `responder_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("responder_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationLinks>() {
           @Override
           public void write(JsonWriter out, NotificationLinks value) throws IOException {
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
           public NotificationLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NotificationLinks instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NotificationLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationLinks
  * @throws IOException if the JSON string is invalid with respect to NotificationLinks
  */
  public static NotificationLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationLinks.class);
  }

 /**
  * Convert an instance of NotificationLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

