package logicaNegocio;

public class Perro extends Animal {

    // TODO: Aquí va tu código
    private String emitirSonido;
    private String obtenerDieta;
    private String TipoHabitat;
    
    public Perro(String emitirSonido, String obtenerDieta, String TipoHabitat) {
        this.emitirSonido = emitirSonido;
        this.obtenerDieta = obtenerDieta;
        this.TipoHabitat = TipoHabitat;
    }

    public String getEmitirSonido() {
        return emitirSonido;
    }

    public String getObtenerDieta() {
        return obtenerDieta;
    }

    public String getTipoHabitat() {
        return TipoHabitat;
    }

    public void setEmitirSonido(String emitirSonido) {
        this.emitirSonido = emitirSonido;
    }

    public void setObtenerDieta(String obtenerDieta) {
        this.obtenerDieta = obtenerDieta;
    }

    public void setTipoHabitat(String TipoHabitat) {
        this.TipoHabitat = TipoHabitat;
    }
    
    @Override
       public String emitirSonido() {
        this.emitirSonido = "Ladrido";
        return this.emitirSonido;
    }

    @Override
    public String obtenerDieta() {
        this.obtenerDieta = "Omnivoro";
        return this.obtenerDieta;
    }

    
}

