# HomeFeedApi

All URIs are relative to *https://your-company.namely.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEventComment**](HomeFeedApi.md#createEventComment) | **POST** /events/{id}/comments | Create an Event&#39;s Comment |
| [**createEventLike**](HomeFeedApi.md#createEventLike) | **POST** /likes/event/{id} | Create an Event&#39;s Like |
| [**deleteAnnouncement**](HomeFeedApi.md#deleteAnnouncement) | **DELETE** /events/{id} | Delete an Announcement |
| [**deleteEventCommentLike**](HomeFeedApi.md#deleteEventCommentLike) | **DELETE** /likes/event_comment/{comment-id} | Delete an Event&#39;s Comment&#39;s Like |
| [**events**](HomeFeedApi.md#events) | **GET** /events | Get all Events |
| [**events_0**](HomeFeedApi.md#events_0) | **POST** /events | Create an Announcement |
| [**getEvent**](HomeFeedApi.md#getEvent) | **GET** /events/{id} | Get an Event |
| [**getEventCommentLikes**](HomeFeedApi.md#getEventCommentLikes) | **GET** /likes/event_comment/{comment-id}/recent | Get an Event&#39;s Comment&#39;s Likes |
| [**getEventComments**](HomeFeedApi.md#getEventComments) | **GET** /events/{event-id}/comments | Get an Event&#39;s Comments |
| [**getEventLikes**](HomeFeedApi.md#getEventLikes) | **GET** /likes/event/{event-id}/recent | Get an Event&#39;s Likes |
| [**likeEventComment**](HomeFeedApi.md#likeEventComment) | **POST** /likes/event_comment/{comment-id} | Create an Event&#39;s Comment&#39;s Like |
| [**removeEventComment**](HomeFeedApi.md#removeEventComment) | **DELETE** /events/{event-id}/comments/{comment-id} | Delete an Event&#39;s Comment |
| [**removeEventLike**](HomeFeedApi.md#removeEventLike) | **DELETE** /likes/event/{event-id} | Delete an Event&#39;s Like |


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
import com.konfigthis.client.api.HomeFeedApi;
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
              .homeFeed
              .createEventComment(comments, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#createEventComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedCreateEventCommentResponse> response = client
              .homeFeed
              .createEventComment(comments, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#createEventComment");
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

<a name="createEventLike"></a>
# **createEventLike**
> HomeFeedCreateEventLikeResponse createEventLike(id).execute();

Create an Event&#39;s Like

Like a particular event simply by &#x60;POST&#x60;ing to the endpoint with its &lt;code&gt;id&lt;/code&gt; in the path parameters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeFeedApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    String id = "id_example"; // <code>id</code> of the event you want to like
    try {
      HomeFeedCreateEventLikeResponse result = client
              .homeFeed
              .createEventLike(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#createEventLike");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedCreateEventLikeResponse> response = client
              .homeFeed
              .createEventLike(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#createEventLike");
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
| **id** | **String**| &lt;code&gt;id&lt;/code&gt; of the event you want to like | |

### Return type

[**HomeFeedCreateEventLikeResponse**](HomeFeedCreateEventLikeResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success! |  -  |

<a name="deleteAnnouncement"></a>
# **deleteAnnouncement**
> HomeFeedDeleteAnnouncementResponse deleteAnnouncement(id).execute();

Delete an Announcement

Delete a particular event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeFeedApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    Namely client = new Namely(configuration);
    String id = "id_example"; // id of event.
    try {
      HomeFeedDeleteAnnouncementResponse result = client
              .homeFeed
              .deleteAnnouncement(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#deleteAnnouncement");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedDeleteAnnouncementResponse> response = client
              .homeFeed
              .deleteAnnouncement(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#deleteAnnouncement");
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

[**HomeFeedDeleteAnnouncementResponse**](HomeFeedDeleteAnnouncementResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="deleteEventCommentLike"></a>
# **deleteEventCommentLike**
> HomeFeedDeleteEventCommentLikeResponse deleteEventCommentLike(commentId).execute();

Delete an Event&#39;s Comment&#39;s Like

Delete your like from a particular comment. You can only delete your own like (from the profile related to the token).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeFeedApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    Namely client = new Namely(configuration);
    String commentId = "commentId_example"; // <code>id</code> of the comment you want to like
    try {
      HomeFeedDeleteEventCommentLikeResponse result = client
              .homeFeed
              .deleteEventCommentLike(commentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#deleteEventCommentLike");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedDeleteEventCommentLikeResponse> response = client
              .homeFeed
              .deleteEventCommentLike(commentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#deleteEventCommentLike");
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
| **commentId** | **String**| &lt;code&gt;id&lt;/code&gt; of the comment you want to like | |

### Return type

[**HomeFeedDeleteEventCommentLikeResponse**](HomeFeedDeleteEventCommentLikeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

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
import com.konfigthis.client.api.HomeFeedApi;
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
              .homeFeed
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
      System.err.println("Exception when calling HomeFeedApi#events");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetEventsResponse> response = client
              .homeFeed
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
      System.err.println("Exception when calling HomeFeedApi#events");
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
import com.konfigthis.client.api.HomeFeedApi;
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
              .homeFeed
              .events_0(events)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#events_0");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PostEventsResponse> response = client
              .homeFeed
              .events_0(events)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#events_0");
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
import com.konfigthis.client.api.HomeFeedApi;
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
              .homeFeed
              .getEvent(id)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#getEvent");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedGetEventResponse> response = client
              .homeFeed
              .getEvent(id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#getEvent");
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

<a name="getEventCommentLikes"></a>
# **getEventCommentLikes**
> HomeFeedGetEventCommentLikesResponse getEventCommentLikes(commentId).execute();

Get an Event&#39;s Comment&#39;s Likes

Returns a list of profiles that liked a particular comment on a particular event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeFeedApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    Namely client = new Namely(configuration);
    String commentId = "commentId_example"; // <code>id</code> of the comment whose likes you want to view
    try {
      HomeFeedGetEventCommentLikesResponse result = client
              .homeFeed
              .getEventCommentLikes(commentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLikes());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#getEventCommentLikes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedGetEventCommentLikesResponse> response = client
              .homeFeed
              .getEventCommentLikes(commentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#getEventCommentLikes");
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
| **commentId** | **String**| &lt;code&gt;id&lt;/code&gt; of the comment whose likes you want to view | |

### Return type

[**HomeFeedGetEventCommentLikesResponse**](HomeFeedGetEventCommentLikesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

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
import com.konfigthis.client.api.HomeFeedApi;
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
              .homeFeed
              .getEventComments(eventId)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#getEventComments");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedGetEventCommentsResponse> response = client
              .homeFeed
              .getEventComments(eventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#getEventComments");
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
import com.konfigthis.client.api.HomeFeedApi;
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
              .homeFeed
              .getEventLikes(eventId)
              .execute();
      System.out.println(result);
      System.out.println(result.getLikes());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#getEventLikes");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedGetEventLikesResponse> response = client
              .homeFeed
              .getEventLikes(eventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#getEventLikes");
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

<a name="likeEventComment"></a>
# **likeEventComment**
> Object likeEventComment(commentId).execute();

Create an Event&#39;s Comment&#39;s Like

Like a particular comment simply by &#x60;POST&#x60;ing to the endpoint with its &lt;code&gt;id&lt;/code&gt; in the path parameters.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeFeedApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    Namely client = new Namely(configuration);
    String commentId = "commentId_example"; // <code>id</code> of the comment you want to like
    try {
      Object result = client
              .homeFeed
              .likeEventComment(commentId)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#likeEventComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .homeFeed
              .likeEventComment(commentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#likeEventComment");
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
| **commentId** | **String**| &lt;code&gt;id&lt;/code&gt; of the comment you want to like | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** |  |  -  |

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
import com.konfigthis.client.api.HomeFeedApi;
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
              .homeFeed
              .removeEventComment(eventId, commentId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#removeEventComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedRemoveEventCommentResponse> response = client
              .homeFeed
              .removeEventComment(eventId, commentId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#removeEventComment");
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

<a name="removeEventLike"></a>
# **removeEventLike**
> HomeFeedRemoveEventLikeResponse removeEventLike(eventId).deleteLike(deleteLike).execute();

Delete an Event&#39;s Like

Delete a particular like from an event.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.HomeFeedApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    List<DeleteLikePayload> message = Arrays.asList();
    String eventId = "eventId_example"; // <code>id</code> of the event from which you want to delete the like
    try {
      HomeFeedRemoveEventLikeResponse result = client
              .homeFeed
              .removeEventLike(message, eventId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#removeEventLike");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedRemoveEventLikeResponse> response = client
              .homeFeed
              .removeEventLike(message, eventId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling HomeFeedApi#removeEventLike");
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
| **eventId** | **String**| &lt;code&gt;id&lt;/code&gt; of the event from which you want to delete the like | |
| **deleteLike** | [**DeleteLike**](DeleteLike.md)|  | [optional] |

### Return type

[**HomeFeedRemoveEventLikeResponse**](HomeFeedRemoveEventLikeResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

