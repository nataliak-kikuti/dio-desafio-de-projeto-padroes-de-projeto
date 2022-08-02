package subsistema2.cep;



public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getIinstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Londrina";
    }
    public String recuperarEstado(String cep){
        return "PR";
    }

}
