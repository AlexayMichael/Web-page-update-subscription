package com.commafeed.backend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFeedEntry is a Querydsl query type for FeedEntry
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeedEntry extends EntityPathBase<FeedEntry> {

    private static final long serialVersionUID = 1899305293L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFeedEntry feedEntry = new QFeedEntry("feedEntry");

    public final QAbstractModel _super = new QAbstractModel(this);

    public final QFeedEntryContent content;

    public final QFeed feed;

    public final StringPath guid = createString("guid");

    public final StringPath guidHash = createString("guidHash");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final DateTimePath<java.util.Date> inserted = createDateTime("inserted", java.util.Date.class);

    public final SetPath<FeedEntryStatus, QFeedEntryStatus> statuses = this.<FeedEntryStatus, QFeedEntryStatus>createSet("statuses", FeedEntryStatus.class, QFeedEntryStatus.class, PathInits.DIRECT2);

    public final SetPath<FeedEntryTag, QFeedEntryTag> tags = this.<FeedEntryTag, QFeedEntryTag>createSet("tags", FeedEntryTag.class, QFeedEntryTag.class, PathInits.DIRECT2);

    public final DateTimePath<java.util.Date> updated = createDateTime("updated", java.util.Date.class);

    public final StringPath url = createString("url");

    public QFeedEntry(String variable) {
        this(FeedEntry.class, forVariable(variable), INITS);
    }

    public QFeedEntry(Path<? extends FeedEntry> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFeedEntry(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QFeedEntry(PathMetadata metadata, PathInits inits) {
        this(FeedEntry.class, metadata, inits);
    }

    public QFeedEntry(Class<? extends FeedEntry> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.content = inits.isInitialized("content") ? new QFeedEntryContent(forProperty("content")) : null;
        this.feed = inits.isInitialized("feed") ? new QFeed(forProperty("feed")) : null;
    }

}

