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

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "mylist")
@NamedQueries({
    @NamedQuery(name = "Mylist.findAll", query = "SELECT m FROM Mylist m"),
    @NamedQuery(name = "Mylist.findByIdmylist", query = "SELECT m FROM Mylist m WHERE m.idmylist = :idmylist")})
public class Mylist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmylist")
    private Integer idmylist;
    @JoinColumn(name = "animeidFK", referencedColumnName = "idanime")
    @ManyToOne(optional = false)
    private Anime animeidFK;
    @JoinColumn(name = "iduserFK", referencedColumnName = "iduser")
    @ManyToOne(optional = false)
    private User iduserFK;

    public Mylist() {
    }

    public Mylist(Integer idmylist) {
        this.idmylist = idmylist;
    }

    public Integer getIdmylist() {
        return idmylist;
    }

    public void setIdmylist(Integer idmylist) {
        this.idmylist = idmylist;
    }

    public Anime getAnimeidFK() {
        return animeidFK;
    }

    public void setAnimeidFK(Anime animeidFK) {
        this.animeidFK = animeidFK;
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
        hash += (idmylist != null ? idmylist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mylist)) {
            return false;
        }
        Mylist other = (Mylist) object;
        if ((this.idmylist == null && other.idmylist != null) || (this.idmylist != null && !this.idmylist.equals(other.idmylist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Mylist[ idmylist=" + idmylist + " ]";
    }
    
}
