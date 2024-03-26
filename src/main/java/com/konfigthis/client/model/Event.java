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
import com.konfigthis.client.model.EventLinks;
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
 * Event
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Event {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TIME = "time";
  @SerializedName(SERIALIZED_NAME_TIME)
  private Integer time;

  public static final String SERIALIZED_NAME_UFC_OFFSET = "ufc_offset";
  @SerializedName(SERIALIZED_NAME_UFC_OFFSET)
  private Integer ufcOffset;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_HTML_CONTENT = "html_content";
  @SerializedName(SERIALIZED_NAME_HTML_CONTENT)
  private String htmlContent;

  public static final String SERIALIZED_NAME_YEARS_AT_COMPANY = "years_at_company";
  @SerializedName(SERIALIZED_NAME_YEARS_AT_COMPANY)
  private Integer yearsAtCompany;

  public static final String SERIALIZED_NAME_USE_COMMENTS = "use_comments";
  @SerializedName(SERIALIZED_NAME_USE_COMMENTS)
  private Boolean useComments;

  public static final String SERIALIZED_NAME_CAN_COMMENT = "can_comment";
  @SerializedName(SERIALIZED_NAME_CAN_COMMENT)
  private Boolean canComment;

  public static final String SERIALIZED_NAME_CAN_DESTROY = "can_destroy";
  @SerializedName(SERIALIZED_NAME_CAN_DESTROY)
  private Boolean canDestroy;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private EventLinks links;

  public static final String SERIALIZED_NAME_CAN_LIKE = "can_like";
  @SerializedName(SERIALIZED_NAME_CAN_LIKE)
  private Boolean canLike;

  public static final String SERIALIZED_NAME_LIKES_COUNT = "likes_count";
  @SerializedName(SERIALIZED_NAME_LIKES_COUNT)
  private Integer likesCount;

  public static final String SERIALIZED_NAME_LIKED_BY_CURRENT_PROFILE = "liked_by_current_profile";
  @SerializedName(SERIALIZED_NAME_LIKED_BY_CURRENT_PROFILE)
  private Boolean likedByCurrentProfile;

  public Event() {
  }

  public Event id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * unique identifier of the event
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unique identifier of the event")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Event href(String href) {
    
    
    
    
    this.href = href;
    return this;
  }

   /**
   * a link to the event on the web
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "a link to the event on the web")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    
    
    
    this.href = href;
  }


  public Event type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * the type of event: &lt;code&gt;announcement&lt;/code&gt; (posted by a profile) or &lt;code&gt;birthday&lt;/code&gt;, &lt;code&gt;anniversary&lt;/code&gt;, &lt;code&gt;recent_arrival&lt;/code&gt; (auto-generated)
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the type of event: <code>announcement</code> (posted by a profile) or <code>birthday</code>, <code>anniversary</code>, <code>recent_arrival</code> (auto-generated)")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public Event time(Integer time) {
    
    
    
    
    this.time = time;
    return this;
  }

   /**
   * epoch time that the event was created/generated
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "epoch time that the event was created/generated")

  public Integer getTime() {
    return time;
  }


  public void setTime(Integer time) {
    
    
    
    this.time = time;
  }


  public Event ufcOffset(Integer ufcOffset) {
    
    
    
    
    this.ufcOffset = ufcOffset;
    return this;
  }

   /**
   * the hour difference between UTC and the main office of the company
   * @return ufcOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the hour difference between UTC and the main office of the company")

  public Integer getUfcOffset() {
    return ufcOffset;
  }


  public void setUfcOffset(Integer ufcOffset) {
    
    
    
    this.ufcOffset = ufcOffset;
  }


  public Event content(String content) {
    
    
    
    
    this.content = content;
    return this;
  }

   /**
   * content of the post, displayed in markdown; null for anything but type: &lt;code&gt;announcement&lt;/code&gt;
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "content of the post, displayed in markdown; null for anything but type: <code>announcement</code>")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    
    
    
    this.content = content;
  }


  public Event htmlContent(String htmlContent) {
    
    
    
    
    this.htmlContent = htmlContent;
    return this;
  }

   /**
   * content of the post, displayed in HTML; null for anything but type: &lt;code&gt;announcement&lt;/code&gt;
   * @return htmlContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "content of the post, displayed in HTML; null for anything but type: <code>announcement</code>")

  public String getHtmlContent() {
    return htmlContent;
  }


  public void setHtmlContent(String htmlContent) {
    
    
    
    this.htmlContent = htmlContent;
  }


  public Event yearsAtCompany(Integer yearsAtCompany) {
    
    
    
    
    this.yearsAtCompany = yearsAtCompany;
    return this;
  }

   /**
   * number of years related profile has been at the company; null for anything but: &lt;code&gt;anniversary&lt;/code&gt;
   * @return yearsAtCompany
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "number of years related profile has been at the company; null for anything but: <code>anniversary</code>")

  public Integer getYearsAtCompany() {
    return yearsAtCompany;
  }


  public void setYearsAtCompany(Integer yearsAtCompany) {
    
    
    
    this.yearsAtCompany = yearsAtCompany;
  }


  public Event useComments(Boolean useComments) {
    
    
    
    
    this.useComments = useComments;
    return this;
  }

   /**
   * &lt;code&gt;true&lt;/code&gt; if the company has commenting enabled on the home feed; same as in &lt;code&gt;meta&lt;/code&gt;
   * @return useComments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<code>true</code> if the company has commenting enabled on the home feed; same as in <code>meta</code>")

  public Boolean getUseComments() {
    return useComments;
  }


  public void setUseComments(Boolean useComments) {
    
    
    
    this.useComments = useComments;
  }


  public Event canComment(Boolean canComment) {
    
    
    
    
    this.canComment = canComment;
    return this;
  }

   /**
   * &lt;code&gt;true&lt;/code&gt; if the token bearer has a role with permission to comment on events on the home feed (will be same value on all events)
   * @return canComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<code>true</code> if the token bearer has a role with permission to comment on events on the home feed (will be same value on all events)")

  public Boolean getCanComment() {
    return canComment;
  }


  public void setCanComment(Boolean canComment) {
    
    
    
    this.canComment = canComment;
  }


  public Event canDestroy(Boolean canDestroy) {
    
    
    
    
    this.canDestroy = canDestroy;
    return this;
  }

   /**
   * &lt;code&gt;true&lt;/code&gt; if the token bearer has a role with permission to delete the event; will always be &lt;code&gt;true&lt;/code&gt; for one&#39;s own announcement
   * @return canDestroy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<code>true</code> if the token bearer has a role with permission to delete the event; will always be <code>true</code> for one's own announcement")

  public Boolean getCanDestroy() {
    return canDestroy;
  }


  public void setCanDestroy(Boolean canDestroy) {
    
    
    
    this.canDestroy = canDestroy;
  }


  public Event links(EventLinks links) {
    
    
    
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventLinks getLinks() {
    return links;
  }


  public void setLinks(EventLinks links) {
    
    
    
    this.links = links;
  }


  public Event canLike(Boolean canLike) {
    
    
    
    
    this.canLike = canLike;
    return this;
  }

   /**
   * &lt;code&gt;true&lt;/code&gt; if the token bearer has a role with permission to like events on the home feed (will be same value on all events)
   * @return canLike
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<code>true</code> if the token bearer has a role with permission to like events on the home feed (will be same value on all events)")

  public Boolean getCanLike() {
    return canLike;
  }


  public void setCanLike(Boolean canLike) {
    
    
    
    this.canLike = canLike;
  }


  public Event likesCount(Integer likesCount) {
    
    
    
    
    this.likesCount = likesCount;
    return this;
  }

   /**
   * total number of likes on event
   * @return likesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "total number of likes on event")

  public Integer getLikesCount() {
    return likesCount;
  }


  public void setLikesCount(Integer likesCount) {
    
    
    
    this.likesCount = likesCount;
  }


  public Event likedByCurrentProfile(Boolean likedByCurrentProfile) {
    
    
    
    
    this.likedByCurrentProfile = likedByCurrentProfile;
    return this;
  }

   /**
   * &lt;code&gt;true&lt;/code&gt; if the token bearer has liked this event
   * @return likedByCurrentProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<code>true</code> if the token bearer has liked this event")

  public Boolean getLikedByCurrentProfile() {
    return likedByCurrentProfile;
  }


  public void setLikedByCurrentProfile(Boolean likedByCurrentProfile) {
    
    
    
    this.likedByCurrentProfile = likedByCurrentProfile;
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
   * @return the Event instance itself
   */
  public Event putAdditionalProperty(String key, Object value) {
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
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.href, event.href) &&
        Objects.equals(this.type, event.type) &&
        Objects.equals(this.time, event.time) &&
        Objects.equals(this.ufcOffset, event.ufcOffset) &&
        Objects.equals(this.content, event.content) &&
        Objects.equals(this.htmlContent, event.htmlContent) &&
        Objects.equals(this.yearsAtCompany, event.yearsAtCompany) &&
        Objects.equals(this.useComments, event.useComments) &&
        Objects.equals(this.canComment, event.canComment) &&
        Objects.equals(this.canDestroy, event.canDestroy) &&
        Objects.equals(this.links, event.links) &&
        Objects.equals(this.canLike, event.canLike) &&
        Objects.equals(this.likesCount, event.likesCount) &&
        Objects.equals(this.likedByCurrentProfile, event.likedByCurrentProfile)&&
        Objects.equals(this.additionalProperties, event.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, type, time, ufcOffset, content, htmlContent, yearsAtCompany, useComments, canComment, canDestroy, links, canLike, likesCount, likedByCurrentProfile, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    ufcOffset: ").append(toIndentedString(ufcOffset)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    htmlContent: ").append(toIndentedString(htmlContent)).append("\n");
    sb.append("    yearsAtCompany: ").append(toIndentedString(yearsAtCompany)).append("\n");
    sb.append("    useComments: ").append(toIndentedString(useComments)).append("\n");
    sb.append("    canComment: ").append(toIndentedString(canComment)).append("\n");
    sb.append("    canDestroy: ").append(toIndentedString(canDestroy)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    canLike: ").append(toIndentedString(canLike)).append("\n");
    sb.append("    likesCount: ").append(toIndentedString(likesCount)).append("\n");
    sb.append("    likedByCurrentProfile: ").append(toIndentedString(likedByCurrentProfile)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("href");
    openapiFields.add("type");
    openapiFields.add("time");
    openapiFields.add("ufc_offset");
    openapiFields.add("content");
    openapiFields.add("html_content");
    openapiFields.add("years_at_company");
    openapiFields.add("use_comments");
    openapiFields.add("can_comment");
    openapiFields.add("can_destroy");
    openapiFields.add("links");
    openapiFields.add("can_like");
    openapiFields.add("likes_count");
    openapiFields.add("liked_by_current_profile");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Event
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Event.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Event is not found in the empty JSON string", Event.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("href") != null && !jsonObj.get("href").isJsonNull()) && !jsonObj.get("href").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `href` to be a primitive type in the JSON string but got `%s`", jsonObj.get("href").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("html_content") != null && !jsonObj.get("html_content").isJsonNull()) && !jsonObj.get("html_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html_content").toString()));
      }
      // validate the optional field `links`
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonNull()) {
        EventLinks.validateJsonObject(jsonObj.getAsJsonObject("links"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Event.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Event' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Event> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Event.class));

       return (TypeAdapter<T>) new TypeAdapter<Event>() {
           @Override
           public void write(JsonWriter out, Event value) throws IOException {
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
           public Event read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Event instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Event given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Event
  * @throws IOException if the JSON string is invalid with respect to Event
  */
  public static Event fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Event.class);
  }

 /**
  * Convert an instance of Event to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

