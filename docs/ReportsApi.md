# ReportsApi

All URIs are relative to *https://your-company.namely.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getReportData**](ReportsApi.md#getReportData) | **GET** /reports/{id} | Get a Report |


<a name="getReportData"></a>
# **getReportData**
> ReportsGetReportDataResponse getReportData(id).execute();

Get a Report

This endpoint returns a JSON format version of a report created in Namely. These reports update instantly, so each new call to the API will provide the user with updated information.  After information about the report itself, there is an array of objects that are the columns within the report. The position of the columns is important.  After the columns is what is technically an array of arrays without any keys. Each \&quot;sub\&quot;-array represents a line in the report and is a list of values whose position on the list within each \&quot;sub\&quot;-array sequentially corresponds to the column. For example, if the second \&quot;column\&quot; is \&quot;last name\&quot;, the second \&quot;value\&quot; in each \&quot;sub\&quot;-array is the value.  The reports API does not technically have a limit to how many lines can be pulled through the API at once. However, we would suggest limiting it to around 200 lines. A user could likely pull more than that without any problems, but they will eventually run into a timeout. There is no hard limit, however.  Do not have your integration rely on field &#39;labels&#39; as they are dynamic.  Please use the field &#39;name&#39; instead.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ReportsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    String id = "id_example"; // <code>id</code> of the report from Namely; can be found at the end of the URL of the report on the web
    try {
      ReportsGetReportDataResponse result = client
              .reports
              .getReportData(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getReports());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getReportData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReportsGetReportDataResponse> response = client
              .reports
              .getReportData(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getReportData");
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
| **id** | **String**| &lt;code&gt;id&lt;/code&gt; of the report from Namely; can be found at the end of the URL of the report on the web | |

### Return type

[**ReportsGetReportDataResponse**](ReportsGetReportDataResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

