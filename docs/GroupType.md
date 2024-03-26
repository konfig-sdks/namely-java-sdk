

# GroupType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**title** | **String** | name/label of the group type |  [optional] |
|**id** | **String** | unique identifier of the group type |  [optional] |
|**fieldName** | **String** | immutable, system generated field name for the group type |  [optional] |
|**deletable** | **Boolean** | denotes whether or not the group can be deleted by someone with the appropriate permissions; &lt;code&gt;true&lt;/code&gt; for all groups except Departments and Office Location. |  [optional] |
|**type** | **String** | returns one of three group types: office location, department, or custom; location and department are system delivered groups (will also not be deletable) |  [optional] |
|**xGroupsAsTeams** | **Boolean** | &lt;code&gt;true&lt;/code&gt; if the group type has been chosen to display on the \&quot;Teams\&quot; page in Namely, eligible for @mention (additional permissions apply) |  [optional] |



