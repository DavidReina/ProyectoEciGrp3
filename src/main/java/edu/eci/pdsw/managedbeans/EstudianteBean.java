/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author 
 */
@ManagedBean(name="beanEstudiante")

@SessionScoped
public class EstudianteBean {
    private int codigo;
    private int numero_identificacion;
    private String nombre;
    private int semestre;
    private String tipo_identificacion;
     private String carrera;
    private int telefono_fijo;
    private int celular;
    private String direccion;
    private String correo;


    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }
    private int documento;

    public int getTelefono_fijo() {
        return telefono_fijo;
    }

    public int getCelular() {
        return celular;
    }    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //bases de datos


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumero_identificacion() {
        return numero_identificacion;
    }

    public void setNumero_identificacion(int numero_identificacion) {
        this.numero_identificacion = numero_identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getTipo_identificacion() {
        return tipo_identificacion;
    }

    public void setTipo_identificacion(String tipo_identificacion) {
        this.tipo_identificacion = tipo_identificacion;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
        
    public void setTelefono_fijo(int telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

}