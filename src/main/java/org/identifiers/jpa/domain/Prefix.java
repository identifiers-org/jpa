package org.identifiers.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sarala on 27/09/2016.
 */

@Entity
@Table(name="mir_uri")
public class Prefix implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="uri_id")
    private String id;

    private String uri;

    @Column(name="uri_type")
    private String uriType;

    private int deprecated;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ptr_datatype")
    private Collection collection;

    @Column(name="convertprefix")
    private String convertPrefix;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUriType() {
        return uriType;
    }

    public void setUriType(String uriType) {
        this.uriType = uriType;
    }

    public int getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(int deprecated) {
        this.deprecated = deprecated;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public String getConvertPrefix() {
        return convertPrefix;
    }

    public void setConvertPrefix(String convertPrefix) {
        this.convertPrefix = convertPrefix;
    }
}
