/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author danielfms
 */
@Entity
@Table(name = "compromisos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compromisos.findAll", query = "SELECT c FROM Compromisos c")
    , @NamedQuery(name = "Compromisos.findById", query = "SELECT c FROM Compromisos c WHERE c.id = :id")
    , @NamedQuery(name = "Compromisos.findByFechaEntrega", query = "SELECT c FROM Compromisos c WHERE c.fechaEntrega = :fechaEntrega")})
public class Compromisos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "actividad")
    private String actividad;
    @Column(name = "fecha_entrega")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaEntrega;
    @JoinColumn(name = "acta_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Actas actaId;
    @JoinColumn(name = "responsable", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Personas responsable;

    public Compromisos() {
    }

    public Compromisos(Integer id) {
        this.id = id;
    }

    public Compromisos(Integer id, String actividad) {
        this.id = id;
        this.actividad = actividad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Actas getActaId() {
        return actaId;
    }

    public void setActaId(Actas actaId) {
        this.actaId = actaId;
    }

    public Personas getResponsable() {
        return responsable;
    }

    public void setResponsable(Personas responsable) {
        this.responsable = responsable;
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
        if (!(object instanceof Compromisos)) {
            return false;
        }
        Compromisos other = (Compromisos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "#[ " + id + " ] | Responsable: " + responsable.getNombre();
    }
    
}
