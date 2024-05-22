package co.com.Bancolombia;

import java.util.ArrayList;

public class Cliente implements ServicioCuentas{

    private int numero;
    private String nombre;
    private Domicilio domicilio;
    private String rfc;
    private String telefono;
    private ArrayList<Cuenta> cuentas;
    private String fechaNacimiento;

    public Cliente(int numero, String nombre, Domicilio domicilio, String rfc, String telefono, String fechaNacimiento) {
        this.numero = numero;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.rfc = rfc;
        this.telefono = telefono;
        this.cuentas = new ArrayList<Cuenta>();
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public boolean agregarCuenta(Cuenta cuenta){
        return cuentas.add(cuenta);
    }
    public boolean cancelarCuenta(int numero){
        return cuentas.removeIf(cuenta -> cuenta.getNumero() == numero);
    }
    public void abonarCuenta(int numero, double abono){
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numero){
                cuenta.setSaldo(cuenta.getSaldo() + abono);
                break;
            }
        }

    }
    public void retirar(int numero, double retiro){
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero() == numero){
                cuenta.setSaldo(cuenta.getSaldo() - retiro);
                break;
            }
        }
    }
    public Cuenta[] obtenerCuentas(){
        return cuentas.toArray(new Cuenta[0]);
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "numero=" + numero + ", " +
                "nombre=" + nombre + ", " +
                "domicilio=" + domicilio + ", " +
                "rfc=" + rfc + ", " +
                "telefono=" + telefono + ", " +
                "fechaNacimiento=" + fechaNacimiento + '}';
    }
}