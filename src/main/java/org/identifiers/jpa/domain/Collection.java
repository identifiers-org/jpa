package org.identifiers.jpa.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * Created by sarala on 21/09/2016.
 */

@Entity
@Table (name="mir_datatype")
public class Collection implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="datatype_id")
    private String id;

    private String name;
    private String pattern;
    private String definition;

    @Column(name="date_creation")
    private Date dateCreatd;

    @Column(name="date_modif")
    private Date dateModif;

    private int obsolete;
    private String obsolete_comment;
    private String replacement;
    private int restriction;

    @Column(name="prefixed_id")
    private int prefixedId;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "collection")
    private Set<Resource> resources;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "collection")
    private Set<Prefix> prefixes;

    protected Collection() {
    }

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

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Date getDateCreatd() {
        return dateCreatd;
    }

    public void setDateCreatd(Date dateCreatd) {
        this.dateCreatd = dateCreatd;
    }

    public Date getDateModif() {
        return dateModif;
    }

    public void setDateModif(Date dateModif) {
        this.dateModif = dateModif;
    }

    public int getObsolete() {
        return obsolete;
    }

    public void setObsolete(int obsolete) {
        this.obsolete = obsolete;
    }

    public String getObsolete_comment() {
        return obsolete_comment;
    }

    public void setObsolete_comment(String obsolete_comment) {
        this.obsolete_comment = obsolete_comment;
    }

    public String getReplacement() {
        return replacement;
    }

    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }

    public int getRestriction() {
        return restriction;
    }

    public void setRestriction(int restriction) {
        this.restriction = restriction;
    }

    public int getPrefixedId() {
        return prefixedId;
    }

    public void setPrefixedId(int prefixedId) {
        this.prefixedId = prefixedId;
    }

    public Set<Resource> getResources() {
        return resources;
    }

    public void setResources(Set<Resource> resources) {
        this.resources = resources;
    }
}
