/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.modelo;

/**
 *
 * @author Estudiante
 */
public class Personas {
    private int codiPers;
    private String nombPers;
    private String apelPers;
    private byte[] fotoPers;
    private int codiTipoPers;
    private String correo;
    private String generPers;
    private String fechNaci;
    private String dui;
    private String nit;
    private String tipoSang;
    private int codiUbi;
    private String fechAlta;
    private String fechBaja;
    private int esta;

    @Override
    public String toString() {
        return this.nombPers ;
    }

    public int getCodiPers() {
        return codiPers;
    }

    public void setCodiPers(int codiPers) {
        this.codiPers = codiPers;
    }

    public String getNombPers() {
        return nombPers;
    }

    public void setNombPers(String nombPers) {
        this.nombPers = nombPers;
    }

    public String getApelPers() {
        return apelPers;
    }

    public void setApelPers(String apelPers) {
        this.apelPers = apelPers;
    }

    public byte[] getFotoPers() {
        return fotoPers;
    }

    public void setFotoPers(byte[] fotoPers) {
        this.fotoPers = fotoPers;
    }

    public int getCodiTipoPers() {
        return codiTipoPers;
    }

    public void setCodiTipoPers(int codiTipoPers) {
        this.codiTipoPers = codiTipoPers;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenerPers() {
        return generPers;
    }

    public void setGenerPers(String generPers) {
        this.generPers = generPers;
    }

    public String getFechNaci() {
        return fechNaci;
    }

    public void setFechNaci(String fechNaci) {
        this.fechNaci = fechNaci;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTipoSang() {
        return tipoSang;
    }

    public void setTipoSang(String tipoSang) {
        this.tipoSang = tipoSang;
    }

    public int getCodiUbi() {
        return codiUbi;
    }

    public void setCodiUbi(int codiUbi) {
        this.codiUbi = codiUbi;
    }

    public String getFechAlta() {
        return fechAlta;
    }

    public void setFechAlta(String fechAlta) {
        this.fechAlta = fechAlta;
    }

    public String getFechBaja() {
        return fechBaja;
    }

    public void setFechBaja(String fechBaja) {
        this.fechBaja = fechBaja;
    }

    public int getEsta() {
        return esta;
    }

    public void setEsta(int esta) {
        this.esta = esta;
    }

    public Personas(String correo) {
        this.correo = correo;
    }

    public Personas(int codiPers, String nombPers, String apelPers, byte[] fotoPers, int codiTipoPers,String correo,String generPers, String fechNaci, String dui, String nit, String tipoSang, int codiUbi, String fechAlta, String fechBaja, int esta) {
        this.codiPers = codiPers;
        this.nombPers = nombPers;
        this.apelPers = apelPers;
        this.fotoPers = fotoPers;
        this.codiTipoPers = codiTipoPers;
        this.correo = correo;
        this.generPers = generPers;
        this.fechNaci = fechNaci;
        this.dui = dui;
        this.nit = nit;
        this.tipoSang = tipoSang;
        this.codiUbi = codiUbi;
        this.fechAlta = fechAlta;
        this.fechBaja = fechBaja;
        this.esta = esta;
    }

    public Personas() {
    }
}
