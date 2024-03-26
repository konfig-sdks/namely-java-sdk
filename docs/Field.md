

# Field


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | unique identifier of the profile field |  [optional] |
|**name** | **String** | immutable name of the profile field; auto created based on label if using UI to create profile field |  [optional] |
|**label** | **String** | label of the profile field; editable on UI and through API |  [optional] |
|**type** | **String** | immutable data type of the profile field; valid values include &lt;code&gt;text&lt;/code&gt;, &lt;code&gt;image&lt;/code&gt;, &lt;code&gt;referencehistory&lt;/code&gt; (&lt;code&gt;job_title&lt;/code&gt; only), &lt;code&gt;select&lt;/code&gt;, &lt;code&gt;date&lt;/code&gt;, &lt;code&gt;email&lt;/code&gt;, &lt;code&gt;longtext&lt;/code&gt;, &lt;code&gt;checkboxes&lt;/code&gt;, &lt;code&gt;address&lt;/code&gt;, &lt;code&gt;address&lt;/code&gt;, &lt;code&gt;file&lt;/code&gt;, &lt;code&gt;referenceselect&lt;/code&gt; (&lt;code&gt;user_status&lt;/code&gt; only), &lt;code&gt;salary&lt;/code&gt;, &lt;code&gt;number&lt;/code&gt;, &lt;code&gt;address&lt;/code&gt; |  [optional] |
|**_default** | **Boolean** | N/A - no longer supported |  [optional] |
|**deletable** | **Boolean** | &lt;code&gt;true&lt;/code&gt; if the profile field is able to be deleted |  [optional] |
|**validFormatInfo** | **String** | valid format information for passing data through the API for the profile field |  [optional] |
|**blockIndex** | **Integer** | refers to the profile field \&quot;block\&quot; in which the profile field is located (included in \&quot;linked\&quot;); sequentially corresponds based the position of the block title; top position is 0 |  [optional] |
|**links** | [**FieldLinks**](FieldLinks.md) |  |  [optional] |
|**example** | **Boolean** | N/A - no longer supported |  [optional] |
|**xKonfigOriginalExample** | **Boolean** | N/A - no longer supported |  [optional] |



