/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "chapters")
@NamedQueries({
    @NamedQuery(name = "Chapters.findAll", query = "SELECT c FROM Chapters c"),
    @NamedQuery(name = "Chapters.findByIdchapters", query = "SELECT c FROM Chapters c WHERE c.idchapters = :idchapters"),
    @NamedQuery(name = "Chapters.findByTitle", query = "SELECT c FROM Chapters c WHERE c.title = :title"),
    @NamedQuery(name = "Chapters.findByDuration", query = "SELECT c FROM Chapters c WHERE c.duration = :duration"),
    @NamedQuery(name = "Chapters.findByLaunch", query = "SELECT c FROM Chapters c WHERE c.launch = :launch"),
    @NamedQuery(name = "Chapters.findByDescription", query = "SELECT c FROM Chapters c WHERE c.description = :description"),
    @NamedQuery(name = "Chapters.findByRate", query = "SELECT c FROM Chapters c WHERE c.rate = :rate")})
public class Chapters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idchapters")
    private Integer idchapters;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "title")
    private String title;
    @Basic(optional = false)
    @NotNull
    @Column(name = "duration")
    private double duration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "launch")
    @Temporal(TemporalType.TIMESTAMP)
    private Date launch;
    @Size(max = 200)
    @Column(name = "description")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "rate")
    private Double rate;
    @JoinColumn(name = "anime_idanime", referencedColumnName = "idanime")
    @ManyToOne(optional = false)
    private Anime animeIdanime;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idchaptersFK")
    private List<Review> reviewList;

    public Chapters() {
    }

    public Chapters(Integer idchapters) {
        this.idchapters = idchapters;
    }

    public Chapters(Integer idchapters, String title, double duration, Date launch) {
        this.idchapters = idchapters;
        this.title = title;
        this.duration = duration;
        this.launch = launch;
    }

    public Integer getIdchapters() {
        return idchapters;
    }

    public void setIdchapters(Integer idchapters) {
        this.idchapters = idchapters;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Date getLaunch() {
        return launch;
    }

    public void setLaunch(Date launch) {
        this.launch = launch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Anime getAnimeIdanime() {
        return animeIdanime;
    }

    public void setAnimeIdanime(Anime animeIdanime) {
        this.animeIdanime = animeIdanime;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idchapters != null ? idchapters.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chapters)) {
            return false;
        }
        Chapters other = (Chapters) object;
        if ((this.idchapters == null && other.idchapters != null) || (this.idchapters != null && !this.idchapters.equals(other.idchapters))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Chapters[ idchapters=" + idchapters + " ]";
    }
    
}
