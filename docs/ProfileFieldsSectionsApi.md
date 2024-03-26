# ProfileFieldsSectionsApi

All URIs are relative to *https://your-company.namely.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllFieldSections**](ProfileFieldsSectionsApi.md#getAllFieldSections) | **GET** /profiles/fields/sections | Get all Profile Field Sections |
| [**getFieldSection**](ProfileFieldsSectionsApi.md#getFieldSection) | **GET** /profiles/fields/sections/{id} | Get a Profile Field Section |
| [**updateFieldInSection**](ProfileFieldsSectionsApi.md#updateFieldInSection) | **PUT** /profiles/fields/sections/{id} | Update a Profile Field Section |


<a name="getAllFieldSections"></a>
# **getAllFieldSections**
> ProfileFieldsGetAllFieldSectionsResponse getAllFieldSections().execute();

Get all Profile Field Sections

Returns all profiles field sections as configured at your company. Linked to this endpoint is a list of profile fields, including additional fields not necessarily included in the #endpoint:2PMjgBj4iCTtp4tJe endpoint, as not all are API transferrable.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileFieldsSectionsApi;
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
      ProfileFieldsGetAllFieldSectionsResponse result = client
              .profileFieldsSections
              .getAllFieldSections()
              .execute();
      System.out.println(result);
      System.out.println(result.getSections());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileFieldsSectionsApi#getAllFieldSections");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfileFieldsGetAllFieldSectionsResponse> response = client
              .profileFieldsSections
              .getAllFieldSections()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileFieldsSectionsApi#getAllFieldSections");
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

[**ProfileFieldsGetAllFieldSectionsResponse**](ProfileFieldsGetAllFieldSectionsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getFieldSection"></a>
# **getFieldSection**
> ProfileFieldsGetFieldSectionResponse getFieldSection(id).execute();

Get a Profile Field Section

Returns information about a single Profile Field Section.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileFieldsSectionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    String id = "id_example"; // id of the profile field section you want to view
    try {
      ProfileFieldsGetFieldSectionResponse result = client
              .profileFieldsSections
              .getFieldSection(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getSections());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileFieldsSectionsApi#getFieldSection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfileFieldsGetFieldSectionResponse> response = client
              .profileFieldsSections
              .getFieldSection(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileFieldsSectionsApi#getFieldSection");
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
| **id** | **String**| id of the profile field section you want to view | |

### Return type

[**ProfileFieldsGetFieldSectionResponse**](ProfileFieldsGetFieldSectionResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="updateFieldInSection"></a>
# **updateFieldInSection**
> ProfileFieldsUpdateFieldInSection200Response updateFieldInSection(id).updateSection(updateSection).execute();

Update a Profile Field Section

Updates the name/label of a profile field section.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ProfileFieldsSectionsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    List<UpdateSectionPayload> sections = Arrays.asList();
    String id = "id_example"; // id of the profile field section you want to view
    try {
      ProfileFieldsUpdateFieldInSection200Response result = client
              .profileFieldsSections
              .updateFieldInSection(sections, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getTitle());
      System.out.println(result.getSections());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileFieldsSectionsApi#updateFieldInSection");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ProfileFieldsUpdateFieldInSection200Response> response = client
              .profileFieldsSections
              .updateFieldInSection(sections, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileFieldsSectionsApi#updateFieldInSection");
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
| **id** | **String**| id of the profile field section you want to view | |
| **updateSection** | [**UpdateSection**](UpdateSection.md)|  | [optional] |

### Return type

[**ProfileFieldsUpdateFieldInSection200Response**](ProfileFieldsUpdateFieldInSection200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

