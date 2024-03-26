# JobTierApi

All URIs are relative to *https://your-company.namely.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJobTier**](JobTierApi.md#createJobTier) | **POST** /job_tiers | Create a Job Tier |
| [**getAllJobTiers**](JobTierApi.md#getAllJobTiers) | **GET** /job_tiers | Get all Job Tiers |
| [**getJobTier**](JobTierApi.md#getJobTier) | **GET** /job_tiers/{id} | Get a Job Tier |
| [**updateLabel**](JobTierApi.md#updateLabel) | **PUT** /job_tiers/{id} | Update a Job Tier |


<a name="createJobTier"></a>
# **createJobTier**
> JobsInfoCreateJobTierResponse createJobTier().createJobTier(createJobTier).execute();

Create a Job Tier

Creates a job tier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobTierApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    List<CreateJobTierPayload> jobTiers = Arrays.asList();
    try {
      JobsInfoCreateJobTierResponse result = client
              .jobTier
              .createJobTier(jobTiers)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobTiers());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTierApi#createJobTier");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobsInfoCreateJobTierResponse> response = client
              .jobTier
              .createJobTier(jobTiers)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTierApi#createJobTier");
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
| **createJobTier** | [**CreateJobTier**](CreateJobTier.md)|  | [optional] |

### Return type

[**JobsInfoCreateJobTierResponse**](JobsInfoCreateJobTierResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create Response |  -  |

<a name="getAllJobTiers"></a>
# **getAllJobTiers**
> JobsInfoGetAllJobTiersResponse getAllJobTiers().execute();

Get all Job Tiers

Returns an array of all job tiers. Each job tier can have zero to many linked job titles (while each job title must have one and only one linked job tier).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobTierApi;
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
      JobsInfoGetAllJobTiersResponse result = client
              .jobTier
              .getAllJobTiers()
              .execute();
      System.out.println(result);
      System.out.println(result.getJobTiers());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTierApi#getAllJobTiers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobsInfoGetAllJobTiersResponse> response = client
              .jobTier
              .getAllJobTiers()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTierApi#getAllJobTiers");
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

[**JobsInfoGetAllJobTiersResponse**](JobsInfoGetAllJobTiersResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getJobTier"></a>
# **getJobTier**
> JobsInfoGetJobTierResponse getJobTier(id).execute();

Get a Job Tier

Returns information about a single job tier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobTierApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    String id = "id_example"; // <code>id</code> of the job tier you want to view
    try {
      JobsInfoGetJobTierResponse result = client
              .jobTier
              .getJobTier(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobTiers());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTierApi#getJobTier");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobsInfoGetJobTierResponse> response = client
              .jobTier
              .getJobTier(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTierApi#getJobTier");
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
| **id** | **String**| &lt;code&gt;id&lt;/code&gt; of the job tier you want to view | |

### Return type

[**JobsInfoGetJobTierResponse**](JobsInfoGetJobTierResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="updateLabel"></a>
# **updateLabel**
> JobsInfoUpdateLabelResponse updateLabel(id).updateJobTier(updateJobTier).execute();

Update a Job Tier

Updates the label of a job tier.  Use the #endpoint:3iHo6fSyKNs2dsaSC endpoint to get a list of job tiers, whose &lt;code&gt;id&lt;/code&gt; is used in the path parameters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobTierApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    List<UpdateJobTierPayload> jobTiers = Arrays.asList();
    String id = "id_example"; // <code>id</code> of the job tier you want to view
    try {
      JobsInfoUpdateLabelResponse result = client
              .jobTier
              .updateLabel(jobTiers, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobTiers());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTierApi#updateLabel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobsInfoUpdateLabelResponse> response = client
              .jobTier
              .updateLabel(jobTiers, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTierApi#updateLabel");
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
| **id** | **String**| &lt;code&gt;id&lt;/code&gt; of the job tier you want to view | |
| **updateJobTier** | [**UpdateJobTier**](UpdateJobTier.md)|  | [optional] |

### Return type

[**JobsInfoUpdateLabelResponse**](JobsInfoUpdateLabelResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

