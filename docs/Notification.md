

# Notification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | unique identifier of the notification |  [optional] |
|**text** | **String** | content of the notification |  [optional] |
|**type** | **String** | type of notification; type &#x3D; pto.responded, pto.new, pto.deleted |  [optional] |
|**timestamp** | **Integer** | epoch time that the event was created/generated |  [optional] |
|**seen** | **String** | &lt;code&gt;true&lt;/code&gt; if the token bearer has viewed the list of notifications since this notification was created |  [optional] |
|**read** | **String** | &lt;code&gt;true&lt;/code&gt; if the token bearer has clicked/tapped on the the notification |  [optional] |
|**links** | [**NotificationLinks**](NotificationLinks.md) |  |  [optional] |



