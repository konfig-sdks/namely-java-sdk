

# Dental


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**beneficiary** | **String** | relationship of the profile&#39;s dental plan&#39;s beneficiary to the profile; valid values include &lt;code&gt;Employee Only&lt;/code&gt;, &lt;code&gt;Employee/Child&lt;/code&gt;, &lt;code&gt;Employee/Spouse&lt;/code&gt;, &lt;code&gt;Family&lt;/code&gt;, &lt;code&gt;Not Applicable&lt;/code&gt;, and &lt;code&gt;Waive&lt;/code&gt;; blank if never provided or provided then deleted; cannot be &lt;code&gt;null&lt;/code&gt; if any other &lt;code&gt;dental&lt;/code&gt; keys provided |  [optional] |
|**amount** | **String** | amount of the profile&#39;s dental plan; numbers only; cannot be &lt;code&gt;null&lt;/code&gt; if any other &lt;code&gt;dental&lt;/code&gt; keys provided |  [optional] |
|**currencyType** | **String** | currency type of the profile&#39;s dental plan amount; default &lt;code&gt;USD&lt;/code&gt; |  [optional] |



