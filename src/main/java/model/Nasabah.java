/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author St0rm
 */
public class Nasabah {
    private Integer idNasabah;
    private String namaNasabah;
    private String alamat;

    public Nasabah(Integer idNasabah, String namaNasabah, String alamat) {
        this.idNasabah = idNasabah;
        this.namaNasabah = namaNasabah;
        this.alamat = alamat;
    }

    public Nasabah() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Integer getIdNasabah() {
        return idNasabah;
    }

    public void setIdNasabah(Integer idNasabah) {
        this.idNasabah = idNasabah;
    }

    public String getNamaNasabah() {
        return namaNasabah;
    }

    public void setNamaNasabah(String namaNasabah) {
        this.namaNasabah = namaNasabah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public String toString() {
        return "Nasabah{" + "idNasabah=" + idNasabah + ", namaNasabah=" + namaNasabah + ", alamat=" + alamat + '}';
    }
    
}
