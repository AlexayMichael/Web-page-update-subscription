package com.commafeed.backend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QFeed is a Querydsl query type for Feed
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeed extends EntityPathBase<Feed> {

    private static final long serialVersionUID = 1982271013L;

    public static final QFeed feed = new QFeed("feed");

    public final QAbstractModel _super = new QAbstractModel(this);

    public final NumberPath<Long> averageEntryInterval = createNumber("averageEntryInterval", Long.class);

    public final DateTimePath<java.util.Date> disabledUntil = createDateTime("disabledUntil", java.util.Date.class);

    public final NumberPath<Integer> errorCount = createNumber("errorCount", Integer.class);

    public final StringPath etagHeader = createString("etagHeader");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath lastContentHash = createString("lastContentHash");

    public final DateTimePath<java.util.Date> lastEntryDate = createDateTime("lastEntryDate", java.util.Date.class);

    public final StringPath lastModifiedHeader = createString("lastModifiedHeader");

    public final DateTimePath<java.util.Date> lastPublishedDate = createDateTime("lastPublishedDate", java.util.Date.class);

    public final DateTimePath<java.util.Date> lastUpdated = createDateTime("lastUpdated", java.util.Date.class);

    public final StringPath link = createString("link");

    public final StringPath message = createString("message");

    public final StringPath normalizedUrl = createString("normalizedUrl");

    public final StringPath normalizedUrlHash = createString("normalizedUrlHash");

    public final StringPath pushHub = createString("pushHub");

    public final DateTimePath<java.util.Date> pushLastPing = createDateTime("pushLastPing", java.util.Date.class);

    public final StringPath pushTopic = createString("pushTopic");

    public final StringPath pushTopicHash = createString("pushTopicHash");

    public final StringPath url = createString("url");

    public final StringPath urlAfterRedirect = createString("urlAfterRedirect");

    public QFeed(String variable) {
        super(Feed.class, forVariable(variable));
    }

    public QFeed(Path<? extends Feed> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFeed(PathMetadata metadata) {
        super(Feed.class, metadata);
    }

}

