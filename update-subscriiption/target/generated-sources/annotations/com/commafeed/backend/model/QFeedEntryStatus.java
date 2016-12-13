package com.commafeed.backend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFeedEntryStatus is a Querydsl query type for FeedEntryStatus
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeedEntryStatus extends EntityPathBase<FeedEntryStatus> {

    private static final long serialVersionUID = -290396257L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFeedEntryStatus feedEntryStatus = new QFeedEntryStatus("feedEntryStatus");

    public final QAbstractModel _super = new QAbstractModel(this);

    public final QFeedEntry entry;

    public final DateTimePath<java.util.Date> entryInserted = createDateTime("entryInserted", java.util.Date.class);

    public final DateTimePath<java.util.Date> entryUpdated = createDateTime("entryUpdated", java.util.Date.class);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final BooleanPath read = createBoolean("read");

    public final BooleanPath starred = createBoolean("starred");

    public final QFeedSubscription subscription;

    public final QUser user;

    public QFeedEntryStatus(String variable) {
        this(FeedEntryStatus.class, forVariable(variable), INITS);
    }

    public QFeedEntryStatus(Path<? extends FeedEntryStatus> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFeedEntryStatus(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFeedEntryStatus(PathMetadata metadata, PathInits inits) {
        this(FeedEntryStatus.class, metadata, inits);
    }

    public QFeedEntryStatus(Class<? extends FeedEntryStatus> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.entry = inits.isInitialized("entry") ? new QFeedEntry(forProperty("entry"), inits.get("entry")) : null;
        this.subscription = inits.isInitialized("subscription") ? new QFeedSubscription(forProperty("subscription"), inits.get("subscription")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

