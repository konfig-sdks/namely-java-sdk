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
import com.konfigthis.client.model.GroupLink;
import com.konfigthis.client.model.JobTitleLink;
import com.konfigthis.client.model.TeamLink;
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
 * ProfileLinks
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProfileLinks {
  public static final String SERIALIZED_NAME_JOB_TITLE = "job_title";
  @SerializedName(SERIALIZED_NAME_JOB_TITLE)
  private JobTitleLink jobTitle;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<GroupLink> groups = null;

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private List<TeamLink> teams = null;

  public static final String SERIALIZED_NAME_ = "";
  @SerializedName(SERIALIZED_NAME_)
  private String ;

  public ProfileLinks() {
  }

  public ProfileLinks jobTitle(JobTitleLink jobTitle) {
    
    
    
    
    this.jobTitle = jobTitle;
    return this;
  }

   /**
   * Get jobTitle
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JobTitleLink getJobTitle() {
    return jobTitle;
  }


  public void setJobTitle(JobTitleLink jobTitle) {
    
    
    
    this.jobTitle = jobTitle;
  }


  public ProfileLinks groups(List<GroupLink> groups) {
    
    
    
    
    this.groups = groups;
    return this;
  }

  public ProfileLinks addGroupsItem(GroupLink groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GroupLink> getGroups() {
    return groups;
  }


  public void setGroups(List<GroupLink> groups) {
    
    
    
    this.groups = groups;
  }


  public ProfileLinks teams(List<TeamLink> teams) {
    
    
    
    
    this.teams = teams;
    return this;
  }

  public ProfileLinks addTeamsItem(TeamLink teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TeamLink> getTeams() {
    return teams;
  }


  public void setTeams(List<TeamLink> teams) {
    
    
    
    this.teams = teams;
  }


  public ProfileLinks (String ) {
    
    
    
    
    this. = ;
    return this;
  }

   /**
   * Get 
   * @return 
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String get() {
    return ;
  }


  public void set(String ) {
    
    
    
    this. = ;
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
   * @return the ProfileLinks instance itself
   */
  public ProfileLinks putAdditionalProperty(String key, Object value) {
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
    ProfileLinks profileLinks = (ProfileLinks) o;
    return Objects.equals(this.jobTitle, profileLinks.jobTitle) &&
        Objects.equals(this.groups, profileLinks.groups) &&
        Objects.equals(this.teams, profileLinks.teams) &&
        Objects.equals(this., profileLinks.)&&
        Objects.equals(this.additionalProperties, profileLinks.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobTitle, groups, teams, , additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileLinks {\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    : ").append(toIndentedString()).append("\n");
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
    openapiFields.add("job_title");
    openapiFields.add("groups");
    openapiFields.add("teams");
    openapiFields.add("");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProfileLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProfileLinks.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProfileLinks is not found in the empty JSON string", ProfileLinks.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `job_title`
      if (jsonObj.get("job_title") != null && !jsonObj.get("job_title").isJsonNull()) {
        JobTitleLink.validateJsonObject(jsonObj.getAsJsonObject("job_title"));
      }
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            GroupLink.validateJsonObject(jsonArraygroups.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("teams") != null && !jsonObj.get("teams").isJsonNull()) {
        JsonArray jsonArrayteams = jsonObj.getAsJsonArray("teams");
        if (jsonArrayteams != null) {
          // ensure the json data is an array
          if (!jsonObj.get("teams").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `teams` to be an array in the JSON string but got `%s`", jsonObj.get("teams").toString()));
          }

          // validate the optional field `teams` (array)
          for (int i = 0; i < jsonArrayteams.size(); i++) {
            TeamLink.validateJsonObject(jsonArrayteams.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("") != null && !jsonObj.get("").isJsonNull()) && !jsonObj.get("").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `` to be a primitive type in the JSON string but got `%s`", jsonObj.get("").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProfileLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProfileLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProfileLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProfileLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<ProfileLinks>() {
           @Override
           public void write(JsonWriter out, ProfileLinks value) throws IOException {
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
           public ProfileLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProfileLinks instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProfileLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProfileLinks
  * @throws IOException if the JSON string is invalid with respect to ProfileLinks
  */
  public static ProfileLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProfileLinks.class);
  }

 /**
  * Convert an instance of ProfileLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

