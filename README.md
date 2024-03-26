<div align="center">

[![Visit Namely](./header.png)](https://namely.com)

# [Namely](https://namely.com)

Move your app forward with the Namely API Move your app forward with the Namely API

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Namely&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>namely-java-sdk</artifactId>
  <version></version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:namely-java-sdk:"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/namely-java-sdk-.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Namely;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.CommentsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://your-company.namely.com/api/v1";
    
    configuration.authorization  = "YOUR API KEY";
    Namely client = new Namely(configuration);
    List<CreateCommentPayload> comments = Arrays.asList();
    String id = "id_example"; // id of event.
    try {
      HomeFeedCreateEventCommentResponse result = client
              .comments
              .createEventComment(comments, id)
              .execute();
      System.out.println(result);
      System.out.println(result.getEvents());
      System.out.println(result.getMeta());
      System.out.println(result.getLinks());
      System.out.println(result.getLinked());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#createEventComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<HomeFeedCreateEventCommentResponse> response = client
              .comments
              .createEventComment(comments, id)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling CommentsApi#createEventComment");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://your-company.namely.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CommentsApi* | [**createEventComment**](docs/CommentsApi.md#createEventComment) | **POST** /events/{id}/comments | Create an Event&#39;s Comment
*CommentsApi* | [**getEventComments**](docs/CommentsApi.md#getEventComments) | **GET** /events/{event-id}/comments | Get an Event&#39;s Comments
*CommentsApi* | [**removeEventComment**](docs/CommentsApi.md#removeEventComment) | **DELETE** /events/{event-id}/comments/{comment-id} | Delete an Event&#39;s Comment
*CompanyInfoApi* | [**getInfo**](docs/CompanyInfoApi.md#getInfo) | **GET** /companies/info | Company Info
*CompanyResourcesApi* | [**deleteFolderById**](docs/CompanyResourcesApi.md#deleteFolderById) | **DELETE** /folders/{id} | Delete Folder
*CompanyResourcesApi* | [**deleteResourceById**](docs/CompanyResourcesApi.md#deleteResourceById) | **DELETE** /folders/{id}/resources | Delete Resource
*CompanyResourcesApi* | [**folders**](docs/CompanyResourcesApi.md#folders) | **GET** /folders | Get all Folders
*CompanyResourcesApi* | [**folders_0**](docs/CompanyResourcesApi.md#folders_0) | **POST** /folders | Create Folder
*CompanyResourcesApi* | [**getById**](docs/CompanyResourcesApi.md#getById) | **GET** /resources/{id} | Get a Resource
*CompanyResourcesApi* | [**getFolderResources**](docs/CompanyResourcesApi.md#getFolderResources) | **GET** /folders/{id}/resources | Get Resources in a Folder
*CompanyResourcesApi* | [**resources**](docs/CompanyResourcesApi.md#resources) | **GET** /resources | Get Resources not in a Folder
*CompanyResourcesApi* | [**updateFolderName**](docs/CompanyResourcesApi.md#updateFolderName) | **PUT** /folders/{id} | Update Folder
*CountriesApi* | [**countries**](docs/CountriesApi.md#countries) | **GET** /countries | Get all Countries
*CountriesApi* | [**getCountryDetails**](docs/CountriesApi.md#getCountryDetails) | **GET** /countries/{id} | Get a Country
*EventsApi* | [**events**](docs/EventsApi.md#events) | **GET** /events | Get all Events
*EventsApi* | [**events_0**](docs/EventsApi.md#events_0) | **POST** /events | Create an Announcement
*EventsApi* | [**getEvent**](docs/EventsApi.md#getEvent) | **GET** /events/{id} | Get an Event
*GroupsApi* | [**getAllGroupTypes**](docs/GroupsApi.md#getAllGroupTypes) | **GET** /group_types | Get all Group Types
*GroupsApi* | [**getGroupDetails**](docs/GroupsApi.md#getGroupDetails) | **GET** /groups/{id} | Get a Group
*GroupsApi* | [**groups**](docs/GroupsApi.md#groups) | **GET** /groups | Get all Groups
*GroupsTeamsApi* | [**get**](docs/GroupsTeamsApi.md#get) | **GET** /teams/{id} | Get a Team
*GroupsTeamsApi* | [**getAllGroupTypes**](docs/GroupsTeamsApi.md#getAllGroupTypes) | **GET** /group_types | Get all Group Types
*GroupsTeamsApi* | [**getGroupDetails**](docs/GroupsTeamsApi.md#getGroupDetails) | **GET** /groups/{id} | Get a Group
*GroupsTeamsApi* | [**getGroupTypeDetails**](docs/GroupsTeamsApi.md#getGroupTypeDetails) | **GET** /group_types/{id} | Get a Group Type
*GroupsTeamsApi* | [**getGroupTypeGroups**](docs/GroupsTeamsApi.md#getGroupTypeGroups) | **GET** /group_types/{id}/groups | Get Groups from Group Type
*GroupsTeamsApi* | [**groups**](docs/GroupsTeamsApi.md#groups) | **GET** /groups | Get all Groups
*GroupsTeamsApi* | [**teams**](docs/GroupsTeamsApi.md#teams) | **GET** /teams | Get all Teams
*HomeFeedApi* | [**createEventComment**](docs/HomeFeedApi.md#createEventComment) | **POST** /events/{id}/comments | Create an Event&#39;s Comment
*HomeFeedApi* | [**createEventLike**](docs/HomeFeedApi.md#createEventLike) | **POST** /likes/event/{id} | Create an Event&#39;s Like
*HomeFeedApi* | [**deleteAnnouncement**](docs/HomeFeedApi.md#deleteAnnouncement) | **DELETE** /events/{id} | Delete an Announcement
*HomeFeedApi* | [**deleteEventCommentLike**](docs/HomeFeedApi.md#deleteEventCommentLike) | **DELETE** /likes/event_comment/{comment-id} | Delete an Event&#39;s Comment&#39;s Like
*HomeFeedApi* | [**events**](docs/HomeFeedApi.md#events) | **GET** /events | Get all Events
*HomeFeedApi* | [**events_0**](docs/HomeFeedApi.md#events_0) | **POST** /events | Create an Announcement
*HomeFeedApi* | [**getEvent**](docs/HomeFeedApi.md#getEvent) | **GET** /events/{id} | Get an Event
*HomeFeedApi* | [**getEventCommentLikes**](docs/HomeFeedApi.md#getEventCommentLikes) | **GET** /likes/event_comment/{comment-id}/recent | Get an Event&#39;s Comment&#39;s Likes
*HomeFeedApi* | [**getEventComments**](docs/HomeFeedApi.md#getEventComments) | **GET** /events/{event-id}/comments | Get an Event&#39;s Comments
*HomeFeedApi* | [**getEventLikes**](docs/HomeFeedApi.md#getEventLikes) | **GET** /likes/event/{event-id}/recent | Get an Event&#39;s Likes
*HomeFeedApi* | [**likeEventComment**](docs/HomeFeedApi.md#likeEventComment) | **POST** /likes/event_comment/{comment-id} | Create an Event&#39;s Comment&#39;s Like
*HomeFeedApi* | [**removeEventComment**](docs/HomeFeedApi.md#removeEventComment) | **DELETE** /events/{event-id}/comments/{comment-id} | Delete an Event&#39;s Comment
*HomeFeedApi* | [**removeEventLike**](docs/HomeFeedApi.md#removeEventLike) | **DELETE** /likes/event/{event-id} | Delete an Event&#39;s Like
*JobTierApi* | [**createJobTier**](docs/JobTierApi.md#createJobTier) | **POST** /job_tiers | Create a Job Tier
*JobTierApi* | [**getAllJobTiers**](docs/JobTierApi.md#getAllJobTiers) | **GET** /job_tiers | Get all Job Tiers
*JobTierApi* | [**getJobTier**](docs/JobTierApi.md#getJobTier) | **GET** /job_tiers/{id} | Get a Job Tier
*JobTierApi* | [**updateLabel**](docs/JobTierApi.md#updateLabel) | **PUT** /job_tiers/{id} | Update a Job Tier
*JobTitleApi* | [**createJobTitle**](docs/JobTitleApi.md#createJobTitle) | **POST** /job_titles | Create a Job Title
*JobTitleApi* | [**getAllJobTitles**](docs/JobTitleApi.md#getAllJobTitles) | **GET** /job_titles | Get all Job Titles
*JobTitleApi* | [**getJobTitleById**](docs/JobTitleApi.md#getJobTitleById) | **GET** /job_titles/{id} | Get a Job Title
*JobTitleApi* | [**updateJobTitle**](docs/JobTitleApi.md#updateJobTitle) | **PUT** /job_titles/{id} | Update a Job Title
*JobsInfoApi* | [**createJobTier**](docs/JobsInfoApi.md#createJobTier) | **POST** /job_tiers | Create a Job Tier
*JobsInfoApi* | [**createJobTitle**](docs/JobsInfoApi.md#createJobTitle) | **POST** /job_titles | Create a Job Title
*JobsInfoApi* | [**getAllJobTiers**](docs/JobsInfoApi.md#getAllJobTiers) | **GET** /job_tiers | Get all Job Tiers
*JobsInfoApi* | [**getAllJobTitles**](docs/JobsInfoApi.md#getAllJobTitles) | **GET** /job_titles | Get all Job Titles
*JobsInfoApi* | [**getJobTier**](docs/JobsInfoApi.md#getJobTier) | **GET** /job_tiers/{id} | Get a Job Tier
*JobsInfoApi* | [**getJobTitleById**](docs/JobsInfoApi.md#getJobTitleById) | **GET** /job_titles/{id} | Get a Job Title
*JobsInfoApi* | [**updateJobTitle**](docs/JobsInfoApi.md#updateJobTitle) | **PUT** /job_titles/{id} | Update a Job Title
*JobsInfoApi* | [**updateLabel**](docs/JobsInfoApi.md#updateLabel) | **PUT** /job_tiers/{id} | Update a Job Tier
*LikesApi* | [**getEventLikes**](docs/LikesApi.md#getEventLikes) | **GET** /likes/event/{event-id}/recent | Get an Event&#39;s Likes
*NamelySystemInfoApi* | [**countries**](docs/NamelySystemInfoApi.md#countries) | **GET** /countries | Get all Countries
*NamelySystemInfoApi* | [**getCountryDetails**](docs/NamelySystemInfoApi.md#getCountryDetails) | **GET** /countries/{id} | Get a Country
*NotificationsApi* | [**getProfileNotifications**](docs/NotificationsApi.md#getProfileNotifications) | **GET** /profiles/{id}/notifications | Get a Profile&#39;s Notifications
*NotificationsApi* | [**notifications**](docs/NotificationsApi.md#notifications) | **GET** /notifications | Get all Notifications
*ProfileFieldsApi* | [**createProfileField**](docs/ProfileFieldsApi.md#createProfileField) | **POST** /profiles/fields | Create a Profile Field
*ProfileFieldsApi* | [**getAllFieldSections**](docs/ProfileFieldsApi.md#getAllFieldSections) | **GET** /profiles/fields/sections | Get all Profile Field Sections
*ProfileFieldsApi* | [**getAllFields**](docs/ProfileFieldsApi.md#getAllFields) | **GET** /profiles/fields | Get all Profile Fields
*ProfileFieldsApi* | [**getFieldInformation**](docs/ProfileFieldsApi.md#getFieldInformation) | **GET** /profiles/fields/{id} | Get a Profile Field
*ProfileFieldsApi* | [**getFieldSection**](docs/ProfileFieldsApi.md#getFieldSection) | **GET** /profiles/fields/sections/{id} | Get a Profile Field Section
*ProfileFieldsApi* | [**updateFieldInSection**](docs/ProfileFieldsApi.md#updateFieldInSection) | **PUT** /profiles/fields/{id} | Update a Profile Field
*ProfileFieldsApi* | [**updateFieldInSection_0**](docs/ProfileFieldsApi.md#updateFieldInSection_0) | **PUT** /profiles/fields/sections/{id} | Update a Profile Field Section
*ProfileFieldsSectionsApi* | [**getAllFieldSections**](docs/ProfileFieldsSectionsApi.md#getAllFieldSections) | **GET** /profiles/fields/sections | Get all Profile Field Sections
*ProfileFieldsSectionsApi* | [**getFieldSection**](docs/ProfileFieldsSectionsApi.md#getFieldSection) | **GET** /profiles/fields/sections/{id} | Get a Profile Field Section
*ProfileFieldsSectionsApi* | [**updateFieldInSection**](docs/ProfileFieldsSectionsApi.md#updateFieldInSection) | **PUT** /profiles/fields/sections/{id} | Update a Profile Field Section
*ProfilesApi* | [**getCurrentUserProfile**](docs/ProfilesApi.md#getCurrentUserProfile) | **GET** /profiles/me | Get Current User&#39;s Profile
*ProfilesApi* | [**getProfileById**](docs/ProfilesApi.md#getProfileById) | **GET** /profiles/{id} | Get a Profile
*ProfilesApi* | [**profiles**](docs/ProfilesApi.md#profiles) | **GET** /profiles | Get all Profiles
*ProfilesApi* | [**profiles_0**](docs/ProfilesApi.md#profiles_0) | **POST** /profiles | Create a Profile
*ProfilesApi* | [**updateProfileWithNewJobTitle**](docs/ProfilesApi.md#updateProfileWithNewJobTitle) | **PUT** /profiles/{id} | Update a Profile
*ReportsApi* | [**getReportData**](docs/ReportsApi.md#getReportData) | **GET** /reports/{id} | Get a Report
*TeamsApi* | [**teams**](docs/TeamsApi.md#teams) | **GET** /teams | Get all Teams


## Documentation for Models

 - [Address](docs/Address.md)
 - [ColumnInner](docs/ColumnInner.md)
 - [Comment](docs/Comment.md)
 - [CommentLinks](docs/CommentLinks.md)
 - [CommentMeta](docs/CommentMeta.md)
 - [CompanyInfoGetInfoResponse](docs/CompanyInfoGetInfoResponse.md)
 - [CompanyInfoGetInfoResponseAuthenticationsInner](docs/CompanyInfoGetInfoResponseAuthenticationsInner.md)
 - [CompanyResourcesGetByIdResponse](docs/CompanyResourcesGetByIdResponse.md)
 - [CompanyResourcesGetFolderResourcesResponse](docs/CompanyResourcesGetFolderResourcesResponse.md)
 - [CompanyResourcesGetFolderResourcesResponseMeta](docs/CompanyResourcesGetFolderResourcesResponseMeta.md)
 - [CompanyResourcesUpdateFolderNameResponse](docs/CompanyResourcesUpdateFolderNameResponse.md)
 - [CompensationBenefits](docs/CompensationBenefits.md)
 - [Countries](docs/Countries.md)
 - [Country](docs/Country.md)
 - [CountryLinksInner](docs/CountryLinksInner.md)
 - [CreateComment](docs/CreateComment.md)
 - [CreateCommentPayload](docs/CreateCommentPayload.md)
 - [CreateEvent](docs/CreateEvent.md)
 - [CreateEventPayload](docs/CreateEventPayload.md)
 - [CreateFolder](docs/CreateFolder.md)
 - [CreateFolderPayload](docs/CreateFolderPayload.md)
 - [CreateGroup](docs/CreateGroup.md)
 - [CreateGroupPayload](docs/CreateGroupPayload.md)
 - [CreateGroupType](docs/CreateGroupType.md)
 - [CreateGroupTypePayload](docs/CreateGroupTypePayload.md)
 - [CreateJobTier](docs/CreateJobTier.md)
 - [CreateJobTierPayload](docs/CreateJobTierPayload.md)
 - [CreateJobTitle](docs/CreateJobTitle.md)
 - [CreateJobTitlePayload](docs/CreateJobTitlePayload.md)
 - [CreateLike](docs/CreateLike.md)
 - [CreateLikePayload](docs/CreateLikePayload.md)
 - [CreateProfile](docs/CreateProfile.md)
 - [CreateProfileField](docs/CreateProfileField.md)
 - [CreateProfileFieldPayload](docs/CreateProfileFieldPayload.md)
 - [CreateProfilePayload](docs/CreateProfilePayload.md)
 - [CreateResource](docs/CreateResource.md)
 - [CreateResourcePayload](docs/CreateResourcePayload.md)
 - [CreateSection](docs/CreateSection.md)
 - [CreateSectionPayload](docs/CreateSectionPayload.md)
 - [CurrencyType](docs/CurrencyType.md)
 - [DeleteLike](docs/DeleteLike.md)
 - [DeleteLikePayload](docs/DeleteLikePayload.md)
 - [Dental](docs/Dental.md)
 - [Event](docs/Event.md)
 - [EventLinks](docs/EventLinks.md)
 - [EventsMeta](docs/EventsMeta.md)
 - [Field](docs/Field.md)
 - [FieldLinks](docs/FieldLinks.md)
 - [Folder](docs/Folder.md)
 - [GenericNotification](docs/GenericNotification.md)
 - [GetCountriesResponse](docs/GetCountriesResponse.md)
 - [GetEventsResponse](docs/GetEventsResponse.md)
 - [GetEventsResponseLinked](docs/GetEventsResponseLinked.md)
 - [GetEventsResponseLinks](docs/GetEventsResponseLinks.md)
 - [GetFoldersResponse](docs/GetFoldersResponse.md)
 - [GetGroupsResponse](docs/GetGroupsResponse.md)
 - [GetGroupsResponseLinked](docs/GetGroupsResponseLinked.md)
 - [GetGroupsResponseLinks](docs/GetGroupsResponseLinks.md)
 - [GetNotificationsResponse](docs/GetNotificationsResponse.md)
 - [GetNotificationsResponseLinked](docs/GetNotificationsResponseLinked.md)
 - [GetNotificationsResponseLinks](docs/GetNotificationsResponseLinks.md)
 - [GetProfilesResponse](docs/GetProfilesResponse.md)
 - [GetProfilesResponseLinked](docs/GetProfilesResponseLinked.md)
 - [GetResourcesResponse](docs/GetResourcesResponse.md)
 - [GetTeamsResponse](docs/GetTeamsResponse.md)
 - [GetTeamsResponseLinked](docs/GetTeamsResponseLinked.md)
 - [GetTeamsResponseLinks](docs/GetTeamsResponseLinks.md)
 - [Group](docs/Group.md)
 - [GroupLink](docs/GroupLink.md)
 - [GroupLinks](docs/GroupLinks.md)
 - [GroupSingular](docs/GroupSingular.md)
 - [GroupSingularLinks](docs/GroupSingularLinks.md)
 - [GroupType](docs/GroupType.md)
 - [GroupsTeamsGetAllGroupTypesResponse](docs/GroupsTeamsGetAllGroupTypesResponse.md)
 - [GroupsTeamsGetAllGroupTypesResponseLinks](docs/GroupsTeamsGetAllGroupTypesResponseLinks.md)
 - [GroupsTeamsGetGroupDetailsResponse](docs/GroupsTeamsGetGroupDetailsResponse.md)
 - [GroupsTeamsGetGroupTypeDetailsResponse](docs/GroupsTeamsGetGroupTypeDetailsResponse.md)
 - [GroupsTeamsGetGroupTypeGroupsResponse](docs/GroupsTeamsGetGroupTypeGroupsResponse.md)
 - [GroupsTeamsGetResponse](docs/GroupsTeamsGetResponse.md)
 - [Healthcare](docs/Healthcare.md)
 - [Home](docs/Home.md)
 - [HomeFeedCreateEventCommentResponse](docs/HomeFeedCreateEventCommentResponse.md)
 - [HomeFeedCreateEventLikeResponse](docs/HomeFeedCreateEventLikeResponse.md)
 - [HomeFeedCreateEventLikeResponseMessage](docs/HomeFeedCreateEventLikeResponseMessage.md)
 - [HomeFeedDeleteAnnouncementResponse](docs/HomeFeedDeleteAnnouncementResponse.md)
 - [HomeFeedDeleteEventCommentLikeResponse](docs/HomeFeedDeleteEventCommentLikeResponse.md)
 - [HomeFeedGetEventCommentLikesResponse](docs/HomeFeedGetEventCommentLikesResponse.md)
 - [HomeFeedGetEventCommentsResponse](docs/HomeFeedGetEventCommentsResponse.md)
 - [HomeFeedGetEventCommentsResponseLinked](docs/HomeFeedGetEventCommentsResponseLinked.md)
 - [HomeFeedGetEventCommentsResponseLinks](docs/HomeFeedGetEventCommentsResponseLinks.md)
 - [HomeFeedGetEventLikesResponse](docs/HomeFeedGetEventLikesResponse.md)
 - [HomeFeedGetEventResponse](docs/HomeFeedGetEventResponse.md)
 - [HomeFeedGetEventResponseLinked](docs/HomeFeedGetEventResponseLinked.md)
 - [HomeFeedRemoveEventCommentResponse](docs/HomeFeedRemoveEventCommentResponse.md)
 - [HomeFeedRemoveEventLikeResponse](docs/HomeFeedRemoveEventLikeResponse.md)
 - [Image](docs/Image.md)
 - [JobTier](docs/JobTier.md)
 - [JobTierLinks](docs/JobTierLinks.md)
 - [JobTitle](docs/JobTitle.md)
 - [JobTitleLink](docs/JobTitleLink.md)
 - [JobTitleLinks](docs/JobTitleLinks.md)
 - [JobsInfoCreateJobTierResponse](docs/JobsInfoCreateJobTierResponse.md)
 - [JobsInfoCreateJobTierResponseLinked](docs/JobsInfoCreateJobTierResponseLinked.md)
 - [JobsInfoCreateJobTitleResponse](docs/JobsInfoCreateJobTitleResponse.md)
 - [JobsInfoCreateJobTitleResponseLinks](docs/JobsInfoCreateJobTitleResponseLinks.md)
 - [JobsInfoGetAllJobTiersResponse](docs/JobsInfoGetAllJobTiersResponse.md)
 - [JobsInfoGetAllJobTiersResponseLinked](docs/JobsInfoGetAllJobTiersResponseLinked.md)
 - [JobsInfoGetAllJobTiersResponseLinks](docs/JobsInfoGetAllJobTiersResponseLinks.md)
 - [JobsInfoGetAllJobTitlesResponse](docs/JobsInfoGetAllJobTitlesResponse.md)
 - [JobsInfoGetAllJobTitlesResponseLinked](docs/JobsInfoGetAllJobTitlesResponseLinked.md)
 - [JobsInfoGetAllJobTitlesResponseLinks](docs/JobsInfoGetAllJobTitlesResponseLinks.md)
 - [JobsInfoGetJobTierResponse](docs/JobsInfoGetJobTierResponse.md)
 - [JobsInfoGetJobTitleByIdResponse](docs/JobsInfoGetJobTitleByIdResponse.md)
 - [JobsInfoUpdateJobTitleResponse](docs/JobsInfoUpdateJobTitleResponse.md)
 - [JobsInfoUpdateLabelResponse](docs/JobsInfoUpdateLabelResponse.md)
 - [Like](docs/Like.md)
 - [LikeLinks](docs/LikeLinks.md)
 - [Link](docs/Link.md)
 - [Linked](docs/Linked.md)
 - [LinkedProfile](docs/LinkedProfile.md)
 - [MentionNotification](docs/MentionNotification.md)
 - [MentionNotificationLinks](docs/MentionNotificationLinks.md)
 - [Meta](docs/Meta.md)
 - [MetaGroup](docs/MetaGroup.md)
 - [ModelFile](docs/ModelFile.md)
 - [NamelySystemInfoGetCountryDetailsResponse](docs/NamelySystemInfoGetCountryDetailsResponse.md)
 - [Notification](docs/Notification.md)
 - [NotificationLinks](docs/NotificationLinks.md)
 - [NotificationsGetProfileNotificationsResponse](docs/NotificationsGetProfileNotificationsResponse.md)
 - [Office](docs/Office.md)
 - [PayGroup](docs/PayGroup.md)
 - [PayrollCompany](docs/PayrollCompany.md)
 - [PayrollJob](docs/PayrollJob.md)
 - [PostEventsResponse](docs/PostEventsResponse.md)
 - [PostFoldersResponse](docs/PostFoldersResponse.md)
 - [PostProfilesResponse](docs/PostProfilesResponse.md)
 - [Profile](docs/Profile.md)
 - [ProfileEmployeeType](docs/ProfileEmployeeType.md)
 - [ProfileFieldsCreateProfileFieldResponse](docs/ProfileFieldsCreateProfileFieldResponse.md)
 - [ProfileFieldsGetAllFieldSectionsResponse](docs/ProfileFieldsGetAllFieldSectionsResponse.md)
 - [ProfileFieldsGetAllFieldSectionsResponseLinked](docs/ProfileFieldsGetAllFieldSectionsResponseLinked.md)
 - [ProfileFieldsGetAllFieldSectionsResponseLinks](docs/ProfileFieldsGetAllFieldSectionsResponseLinks.md)
 - [ProfileFieldsGetAllFieldsResponse](docs/ProfileFieldsGetAllFieldsResponse.md)
 - [ProfileFieldsGetAllFieldsResponseLinked](docs/ProfileFieldsGetAllFieldsResponseLinked.md)
 - [ProfileFieldsGetAllFieldsResponseLinks](docs/ProfileFieldsGetAllFieldsResponseLinks.md)
 - [ProfileFieldsGetFieldInformationResponse](docs/ProfileFieldsGetFieldInformationResponse.md)
 - [ProfileFieldsGetFieldSectionResponse](docs/ProfileFieldsGetFieldSectionResponse.md)
 - [ProfileFieldsUpdateFieldInSection200Response](docs/ProfileFieldsUpdateFieldInSection200Response.md)
 - [ProfileFieldsUpdateFieldInSectionResponse](docs/ProfileFieldsUpdateFieldInSectionResponse.md)
 - [ProfileFieldsUpdateFieldInSectionResponseMeta](docs/ProfileFieldsUpdateFieldInSectionResponseMeta.md)
 - [ProfileLinks](docs/ProfileLinks.md)
 - [ProfileMeta](docs/ProfileMeta.md)
 - [ProfileReportsToInner](docs/ProfileReportsToInner.md)
 - [ProfilesGetCurrentUserProfileResponse](docs/ProfilesGetCurrentUserProfileResponse.md)
 - [ProfilesGetProfileByIdResponse](docs/ProfilesGetProfileByIdResponse.md)
 - [ProfilesUpdateProfileWithNewJobTitleResponse](docs/ProfilesUpdateProfileWithNewJobTitleResponse.md)
 - [Report](docs/Report.md)
 - [ReportsGetReportDataResponse](docs/ReportsGetReportDataResponse.md)
 - [Resource](docs/Resource.md)
 - [Salary](docs/Salary.md)
 - [Section](docs/Section.md)
 - [SectionLinks](docs/SectionLinks.md)
 - [Subdivision](docs/Subdivision.md)
 - [Team](docs/Team.md)
 - [TeamCategory](docs/TeamCategory.md)
 - [TeamLink](docs/TeamLink.md)
 - [TeamLinks](docs/TeamLinks.md)
 - [Thumb](docs/Thumb.md)
 - [UpdateFolder](docs/UpdateFolder.md)
 - [UpdateFolderPayload](docs/UpdateFolderPayload.md)
 - [UpdateGroup](docs/UpdateGroup.md)
 - [UpdateGroupPayload](docs/UpdateGroupPayload.md)
 - [UpdateGroupType](docs/UpdateGroupType.md)
 - [UpdateGroupTypePayload](docs/UpdateGroupTypePayload.md)
 - [UpdateJobTier](docs/UpdateJobTier.md)
 - [UpdateJobTierPayload](docs/UpdateJobTierPayload.md)
 - [UpdateJobTitle](docs/UpdateJobTitle.md)
 - [UpdateJobTitlePayload](docs/UpdateJobTitlePayload.md)
 - [UpdateProfile](docs/UpdateProfile.md)
 - [UpdateProfileField](docs/UpdateProfileField.md)
 - [UpdateProfileFieldPayload](docs/UpdateProfileFieldPayload.md)
 - [UpdateProfilePayload](docs/UpdateProfilePayload.md)
 - [UpdateResource](docs/UpdateResource.md)
 - [UpdateResourcePayload](docs/UpdateResourcePayload.md)
 - [UpdateSection](docs/UpdateSection.md)
 - [UpdateSectionPayload](docs/UpdateSectionPayload.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
