package com.commafeed.backend.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAbstractModel is a Querydsl query type for AbstractModel
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QAbstractModel extends EntityPathBase<AbstractModel> {

    private static final long serialVersionUID = 607281024L;

    public static final QAbstractModel abstractModel = new QAbstractModel("abstractModel");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QAbstractModel(String variable) {
        super(AbstractModel.class, forVariable(variable));
    }

    public QAbstractModel(Path<? extends AbstractModel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAbstractModel(PathMetadata metadata) {
        super(AbstractModel.class, metadata);
    }

}

