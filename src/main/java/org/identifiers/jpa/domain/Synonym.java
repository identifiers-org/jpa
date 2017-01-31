package org.identifiers.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sarala on 31/01/2017.
 */

@Entity
@Table(name="mir_synonym")
public class Synonym implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="synonym_id")
    private String id;

    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ptr_datatype")
    private Collection collection;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }
}
