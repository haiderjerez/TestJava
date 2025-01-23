package Model.Entities;

public class Transaccion {
    private int id;
    private int idCuenta;
    private String tipo;
    private double monto;
    private String fecha;
    private String referencia;
    private double saldoAnterior;
    private double saldoNuevo;
    private String estado;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getIdCuenta() { return idCuenta; }
    public void setIdCuenta(int idCuenta) { this.idCuenta = idCuenta; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getReferencia() { return referencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }

    public double getSaldoAnterior() { return saldoAnterior; }
    public void setSaldoAnterior(double saldoAnterior) { this.saldoAnterior = saldoAnterior; }

    public double getSaldoNuevo() { return saldoNuevo; }
    public void setSaldoNuevo(double saldoNuevo) { this.saldoNuevo = saldoNuevo; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
