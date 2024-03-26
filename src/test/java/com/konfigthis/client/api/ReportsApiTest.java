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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ReportsGetReportDataResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReportsApi
 */
@Disabled
public class ReportsApiTest {

    private static ReportsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ReportsApi(apiClient);
    }

    /**
     * Get a Report
     *
     * This endpoint returns a JSON format version of a report created in Namely. These reports update instantly, so each new call to the API will provide the user with updated information.  After information about the report itself, there is an array of objects that are the columns within the report. The position of the columns is important.  After the columns is what is technically an array of arrays without any keys. Each \&quot;sub\&quot;-array represents a line in the report and is a list of values whose position on the list within each \&quot;sub\&quot;-array sequentially corresponds to the column. For example, if the second \&quot;column\&quot; is \&quot;last name\&quot;, the second \&quot;value\&quot; in each \&quot;sub\&quot;-array is the value.  The reports API does not technically have a limit to how many lines can be pulled through the API at once. However, we would suggest limiting it to around 200 lines. A user could likely pull more than that without any problems, but they will eventually run into a timeout. There is no hard limit, however.  Do not have your integration rely on field &#39;labels&#39; as they are dynamic.  Please use the field &#39;name&#39; instead.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getReportDataTest() throws ApiException {
        String id = null;
        ReportsGetReportDataResponse response = api.getReportData(id)
                .execute();
        // TODO: test validations
    }

}
