# ProfilesApi

All URIs are relative to *https://your-company.namely.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCurrentUserProfile**](ProfilesApi.md#getCurrentUserProfile) | **GET** /profiles/me | Get Current User&#39;s Profile |
| [**getProfileById**](ProfilesApi.md#getProfileById) | **GET** /profiles/{id} | Get a Profile |
| [**profiles**](ProfilesApi.md#profiles) | **GET** /profiles | Get all Profiles |
| [**profiles_0**](ProfilesApi.md#profiles_0) | **POST** /profiles | Create a Profile |
| [**updateProfileWithNewJobTitle**](ProfilesApi.md#updateProfileWithNewJobTitle) | **PUT** /profiles/{id} | Update a Profile |


<a name="getCurrentUserProfile"></a>
# **getCurrentUserProfile**
> ProfilesGetCurrentUserProfileResponse getCurrentUserProfile().execute();

Get Current User&#39;s Profile

Returns same information about the profile as in the #endpoint:E2y2tKYabriCCzTiJ endpoint but isolated, and about the current user only (the profile that owns the access token used to access the API).  Every client-created custom field (the token bearer has permission to see) will appear as key at the bottom of the profile object.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    try {
      ProfilesGetCurrentUserProfileResponse result = client
              .profiles
              .getCurrentUserProfile()
              .execute();
      System.out.println(result);
      System.out.println(result.getProfiles());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfilesApi#getCurrentUserProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfilesGetCurrentUserProfileResponse> response = client
              .profiles
              .getCurrentUserProfile()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfilesApi#getCurrentUserProfile");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProfilesGetCurrentUserProfileResponse**](ProfilesGetCurrentUserProfileResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getProfileById"></a>
# **getProfileById**
> ProfilesGetProfileByIdResponse getProfileById(id).execute();

Get a Profile

Returns same information about the profile as in the #endpoint:E2y2tKYabriCCzTiJ endpoint but isolated.  Every client-created custom field (the token bearer has permission to see) will appear as key at the bottom of the profile object.  As a note, the following fields will always be returned in the API response, regardless of user permissions:  1. id 2. email 3. first_name 4. last_name 5. user_status 6. updated_at 7. created_at 8. preferred_name 9. full_name 10. job_title   These will NOT be exposed to the user in the UI if their permissions are set correctly.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    String id = "id_example"; // id of the profile you want to view
    try {
      ProfilesGetProfileByIdResponse result = client
              .profiles
              .getProfileById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getProfiles());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfilesApi#getProfileById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfilesGetProfileByIdResponse> response = client
              .profiles
              .getProfileById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfilesApi#getProfileById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| id of the profile you want to view | |

### Return type

[**ProfilesGetProfileByIdResponse**](ProfilesGetProfileByIdResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="profiles"></a>
# **profiles**
> GetProfilesResponse profiles().page(page).perPage(perPage).profileFormat(profileFormat).sort(sort).filterFirstName(filterFirstName).filterLastName(filterLastName).filterEmail(filterEmail).filterPersonalEmail(filterPersonalEmail).filterJobTitle(filterJobTitle).filterReportsTo(filterReportsTo).filterUserStatus(filterUserStatus).execute();

Get all Profiles

Returns all active and inactive employee profiles in the same format as the #endpoint:wn3pJ3WtCYWuuBL6r endpoint.  Every client-created custom field (the token bearer has permission to see) will appear as key at the bottom of the profile object.  As a note, the following fields will always be returned in the API response, regardless of user permissions:  1. id 2. email 3. first_name 4. last_name 5. user_status 6. updated_at 7. created_at 8. preferred_name 9. full_name 10. job_title   These will NOT be exposed to the user in the UI if their permissions are set correctly.  ### Important Note About the Endpoint  Please ensure you&#39;re paginating the response of the GET &#x60;/profiles&#x60; endpoint to ensure optimal performance avoid possible time-outs.  **Examples:** 1. &#x60;https://clientname.namely.com/api/v1/profiles.json?page&#x3D;1&amp;per_page&#x3D;20&amp;filter[user_status]&#x3D;active&#x60; 2. &#x60;https://clientname.namely.com/api/v1/profiles.json?page&#x3D;2&amp;per_page&#x3D;20&amp;filter[user_status]&#x3D;active&#x60; 3. &#x60;https://clientname.namely.com/api/v1/profiles.json?page&#x3D;3&amp;per_page&#x3D;20&amp;filter[user_status]&#x3D;active&#x60;  **Notes:** 1. If you do not specify the &#x60;per_page&#x60; value, this will default to 30. The max possible is 50. 2. If the response returns with less than the number of profiles requested (or none), the &#x60;count&#x60; in the &#x60;meta&#x60; object will be 0, and the &#x60;profiles&#x60; key will return an empty array.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    Integer page = 56; // the page of information you'd like to receive.
    Integer perPage = 56; // the number of employees to retrieve when using pagination; default is 30 and the limit is 50.
    String profileFormat = "profileFormat_example"; // format of the profile object; only <code>short</code> is supported - returns a truncated version of the profile object
    String sort = "sort_example"; // sort order of profiles; valid values - <code>first_name</code>, <code>last_name</code>, <code>created_at</code>, <code>updated_at</code>; prepend with a - (minus) sign to reverse the order
    String filterFirstName = "filterFirstName_example"; // returns only profiles with the defined first name
    String filterLastName = "filterLastName_example"; // returns only profiles with the defined last name
    String filterEmail = "filterEmail_example"; // returns only profiles with the defined (company) email
    String filterPersonalEmail = "filterPersonalEmail_example"; // returns only profiles with the defined personal email
    String filterJobTitle = "filterJobTitle_example"; // returns only profiles with the defined job title; must be the job_title's <code>title</code>
    String filterReportsTo = "filterReportsTo_example"; // <code>id</code> of the profile for whose direct reports you to view; returns only those profiles
    String filterUserStatus = "filterUserStatus_example"; // returns only profiles with the defined <code>user_status</code>; <code>active</code>, <code>pending</code>, and <code>inactive</code> are supported
    try {
      GetProfilesResponse result = client
              .profiles
              .profiles()
              .page(page)
              .perPage(perPage)
              .profileFormat(profileFormat)
              .sort(sort)
              .filterFirstName(filterFirstName)
              .filterLastName(filterLastName)
              .filterEmail(filterEmail)
              .filterPersonalEmail(filterPersonalEmail)
              .filterJobTitle(filterJobTitle)
              .filterReportsTo(filterReportsTo)
              .filterUserStatus(filterUserStatus)
              .execute();
      System.out.println(result);
      System.out.println(result.getProfiles());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfilesApi#profiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetProfilesResponse> response = client
              .profiles
              .profiles()
              .page(page)
              .perPage(perPage)
              .profileFormat(profileFormat)
              .sort(sort)
              .filterFirstName(filterFirstName)
              .filterLastName(filterLastName)
              .filterEmail(filterEmail)
              .filterPersonalEmail(filterPersonalEmail)
              .filterJobTitle(filterJobTitle)
              .filterReportsTo(filterReportsTo)
              .filterUserStatus(filterUserStatus)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfilesApi#profiles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| the page of information you&#39;d like to receive. | [optional] |
| **perPage** | **Integer**| the number of employees to retrieve when using pagination; default is 30 and the limit is 50. | [optional] |
| **profileFormat** | **String**| format of the profile object; only &lt;code&gt;short&lt;/code&gt; is supported - returns a truncated version of the profile object | [optional] |
| **sort** | **String**| sort order of profiles; valid values - &lt;code&gt;first_name&lt;/code&gt;, &lt;code&gt;last_name&lt;/code&gt;, &lt;code&gt;created_at&lt;/code&gt;, &lt;code&gt;updated_at&lt;/code&gt;; prepend with a - (minus) sign to reverse the order | [optional] |
| **filterFirstName** | **String**| returns only profiles with the defined first name | [optional] |
| **filterLastName** | **String**| returns only profiles with the defined last name | [optional] |
| **filterEmail** | **String**| returns only profiles with the defined (company) email | [optional] |
| **filterPersonalEmail** | **String**| returns only profiles with the defined personal email | [optional] |
| **filterJobTitle** | **String**| returns only profiles with the defined job title; must be the job_title&#39;s &lt;code&gt;title&lt;/code&gt; | [optional] |
| **filterReportsTo** | **String**| &lt;code&gt;id&lt;/code&gt; of the profile for whose direct reports you to view; returns only those profiles | [optional] |
| **filterUserStatus** | **String**| returns only profiles with the defined &lt;code&gt;user_status&lt;/code&gt;; &lt;code&gt;active&lt;/code&gt;, &lt;code&gt;pending&lt;/code&gt;, and &lt;code&gt;inactive&lt;/code&gt; are supported | [optional] |

### Return type

[**GetProfilesResponse**](GetProfilesResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="profiles_0"></a>
# **profiles_0**
> PostProfilesResponse profiles_0().createProfile(createProfile).execute();

Create a Profile

**Create a profile as a draft Onboarding session**  1. Ensure that the Onboarding feature has been enabled for your company. 2. In the body of the POST /profiles request, use \&quot;pending\&quot; as the value of the user_status field along with the other required fields found in the Request Body section below.  *Sample Request:* &#x60;&#x60;&#x60;json {     \&quot;profiles\&quot;: [         {             \&quot;first_name\&quot;: \&quot;John\&quot;,             \&quot;last_name\&quot;: \&quot;Smith\&quot;,             \&quot;user_status\&quot;: \&quot;pending\&quot;,             \&quot;start_date\&quot;: \&quot;2019-01-01\&quot;,             \&quot;personal_email\&quot;: \&quot;personal@email.com\&quot;,             \&quot;email\&quot;: \&quot;work@email.com\&quot;         }     ] } &#x60;&#x60;&#x60;  **Create a profile with a job title set**  1. Retrieve the title or id of a  by making a GET request to the /job_titles or /job_titles/{id} endpoint (see the  section). 2. In the body of the POST /profiles request, include the job_title field in addition to the other required fields found in the Request Body section below. 3. The value of the job_title field should be set to an object containing the title (string) or id (guid) of an existing job title. Passing both values is also valid.  *Sample Request:* &#x60;&#x60;&#x60;json {     \&quot;profiles\&quot;: [         {             \&quot;first_name\&quot;: \&quot;John\&quot;,             \&quot;last_name\&quot;: \&quot;Smith\&quot;,             \&quot;user_status\&quot;: \&quot;active\&quot;,             \&quot;start_date\&quot;: \&quot;2019-01-01\&quot;,             \&quot;personal_email\&quot;: \&quot;personal@email.com\&quot;,             \&quot;email\&quot;: \&quot;work@email.com\&quot;,             \&quot;job_title\&quot;: {              \&quot;id\&quot;: \&quot;a4d5783d-a447-4269-8724-b710d0267aa4\&quot;             }         }     ] } &#x60;&#x60;&#x60;  **Create a profile with an address set**  1. Retrieve the country_id of an  by making a GET request to the /countries endpoint (see the  section). 2. The state_id is the 2-letter abbreviation for a state in the United States. 3. In the body of the POST /profiles request, include the home field and set its value equal to an object containing a valid street address as well as the country_id and state_id. 4. Note that every field in the home object (address1, address2, city, state_id, country_id, or zip) is validated against an actual address. If any field in the address object is invalid, a 422 Unprocessable Entity error will be returned.  *Sample Request:* &#x60;&#x60;&#x60;json {     \&quot;profiles\&quot;: [         {             \&quot;first_name\&quot;: \&quot;John\&quot;,             \&quot;last_name\&quot;: \&quot;Smith\&quot;,             \&quot;user_status\&quot;: \&quot;active\&quot;,             \&quot;start_date\&quot;: \&quot;2019-01-01\&quot;,             \&quot;personal_email\&quot;: \&quot;personal@email.com\&quot;,             \&quot;email\&quot;: \&quot;work@email.com\&quot;,             \&quot;home\&quot;: {                 \&quot;address1\&quot;: \&quot;195 Broadway\&quot;,                 \&quot;address2\&quot;: \&quot;\&quot;,                 \&quot;city\&quot;: \&quot;New York\&quot;,                 \&quot;state_id\&quot;: \&quot;NY\&quot;,                 \&quot;country_id\&quot;: \&quot;US\&quot;,                 \&quot;zip\&quot;: \&quot;10007\&quot;             }         }     ] } &#x60;&#x60;&#x60;  **Create a profile with a salary set**  1. In the body of the POST /profiles request, include the salary field and set its value equal to an object containing a currency_type, a date representing the start date of the salary, and a yearly_amount. 2. \&quot;USD\&quot; is currently the only valid value for currency_type.  *Sample Request:* &#x60;&#x60;&#x60;json {     \&quot;profiles\&quot;: [         {             \&quot;first_name\&quot;: \&quot;John\&quot;,             \&quot;last_name\&quot;: \&quot;Smith\&quot;,             \&quot;user_status\&quot;: \&quot;active\&quot;,             \&quot;start_date\&quot;: \&quot;2019-01-01\&quot;,             \&quot;personal_email\&quot;: \&quot;personal@email.com\&quot;,             \&quot;email\&quot;: \&quot;work@email.com\&quot;,             \&quot;salary\&quot;: {                 \&quot;currency_type\&quot;: \&quot;USD\&quot;,                 \&quot;date\&quot;: \&quot;2019-01-10\&quot;,                 \&quot;yearly_amount\&quot;: 100000             }         }     ] } &#x60;&#x60;&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    List<CreateProfilePayload> profiles = Arrays.asList();
    try {
      PostProfilesResponse result = client
              .profiles
              .profiles_0(profiles)
              .execute();
      System.out.println(result);
      System.out.println(result.getProfiles());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfilesApi#profiles_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PostProfilesResponse> response = client
              .profiles
              .profiles_0(profiles)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfilesApi#profiles_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createProfile** | [**CreateProfile**](CreateProfile.md)|  | [optional] |

### Return type

[**PostProfilesResponse**](PostProfilesResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created Response |  -  |

<a name="updateProfileWithNewJobTitle"></a>
# **updateProfileWithNewJobTitle**
> ProfilesUpdateProfileWithNewJobTitleResponse updateProfileWithNewJobTitle(id).updateProfile(updateProfile).execute();

Update a Profile

Note: the only fields that need to be included in a PUT /profiles/{id} request are the ones that should be updated.  **Update a profile with a new job title**  1. Retrieve the &#x60;title&#x60; or &#x60;id&#x60; of a  #model:JcAXAf5CGXH22bS6Z by making a GET request to the /job_titles or /job_titles/{id} endpoint (see the #docTextSection:FwRLDxsBbevBbo8uz section). 2. In the body of the PUT /profiles/{id} request, include the &#x60;job_title&#x60; field. 3. The value of the &#x60;job_title&#x60; field should be set to an object containing the &#x60;title&#x60; (string) or &#x60;id&#x60; (guid) of an existing job title. Passing both values is also valid.  _Sample Request:_ &#x60;&#x60;&#x60;json {     \&quot;profiles\&quot;: [         {             \&quot;job_title\&quot;: {              \&quot;id\&quot;: \&quot;a4d5783d-a447-4269-8724-b710d0267aa4\&quot;             }         }     ] } &#x60;&#x60;&#x60;  **Update a profile with a new address**  1. Retrieve the &#x60;country_id&#x60; of an #model:yq9tkBR24wuBhzizY by making a GET request to the /countries endpoint (see the #endpoint:ECuAqAqRDoaFMn9ZH section). 2. The &#x60;state_id&#x60; is the 2-letter abbreviation for a state in the United States. 3. In the body of the PUT /profiles/{id} request, include the &#x60;home&#x60; field and set its value equal to an object containing a valid street address as well as the &#x60;country_id&#x60; and &#x60;state_id&#x60;. 4. Note that every field in the &#x60;home&#x60; object (&#x60;address1&#x60;, &#x60;address2&#x60;, &#x60;city&#x60;, &#x60;state_id&#x60;, &#x60;country_id&#x60;, or &#x60;zip&#x60;) is validated against an actual address. If any field in the address object is invalid, a 422 Unprocessable Entity error will be returned.  _Sample Request:_ &#x60;&#x60;&#x60;json {     \&quot;profiles\&quot;: [         {             \&quot;home\&quot;: {                 \&quot;address1\&quot;: \&quot;195 Broadway\&quot;,                 \&quot;address2\&quot;: \&quot;\&quot;,                 \&quot;city\&quot;: \&quot;New York\&quot;,                 \&quot;state_id\&quot;: \&quot;NY\&quot;,                 \&quot;country_id\&quot;: \&quot;US\&quot;,                 \&quot;zip\&quot;: \&quot;10007\&quot;             }         }     ] } &#x60;&#x60;&#x60;  **Update a profile with a new salary**  1. In the body of the PUT /profiles/{id} request, include the &#x60;salary&#x60; field and set its value equal to an object containing a &#x60;currency_type&#x60;, a &#x60;date&#x60; representing the start date of the salary, and a &#x60;yearly_amount&#x60;. 2. \&quot;USD\&quot; is currently the only valid value for &#x60;currency_type&#x60;. 3. Note that the &#x60;date&#x60; is the start date of the new salary. When updating an employee&#39;s salary, the &#x60;date&#x60; value that&#39;s passed in must be at least 2 days after the &#x60;date&#x60; value of the preceding salary. This is because with each new salary, the previous salary is automatically end-dated with a date that must be at least 1 day after the start date of the previous salary. If a passed-in date is invalid, a 422 Unprocessable Entity error will be returned.  _Sample Request:_ &#x60;&#x60;&#x60;json {     \&quot;profiles\&quot;: [         {             \&quot;salary\&quot;: {                 \&quot;currency_type\&quot;: \&quot;USD\&quot;,                 \&quot;date\&quot;: \&quot;2019-01-10\&quot;,                 \&quot;yearly_amount\&quot;: 100000             }         }     ] } &#x60;&#x60;&#x60;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfilesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    List<UpdateProfilePayload> profiles = Arrays.asList();
    String id = "id_example"; // id of the profile you want to view
    try {
      ProfilesUpdateProfileWithNewJobTitleResponse result = client
              .profiles
              .updateProfileWithNewJobTitle(profiles, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getProfiles());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfilesApi#updateProfileWithNewJobTitle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfilesUpdateProfileWithNewJobTitleResponse> response = client
              .profiles
              .updateProfileWithNewJobTitle(profiles, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfilesApi#updateProfileWithNewJobTitle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| id of the profile you want to view | |
| **updateProfile** | [**UpdateProfile**](UpdateProfile.md)|  | [optional] |

### Return type

[**ProfilesUpdateProfileWithNewJobTitleResponse**](ProfilesUpdateProfileWithNewJobTitleResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

