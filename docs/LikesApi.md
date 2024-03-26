# LikesApi

All URIs are relative to *https://your-company.namely.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEventLikes**](LikesApi.md#getEventLikes) | **GET** /likes/event/{event-id}/recent | Get an Event&#39;s Likes |


<a name="getEventLikes"></a>
# **getEventLikes**
> HomeFeedGetEventLikesResponse getEventLikes(eventId).execute();

Get an Event&#39;s Likes

Returns a list of profiles that liked a particular event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.LikesApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    String eventId = "eventId_example"; // <code>id</code> of the event whose likes you want to view
    try {
      HomeFeedGetEventLikesResponse result = client
              .likes
              .getEventLikes(eventId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLikes());
    } catch (ApiException e) {
      System.err.println("Exception when calling LikesApi#getEventLikes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedGetEventLikesResponse> response = client
              .likes
              .getEventLikes(eventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling LikesApi#getEventLikes");
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
| **eventId** | **String**| &lt;code&gt;id&lt;/code&gt; of the event whose likes you want to view | |

### Return type

[**HomeFeedGetEventLikesResponse**](HomeFeedGetEventLikesResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

