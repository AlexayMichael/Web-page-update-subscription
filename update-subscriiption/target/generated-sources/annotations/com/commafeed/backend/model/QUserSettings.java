package com.commafeed.backend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserSettings is a Querydsl query type for UserSettings
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUserSettings extends EntityPathBase<UserSettings> {

    private static final long serialVersionUID = -1742552427L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserSettings userSettings = new QUserSettings("userSettings");

    public final QAbstractModel _super = new QAbstractModel(this);

    public final BooleanPath buffer = createBoolean("buffer");

    public final StringPath customCss = createString("customCss");

    public final BooleanPath email = createBoolean("email");

    public final BooleanPath facebook = createBoolean("facebook");

    public final BooleanPath gmail = createBoolean("gmail");

    public final BooleanPath googleplus = createBoolean("googleplus");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final BooleanPath instapaper = createBoolean("instapaper");

    public final StringPath language = createString("language");

    public final BooleanPath pocket = createBoolean("pocket");

    public final BooleanPath readability = createBoolean("readability");

    public final EnumPath<UserSettings.ReadingMode> readingMode = createEnum("readingMode", UserSettings.ReadingMode.class);

    public final EnumPath<UserSettings.ReadingOrder> readingOrder = createEnum("readingOrder", UserSettings.ReadingOrder.class);

    public final BooleanPath scrollMarks = createBoolean("scrollMarks");

    public final NumberPath<Integer> scrollSpeed = createNumber("scrollSpeed", Integer.class);

    public final BooleanPath showRead = createBoolean("showRead");

    public final StringPath theme = createString("theme");

    public final BooleanPath tumblr = createBoolean("tumblr");

    public final BooleanPath twitter = createBoolean("twitter");

    public final QUser user;

    public final EnumPath<UserSettings.ViewMode> viewMode = createEnum("viewMode", UserSettings.ViewMode.class);

    public QUserSettings(String variable) {
        this(UserSettings.class, forVariable(variable), INITS);
    }

    public QUserSettings(Path<? extends UserSettings> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserSettings(PathMetadata metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QUserSettings(PathMetadata metadata, PathInits inits) {
        this(UserSettings.class, metadata, inits);
    }

    public QUserSettings(Class<? extends UserSettings> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

