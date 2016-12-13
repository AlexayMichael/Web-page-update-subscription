package com.commafeed.backend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = 1982731346L;

    public static final QUser user = new QUser("user");

    public final QAbstractModel _super = new QAbstractModel(this);

    public final StringPath apiKey = createString("apiKey");

    public final DateTimePath<java.util.Date> created = createDateTime("created", java.util.Date.class);

    public final BooleanPath disabled = createBoolean("disabled");

    public final StringPath email = createString("email");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final DateTimePath<java.util.Date> lastFullRefresh = createDateTime("lastFullRefresh", java.util.Date.class);

    public final DateTimePath<java.util.Date> lastLogin = createDateTime("lastLogin", java.util.Date.class);

    public final StringPath name = createString("name");

    public final ArrayPath<byte[], Byte> password = createArray("password", byte[].class);

    public final StringPath recoverPasswordToken = createString("recoverPasswordToken");

    public final DateTimePath<java.util.Date> recoverPasswordTokenDate = createDateTime("recoverPasswordTokenDate", java.util.Date.class);

    public final ArrayPath<byte[], Byte> salt = createArray("salt", byte[].class);

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

