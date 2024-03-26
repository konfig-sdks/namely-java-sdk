

# UpdateProfilePayload



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | company email of the profile |  [optional] |
|**firstName** | **String** |  |  [optional] |
|**lastName** | **String** |  |  [optional] |
|**userStatus** | **String** | valid values are &lt;code&gt;active&lt;/code&gt; or &lt;code&gt;pending&lt;/code&gt; |  [optional] |
|**startDate** | **String** | valid format is YYYY-MM-DD |  [optional] |
|**personalEmail** | **String** | REQUIRED if &lt;code&gt;user_status&lt;/code&gt; &#x3D; &lt;code&gt;pending&lt;/code&gt; |  [optional] |
|**reportsTo** | **String** | &lt;code&gt;id&lt;/code&gt;of the profile you&#39;d like to assign as the manager of the profile you&#39;re creating |  [optional] |
|**jobTitle** | **String** | in addition to passing the &lt;code&gt;id&lt;/code&gt; of the &lt;code&gt;job title&lt;/code&gt;, you can also pass the &lt;code&gt;title&lt;/code&gt;, however, it is case-sensitive |  [optional] |



