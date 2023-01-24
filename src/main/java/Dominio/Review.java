/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "review")
@NamedQueries({
    @NamedQuery(name = "Review.findAll", query = "SELECT r FROM Review r"),
    @NamedQuery(name = "Review.findByIdreview", query = "SELECT r FROM Review r WHERE r.idreview = :idreview"),
    @NamedQuery(name = "Review.findByContain", query = "SELECT r FROM Review r WHERE r.contain = :contain")})
public class Review implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreview")
    private Integer idreview;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "contain")
    private String contain;
    @JoinColumn(name = "animeidFK", referencedColumnName = "idanime")
    @ManyToOne(optional = false)
    private Anime animeidFK;
    @JoinColumn(name = "idchaptersFK", referencedColumnName = "idchapters")
    @ManyToOne(optional = false)
    private Chapters idchaptersFK;
    @JoinColumn(name = "iduserFK", referencedColumnName = "iduser")
    @ManyToOne(optional = false)
    private User iduserFK;

    public Review() {
    }

    public Review(Integer idreview) {
        this.idreview = idreview;
    }

    public Review(Integer idreview, String contain) {
        this.idreview = idreview;
        this.contain = contain;
    }

    public Integer getIdreview() {
        return idreview;
    }

    public void setIdreview(Integer idreview) {
        this.idreview = idreview;
    }

    public String getContain() {
        return contain;
    }

    public void setContain(String contain) {
        this.contain = contain;
    }

    public Anime getAnimeidFK() {
        return animeidFK;
    }

    public void setAnimeidFK(Anime animeidFK) {
        this.animeidFK = animeidFK;
    }

    public Chapters getIdchaptersFK() {
        return idchaptersFK;
    }

    public void setIdchaptersFK(Chapters idchaptersFK) {
        this.idchaptersFK = idchaptersFK;
    }

    public User getIduserFK() {
        return iduserFK;
    }

    public void setIduserFK(User iduserFK) {
        this.iduserFK = iduserFK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreview != null ? idreview.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Review)) {
            return false;
        }
        Review other = (Review) object;
        if ((this.idreview == null && other.idreview != null) || (this.idreview != null && !this.idreview.equals(other.idreview))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Review[ idreview=" + idreview + " ]";
    }
    
}
