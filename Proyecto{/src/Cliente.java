/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Cliente {

    private String Nombres;
    private String Apellidos;
    private int Cedula;
    private String Email;
    private String Ciudad;
    private String Direccion;
    private String Celular;
    private int Edad = 18;
    private String CodPostal;

    public Cliente() {
    }

    public Cliente(String Nombres, String Apellidos, int Cedula, String Email, String Ciudad, String Direccion, String Celular, String CodPostal) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Cedula = Cedula;
        this.Email = Email;
        this.Ciudad = Ciudad;
        this.Direccion = Direccion;
        this.Celular = Celular;
        this.CodPostal = CodPostal;
    }

    /**
     * @return the Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres the Nombres to set
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    /**
     * @return the Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos the Apellidos to set
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * @return the Cedula
     */
    public int getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Ciudad
     */
    public String getCiudad() {
        return Ciudad;
    }

    /**
     * @param Ciudad the Ciudad to set
     */
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the CodPostal
     */
    public String getCodPostal() {
        return CodPostal;
    }

    /**
     * @param CodPostal the CodPostal to set
     */
    public void setCodPostal(String CodPostal) {
        this.CodPostal = CodPostal;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", Cedula=" + Cedula + ", Email=" + Email + ", Ciudad=" + Ciudad + ", Direccion=" + Direccion + ", Celular=" + Celular + ", Edad=" + Edad + ", CodPostal=" + CodPostal + '}';
    }

}
