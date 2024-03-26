

# Profile


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | unique identifier of the profile |  [optional] |
|**email** | **String** | company email of the profile |  [optional] |
|**firstName** | **String** | first name of the profile |  [optional] |
|**lastName** | **String** | last name of the profile |  [optional] |
|**userStatus** | **String** | user status of the profile; valid values in the API are &lt;code&gt;active&lt;/code&gt;, &lt;code&gt;pending&lt;/code&gt;, and &lt;code&gt;inactive&lt;/code&gt; |  [optional] |
|**updatedAt** | **Integer** | epoch time that the profile was updated; equal to &lt;code&gt;create_at&lt;/code&gt; if never updated |  [optional] |
|**createdAt** | **Integer** | epoch time that the profile was created |  [optional] |
|**preferredName** | **String** | preferred name of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**image** | [**Image**](Image.md) |  |  [optional] |
|**fullName** | **String** | combination of &lt;code&gt;first_name&lt;/code&gt; and &lt;code&gt;last_name&lt;/code&gt; |  [optional] |
|**jobTitle** | [**JobTitleLink**](JobTitleLink.md) |  |  [optional] |
|**reportsTo** | [**List&lt;ProfileReportsToInner&gt;**](ProfileReportsToInner.md) | information regarding the profile to whom the profile of this object reports |  [optional] |
|**employeeType** | [**ProfileEmployeeType**](ProfileEmployeeType.md) |  |  [optional] |
|**accessRole** | **String** | returns the type of access_role assigned to the profile |  [optional] |
|**ethnicity** | **String** | self described ethnicity of the profile; &lt;code&gt;null&lt;/code&gt; if never provided |  [optional] |
|**links** | [**ProfileLinks**](ProfileLinks.md) |  |  [optional] |
|**middleName** | **String** | middle name of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**gender** | **String** | gender of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; valid values include &lt;code&gt;Male&lt;/code&gt; and &lt;code&gt;Female&lt;/code&gt; |  [optional] |
|**jobChangeReason** | **String** | job change reason of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; valid values include &lt;code&gt;New Hire&lt;/code&gt;, &lt;code&gt;Salary Change&lt;/code&gt;, &lt;code&gt;Promotion&lt;/code&gt;, and &lt;code&gt;Transfer&lt;/code&gt; |  [optional] |
|**terminatedReason** | **String** | terminated reason of the profile; &lt;code&gt;null&lt;/code&gt; if never provided |  [optional] |
|**startDate** | **String** | start date of the profile; format &lt;code&gt;YYYY-MM-DD&lt;/code&gt; |  [optional] |
|**departureDate** | **String** | departure date of the profile; format &lt;code&gt;YYYY-MM-DD&lt;/code&gt;; blank if never provided or provided then deleted |  [optional] |
|**employeeId** | **String** | employee id of the profile; blank if never provided or provided then deleted |  [optional] |
|**personalEmail** | **String** | employee id of the profile; blank if never provided or provided then deleted |  [optional] |
|**dob** | **String** | date of birth of the profile; format &lt;code&gt;YYYY-MM-DD&lt;/code&gt;; blank if never provided or provided then deleted |  [optional] |
|**ssn** | **String** | ssn of the profile; blank if never provided or provided then deleted |  [optional] |
|**maritalStatus** | **String** | marital status of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; valid values include &lt;code&gt;Single&lt;/code&gt;, &lt;code&gt;Married&lt;/code&gt;, &lt;code&gt;Civil Partnership&lt;/code&gt;, &lt;code&gt;Separated&lt;/code&gt;, and &lt;code&gt;Divorced&lt;/code&gt; |  [optional] |
|**bio** | **String** | bio of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**assetManagement** | **String** | list of assets on the profile; blank if never provided or provided then deleted; valid values include &lt;code&gt;Laptop&lt;/code&gt;, &lt;code&gt;Cell Phone&lt;/code&gt;, &lt;code&gt;Building Keys&lt;/code&gt;, &lt;code&gt;Corporate Card&lt;/code&gt;, and &lt;code&gt;Air Card&lt;/code&gt; |  [optional] |
|**laptopAssetNumber** | **String** | laptop asset number of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**corporateCardMember** | **String** | corporate card number of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**keyTagNumber** | **String** | key tag number of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**linkedinUrl** | **String** | linkedin_url of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**officeMainNumber** | **String** | office main number of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**officeDirectDial** | **String** | office direct dial number of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**officePhone** | **String** | office phone number of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**officeFax** | **String** | office fax number of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**officeCompanyMobile** | **String** | office company mobile phone number of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**homePhone** | **String** | home phone number of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**mobilePhone** | **String** | mobile phone number of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**home** | [**Home**](Home.md) |  |  [optional] |
|**office** | [**Office**](Office.md) |  |  [optional] |
|**emergencyContact** | **String** | name of the profile&#39;s emergency contact; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**emergencyContactPhone** | **String** | phone number of the profile&#39;s emergency contact; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**resume** | **String** | resume of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**currentJobDescription** | **String** | current job description of of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**jobDescription** | **String** | current job description of of the profile; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**salary** | [**Salary**](Salary.md) |  |  [optional] |
|**healthcare** | [**Healthcare**](Healthcare.md) |  |  [optional] |
|**healthcareInfo** | **String** | description of the profile&#39;s healthcare plan; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**dental** | [**Dental**](Dental.md) |  |  [optional] |
|**dentalInfo** | **String** | description of the profile&#39;s dental plan; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**visionPlanInfo** | **String** | description of the profile&#39;s vision plan; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**lifeInsuranceInfo** | **String** | description of the profile&#39;s life insurance plan; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted |  [optional] |
|**namelyTimeEmployeeRole** | **String** | only applies to companies using Namely Time |  [optional] |
|**namelyTimeManagerRole** | **String** | only applies to companies using Namely Time |  [optional] |



