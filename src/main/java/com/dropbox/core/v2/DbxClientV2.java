/* DO NOT EDIT */
/* This file was generated by Babel */

package com.dropbox.core.v2;

import com.dropbox.core.DbxHost;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.http.HttpRequestor;
import com.dropbox.core.v2.files.DbxUserFilesRequests;
import com.dropbox.core.v2.sharing.DbxUserSharingRequests;
import com.dropbox.core.v2.users.DbxUserUsersRequests;

/**
 * Use this class to make remote calls to the Dropbox API user endpoints.  User
 * endpoints expose actions you can perform as a Dropbox user.  You'll need an
 * access token first, normally acquired by directing a Dropbox user through the
 * auth flow using {@link com.dropbox.core.DbxWebAuth}.
 *
 * <p> This class has no mutable state, so it's thread safe as long as you pass
 * in a thread safe {@link HttpRequestor} implementation. </p>
 */
public final class DbxClientV2 {
    private final DbxRawClientV2 _client;
    private final com.dropbox.core.v2.files.DbxUserFilesRequests files;
    private final com.dropbox.core.v2.sharing.DbxUserSharingRequests sharing;
    private final com.dropbox.core.v2.users.DbxUserUsersRequests users;

    /**
     * Creates a client that uses the given OAuth 2 access token as
     * authorization when performing requests against the default Dropbox hosts.
     *
     * @param requestConfig  Default attributes to use for each request
     * @param accessToken  OAuth 2 access token (that you got from Dropbox) that
     *     gives your app the ability to make Dropbox API calls. Typically
     *     acquired through {@link com.dropbox.core.DbxWebAuth}
     */
    public DbxClientV2(DbxRequestConfig requestConfig, String accessToken) {
        this(requestConfig, accessToken, DbxHost.DEFAULT);
    }

    /**
     * Same as {@link #DbxClientV2(DbxRequestConfig, String)} except you can
     * also set the hostnames of the Dropbox API servers. This is used in
     * testing. You don't normally need to call this.
     *
     * @param requestConfig  Default attributes to use for each request
     * @param accessToken  OAuth 2 access token (that you got from Dropbox) that
     *     gives your app the ability to make Dropbox API calls. Typically
     *     acquired through {@link com.dropbox.core.DbxWebAuth}
     * @param host  Dropbox hosts to send requests to (used for mocking and
     *     testing)
     */
    public DbxClientV2(DbxRequestConfig requestConfig, String accessToken, DbxHost host) {
        this(new DbxRawClientV2(requestConfig, accessToken, host));
    }

    /**
     * For internal use only.
     *
     * @param requestConfig  Default attributes to use for each request
     * @param accessToken  OAuth 2 access token (that you got from Dropbox) that
     *     gives your app the ability to make Dropbox API calls. Typically
     *     acquired through {@link com.dropbox.core.DbxWebAuth}
     * @param host  Dropbox hosts to send requests to (used for mocking and
     *     testing)
     */
    DbxClientV2(DbxRawClientV2 _client) {
        this._client = _client;
        this.files = new com.dropbox.core.v2.files.DbxUserFilesRequests(_client);
        this.sharing = new com.dropbox.core.v2.sharing.DbxUserSharingRequests(_client);
        this.users = new com.dropbox.core.v2.users.DbxUserUsersRequests(_client);
    }

    /**
     * Returns client for issuing requests in the {@code "files"} namespace.
     *
     * @return Dropbox files client
     */
    public com.dropbox.core.v2.files.DbxUserFilesRequests files() {
        return files;
    }

    /**
     * Returns client for issuing requests in the {@code "sharing"} namespace.
     *
     * @return Dropbox sharing client
     */
    public com.dropbox.core.v2.sharing.DbxUserSharingRequests sharing() {
        return sharing;
    }

    /**
     * Returns client for issuing requests in the {@code "users"} namespace.
     *
     * @return Dropbox users client
     */
    public com.dropbox.core.v2.users.DbxUserUsersRequests users() {
        return users;
    }

}
