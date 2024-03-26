# NotificationsApi

All URIs are relative to *https://your-company.namely.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProfileNotifications**](NotificationsApi.md#getProfileNotifications) | **GET** /profiles/{id}/notifications | Get a Profile&#39;s Notifications |
| [**notifications**](NotificationsApi.md#notifications) | **GET** /notifications | Get all Notifications |


<a name="getProfileNotifications"></a>
# **getProfileNotifications**
> NotificationsGetProfileNotificationsResponse getProfileNotifications(id).page(page).perPage(perPage).execute();

Get a Profile&#39;s Notifications

Returns notifications for a profile in a paginated form. By default, there will be 30 notifications per page. At most, you can request 50 notifications per page.  There are three main types of notifications: 1. Time Off 2. Mentioned/Appreciated 3. Generic (All Other)  &lt;strong&gt;There are also three \&quot;200\&quot; responses on this page&lt;/strong&gt;. However, the actual notification response is a combination of all three responses (assuming the user has received all three types of notifications).  Time Off and Mentioned/Appreciated have distinct \&quot;links\&quot; associated with the notification object. Certain keys will be present or absent based on the nature of notification (e.g. the \&quot;comment_id\&quot; key will only be present if you were mentioned in a comment).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    String id = "id_example"; // id of the profile whose notifications you want to view
    Integer page = 56; // the page of information you'd like to receive.
    Integer perPage = 56; // the number of employees to retrieve when using pagination; default is 30 and the limit is 50.
    try {
      NotificationsGetProfileNotificationsResponse result = client
              .notifications
              .getProfileNotifications(id)
              .page(page)
              .perPage(perPage)
              .execute();
      System.out.println(result);
      System.out.println(result.getNotifications());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getProfileNotifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<NotificationsGetProfileNotificationsResponse> response = client
              .notifications
              .getProfileNotifications(id)
              .page(page)
              .perPage(perPage)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#getProfileNotifications");
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
| **id** | **String**| id of the profile whose notifications you want to view | |
| **page** | **Integer**| the page of information you&#39;d like to receive. | [optional] |
| **perPage** | **Integer**| the number of employees to retrieve when using pagination; default is 30 and the limit is 50. | [optional] |

### Return type

[**NotificationsGetProfileNotificationsResponse**](NotificationsGetProfileNotificationsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="notifications"></a>
# **notifications**
> GetNotificationsResponse notifications().execute();

Get all Notifications

Returns all notifications for the current API user/token bearer.  There are three main types of notifications: 1. Time Off 2. Mentioned/Appreciated 3. Generic (All Other)  &lt;strong&gt;There are also three \&quot;200\&quot; responses on this page&lt;/strong&gt;. However, the actual notification response is a combination of all three responses (assuming the user has received all three types of notifications).  Time Off and Mentioned/Appreciated have distinct \&quot;links\&quot; associated with the notification object. Certain keys will be present or absent based on the nature of notification (e.g. the \&quot;comment_id\&quot; key will only be present if you were mentioned in a comment).

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.NotificationsApi;
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
      GetNotificationsResponse result = client
              .notifications
              .notifications()
              .execute();
      System.out.println(result);
      System.out.println(result.getNotifications());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#notifications");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetNotificationsResponse> response = client
              .notifications
              .notifications()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling NotificationsApi#notifications");
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

[**GetNotificationsResponse**](GetNotificationsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

