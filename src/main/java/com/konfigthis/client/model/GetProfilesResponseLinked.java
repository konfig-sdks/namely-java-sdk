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
import com.konfigthis.client.model.Group;
import com.konfigthis.client.model.JobTitle;
import com.konfigthis.client.model.ModelFile;
import com.konfigthis.client.model.Team;
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
 * GetProfilesResponseLinked
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class GetProfilesResponseLinked {
  public static final String SERIALIZED_NAME_JOB_TITLES = "job_titles";
  @SerializedName(SERIALIZED_NAME_JOB_TITLES)
  private List<JobTitle> jobTitles = null;

  public static final String SERIALIZED_NAME_FILES = "files";
  @SerializedName(SERIALIZED_NAME_FILES)
  private List<ModelFile> files = null;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<Group> groups = null;

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private List<Team> teams = null;

  public GetProfilesResponseLinked() {
  }

  public GetProfilesResponseLinked jobTitles(List<JobTitle> jobTitles) {
    
    
    
    
    this.jobTitles = jobTitles;
    return this;
  }

  public GetProfilesResponseLinked addJobTitlesItem(JobTitle jobTitlesItem) {
    if (this.jobTitles == null) {
      this.jobTitles = new ArrayList<>();
    }
    this.jobTitles.add(jobTitlesItem);
    return this;
  }

   /**
   * Get jobTitles
   * @return jobTitles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<JobTitle> getJobTitles() {
    return jobTitles;
  }


  public void setJobTitles(List<JobTitle> jobTitles) {
    
    
    
    this.jobTitles = jobTitles;
  }


  public GetProfilesResponseLinked files(List<ModelFile> files) {
    
    
    
    
    this.files = files;
    return this;
  }

  public GetProfilesResponseLinked addFilesItem(ModelFile filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ModelFile> getFiles() {
    return files;
  }


  public void setFiles(List<ModelFile> files) {
    
    
    
    this.files = files;
  }


  public GetProfilesResponseLinked groups(List<Group> groups) {
    
    
    
    
    this.groups = groups;
    return this;
  }

  public GetProfilesResponseLinked addGroupsItem(Group groupsItem) {
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

  public List<Group> getGroups() {
    return groups;
  }


  public void setGroups(List<Group> groups) {
    
    
    
    this.groups = groups;
  }


  public GetProfilesResponseLinked teams(List<Team> teams) {
    
    
    
    
    this.teams = teams;
    return this;
  }

  public GetProfilesResponseLinked addTeamsItem(Team teamsItem) {
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

  public List<Team> getTeams() {
    return teams;
  }


  public void setTeams(List<Team> teams) {
    
    
    
    this.teams = teams;
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
   * @return the GetProfilesResponseLinked instance itself
   */
  public GetProfilesResponseLinked putAdditionalProperty(String key, Object value) {
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
    GetProfilesResponseLinked getProfilesResponseLinked = (GetProfilesResponseLinked) o;
    return Objects.equals(this.jobTitles, getProfilesResponseLinked.jobTitles) &&
        Objects.equals(this.files, getProfilesResponseLinked.files) &&
        Objects.equals(this.groups, getProfilesResponseLinked.groups) &&
        Objects.equals(this.teams, getProfilesResponseLinked.teams)&&
        Objects.equals(this.additionalProperties, getProfilesResponseLinked.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobTitles, files, groups, teams, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProfilesResponseLinked {\n");
    sb.append("    jobTitles: ").append(toIndentedString(jobTitles)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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
    openapiFields.add("job_titles");
    openapiFields.add("files");
    openapiFields.add("groups");
    openapiFields.add("teams");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetProfilesResponseLinked
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetProfilesResponseLinked.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetProfilesResponseLinked is not found in the empty JSON string", GetProfilesResponseLinked.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("job_titles") != null && !jsonObj.get("job_titles").isJsonNull()) {
        JsonArray jsonArrayjobTitles = jsonObj.getAsJsonArray("job_titles");
        if (jsonArrayjobTitles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("job_titles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `job_titles` to be an array in the JSON string but got `%s`", jsonObj.get("job_titles").toString()));
          }

          // validate the optional field `job_titles` (array)
          for (int i = 0; i < jsonArrayjobTitles.size(); i++) {
            JobTitle.validateJsonObject(jsonArrayjobTitles.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("files") != null && !jsonObj.get("files").isJsonNull()) {
        JsonArray jsonArrayfiles = jsonObj.getAsJsonArray("files");
        if (jsonArrayfiles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("files").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `files` to be an array in the JSON string but got `%s`", jsonObj.get("files").toString()));
          }

          // validate the optional field `files` (array)
          for (int i = 0; i < jsonArrayfiles.size(); i++) {
            ModelFile.validateJsonObject(jsonArrayfiles.get(i).getAsJsonObject());
          };
        }
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
            Group.validateJsonObject(jsonArraygroups.get(i).getAsJsonObject());
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
            Team.validateJsonObject(jsonArrayteams.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetProfilesResponseLinked.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetProfilesResponseLinked' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetProfilesResponseLinked> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetProfilesResponseLinked.class));

       return (TypeAdapter<T>) new TypeAdapter<GetProfilesResponseLinked>() {
           @Override
           public void write(JsonWriter out, GetProfilesResponseLinked value) throws IOException {
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
           public GetProfilesResponseLinked read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             GetProfilesResponseLinked instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetProfilesResponseLinked given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetProfilesResponseLinked
  * @throws IOException if the JSON string is invalid with respect to GetProfilesResponseLinked
  */
  public static GetProfilesResponseLinked fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetProfilesResponseLinked.class);
  }

 /**
  * Convert an instance of GetProfilesResponseLinked to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

