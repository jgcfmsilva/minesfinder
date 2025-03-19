public class TipoJogo {

    // fields
    private int linhas;
    private int colunas;
    private int minas;
    private String tipo;

    // constructor
    public TipoJogo(int linhas, int colunas, int minas, String tipo) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;
        this.tipo = tipo;
    }

    // gets
    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public int getMinas() {
        return minas;
    }

    public String getTipo() {
        return tipo;
    }
}
