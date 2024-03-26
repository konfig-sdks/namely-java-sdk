package com.konfigthis.client;

import com.konfigthis.client.api.CommentsApi;
import com.konfigthis.client.api.CompanyInfoApi;
import com.konfigthis.client.api.CompanyResourcesApi;
import com.konfigthis.client.api.CountriesApi;
import com.konfigthis.client.api.EventsApi;
import com.konfigthis.client.api.GroupsApi;
import com.konfigthis.client.api.GroupsTeamsApi;
import com.konfigthis.client.api.HomeFeedApi;
import com.konfigthis.client.api.JobTierApi;
import com.konfigthis.client.api.JobTitleApi;
import com.konfigthis.client.api.JobsInfoApi;
import com.konfigthis.client.api.LikesApi;
import com.konfigthis.client.api.NamelySystemInfoApi;
import com.konfigthis.client.api.NotificationsApi;
import com.konfigthis.client.api.ProfileFieldsApi;
import com.konfigthis.client.api.ProfileFieldsSectionsApi;
import com.konfigthis.client.api.ProfilesApi;
import com.konfigthis.client.api.ReportsApi;
import com.konfigthis.client.api.TeamsApi;

public class Namely {
    private ApiClient apiClient;
    public final CommentsApi comments;
    public final CompanyInfoApi companyInfo;
    public final CompanyResourcesApi companyResources;
    public final CountriesApi countries;
    public final EventsApi events;
    public final GroupsApi groups;
    public final GroupsTeamsApi groupsTeams;
    public final HomeFeedApi homeFeed;
    public final JobTierApi jobTier;
    public final JobTitleApi jobTitle;
    public final JobsInfoApi jobsInfo;
    public final LikesApi likes;
    public final NamelySystemInfoApi namelySystemInfo;
    public final NotificationsApi notifications;
    public final ProfileFieldsApi profileFields;
    public final ProfileFieldsSectionsApi profileFieldsSections;
    public final ProfilesApi profiles;
    public final ReportsApi reports;
    public final TeamsApi teams;

    public Namely() {
        this(null);
    }

    public Namely(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.comments = new CommentsApi(this.apiClient);
        this.companyInfo = new CompanyInfoApi(this.apiClient);
        this.companyResources = new CompanyResourcesApi(this.apiClient);
        this.countries = new CountriesApi(this.apiClient);
        this.events = new EventsApi(this.apiClient);
        this.groups = new GroupsApi(this.apiClient);
        this.groupsTeams = new GroupsTeamsApi(this.apiClient);
        this.homeFeed = new HomeFeedApi(this.apiClient);
        this.jobTier = new JobTierApi(this.apiClient);
        this.jobTitle = new JobTitleApi(this.apiClient);
        this.jobsInfo = new JobsInfoApi(this.apiClient);
        this.likes = new LikesApi(this.apiClient);
        this.namelySystemInfo = new NamelySystemInfoApi(this.apiClient);
        this.notifications = new NotificationsApi(this.apiClient);
        this.profileFields = new ProfileFieldsApi(this.apiClient);
        this.profileFieldsSections = new ProfileFieldsSectionsApi(this.apiClient);
        this.profiles = new ProfilesApi(this.apiClient);
        this.reports = new ReportsApi(this.apiClient);
        this.teams = new TeamsApi(this.apiClient);
    }

}
