/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq;


import org.eclipse.openvsx.jooq.tables.Extension;
import org.eclipse.openvsx.jooq.tables.ExtensionReview;
import org.eclipse.openvsx.jooq.tables.ExtensionVersion;
import org.eclipse.openvsx.jooq.tables.FileResource;
import org.eclipse.openvsx.jooq.tables.FlywaySchemaHistory;
import org.eclipse.openvsx.jooq.tables.NamespaceMembership;
import org.eclipse.openvsx.jooq.tables.PersistedLog;
import org.eclipse.openvsx.jooq.tables.SpringSession;
import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index EXTENSION__LATEST_ID__IDX = Internal.createIndex(DSL.name("extension__latest_id__idx"), Extension.EXTENSION, new OrderField[] { Extension.EXTENSION.LATEST_ID }, false);
    public static final Index EXTENSION__NAMESPACE_ID__IDX = Internal.createIndex(DSL.name("extension__namespace_id__idx"), Extension.EXTENSION, new OrderField[] { Extension.EXTENSION.NAMESPACE_ID }, false);
    public static final Index EXTENSION__PREVIEW_ID__IDX = Internal.createIndex(DSL.name("extension__preview_id__idx"), Extension.EXTENSION, new OrderField[] { Extension.EXTENSION.PREVIEW_ID }, false);
    public static final Index EXTENSION_REVIEW__EXTENSION_ID__IDX = Internal.createIndex(DSL.name("extension_review__extension_id__idx"), ExtensionReview.EXTENSION_REVIEW, new OrderField[] { ExtensionReview.EXTENSION_REVIEW.EXTENSION_ID }, false);
    public static final Index EXTENSION_REVIEW__USER_ID__IDX = Internal.createIndex(DSL.name("extension_review__user_id__idx"), ExtensionReview.EXTENSION_REVIEW, new OrderField[] { ExtensionReview.EXTENSION_REVIEW.USER_ID }, false);
    public static final Index EXTENSION_VERSION__EXTENSION_ID__IDX = Internal.createIndex(DSL.name("extension_version__extension_id__idx"), ExtensionVersion.EXTENSION_VERSION, new OrderField[] { ExtensionVersion.EXTENSION_VERSION.EXTENSION_ID }, false);
    public static final Index EXTENSION_VERSION__PUBLISHED_WITH_ID__IDX = Internal.createIndex(DSL.name("extension_version__published_with_id__idx"), ExtensionVersion.EXTENSION_VERSION, new OrderField[] { ExtensionVersion.EXTENSION_VERSION.PUBLISHED_WITH_ID }, false);
    public static final Index EXTENSION_VERSION_EXT_AND_VER_IDX = Internal.createIndex(DSL.name("extension_version_ext_and_ver_idx"), ExtensionVersion.EXTENSION_VERSION, new OrderField[] { ExtensionVersion.EXTENSION_VERSION.EXTENSION_ID, ExtensionVersion.EXTENSION_VERSION.VERSION }, false);
    public static final Index FILE_RESOURCE_EXTENSION_IDX = Internal.createIndex(DSL.name("file_resource_extension_idx"), FileResource.FILE_RESOURCE, new OrderField[] { FileResource.FILE_RESOURCE.EXTENSION_ID }, false);
    public static final Index FLYWAY_SCHEMA_HISTORY_S_IDX = Internal.createIndex(DSL.name("flyway_schema_history_s_idx"), FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, new OrderField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.SUCCESS }, false);
    public static final Index NAMESPACE_MEMBERSHIP__NAMESPACE__IDX = Internal.createIndex(DSL.name("namespace_membership__namespace__idx"), NamespaceMembership.NAMESPACE_MEMBERSHIP, new OrderField[] { NamespaceMembership.NAMESPACE_MEMBERSHIP.NAMESPACE }, false);
    public static final Index NAMESPACE_MEMBERSHIP__USER_DATA__IDX = Internal.createIndex(DSL.name("namespace_membership__user_data__idx"), NamespaceMembership.NAMESPACE_MEMBERSHIP, new OrderField[] { NamespaceMembership.NAMESPACE_MEMBERSHIP.USER_DATA }, false);
    public static final Index PERSISTED_LOG__USER_DATA__IDX = Internal.createIndex(DSL.name("persisted_log__user_data__idx"), PersistedLog.PERSISTED_LOG, new OrderField[] { PersistedLog.PERSISTED_LOG.USER_DATA }, false);
    public static final Index SPRING_SESSION_IX1 = Internal.createIndex(DSL.name("spring_session_ix1"), SpringSession.SPRING_SESSION, new OrderField[] { SpringSession.SPRING_SESSION.SESSION_ID }, true);
    public static final Index SPRING_SESSION_IX2 = Internal.createIndex(DSL.name("spring_session_ix2"), SpringSession.SPRING_SESSION, new OrderField[] { SpringSession.SPRING_SESSION.EXPIRY_TIME }, false);
    public static final Index SPRING_SESSION_IX3 = Internal.createIndex(DSL.name("spring_session_ix3"), SpringSession.SPRING_SESSION, new OrderField[] { SpringSession.SPRING_SESSION.PRINCIPAL_NAME }, false);
}
