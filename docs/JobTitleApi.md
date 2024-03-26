# JobTitleApi

All URIs are relative to *https://your-company.namely.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJobTitle**](JobTitleApi.md#createJobTitle) | **POST** /job_titles | Create a Job Title |
| [**getAllJobTitles**](JobTitleApi.md#getAllJobTitles) | **GET** /job_titles | Get all Job Titles |
| [**getJobTitleById**](JobTitleApi.md#getJobTitleById) | **GET** /job_titles/{id} | Get a Job Title |
| [**updateJobTitle**](JobTitleApi.md#updateJobTitle) | **PUT** /job_titles/{id} | Update a Job Title |


<a name="createJobTitle"></a>
# **createJobTitle**
> JobsInfoCreateJobTitleResponse createJobTitle().createJobTitle(createJobTitle).execute();

Create a Job Title

Creates a job title.  Use the #endpoint:xfyRRDnWE32d5PNBZ endpoint to get a list of job tiers, whose &lt;code&gt;id&lt;/code&gt; is used to populate the value for the &lt;code&gt;parent&lt;/code&gt; (job tier) key in the request body.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobTitleApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    List<CreateJobTitlePayload> jobTitles = Arrays.asList();
    try {
      JobsInfoCreateJobTitleResponse result = client
              .jobTitle
              .createJobTitle(jobTitles)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobTitles());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitleApi#createJobTitle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobsInfoCreateJobTitleResponse> response = client
              .jobTitle
              .createJobTitle(jobTitles)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitleApi#createJobTitle");
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
| **createJobTitle** | [**CreateJobTitle**](CreateJobTitle.md)|  | [optional] |

### Return type

[**JobsInfoCreateJobTitleResponse**](JobsInfoCreateJobTitleResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create Response |  -  |

<a name="getAllJobTitles"></a>
# **getAllJobTitles**
> JobsInfoGetAllJobTitlesResponse getAllJobTitles().execute();

Get all Job Titles

Returns all job titles. Each job title must have one and only one linked job tier (and each job tier can have zero to many linked job titles).  When using the #endpoint:K6iFb2x6z2yTM9jev endpoint, the API user must either use the &lt;code&gt;title&lt;/code&gt; or &lt;code&gt;id&lt;/code&gt; of a &lt;code&gt;job_title&lt;/code&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobTitleApi;
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
      JobsInfoGetAllJobTitlesResponse result = client
              .jobTitle
              .getAllJobTitles()
              .execute();
      System.out.println(result);
      System.out.println(result.getJobTitles());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitleApi#getAllJobTitles");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobsInfoGetAllJobTitlesResponse> response = client
              .jobTitle
              .getAllJobTitles()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitleApi#getAllJobTitles");
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

[**JobsInfoGetAllJobTitlesResponse**](JobsInfoGetAllJobTitlesResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="getJobTitleById"></a>
# **getJobTitleById**
> JobsInfoGetJobTitleByIdResponse getJobTitleById(id).execute();

Get a Job Title

Returns information about a single Job Title..  When using the #endpoint:K6iFb2x6z2yTM9jev endpoint, the API user must either use the &lt;code&gt;title&lt;/code&gt; or &lt;code&gt;id&lt;/code&gt; of a &lt;code&gt;job_title&lt;/code&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobTitleApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    String id = "id_example"; // id of the job title you want to view
    try {
      JobsInfoGetJobTitleByIdResponse result = client
              .jobTitle
              .getJobTitleById(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobTitles());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitleApi#getJobTitleById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobsInfoGetJobTitleByIdResponse> response = client
              .jobTitle
              .getJobTitleById(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitleApi#getJobTitleById");
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
| **id** | **String**| id of the job title you want to view | |

### Return type

[**JobsInfoGetJobTitleByIdResponse**](JobsInfoGetJobTitleByIdResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="updateJobTitle"></a>
# **updateJobTitle**
> JobsInfoUpdateJobTitleResponse updateJobTitle(id).updateJobTitle(updateJobTitle).execute();

Update a Job Title

Updates the label and/or parent (job tier) of a job title.  Use the #endpoint:xfyRRDnWE32d5PNBZ endpoint to get a list of job tiers, whose &lt;code&gt;id&lt;/code&gt; is used to populate the value for the &lt;code&gt;parent&lt;/code&gt; (job tier) key in the request body.   If not updating the &lt;code&gt;parent&lt;/code&gt;, use the &lt;code&gt;id&lt;/code&gt; of the current &lt;code&gt;parent&lt;/code&gt; value; if not updating the &lt;code&gt;title&lt;/code&gt;, use the current job title &lt;code&gt;title&lt;/code&gt;.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.JobTitleApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    List<UpdateJobTitlePayload> jobTitles = Arrays.asList();
    String id = "id_example"; // id of the job title you want to view
    try {
      JobsInfoUpdateJobTitleResponse result = client
              .jobTitle
              .updateJobTitle(jobTitles, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobTitles());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitleApi#updateJobTitle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<JobsInfoUpdateJobTitleResponse> response = client
              .jobTitle
              .updateJobTitle(jobTitles, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling JobTitleApi#updateJobTitle");
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
| **id** | **String**| id of the job title you want to view | |
| **updateJobTitle** | [**UpdateJobTitle**](UpdateJobTitle.md)|  | [optional] |

### Return type

[**JobsInfoUpdateJobTitleResponse**](JobsInfoUpdateJobTitleResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

