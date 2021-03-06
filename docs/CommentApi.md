# CommentApi

All URIs are relative to *https://dex-api.coinex.org*

Method | HTTP request | Description
------------- | ------------- | -------------
[**followupComment**](CommentApi.md#followupComment) | **POST** /comment/followup-comment | Post a follow-up comment under some thread
[**newThread**](CommentApi.md#newThread) | **POST** /comment/new-thread | Post a new comment to open a new thread
[**queryComment**](CommentApi.md#queryComment) | **GET** /comment/comments | Query token comment
[**rewardComments**](CommentApi.md#rewardComments) | **POST** /comment/reward-comments | reward some comments with coins


<a name="followupComment"></a>
# **followupComment**
> StdTx followupComment(followupCommentReq)

Post a follow-up comment under some thread

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
FollowupCommentReq followupCommentReq = new FollowupCommentReq(); // FollowupCommentReq | Post a follow-up comment
try {
    StdTx result = apiInstance.followupComment(followupCommentReq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#followupComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **followupCommentReq** | [**FollowupCommentReq**](FollowupCommentReq.md)| Post a follow-up comment |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="newThread"></a>
# **newThread**
> StdTx newThread(newThreadReq)

Post a new comment to open a new thread

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
NewThreadReq newThreadReq = new NewThreadReq(); // NewThreadReq | open a new thread
try {
    StdTx result = apiInstance.newThread(newThreadReq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#newThread");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newThreadReq** | [**NewThreadReq**](NewThreadReq.md)| open a new thread |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="queryComment"></a>
# **queryComment**
> InlineResponse20063 queryComment(token, time, sid, count)

Query token comment

Query all comments about given token until to time

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
String token = "token_example"; // String | Symbol
Long time = 789L; // Long | Unix timestamp
Long sid = 789L; // Long | Sequence id
Integer count = 56; // Integer | Querier comment count limited to 1024
try {
    InlineResponse20063 result = apiInstance.queryComment(token, time, sid, count);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#queryComment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **String**| Symbol |
 **time** | **Long**| Unix timestamp |
 **sid** | **Long**| Sequence id |
 **count** | **Integer**| Querier comment count limited to 1024 |

### Return type

[**InlineResponse20063**](InlineResponse20063.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="rewardComments"></a>
# **rewardComments**
> StdTx rewardComments(rewardCommentsReq)

reward some comments with coins

### Example
```java
// Import classes:
//import org.coinex.dex.client.ApiException;
//import org.coinex.dex.client.api.CommentApi;


CommentApi apiInstance = new CommentApi();
RewardCommentsReq rewardCommentsReq = new RewardCommentsReq(); // RewardCommentsReq | reward some comments
try {
    StdTx result = apiInstance.rewardComments(rewardCommentsReq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CommentApi#rewardComments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rewardCommentsReq** | [**RewardCommentsReq**](RewardCommentsReq.md)| reward some comments |

### Return type

[**StdTx**](StdTx.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

