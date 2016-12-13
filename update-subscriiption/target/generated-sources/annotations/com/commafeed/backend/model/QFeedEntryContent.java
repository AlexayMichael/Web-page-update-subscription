package com.commafeed.backend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFeedEntryContent is a Querydsl query type for FeedEntryContent
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QFeedEntryContent extends EntityPathBase<FeedEntryContent> {

    private static final long serialVersionUID = -1858661780L;

    public static final QFeedEntryContent feedEntryContent = new QFeedEntryContent("feedEntryContent");

    public final QAbstractModel _super = new QAbstractModel(this);

    public final StringPath author = createString("author");

    public final StringPath categories = createString("categories");

    public final StringPath content = createString("content");

    public final StringPath contentHash = createString("contentHash");

    public final StringPath enclosureType = createString("enclosureType");

    public final StringPath enclosureUrl = createString("enclosureUrl");

    public final SetPath<FeedEntry, QFeedEntry> entries = this.<FeedEntry, QFeedEntry>createSet("entries", FeedEntry.class, QFeedEntry.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath title = createString("title");

    public final StringPath titleHash = createString("titleHash");

    public QFeedEntryContent(String variable) {
        super(FeedEntryContent.class, forVariable(variable));
    }

    public QFeedEntryContent(Path<? extends FeedEntryContent> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFeedEntryContent(PathMetadata metadata) {
        super(FeedEntryContent.class, metadata);
    }

}

