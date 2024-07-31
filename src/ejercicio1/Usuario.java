package ejercicio1;

public class Usuario {
    private String usuarioBase;
    private String usuarioIngresado;
    private String claveBase;
    private String claveIngresada;
    private boolean estadoSistema;

    public Usuario(String usuarioBase, String claveBase, boolean estadoSistema) {
        this.usuarioBase = usuarioBase;
        this.claveBase = claveBase;
        this.estadoSistema = estadoSistema;
    }

    public boolean validarEstado() {
        return estadoSistema;
    }

    public boolean permitirAcceso(String usuarioIngresado, String claveIngresada) {
        this.usuarioIngresado = usuarioIngresado;
        this.claveIngresada = claveIngresada;

        return validarEstado() && usuarioBase.equals(usuarioIngresado) && claveBase.equals(claveIngresada);
    }

    public String getUsuarioBase() {
        return usuarioBase;
    }

    public void setUsuarioBase(String usuarioBase) {
        this.usuarioBase = usuarioBase;
    }

    public String getUsuarioIngresado() {
        return usuarioIngresado;
    }

    public void setUsuarioIngresado(String usuarioIngresado) {
        this.usuarioIngresado = usuarioIngresado;
    }

    public String getClaveBase() {
        return claveBase;
    }

    public void setClaveBase(String claveBase) {
        this.claveBase = claveBase;
    }

    public String getClaveIngresada() {
        return claveIngresada;
    }

    public void setClaveIngresada(String claveIngresada) {
        this.claveIngresada = claveIngresada;
    }

    public boolean isEstadoSistema() {
        return estadoSistema;
    }

    public void setEstadoSistema(boolean estadoSistema) {
        this.estadoSistema = estadoSistema;
    }
}

