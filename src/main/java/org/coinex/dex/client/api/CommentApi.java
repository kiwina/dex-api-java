/*
 * CET-Lite for CoinEx Chain
 * A REST interface for state queries, transaction generation and broadcasting.
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.coinex.dex.client.api;

import org.coinex.dex.client.ApiClient;
import org.coinex.dex.client.ApiResponse;
import org.coinex.dex.client.Configuration;
import org.coinex.dex.client.model.FollowupCommentReq;
import org.coinex.dex.client.model.NewThreadReq;
import org.coinex.dex.client.model.RewardCommentsReq;
import org.coinex.dex.client.model.StdTx;
import org.coinex.dex.client.ApiCallback;
import org.coinex.dex.client.ApiException;
import org.coinex.dex.client.Pair;
import org.coinex.dex.client.ProgressRequestBody;
import org.coinex.dex.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentApi {
    private ApiClient apiClient;

    public CommentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CommentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for followupComment
     * @param followupCommentReq Post a follow-up comment (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call followupCommentCall(FollowupCommentReq followupCommentReq, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = followupCommentReq;

        // create path and map variables
        String localVarPath = "/comment/followup-comment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call followupCommentValidateBeforeCall(FollowupCommentReq followupCommentReq, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'followupCommentReq' is set
        if (followupCommentReq == null) {
            throw new ApiException("Missing the required parameter 'followupCommentReq' when calling followupComment(Async)");
        }
        

        com.squareup.okhttp.Call call = followupCommentCall(followupCommentReq, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Post a follow-up comment under some thread
     * 
     * @param followupCommentReq Post a follow-up comment (required)
     * @return StdTx
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StdTx followupComment(FollowupCommentReq followupCommentReq) throws ApiException {
        ApiResponse<StdTx> resp = followupCommentWithHttpInfo(followupCommentReq);
        return resp.getData();
    }

    /**
     * Post a follow-up comment under some thread
     * 
     * @param followupCommentReq Post a follow-up comment (required)
     * @return ApiResponse&lt;StdTx&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StdTx> followupCommentWithHttpInfo(FollowupCommentReq followupCommentReq) throws ApiException {
        com.squareup.okhttp.Call call = followupCommentValidateBeforeCall(followupCommentReq, null, null);
        Type localVarReturnType = new TypeToken<StdTx>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Post a follow-up comment under some thread (asynchronously)
     * 
     * @param followupCommentReq Post a follow-up comment (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call followupCommentAsync(FollowupCommentReq followupCommentReq, final ApiCallback<StdTx> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = followupCommentValidateBeforeCall(followupCommentReq, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StdTx>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for newThread
     * @param newThreadReq open a new thread (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call newThreadCall(NewThreadReq newThreadReq, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = newThreadReq;

        // create path and map variables
        String localVarPath = "/comment/new-thread";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call newThreadValidateBeforeCall(NewThreadReq newThreadReq, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'newThreadReq' is set
        if (newThreadReq == null) {
            throw new ApiException("Missing the required parameter 'newThreadReq' when calling newThread(Async)");
        }
        

        com.squareup.okhttp.Call call = newThreadCall(newThreadReq, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Post a new comment to open a new thread
     * 
     * @param newThreadReq open a new thread (required)
     * @return StdTx
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StdTx newThread(NewThreadReq newThreadReq) throws ApiException {
        ApiResponse<StdTx> resp = newThreadWithHttpInfo(newThreadReq);
        return resp.getData();
    }

    /**
     * Post a new comment to open a new thread
     * 
     * @param newThreadReq open a new thread (required)
     * @return ApiResponse&lt;StdTx&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StdTx> newThreadWithHttpInfo(NewThreadReq newThreadReq) throws ApiException {
        com.squareup.okhttp.Call call = newThreadValidateBeforeCall(newThreadReq, null, null);
        Type localVarReturnType = new TypeToken<StdTx>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Post a new comment to open a new thread (asynchronously)
     * 
     * @param newThreadReq open a new thread (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call newThreadAsync(NewThreadReq newThreadReq, final ApiCallback<StdTx> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = newThreadValidateBeforeCall(newThreadReq, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StdTx>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for rewardComments
     * @param rewardCommentsReq reward some comments (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call rewardCommentsCall(RewardCommentsReq rewardCommentsReq, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = rewardCommentsReq;

        // create path and map variables
        String localVarPath = "/comment/reward-comments";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call rewardCommentsValidateBeforeCall(RewardCommentsReq rewardCommentsReq, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'rewardCommentsReq' is set
        if (rewardCommentsReq == null) {
            throw new ApiException("Missing the required parameter 'rewardCommentsReq' when calling rewardComments(Async)");
        }
        

        com.squareup.okhttp.Call call = rewardCommentsCall(rewardCommentsReq, progressListener, progressRequestListener);
        return call;

    }

    /**
     * reward some comments with coins
     * 
     * @param rewardCommentsReq reward some comments (required)
     * @return StdTx
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StdTx rewardComments(RewardCommentsReq rewardCommentsReq) throws ApiException {
        ApiResponse<StdTx> resp = rewardCommentsWithHttpInfo(rewardCommentsReq);
        return resp.getData();
    }

    /**
     * reward some comments with coins
     * 
     * @param rewardCommentsReq reward some comments (required)
     * @return ApiResponse&lt;StdTx&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StdTx> rewardCommentsWithHttpInfo(RewardCommentsReq rewardCommentsReq) throws ApiException {
        com.squareup.okhttp.Call call = rewardCommentsValidateBeforeCall(rewardCommentsReq, null, null);
        Type localVarReturnType = new TypeToken<StdTx>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * reward some comments with coins (asynchronously)
     * 
     * @param rewardCommentsReq reward some comments (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call rewardCommentsAsync(RewardCommentsReq rewardCommentsReq, final ApiCallback<StdTx> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = rewardCommentsValidateBeforeCall(rewardCommentsReq, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StdTx>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}