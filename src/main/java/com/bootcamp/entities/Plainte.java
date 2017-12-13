package com.bootcamp.entities;

import com.bootcamp.commons.annotations.NativeQueryResultColumn;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
public class Plainte {

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private long longitude;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private long lattitude;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private boolean etatValidation;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String contenu;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String etapes;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String reference;

    @ApiModelProperty(value = "creation date of Axe")
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Column(nullable = false)
    private long dateCreation;

    @ApiModelProperty(value = "update date of Axe")
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Column(nullable = false)
    private long dateMiseAJour;

    @Column
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String plaignantPhone;

    @Column
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String plaignantEmail;

    @Column
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String plaignantAppId;
    @Column
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private boolean plainteIsActive;

    public boolean isPlainteIsActive() {
        return plainteIsActive;
    }

    public void setPlainteIsActive(boolean plainteIsActive) {
        this.plainteIsActive = plainteIsActive;
    }

    public String getPlaignantAppId() {
        return plaignantAppId;
    }

    public void setPlaignantAppId(String plaignantAppId) {
        this.plaignantAppId = plaignantAppId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getLattitude() {
        return lattitude;
    }

    public void setLattitude(long lattitude) {
        this.lattitude = lattitude;
    }

    public boolean isEtatValidation() {
        return etatValidation;
    }

    public void setEtatValidation(boolean etatValidation) {
        this.etatValidation = etatValidation;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public String getEtapes() {
        return etapes;
    }

    public void setEtapes(String etapes) {
        this.etapes = etapes;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public long getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    public long getDateMiseAJour() {
        return dateMiseAJour;
    }

    public void setDateMiseAJour(long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }

    public String getPlaignantPhone() {
        return plaignantPhone;
    }

    public void setPlaignantPhone(String plaignantPhone) {
        this.plaignantPhone = plaignantPhone;
    }

    public String getPlaignantEmail() {
        return plaignantEmail;
    }

    public void setPlaignantEmail(String plaignantEmail) {
        this.plaignantEmail = plaignantEmail;
    }
}
