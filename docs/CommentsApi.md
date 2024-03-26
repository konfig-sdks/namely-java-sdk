# CommentsApi

All URIs are relative to *https://your-company.namely.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEventComment**](CommentsApi.md#createEventComment) | **POST** /events/{id}/comments | Create an Event&#39;s Comment |
| [**getEventComments**](CommentsApi.md#getEventComments) | **GET** /events/{event-id}/comments | Get an Event&#39;s Comments |
| [**removeEventComment**](CommentsApi.md#removeEventComment) | **DELETE** /events/{event-id}/comments/{comment-id} | Delete an Event&#39;s Comment |


<a name="createEventComment"></a>
# **createEventComment**
> HomeFeedCreateEventCommentResponse createEventComment(id).createComment(createComment).execute();

Create an Event&#39;s Comment

Creates a comment on a particular event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    List<CreateCommentPayload> comments = Arrays.asList();
    String id = "id_example"; // id of event.
    try {
      HomeFeedCreateEventCommentResponse result = client
              .comments
              .createEventComment(comments, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#createEventComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedCreateEventCommentResponse> response = client
              .comments
              .createEventComment(comments, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#createEventComment");
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
| **createComment** | [**CreateComment**](CreateComment.md)|  | [optional] |

### Return type

[**HomeFeedCreateEventCommentResponse**](HomeFeedCreateEventCommentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created Response |  -  |

<a name="getEventComments"></a>
# **getEventComments**
> HomeFeedGetEventCommentsResponse getEventComments(eventId).execute();

Get an Event&#39;s Comments

Returns all comments associated with a particular event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    String eventId = "eventId_example"; // <code>id</code> of the event whose comments you want to view
    try {
      HomeFeedGetEventCommentsResponse result = client
              .comments
              .getEventComments(eventId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getEventComments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedGetEventCommentsResponse> response = client
              .comments
              .getEventComments(eventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#getEventComments");
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
| **eventId** | **String**| &lt;code&gt;id&lt;/code&gt; of the event whose comments you want to view | |

### Return type

[**HomeFeedGetEventCommentsResponse**](HomeFeedGetEventCommentsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a name="removeEventComment"></a>
# **removeEventComment**
> HomeFeedRemoveEventCommentResponse removeEventComment(eventId, commentId).execute();

Delete an Event&#39;s Comment

Delete a particular comment on an event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    String eventId = "eventId_example"; // <code>id</code> of the event to which the comment belongs
    String commentId = "commentId_example"; // <code>id</code> of the comment you want to delete from the event
    try {
      HomeFeedRemoveEventCommentResponse result = client
              .comments
              .removeEventComment(eventId, commentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#removeEventComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedRemoveEventCommentResponse> response = client
              .comments
              .removeEventComment(eventId, commentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#removeEventComment");
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
| **eventId** | **String**| &lt;code&gt;id&lt;/code&gt; of the event to which the comment belongs | |
| **commentId** | **String**| &lt;code&gt;id&lt;/code&gt; of the comment you want to delete from the event | |

### Return type

[**HomeFeedRemoveEventCommentResponse**](HomeFeedRemoveEventCommentResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Succssful Response |  -  |

