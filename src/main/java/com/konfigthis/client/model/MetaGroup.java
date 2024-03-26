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
 * MetaGroup
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class MetaGroup {
  public static final String SERIALIZED_NAME_RESPONSE = "response";
  @SerializedName(SERIALIZED_NAME_RESPONSE)
  private Integer response;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count;

  public static final String SERIALIZED_NAME_PAGE_TITLE = "page_title";
  @SerializedName(SERIALIZED_NAME_PAGE_TITLE)
  private String pageTitle;

  public static final String SERIALIZED_NAME_PAGE_COPY = "page_copy";
  @SerializedName(SERIALIZED_NAME_PAGE_COPY)
  private String pageCopy;

  public MetaGroup() {
  }

  public MetaGroup response(Integer response) {
    
    
    
    
    this.response = response;
    return this;
  }

   /**
   * HTTP response
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "HTTP response")

  public Integer getResponse() {
    return response;
  }


  public void setResponse(Integer response) {
    
    
    
    this.response = response;
  }


  public MetaGroup count(Integer count) {
    
    
    
    
    this.count = count;
    return this;
  }

   /**
   * number of total groups
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of total groups")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    
    
    
    this.count = count;
  }


  public MetaGroup pageTitle(String pageTitle) {
    
    
    
    
    this.pageTitle = pageTitle;
    return this;
  }

   /**
   * Get pageTitle
   * @return pageTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPageTitle() {
    return pageTitle;
  }


  public void setPageTitle(String pageTitle) {
    
    
    
    this.pageTitle = pageTitle;
  }


  public MetaGroup pageCopy(String pageCopy) {
    
    
    
    
    this.pageCopy = pageCopy;
    return this;
  }

   /**
   * Get pageCopy
   * @return pageCopy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPageCopy() {
    return pageCopy;
  }


  public void setPageCopy(String pageCopy) {
    
    
    
    this.pageCopy = pageCopy;
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
   * @return the MetaGroup instance itself
   */
  public MetaGroup putAdditionalProperty(String key, Object value) {
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
    MetaGroup metaGroup = (MetaGroup) o;
    return Objects.equals(this.response, metaGroup.response) &&
        Objects.equals(this.count, metaGroup.count) &&
        Objects.equals(this.pageTitle, metaGroup.pageTitle) &&
        Objects.equals(this.pageCopy, metaGroup.pageCopy)&&
        Objects.equals(this.additionalProperties, metaGroup.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, count, pageTitle, pageCopy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaGroup {\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    pageTitle: ").append(toIndentedString(pageTitle)).append("\n");
    sb.append("    pageCopy: ").append(toIndentedString(pageCopy)).append("\n");
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
    openapiFields.add("response");
    openapiFields.add("count");
    openapiFields.add("page_title");
    openapiFields.add("page_copy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MetaGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!MetaGroup.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MetaGroup is not found in the empty JSON string", MetaGroup.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("page_title") != null && !jsonObj.get("page_title").isJsonNull()) && !jsonObj.get("page_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_title").toString()));
      }
      if ((jsonObj.get("page_copy") != null && !jsonObj.get("page_copy").isJsonNull()) && !jsonObj.get("page_copy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_copy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_copy").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MetaGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MetaGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MetaGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MetaGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<MetaGroup>() {
           @Override
           public void write(JsonWriter out, MetaGroup value) throws IOException {
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
           public MetaGroup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             MetaGroup instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of MetaGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MetaGroup
  * @throws IOException if the JSON string is invalid with respect to MetaGroup
  */
  public static MetaGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MetaGroup.class);
  }

 /**
  * Convert an instance of MetaGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

