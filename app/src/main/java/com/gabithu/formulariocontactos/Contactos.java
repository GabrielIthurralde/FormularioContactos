package com.gabithu.formulariocontactos;

public class Contactos {

    private String nombre;
    private String fechanacimiento;
    private String telefono;
    private String email;
    private String descripcioncomentario;
    private int foto;


    public Contactos(int foto, String nombre, String fechanacimiento, String telefono, String email, String descripcioncomentario) {
        this.foto=foto;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.telefono = telefono;
        this.email = email;
        this.descripcioncomentario = descripcioncomentario;
    }

    public static void add(Contactos contactos) {
    }

    public static Contactos get(int position) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcioncomentario() {
        return descripcioncomentario;
    }

    public void setDescripcioncomentario(String descripcioncomentario) {
        this.descripcioncomentario = descripcioncomentario;
    }

    public String getDescripcionComentario() {
        return null;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
