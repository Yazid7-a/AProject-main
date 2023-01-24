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
import javax.persistence.Lob;
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
@Table(name = "anime")
@NamedQueries({
    @NamedQuery(name = "Anime.findAll", query = "SELECT a FROM Anime a"),
    @NamedQuery(name = "Anime.findByIdanime", query = "SELECT a FROM Anime a WHERE a.idanime = :idanime"),
    @NamedQuery(name = "Anime.findByName", query = "SELECT a FROM Anime a WHERE a.name = :name"),
    @NamedQuery(name = "Anime.findByAuthor", query = "SELECT a FROM Anime a WHERE a.author = :author"),
    @NamedQuery(name = "Anime.findByDescription", query = "SELECT a FROM Anime a WHERE a.description = :description"),
    @NamedQuery(name = "Anime.findByNcaps", query = "SELECT a FROM Anime a WHERE a.ncaps = :ncaps"),
    @NamedQuery(name = "Anime.findBySeasons", query = "SELECT a FROM Anime a WHERE a.seasons = :seasons"),
    @NamedQuery(name = "Anime.findByLaunch", query = "SELECT a FROM Anime a WHERE a.launch = :launch"),
    @NamedQuery(name = "Anime.findByEnd", query = "SELECT a FROM Anime a WHERE a.end = :end"),
    @NamedQuery(name = "Anime.findByLanguage", query = "SELECT a FROM Anime a WHERE a.language = :language"),
    @NamedQuery(name = "Anime.findByRate", query = "SELECT a FROM Anime a WHERE a.rate = :rate"),
    @NamedQuery(name = "Anime.findByMovie", query = "SELECT a FROM Anime a WHERE a.movie = :movie"),
    @NamedQuery(name = "Anime.findByCategory", query = "SELECT a FROM Anime a WHERE a.category = :category")})
public class Anime implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idanime")
    private Integer idanime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "author")
    private String author;
    @Size(max = 205)
    @Column(name = "description")
    private String description;
    @Column(name = "ncaps")
    private Integer ncaps;
    @Column(name = "seasons")
    private Integer seasons;
    @Basic(optional = false)
    @NotNull
    @Column(name = "launch")
    @Temporal(TemporalType.TIMESTAMP)
    private Date launch;
    @Column(name = "end")
    @Temporal(TemporalType.TIMESTAMP)
    private Date end;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "language")
    private String language;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "rate")
    private Double rate;
    @Column(name = "movie")
    private Boolean movie;
    @Size(max = 45)
    @Column(name = "category")
    private String category;
    @Lob
    @Column(name = "portada")
    private String portada;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "animeIdanime")
    private List<Chapters> chaptersList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "animeidFK")
    private List<Mylist> mylistList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "animeidFK")
    private List<Review> reviewList;

    public Anime() {
    }

    public Anime(Integer idanime) {
        this.idanime = idanime;
    }

    public Anime(String name, String author, String description, Integer ncaps, Integer seasons, Date launch, Date end, String language, Double rate, Boolean movie, String category, String portada, List<Chapters> chaptersList, List<Mylist> mylistList, List<Review> reviewList) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.ncaps = ncaps;
        this.seasons = seasons;
        this.launch = launch;
        this.end = end;
        this.language = language;
        this.rate = rate;
        this.movie = movie;
        this.category = category;
        this.portada = portada;
        this.chaptersList = chaptersList;
        this.mylistList = mylistList;
        this.reviewList = reviewList;
    }

    public Anime(Integer idanime, String name, String author, Date launch, String language) {
        this.idanime = idanime;
        this.name = name;
        this.author = author;
        this.launch = launch;
        this.language = language;
    }

    public Anime(String name, String author, String description, int ncaps, int seasons, java.sql.Date launch, java.sql.Date end, String language, double rate, boolean movie, String category, String portada) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.ncaps = ncaps;
        this.seasons = seasons;
        this.launch = launch;
        this.end = end;
        this.language = language;
        this.rate = rate;
        this.movie = movie;
        this.category = category;
        this.portada = portada;
        this.chaptersList = chaptersList;
        this.mylistList = mylistList;
        this.reviewList = reviewList;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Integer getIdanime() {
        return idanime;
    }

    public void setIdanime(Integer idanime) {
        this.idanime = idanime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNcaps() {
        return ncaps;
    }

    public void setNcaps(Integer ncaps) {
        this.ncaps = ncaps;
    }

    public Integer getSeasons() {
        return seasons;
    }

    public void setSeasons(Integer seasons) {
        this.seasons = seasons;
    }

    public Date getLaunch() {
        return launch;
    }

    public void setLaunch(Date launch) {
        this.launch = launch;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Boolean getMovie() {
        return movie;
    }

    public void setMovie(Boolean movie) {
        this.movie = movie;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }

    public List<Chapters> getChaptersList() {
        return chaptersList;
    }

    public void setChaptersList(List<Chapters> chaptersList) {
        this.chaptersList = chaptersList;
    }

    public List<Mylist> getMylistList() {
        return mylistList;
    }

    public void setMylistList(List<Mylist> mylistList) {
        this.mylistList = mylistList;
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
        hash += (idanime != null ? idanime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anime)) {
            return false;
        }
        Anime other = (Anime) object;
        if ((this.idanime == null && other.idanime != null) || (this.idanime != null && !this.idanime.equals(other.idanime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Anime[ idanime=" + idanime + " ]";
    }
    
}
