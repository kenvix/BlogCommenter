/*
 * This file is generated by jOOQ.
 */
package com.kenvix.commenter.dao.jooq;


import com.kenvix.commenter.dao.jooq.tables.Post;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Commentserver extends SchemaImpl {

    private static final long serialVersionUID = 2023327831;

    /**
     * The reference instance of <code>commentserver</code>
     */
    public static final Commentserver COMMENTSERVER = new Commentserver();

    /**
     * The table <code>commentserver.post</code>.
     */
    public final Post POST = com.kenvix.commenter.dao.jooq.tables.Post.POST;

    /**
     * No further instances allowed
     */
    private Commentserver() {
        super("commentserver", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Post.POST);
    }
}
