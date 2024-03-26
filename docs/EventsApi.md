# EventsApi

All URIs are relative to *https://your-company.namely.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**events**](EventsApi.md#events) | **GET** /events | Get all Events |
| [**events_0**](EventsApi.md#events_0) | **POST** /events | Create an Announcement |
| [**getEvent**](EventsApi.md#getEvent) | **GET** /events/{id} | Get an Event |


<a name="events"></a>
# **events**
> GetEventsResponse events().limit(limit).after(after).filterType(filterType).profileId(profileId).order(order).execute();

Get all Events

Returns all events, paginated. Linked to the event is an array of any profiles that commented on the event. Only events associated with the profiles of active employees are eligible to appear.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    Integer limit = 56; // Limit of records to be retrieved
    String after = "after_example"; // <code>id</code> of the first record BEFORE the events you want to retrieve
    String filterType = "filterType_example"; // The type of event you want to retrieve; examples include `birthday`, `announcement`, `recent_arrival` or `anniversary`
    String profileId = "profileId_example"; // <code>id</code> of the profile that you wish to pull all associated events from
    String order = "order_example"; // This parameter allows you to change how results are ordered. Valid values are `asc` and `desc` - It defaults to `desc`
    try {
      GetEventsResponse result = client
              .events
              .events()
              .limit(limit)
              .after(after)
              .filterType(filterType)
              .profileId(profileId)
              .order(order)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#events");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetEventsResponse> response = client
              .events
              .events()
              .limit(limit)
              .after(after)
              .filterType(filterType)
              .profileId(profileId)
              .order(order)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#events");
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
| **limit** | **Integer**| Limit of records to be retrieved | [optional] |
| **after** | **String**| &lt;code&gt;id&lt;/code&gt; of the first record BEFORE the events you want to retrieve | [optional] |
| **filterType** | **String**| The type of event you want to retrieve; examples include &#x60;birthday&#x60;, &#x60;announcement&#x60;, &#x60;recent_arrival&#x60; or &#x60;anniversary&#x60; | [optional] |
| **profileId** | **String**| &lt;code&gt;id&lt;/code&gt; of the profile that you wish to pull all associated events from | [optional] |
| **order** | **String**| This parameter allows you to change how results are ordered. Valid values are &#x60;asc&#x60; and &#x60;desc&#x60; - It defaults to &#x60;desc&#x60; | [optional] |

### Return type

[**GetEventsResponse**](GetEventsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="events_0"></a>
# **events_0**
> PostEventsResponse events_0().createEvent(createEvent).execute();

Create an Announcement

Creates an announcement. Other event types are auto-generated and cannot be manually created.  The file parameters allow you to include a file which is located in the announcement. As with uploading a file to a profile, the file must be previously uploaded via the &#x60;file create&#x60; endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    List<CreateEventPayload> events = Arrays.asList();
    try {
      PostEventsResponse result = client
              .events
              .events_0(events)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#events_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PostEventsResponse> response = client
              .events
              .events_0(events)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#events_0");
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
| **createEvent** | [**CreateEvent**](CreateEvent.md)|  | [optional] |

### Return type

[**PostEventsResponse**](PostEventsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Create Response |  -  |

<a name="getEvent"></a>
# **getEvent**
> HomeFeedGetEventResponse getEvent(id).execute();

Get an Event

Returns information about a single event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EventsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    String id = "id_example"; // id of event.
    try {
      HomeFeedGetEventResponse result = client
              .events
              .getEvent(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedGetEventResponse> response = client
              .events
              .getEvent(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getEvent");
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
| **id** | **String**| id of event. | |

### Return type

[**HomeFeedGetEventResponse**](HomeFeedGetEventResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

