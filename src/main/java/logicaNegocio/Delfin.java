package logicaNegocio;

public  class Delfin extends Animal {
private String TipoHabitat ;
private String emitirSonido;
private String obtenerDieta;

    public Delfin(String TipoHabitat, String emitirSonido, String obtenerDieta) {
        this.TipoHabitat = TipoHabitat;
        this.emitirSonido = emitirSonido;
        this.obtenerDieta = obtenerDieta;
    }

    public String getTipoHabitat() {
        return TipoHabitat;
    }

    public String getEmitirSonido() {
        return emitirSonido;
    }

    public String getObtenerDieta() {
        return obtenerDieta;
    }

    public void setTipoHabitat(String TipoHabitat) {
        this.TipoHabitat = TipoHabitat;
    }

    public void setEmitirSonido(String emitirSonido) {
        this.emitirSonido = emitirSonido;
    }

    public void setObtenerDieta(String obtenerDieta) {
        this.obtenerDieta = obtenerDieta;
    }
    
    public String emitirSonido(){
        this.emitirSonido = "Chirrido";
        return this.emitirSonido;
    }
     public String obtenerDieta(){
        this.obtenerDieta = "Pescado";
        return this.obtenerDieta;
    }
     public String TipoHabitat(){
        this.TipoHabitat = "ACUATICO";
        return this.TipoHabitat;
    
    
    
   
}
}
     