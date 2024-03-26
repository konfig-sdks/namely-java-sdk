

# CreateEventPayload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**content** | **String** | the content of the announcement; formatted in markdown; to @mention a profile, use format: &lt;code&gt;[full_name](https://developers.namely.com/)&lt;/code&gt; where {profile_id} is the &lt;code&gt;id&lt;/code&gt; of the profile you want to mention |  |
|**isAppreciation** | **Boolean** | if &lt;code&gt;true&lt;/code&gt;, any @mentioned profile will be appreciated |  [optional] |
|**fileId** | **String** |  |  [optional] |
|**emailAll** | **Boolean** | if &lt;code&gt;true&lt;/code&gt;, will send an email to all active profiles per their company email address; will only be successful is token bearer has the corresponding permissions |  [optional] |



