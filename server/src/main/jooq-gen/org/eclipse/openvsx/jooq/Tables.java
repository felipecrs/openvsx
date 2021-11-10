/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq;


import org.eclipse.openvsx.jooq.tables.AzureDownloadCountProcessedItem;
import org.eclipse.openvsx.jooq.tables.Extension;
import org.eclipse.openvsx.jooq.tables.ExtensionReview;
import org.eclipse.openvsx.jooq.tables.ExtensionVersion;
import org.eclipse.openvsx.jooq.tables.FileResource;
import org.eclipse.openvsx.jooq.tables.FlywaySchemaHistory;
import org.eclipse.openvsx.jooq.tables.Namespace;
import org.eclipse.openvsx.jooq.tables.NamespaceMembership;
import org.eclipse.openvsx.jooq.tables.PersistedLog;
import org.eclipse.openvsx.jooq.tables.PersonalAccessToken;
import org.eclipse.openvsx.jooq.tables.Shedlock;
import org.eclipse.openvsx.jooq.tables.SpringSession;
import org.eclipse.openvsx.jooq.tables.SpringSessionAttributes;
import org.eclipse.openvsx.jooq.tables.UserData;


/**
 * Convenience access to all tables in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.azure_download_count_processed_item</code>.
     */
    public static final AzureDownloadCountProcessedItem AZURE_DOWNLOAD_COUNT_PROCESSED_ITEM = AzureDownloadCountProcessedItem.AZURE_DOWNLOAD_COUNT_PROCESSED_ITEM;

    /**
     * The table <code>public.extension</code>.
     */
    public static final Extension EXTENSION = Extension.EXTENSION;

    /**
     * The table <code>public.extension_review</code>.
     */
    public static final ExtensionReview EXTENSION_REVIEW = ExtensionReview.EXTENSION_REVIEW;

    /**
     * The table <code>public.extension_version</code>.
     */
    public static final ExtensionVersion EXTENSION_VERSION = ExtensionVersion.EXTENSION_VERSION;

    /**
     * The table <code>public.file_resource</code>.
     */
    public static final FileResource FILE_RESOURCE = FileResource.FILE_RESOURCE;

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>public.namespace</code>.
     */
    public static final Namespace NAMESPACE = Namespace.NAMESPACE;

    /**
     * The table <code>public.namespace_membership</code>.
     */
    public static final NamespaceMembership NAMESPACE_MEMBERSHIP = NamespaceMembership.NAMESPACE_MEMBERSHIP;

    /**
     * The table <code>public.persisted_log</code>.
     */
    public static final PersistedLog PERSISTED_LOG = PersistedLog.PERSISTED_LOG;

    /**
     * The table <code>public.personal_access_token</code>.
     */
    public static final PersonalAccessToken PERSONAL_ACCESS_TOKEN = PersonalAccessToken.PERSONAL_ACCESS_TOKEN;

    /**
     * The table <code>public.shedlock</code>.
     */
    public static final Shedlock SHEDLOCK = Shedlock.SHEDLOCK;

    /**
     * The table <code>public.spring_session</code>.
     */
    public static final SpringSession SPRING_SESSION = SpringSession.SPRING_SESSION;

    /**
     * The table <code>public.spring_session_attributes</code>.
     */
    public static final SpringSessionAttributes SPRING_SESSION_ATTRIBUTES = SpringSessionAttributes.SPRING_SESSION_ATTRIBUTES;

    /**
     * The table <code>public.user_data</code>.
     */
    public static final UserData USER_DATA = UserData.USER_DATA;
}
