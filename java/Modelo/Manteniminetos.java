/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
 * @author FRANCO
 */
@Entity
@Table(name = "manteniminetos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Manteniminetos.findAll", query = "SELECT m FROM Manteniminetos m")
    , @NamedQuery(name = "Manteniminetos.findByIdVehiculo", query = "SELECT m FROM Manteniminetos m WHERE m.idVehiculo = :idVehiculo")
    , @NamedQuery(name = "Manteniminetos.findByNombre", query = "SELECT m FROM Manteniminetos m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Manteniminetos.findByFecha", query = "SELECT m FROM Manteniminetos m WHERE m.fecha = :fecha")
    , @NamedQuery(name = "Manteniminetos.findByDescripcion", query = "SELECT m FROM Manteniminetos m WHERE m.descripcion = :descripcion")
    , @NamedQuery(name = "Manteniminetos.findByKilometraje", query = "SELECT m FROM Manteniminetos m WHERE m.kilometraje = :kilometraje")})
public class Manteniminetos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_vehiculo")
    private Integer idVehiculo;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @Size(max = 45)
    @Column(name = "kilometraje")
    private String kilometraje;

    public Manteniminetos() {
    }

    public Manteniminetos(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVehiculo != null ? idVehiculo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manteniminetos)) {
            return false;
        }
        Manteniminetos other = (Manteniminetos) object;
        if ((this.idVehiculo == null && other.idVehiculo != null) || (this.idVehiculo != null && !this.idVehiculo.equals(other.idVehiculo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Manteniminetos[ idVehiculo=" + idVehiculo + " ]";
    }
    
}
