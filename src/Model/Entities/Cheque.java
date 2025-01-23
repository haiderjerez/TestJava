package Model.Entities;

public class Cheque {
    private int id;
    private String numeroCheque;
    private int idCuenta;
    private String beneficiario;
    private double monto;
    private String montoLetras;
    private String prioridad;
    private String firmaDigital;
    private String estado;
    private String razonRechazo;
    private String fechaEmision;
    private String fechaProceso;
    private boolean cobrado;
    private double cuentaSaldoMomento;
    private String fechaModificacion;
    private String usuarioModificacion;

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNumeroCheque() { return numeroCheque; }
    public void setNumeroCheque(String numeroCheque) { this.numeroCheque = numeroCheque; }

    public int getIdCuenta() { return idCuenta; }
    public void setIdCuenta(int idCuenta) { this.idCuenta = idCuenta; }

    public String getBeneficiario() { return beneficiario; }
    public void setBeneficiario(String beneficiario) { this.beneficiario = beneficiario; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public String getMontoLetras() { return montoLetras; }
    public void setMontoLetras(String montoLetras) { this.montoLetras = montoLetras; }

    public String getPrioridad() { return prioridad; }
    public void setPrioridad(String prioridad) { this.prioridad = prioridad; }

    public String getFirmaDigital() { return firmaDigital; }
    public void setFirmaDigital(String firmaDigital) { this.firmaDigital = firmaDigital; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getRazonRechazo() { return razonRechazo; }
    public void setRazonRechazo(String razonRechazo) { this.razonRechazo = razonRechazo; }

    public String getFechaEmision() { return fechaEmision; }
    public void setFechaEmision(String fechaEmision) { this.fechaEmision = fechaEmision; }

    public String getFechaProceso() { return fechaProceso; }
    public void setFechaProceso(String fechaProceso) { this.fechaProceso = fechaProceso; }

    public boolean isCobrado() { return cobrado; }
    public void setCobrado(boolean cobrado) { this.cobrado = cobrado; }

    public double getCuentaSaldoMomento() { return cuentaSaldoMomento; }
    public void setCuentaSaldoMomento(double cuentaSaldoMomento) { this.cuentaSaldoMomento = cuentaSaldoMomento; }

    public String getFechaModificacion() { return fechaModificacion; }
    public void setFechaModificacion(String fechaModificacion) { this.fechaModificacion = fechaModificacion; }

    public String getUsuarioModificacion() { return usuarioModificacion; }
    public void setUsuarioModificacion(String usuarioModificacion) { this.usuarioModificacion = usuarioModificacion; }
}
