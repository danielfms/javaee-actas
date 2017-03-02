/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

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
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author danielfms
 */
@Entity
@Table(name = "actas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actas.findAll", query = "SELECT a FROM Actas a")
    , @NamedQuery(name = "Actas.findById", query = "SELECT a FROM Actas a WHERE a.id = :id")
    , @NamedQuery(name = "Actas.findByFecha", query = "SELECT a FROM Actas a WHERE a.fecha = :fecha")
    , @NamedQuery(name = "Actas.findByLugar", query = "SELECT a FROM Actas a WHERE a.lugar = :lugar")
    , @NamedQuery(name = "Actas.findByProximaReunion", query = "SELECT a FROM Actas a WHERE a.proximaReunion = :proximaReunion")})
public class Actas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "lugar")
    private String lugar;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "proxima_reunion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date proximaReunion;
    @JoinTable(name = "actas_personas", joinColumns = {
        @JoinColumn(name = "acta_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "persona_id", referencedColumnName = "id")})
    @ManyToMany
    private List<Personas> personasList = null;
    @JoinColumn(name = "proyecto_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Proyectos proyectoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actaId")
    private List<Compromisos> compromisosList;

    public Actas() {
    }

    public Actas(Integer id) {
        this.id = id;
    }

    public Actas(Integer id, Date fecha, String lugar, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.lugar = lugar;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getProximaReunion() {
        return proximaReunion;
    }

    public void setProximaReunion(Date proximaReunion) {
        this.proximaReunion = proximaReunion;
    }

    @XmlTransient
    public List<Personas> getPersonasList() {
        return personasList;
    }

    public void setPersonasList(List<Personas> personasList) {
        this.personasList = personasList;
    }

    public Proyectos getProyectoId() {
        return proyectoId;
    }

    public void setProyectoId(Proyectos proyectoId) {
        this.proyectoId = proyectoId;
    }

    @XmlTransient
    public List<Compromisos> getCompromisosList() {
        return compromisosList;
    }

    public void setCompromisosList(List<Compromisos> compromisosList) {
        this.compromisosList = compromisosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actas)) {
            return false;
        }
        Actas other = (Actas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
}
