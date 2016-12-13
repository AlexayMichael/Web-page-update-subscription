package com.commafeed.backend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFeedSubscription is a Querydsl query type for FeedSubscription
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeedSubscription extends EntityPathBase<FeedSubscription> {

    private static final long serialVersionUID = 890481634L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFeedSubscription feedSubscription = new QFeedSubscription("feedSubscription");

    public final QAbstractModel _super = new QAbstractModel(this);

    public final QFeedCategory category;

    public final QFeed feed;

    public final StringPath filter = createString("filter");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final NumberPath<Integer> position = createNumber("position", Integer.class);

    public final SetPath<FeedEntryStatus, QFeedEntryStatus> statuses = this.<FeedEntryStatus, QFeedEntryStatus>createSet("statuses", FeedEntryStatus.class, QFeedEntryStatus.class, PathInits.DIRECT2);

    public final StringPath title = createString("title");

    public final QUser user;

    public QFeedSubscription(String variable) {
        this(FeedSubscription.class, forVariable(variable), INITS);
    }

    public QFeedSubscription(Path<? extends FeedSubscription> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFeedSubscription(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFeedSubscription(PathMetadata metadata, PathInits inits) {
        this(FeedSubscription.class, metadata, inits);
    }

    public QFeedSubscription(Class<? extends FeedSubscription> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.category = inits.isInitialized("category") ? new QFeedCategory(forProperty("category"), inits.get("category")) : null;
        this.feed = inits.isInitialized("feed") ? new QFeed(forProperty("feed")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

