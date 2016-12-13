package com.commafeed.backend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFeedEntryTag is a Querydsl query type for FeedEntryTag
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeedEntryTag extends EntityPathBase<FeedEntryTag> {

    private static final long serialVersionUID = 304910093L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFeedEntryTag feedEntryTag = new QFeedEntryTag("feedEntryTag");

    public final QAbstractModel _super = new QAbstractModel(this);

    public final QFeedEntry entry;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final QUser user;

    public QFeedEntryTag(String variable) {
        this(FeedEntryTag.class, forVariable(variable), INITS);
    }

    public QFeedEntryTag(Path<? extends FeedEntryTag> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFeedEntryTag(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFeedEntryTag(PathMetadata metadata, PathInits inits) {
        this(FeedEntryTag.class, metadata, inits);
    }

    public QFeedEntryTag(Class<? extends FeedEntryTag> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.entry = inits.isInitialized("entry") ? new QFeedEntry(forProperty("entry"), inits.get("entry")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

