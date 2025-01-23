package Model.Entities;

public class Cuenta {
    private int id;
    private int idCliente;
    private String tipo;
    private double saldo;
    private double limiteSaldo;
    private String fechaApertura;
    private String estado;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    public double getLimiteSaldo() { return limiteSaldo; }
    public void setLimiteSaldo(double limiteSaldo) { this.limiteSaldo = limiteSaldo; }

    public String getFechaApertura() { return fechaApertura; }
    public void setFechaApertura(String fechaApertura) { this.fechaApertura = fechaApertura; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
