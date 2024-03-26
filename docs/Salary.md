

# Salary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currencyType** | **String** | currency of the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; &lt;code&gt;null&lt;/code&gt; if never provided or no &lt;strong&gt;current&lt;/strong&gt; salary; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided |  [optional] |
|**date** | **String** | start date of the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; &lt;code&gt;null&lt;/code&gt; if never provided or no &lt;strong&gt;current&lt;/strong&gt; salary; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided |  [optional] |
|**guid** | **String** | unique identifier of the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; &lt;code&gt;null&lt;/code&gt; if never provided or no &lt;strong&gt;current&lt;/strong&gt; salary; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided |  [optional] |
|**payGroupId** | **Integer** | unique identifier of the pay group associated with the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; &lt;code&gt;null&lt;/code&gt; if never provided or no &lt;strong&gt;current&lt;/strong&gt; salary |  [optional] |
|**payrollJobId** | **String** | unique identifier of the payroll job associated with the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; &lt;code&gt;null&lt;/code&gt; if never provided or no &lt;strong&gt;current&lt;/strong&gt; salary |  [optional] |
|**rate** | **String** | rate of the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; valid values include &lt;code&gt;annually&lt;/code&gt;, &lt;code&gt;weekly&lt;/code&gt;, &lt;code&gt;biweekly&lt;/code&gt;, &lt;code&gt;bimonthly&lt;/code&gt;, &lt;code&gt;semimonthly&lt;/code&gt;, &lt;code&gt;monthly&lt;/code&gt;, &lt;code&gt;quarterly&lt;/code&gt;, &lt;code&gt;semiannually&lt;/code&gt;, and &lt;code&gt;thirteen_monthly&lt;/code&gt;; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided |  [optional] |
|**yearlyAmount** | **Integer** | annualized amount (\&quot;amount_raw\&quot; * # of pay periods based on the \&quot;rate\&quot;) of the profile&#39;s &lt;strong&gt;current&lt;/strong&gt; salary; all salaries are annualized; &lt;code&gt;null&lt;/code&gt; if never provided; blank if provided then deleted; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided |  [optional] |
|**hourly** | **Boolean** | true if the salary is hourly, and false if yearly; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided. Known as is_hourly elsewhere in the app. |  [optional] |
|**amountRaw** | **String** | returns the amount as it was inputted on the UI; if yearly, will be the amount per pay period; if hourly, will be the hourly rate; cannot be &lt;code&gt;null&lt;/code&gt; if any other salary keys provided |  [optional] |
|**payrollCompany** | **String** | The Payroll Company associated with this salary. Required if multiple Payroll Companies. \&quot;Company name\&quot; defaults to first Payroll Company. |  [optional] |
|**payrollJob** | **String** | Name of the Payroll Job for this Salary. Required if multiple Payroll Companies. Value of \&quot;Job name\&quot; will take first Payroll Job from specified Payroll Company. |  [optional] |



