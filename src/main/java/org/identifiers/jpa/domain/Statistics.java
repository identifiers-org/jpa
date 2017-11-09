package org.identifiers.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sarala on 06/09/2017.
 */
@Entity
@Table(name="mir_url_check")
public class Statistics implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @OneToOne(optional = false)
    @JoinColumn(name = "resource_id")
    private Resource resource;

    private String keyword;

    public Resource getResource() {
        return resource;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
