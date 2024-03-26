/*
 * Namely API
 * Move your app forward with the Namely API Move your app forward with the Namely API
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.GetNotificationsResponse;
import com.konfigthis.client.model.NotificationsGetProfileNotificationsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class NotificationsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NotificationsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public NotificationsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getProfileNotificationsCall(String id, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/profiles/{id}/notifications"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (perPage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("per_page", perPage));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProfileNotificationsValidateBeforeCall(String id, Integer page, Integer perPage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getProfileNotifications(Async)");
        }

        return getProfileNotificationsCall(id, page, perPage, _callback);

    }


    private ApiResponse<NotificationsGetProfileNotificationsResponse> getProfileNotificationsWithHttpInfo(String id, Integer page, Integer perPage) throws ApiException {
        okhttp3.Call localVarCall = getProfileNotificationsValidateBeforeCall(id, page, perPage, null);
        Type localVarReturnType = new TypeToken<NotificationsGetProfileNotificationsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getProfileNotificationsAsync(String id, Integer page, Integer perPage, final ApiCallback<NotificationsGetProfileNotificationsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProfileNotificationsValidateBeforeCall(id, page, perPage, _callback);
        Type localVarReturnType = new TypeToken<NotificationsGetProfileNotificationsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetProfileNotificationsRequestBuilder {
        private final String id;
        private Integer page;
        private Integer perPage;

        private GetProfileNotificationsRequestBuilder(String id) {
            this.id = id;
        }

        /**
         * Set page
         * @param page the page of information you&#39;d like to receive. (optional)
         * @return GetProfileNotificationsRequestBuilder
         */
        public GetProfileNotificationsRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set perPage
         * @param perPage the number of employees to retrieve when using pagination; default is 30 and the limit is 50. (optional)
         * @return GetProfileNotificationsRequestBuilder
         */
        public GetProfileNotificationsRequestBuilder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }
        
        /**
         * Build call for getProfileNotifications
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getProfileNotificationsCall(id, page, perPage, _callback);
        }


        /**
         * Execute getProfileNotifications request
         * @return NotificationsGetProfileNotificationsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public NotificationsGetProfileNotificationsResponse execute() throws ApiException {
            ApiResponse<NotificationsGetProfileNotificationsResponse> localVarResp = getProfileNotificationsWithHttpInfo(id, page, perPage);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getProfileNotifications request with HTTP info returned
         * @return ApiResponse&lt;NotificationsGetProfileNotificationsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<NotificationsGetProfileNotificationsResponse> executeWithHttpInfo() throws ApiException {
            return getProfileNotificationsWithHttpInfo(id, page, perPage);
        }

        /**
         * Execute getProfileNotifications request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<NotificationsGetProfileNotificationsResponse> _callback) throws ApiException {
            return getProfileNotificationsAsync(id, page, perPage, _callback);
        }
    }

    /**
     * Get a Profile&#39;s Notifications
     * Returns notifications for a profile in a paginated form. By default, there will be 30 notifications per page. At most, you can request 50 notifications per page.  There are three main types of notifications: 1. Time Off 2. Mentioned/Appreciated 3. Generic (All Other)  &lt;strong&gt;There are also three \&quot;200\&quot; responses on this page&lt;/strong&gt;. However, the actual notification response is a combination of all three responses (assuming the user has received all three types of notifications).  Time Off and Mentioned/Appreciated have distinct \&quot;links\&quot; associated with the notification object. Certain keys will be present or absent based on the nature of notification (e.g. the \&quot;comment_id\&quot; key will only be present if you were mentioned in a comment).
     * @param id id of the profile whose notifications you want to view (required)
     * @return GetProfileNotificationsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public GetProfileNotificationsRequestBuilder getProfileNotifications(String id) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        return new GetProfileNotificationsRequestBuilder(id);
    }
    private okhttp3.Call notificationsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/notifications";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Authorization" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call notificationsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return notificationsCall(_callback);

    }


    private ApiResponse<GetNotificationsResponse> notificationsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = notificationsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetNotificationsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call notificationsAsync(final ApiCallback<GetNotificationsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = notificationsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetNotificationsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class NotificationsRequestBuilder {

        private NotificationsRequestBuilder() {
        }

        /**
         * Build call for notifications
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return notificationsCall(_callback);
        }


        /**
         * Execute notifications request
         * @return GetNotificationsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public GetNotificationsResponse execute() throws ApiException {
            ApiResponse<GetNotificationsResponse> localVarResp = notificationsWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute notifications request with HTTP info returned
         * @return ApiResponse&lt;GetNotificationsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<GetNotificationsResponse> executeWithHttpInfo() throws ApiException {
            return notificationsWithHttpInfo();
        }

        /**
         * Execute notifications request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<GetNotificationsResponse> _callback) throws ApiException {
            return notificationsAsync(_callback);
        }
    }

    /**
     * Get all Notifications
     * Returns all notifications for the current API user/token bearer.  There are three main types of notifications: 1. Time Off 2. Mentioned/Appreciated 3. Generic (All Other)  &lt;strong&gt;There are also three \&quot;200\&quot; responses on this page&lt;/strong&gt;. However, the actual notification response is a combination of all three responses (assuming the user has received all three types of notifications).  Time Off and Mentioned/Appreciated have distinct \&quot;links\&quot; associated with the notification object. Certain keys will be present or absent based on the nature of notification (e.g. the \&quot;comment_id\&quot; key will only be present if you were mentioned in a comment).
     * @return NotificationsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td>  </td><td>  -  </td></tr>
     </table>
     */
    public NotificationsRequestBuilder notifications() throws IllegalArgumentException {
        return new NotificationsRequestBuilder();
    }
}
