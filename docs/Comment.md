

# Comment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | unique identifier of the comment |  [optional] |
|**content** | **String** | content of the comment, displayed in markdown |  [optional] |
|**htmlContent** | **String** | content of the comment, displayed in HTML |  [optional] |
|**createdAt** | **Integer** | epoch time that the comment was created |  [optional] |
|**canDestroy** | **Boolean** | &lt;code&gt;true&lt;/code&gt; if the token bearer has a role with permission to delete the comment; will always be &lt;code&gt;true&lt;/code&gt; for one&#39;s own comment |  [optional] |
|**links** | [**CommentLinks**](CommentLinks.md) |  |  [optional] |
|**utcOffset** | **Integer** | the hour difference between UTC and the main office of the company |  [optional] |
|**likesCount** | **Integer** | total number of likes on comment |  [optional] |
|**likedByCurrentProfile** | **Boolean** | &lt;code&gt;true&lt;/code&gt; if the token bearer has liked this comment |  [optional] |



