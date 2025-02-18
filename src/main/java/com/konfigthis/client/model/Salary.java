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
 * Salary
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Salary {
  public static final String SERIALIZED_NAME_CURRENCY_TYPE = "currency_type";
  @SerializedName(SERIALIZED_NAME_CURRENCY_TYPE)
  private String currencyType;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date;

  public static final String SERIALIZED_NAME_GUID = "guid";
  @SerializedName(SERIALIZED_NAME_GUID)
  private String guid;

  public static final String SERIALIZED_NAME_PAY_GROUP_ID = "pay_group_id";
  @SerializedName(SERIALIZED_NAME_PAY_GROUP_ID)
  private Integer payGroupId;

  public static final String SERIALIZED_NAME_PAYROLL_JOB_ID = "payroll_job_id";
  @SerializedName(SERIALIZED_NAME_PAYROLL_JOB_ID)
  private String payrollJobId;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  public static final String SERIALIZED_NAME_YEARLY_AMOUNT = "yearly_amount";
  @SerializedName(SERIALIZED_NAME_YEARLY_AMOUNT)
  private Integer yearlyAmount;

  public static final String SERIALIZED_NAME_HOURLY = "hourly";
  @SerializedName(SERIALIZED_NAME_HOURLY)
  private Boolean hourly;

  public static final String SERIALIZED_NAME_AMOUNT_RAW = "amount_raw";
  @SerializedName(SERIALIZED_NAME_AMOUNT_RAW)
  private String amountRaw;

  public static final String SERIALIZED_NAME_PAYROLL_COMPANY = "payroll_company";
  @SerializedName(SERIALIZED_NAME_PAYROLL_COMPANY)
  private String payrollCompany;

  public static final String SERIALIZED_NAME_PAYROLL_JOB = "payroll_job";
  @SerializedName(SERIALIZED_NAME_PAYROLL_JOB)
  private String payrollJob;

  public Salary() {
  }

  public Salary currencyType(String currencyType) {
    
    
    
    
    this.currencyType = currencyType;
    return this;
  }

   /**
   * currency of the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; &lt;code&gt;null&lt;/code&gt; if never provided or no &lt;strong&gt;current&lt;/strong&gt; salary; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided
   * @return currencyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "currency of the profile's <strong>current</strong> salary; <code>null</code> if never provided or no <strong>current</strong> salary; cannot be <code>null</code> if any other salary keys provided")

  public String getCurrencyType() {
    return currencyType;
  }


  public void setCurrencyType(String currencyType) {
    
    
    
    this.currencyType = currencyType;
  }


  public Salary date(String date) {
    
    
    
    
    this.date = date;
    return this;
  }

   /**
   * start date of the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; &lt;code&gt;null&lt;/code&gt; if never provided or no &lt;strong&gt;current&lt;/strong&gt; salary; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "start date of the profile's <strong>current</strong> salary; <code>null</code> if never provided or no <strong>current</strong> salary; cannot be <code>null</code> if any other salary keys provided")

  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    
    
    
    this.date = date;
  }


  public Salary guid(String guid) {
    
    
    
    
    this.guid = guid;
    return this;
  }

   /**
   * unique identifier of the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; &lt;code&gt;null&lt;/code&gt; if never provided or no &lt;strong&gt;current&lt;/strong&gt; salary; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unique identifier of the profile's <strong>current</strong> salary; <code>null</code> if never provided or no <strong>current</strong> salary; cannot be <code>null</code> if any other salary keys provided")

  public String getGuid() {
    return guid;
  }


  public void setGuid(String guid) {
    
    
    
    this.guid = guid;
  }


  public Salary payGroupId(Integer payGroupId) {
    
    
    
    
    this.payGroupId = payGroupId;
    return this;
  }

   /**
   * unique identifier of the pay group associated with the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; &lt;code&gt;null&lt;/code&gt; if never provided or no &lt;strong&gt;current&lt;/strong&gt; salary
   * @return payGroupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unique identifier of the pay group associated with the profile's <strong>current</strong> salary; <code>null</code> if never provided or no <strong>current</strong> salary")

  public Integer getPayGroupId() {
    return payGroupId;
  }


  public void setPayGroupId(Integer payGroupId) {
    
    
    
    this.payGroupId = payGroupId;
  }


  public Salary payrollJobId(String payrollJobId) {
    
    
    
    
    this.payrollJobId = payrollJobId;
    return this;
  }

   /**
   * unique identifier of the payroll job associated with the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; &lt;code&gt;null&lt;/code&gt; if never provided or no &lt;strong&gt;current&lt;/strong&gt; salary
   * @return payrollJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "unique identifier of the payroll job associated with the profile's <strong>current</strong> salary; <code>null</code> if never provided or no <strong>current</strong> salary")

  public String getPayrollJobId() {
    return payrollJobId;
  }


  public void setPayrollJobId(String payrollJobId) {
    
    
    
    this.payrollJobId = payrollJobId;
  }


  public Salary rate(String rate) {
    
    
    
    
    this.rate = rate;
    return this;
  }

   /**
   * rate of the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; valid values include &lt;code&gt;annually&lt;/code&gt;, &lt;code&gt;weekly&lt;/code&gt;, &lt;code&gt;biweekly&lt;/code&gt;, &lt;code&gt;bimonthly&lt;/code&gt;, &lt;code&gt;semimonthly&lt;/code&gt;, &lt;code&gt;monthly&lt;/code&gt;, &lt;code&gt;quarterly&lt;/code&gt;, &lt;code&gt;semiannually&lt;/code&gt;, and &lt;code&gt;thirteen_monthly&lt;/code&gt;; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "rate of the profile's <strong>current</strong> salary; valid values include <code>annually</code>, <code>weekly</code>, <code>biweekly</code>, <code>bimonthly</code>, <code>semimonthly</code>, <code>monthly</code>, <code>quarterly</code>, <code>semiannually</code>, and <code>thirteen_monthly</code>; <code>null</code> if never provided; blank if provided then deleted; cannot be <code>null</code> if any other salary keys provided")

  public String getRate() {
    return rate;
  }


  public void setRate(String rate) {
    
    
    
    this.rate = rate;
  }


  public Salary yearlyAmount(Integer yearlyAmount) {
    
    
    
    
    this.yearlyAmount = yearlyAmount;
    return this;
  }

   /**
   * annualized amount (\&quot;amount_raw\&quot; * # of pay periods based on the \&quot;rate\&quot;) of the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; all salaries are annualized; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided
   * @return yearlyAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "annualized amount (\"amount_raw\" * # of pay periods based on the \"rate\") of the profile's <strong>current</strong> salary; all salaries are annualized; <code>null</code> if never provided; blank if provided then deleted; cannot be <code>null</code> if any other salary keys provided")

  public Integer getYearlyAmount() {
    return yearlyAmount;
  }


  public void setYearlyAmount(Integer yearlyAmount) {
    
    
    
    this.yearlyAmount = yearlyAmount;
  }


  public Salary hourly(Boolean hourly) {
    
    
    
    
    this.hourly = hourly;
    return this;
  }

   /**
   * true if the salary is hourly, and false if yearly; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided. Known as is_hourly elsewhere in the app.
   * @return hourly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "true if the salary is hourly, and false if yearly; cannot be <code>null</code> if any other salary keys provided. Known as is_hourly elsewhere in the app.")

  public Boolean getHourly() {
    return hourly;
  }


  public void setHourly(Boolean hourly) {
    
    
    
    this.hourly = hourly;
  }


  public Salary amountRaw(String amountRaw) {
    
    
    
    
    this.amountRaw = amountRaw;
    return this;
  }

   /**
   * returns the amount as it was inputted on the UI; if yearly, will be the amount per pay period; if hourly, will be the hourly rate; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided
   * @return amountRaw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "returns the amount as it was inputted on the UI; if yearly, will be the amount per pay period; if hourly, will be the hourly rate; cannot be <code>null</code> if any other salary keys provided")

  public String getAmountRaw() {
    return amountRaw;
  }


  public void setAmountRaw(String amountRaw) {
    
    
    
    this.amountRaw = amountRaw;
  }


  public Salary payrollCompany(String payrollCompany) {
    
    
    
    
    this.payrollCompany = payrollCompany;
    return this;
  }

   /**
   * The Payroll Company associated with this salary. Required if multiple Payroll Companies. \&quot;Company name\&quot; defaults to first Payroll Company.
   * @return payrollCompany
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Payroll Company associated with this salary. Required if multiple Payroll Companies. \"Company name\" defaults to first Payroll Company.")

  public String getPayrollCompany() {
    return payrollCompany;
  }


  public void setPayrollCompany(String payrollCompany) {
    
    
    
    this.payrollCompany = payrollCompany;
  }


  public Salary payrollJob(String payrollJob) {
    
    
    
    
    this.payrollJob = payrollJob;
    return this;
  }

   /**
   * Name of the Payroll Job for this Salary. Required if multiple Payroll Companies. Value of \&quot;Job name\&quot; will take first Payroll Job from specified Payroll Company.
   * @return payrollJob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Payroll Job for this Salary. Required if multiple Payroll Companies. Value of \"Job name\" will take first Payroll Job from specified Payroll Company.")

  public String getPayrollJob() {
    return payrollJob;
  }


  public void setPayrollJob(String payrollJob) {
    
    
    
    this.payrollJob = payrollJob;
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
   * @return the Salary instance itself
   */
  public Salary putAdditionalProperty(String key, Object value) {
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
    Salary salary = (Salary) o;
    return Objects.equals(this.currencyType, salary.currencyType) &&
        Objects.equals(this.date, salary.date) &&
        Objects.equals(this.guid, salary.guid) &&
        Objects.equals(this.payGroupId, salary.payGroupId) &&
        Objects.equals(this.payrollJobId, salary.payrollJobId) &&
        Objects.equals(this.rate, salary.rate) &&
        Objects.equals(this.yearlyAmount, salary.yearlyAmount) &&
        Objects.equals(this.hourly, salary.hourly) &&
        Objects.equals(this.amountRaw, salary.amountRaw) &&
        Objects.equals(this.payrollCompany, salary.payrollCompany) &&
        Objects.equals(this.payrollJob, salary.payrollJob)&&
        Objects.equals(this.additionalProperties, salary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyType, date, guid, payGroupId, payrollJobId, rate, yearlyAmount, hourly, amountRaw, payrollCompany, payrollJob, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Salary {\n");
    sb.append("    currencyType: ").append(toIndentedString(currencyType)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    payGroupId: ").append(toIndentedString(payGroupId)).append("\n");
    sb.append("    payrollJobId: ").append(toIndentedString(payrollJobId)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    yearlyAmount: ").append(toIndentedString(yearlyAmount)).append("\n");
    sb.append("    hourly: ").append(toIndentedString(hourly)).append("\n");
    sb.append("    amountRaw: ").append(toIndentedString(amountRaw)).append("\n");
    sb.append("    payrollCompany: ").append(toIndentedString(payrollCompany)).append("\n");
    sb.append("    payrollJob: ").append(toIndentedString(payrollJob)).append("\n");
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
    openapiFields.add("currency_type");
    openapiFields.add("date");
    openapiFields.add("guid");
    openapiFields.add("pay_group_id");
    openapiFields.add("payroll_job_id");
    openapiFields.add("rate");
    openapiFields.add("yearly_amount");
    openapiFields.add("hourly");
    openapiFields.add("amount_raw");
    openapiFields.add("payroll_company");
    openapiFields.add("payroll_job");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Salary
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Salary.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Salary is not found in the empty JSON string", Salary.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("currency_type") != null && !jsonObj.get("currency_type").isJsonNull()) && !jsonObj.get("currency_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency_type").toString()));
      }
      if ((jsonObj.get("date") != null && !jsonObj.get("date").isJsonNull()) && !jsonObj.get("date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("date").toString()));
      }
      if ((jsonObj.get("guid") != null && !jsonObj.get("guid").isJsonNull()) && !jsonObj.get("guid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `guid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("guid").toString()));
      }
      if ((jsonObj.get("payroll_job_id") != null && !jsonObj.get("payroll_job_id").isJsonNull()) && !jsonObj.get("payroll_job_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_job_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_job_id").toString()));
      }
      if ((jsonObj.get("rate") != null && !jsonObj.get("rate").isJsonNull()) && !jsonObj.get("rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rate").toString()));
      }
      if ((jsonObj.get("amount_raw") != null && !jsonObj.get("amount_raw").isJsonNull()) && !jsonObj.get("amount_raw").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_raw` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_raw").toString()));
      }
      if ((jsonObj.get("payroll_company") != null && !jsonObj.get("payroll_company").isJsonNull()) && !jsonObj.get("payroll_company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_company").toString()));
      }
      if ((jsonObj.get("payroll_job") != null && !jsonObj.get("payroll_job").isJsonNull()) && !jsonObj.get("payroll_job").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payroll_job` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payroll_job").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Salary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Salary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Salary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Salary.class));

       return (TypeAdapter<T>) new TypeAdapter<Salary>() {
           @Override
           public void write(JsonWriter out, Salary value) throws IOException {
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
           public Salary read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Salary instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Salary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Salary
  * @throws IOException if the JSON string is invalid with respect to Salary
  */
  public static Salary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Salary.class);
  }

 /**
  * Convert an instance of Salary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

