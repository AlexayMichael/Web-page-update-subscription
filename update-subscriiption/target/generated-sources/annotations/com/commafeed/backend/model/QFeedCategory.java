package com.commafeed.backend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFeedCategory is a Querydsl query type for FeedCategory
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeedCategory extends EntityPathBase<FeedCategory> {

    private static final long serialVersionUID = -1845872061L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFeedCategory feedCategory = new QFeedCategory("feedCategory");

    public final QAbstractModel _super = new QAbstractModel(this);

    public final SetPath<FeedCategory, QFeedCategory> children = this.<FeedCategory, QFeedCategory>createSet("children", FeedCategory.class, QFeedCategory.class, PathInits.DIRECT2);

    public final BooleanPath collapsed = createBoolean("collapsed");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final QFeedCategory parent;

    public final NumberPath<Integer> position = createNumber("position", Integer.class);

    public final SetPath<FeedSubscription, QFeedSubscription> subscriptions = this.<FeedSubscription, QFeedSubscription>createSet("subscriptions", FeedSubscription.class, QFeedSubscription.class, PathInits.DIRECT2);

    public final QUser user;

    public QFeedCategory(String variable) {
        this(FeedCategory.class, forVariable(variable), INITS);
    }

    public QFeedCategory(Path<? extends FeedCategory> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFeedCategory(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFeedCategory(PathMetadata metadata, PathInits inits) {
        this(FeedCategory.class, metadata, inits);
    }

    public QFeedCategory(Class<? extends FeedCategory> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QFeedCategory(forProperty("parent"), inits.get("parent")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

