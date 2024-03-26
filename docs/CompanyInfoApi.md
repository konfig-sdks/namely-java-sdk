# CompanyInfoApi

All URIs are relative to *https://your-company.namely.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getInfo**](CompanyInfoApi.md#getInfo) | **GET** /companies/info | Company Info |


<a name="getInfo"></a>
# **getInfo**
> CompanyInfoGetInfoResponse getInfo().execute();

Company Info

Get company related information. This includes authentication methods, name, permalink, and background image.  Note: Authentication is **not** required for this endpoint because the data (company name, background image, etc.) are required for displaying the public home page of a Namely company.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CompanyInfoApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    Namely client = new Namely(configuration);
    try {
      CompanyInfoGetInfoResponse result = client
              .companyInfo
              .getInfo()
              .execute();
      System.out.println(result);
      System.out.println(result.getName());
      System.out.println(result.getPermalink());
      System.out.println(result.getBackgroundUrl());
      System.out.println(result.getLogoUrl());
      System.out.println(result.getAuthentications());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyInfoApi#getInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CompanyInfoGetInfoResponse> response = client
              .companyInfo
              .getInfo()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CompanyInfoApi#getInfo");
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

[**CompanyInfoGetInfoResponse**](CompanyInfoGetInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

