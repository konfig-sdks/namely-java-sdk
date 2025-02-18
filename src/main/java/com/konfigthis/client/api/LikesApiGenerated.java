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


import com.konfigthis.client.model.HomeFeedGetEventLikesResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class LikesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LikesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public LikesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getEventLikesCall(String eventId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/likes/event/{event-id}/recent"
            .replace("{" + "event-id" + "}", localVarApiClient.escapeString(eventId.toString()));

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
    private okhttp3.Call getEventLikesValidateBeforeCall(String eventId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'eventId' is set
        if (eventId == null) {
            throw new ApiException("Missing the required parameter 'eventId' when calling getEventLikes(Async)");
        }

        return getEventLikesCall(eventId, _callback);

    }


    private ApiResponse<HomeFeedGetEventLikesResponse> getEventLikesWithHttpInfo(String eventId) throws ApiException {
        okhttp3.Call localVarCall = getEventLikesValidateBeforeCall(eventId, null);
        Type localVarReturnType = new TypeToken<HomeFeedGetEventLikesResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getEventLikesAsync(String eventId, final ApiCallback<HomeFeedGetEventLikesResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEventLikesValidateBeforeCall(eventId, _callback);
        Type localVarReturnType = new TypeToken<HomeFeedGetEventLikesResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetEventLikesRequestBuilder {
        private final String eventId;

        private GetEventLikesRequestBuilder(String eventId) {
            this.eventId = eventId;
        }

        /**
         * Build call for getEventLikes
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getEventLikesCall(eventId, _callback);
        }


        /**
         * Execute getEventLikes request
         * @return HomeFeedGetEventLikesResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public HomeFeedGetEventLikesResponse execute() throws ApiException {
            ApiResponse<HomeFeedGetEventLikesResponse> localVarResp = getEventLikesWithHttpInfo(eventId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getEventLikes request with HTTP info returned
         * @return ApiResponse&lt;HomeFeedGetEventLikesResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<HomeFeedGetEventLikesResponse> executeWithHttpInfo() throws ApiException {
            return getEventLikesWithHttpInfo(eventId);
        }

        /**
         * Execute getEventLikes request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<HomeFeedGetEventLikesResponse> _callback) throws ApiException {
            return getEventLikesAsync(eventId, _callback);
        }
    }

    /**
     * Get an Event&#39;s Likes
     * Returns a list of profiles that liked a particular event.
     * @param eventId &lt;code&gt;id&lt;/code&gt; of the event whose likes you want to view (required)
     * @return GetEventLikesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public GetEventLikesRequestBuilder getEventLikes(String eventId) throws IllegalArgumentException {
        if (eventId == null) throw new IllegalArgumentException("\"eventId\" is required but got null");
            

        return new GetEventLikesRequestBuilder(eventId);
    }
}
