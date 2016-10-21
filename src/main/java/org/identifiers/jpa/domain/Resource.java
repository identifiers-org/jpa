package org.identifiers.jpa.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sarala on 26/09/2016.
 */

@Entity
@Table(name="mir_resource")
public class Resource implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="resource_id")
    private String id;

    @Column(name="url_element_prefix")
    private String urlPrefix;

    @Column(name="url_element_suffix")
    private String urlSuffix;

    @Column(name="url_resource")
    private String urlResource;

    private String info;
    private String institution;
    private String location;
    private String example;
    private int official;
    private int obsolete;

    @Column(name="frame_deny")
    private int frameDeny;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ptr_datatype")
    private Collection collection;

    @Column(name="convertprefix")
    private String convertPrefix;

    @Column(name="prefix")
    private String resourcePrefix;

    protected Resource(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrlPrefix() {
        return urlPrefix;
    }

    public void setUrlPrefix(String urlPrefix) {
        this.urlPrefix = urlPrefix;
    }

    public String getUrlSuffix() {
        return urlSuffix;
    }

    public void setUrlSuffix(String urlSuffix) {
        this.urlSuffix = urlSuffix;
    }

    public String getUrlResource() {
        return urlResource;
    }

    public void setUrlResource(String urlResource) {
        this.urlResource = urlResource;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public int getOfficial() {
        return official;
    }

    public void setOfficial(int official) {
        this.official = official;
    }

    public int getObsolete() {
        return obsolete;
    }

    public void setObsolete(int obsolete) {
        this.obsolete = obsolete;
    }

    public int getFrameDeny() {
        return frameDeny;
    }

    public void setFrameDeny(int frameDeny) {
        this.frameDeny = frameDeny;
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

    public String getResourcePrefix() {
        return resourcePrefix;
    }

    public void setResourcePrefix(String resourcePrefix) {
        this.resourcePrefix = resourcePrefix;
    }
}
