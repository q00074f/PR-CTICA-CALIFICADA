/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJERCICIO_03;
import java.util.Objects;
//Gaspar Paucar Wilber Andrihu
/**
 *
 * @author Usuario
 */
public class Persona {
    private String dni;
    private String apellidos;
    private String nombres;
    private String sexo;
    private int edad;
    private double peso;

    public Persona(String dni, String apellidos, String nombres,
    String sexo, int edad, double peso) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public Persona(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
    return "Persona{" + "dni=" + dni + ", apellidos=" + apellidos + ", nombres=" + nombres + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + "}";
    }

    @Override
    public int hashCode() {
    int hash = 7;
    hash = 13 * hash + Objects.hashCode(this.dni);
    return hash;
    }

    @Override
    public boolean equals(Object obj) {
    if (obj == null) {

    return false;
    }
    if (getClass() != obj.getClass()) {
    return false;
    }
    final Persona other = (Persona) obj;
    if (!Objects.equals(this.dni, other.dni)) {
    return false;
    }
    return true;
    }
}
