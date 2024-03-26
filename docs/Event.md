

# Event


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | unique identifier of the event |  [optional] |
|**href** | **String** | a link to the event on the web |  [optional] |
|**type** | **String** | the type of event: &lt;code&gt;announcement&lt;/code&gt; (posted by a profile) or &lt;code&gt;birthday&lt;/code&gt;, &lt;code&gt;anniversary&lt;/code&gt;, &lt;code&gt;recent_arrival&lt;/code&gt; (auto-generated) |  [optional] |
|**time** | **Integer** | epoch time that the event was created/generated |  [optional] |
|**ufcOffset** | **Integer** | the hour difference between UTC and the main office of the company |  [optional] |
|**content** | **String** | content of the post, displayed in markdown; null for anything but type: &lt;code&gt;announcement&lt;/code&gt; |  [optional] |
|**htmlContent** | **String** | content of the post, displayed in HTML; null for anything but type: &lt;code&gt;announcement&lt;/code&gt; |  [optional] |
|**yearsAtCompany** | **Integer** | number of years related profile has been at the company; null for anything but: &lt;code&gt;anniversary&lt;/code&gt; |  [optional] |
|**useComments** | **Boolean** | &lt;code&gt;true&lt;/code&gt; if the company has commenting enabled on the home feed; same as in &lt;code&gt;meta&lt;/code&gt; |  [optional] |
|**canComment** | **Boolean** | &lt;code&gt;true&lt;/code&gt; if the token bearer has a role with permission to comment on events on the home feed (will be same value on all events) |  [optional] |
|**canDestroy** | **Boolean** | &lt;code&gt;true&lt;/code&gt; if the token bearer has a role with permission to delete the event; will always be &lt;code&gt;true&lt;/code&gt; for one&#39;s own announcement |  [optional] |
|**links** | [**EventLinks**](EventLinks.md) |  |  [optional] |
|**canLike** | **Boolean** | &lt;code&gt;true&lt;/code&gt; if the token bearer has a role with permission to like events on the home feed (will be same value on all events) |  [optional] |
|**likesCount** | **Integer** | total number of likes on event |  [optional] |
|**likedByCurrentProfile** | **Boolean** | &lt;code&gt;true&lt;/code&gt; if the token bearer has liked this event |  [optional] |



