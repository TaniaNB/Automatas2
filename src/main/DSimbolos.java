
package main;

public class DSimbolos {
    
        private int no;
        private String simbolo;
        private String tipoSimbolo;
        private int linea;

    public DSimbolos(int x, String y, String z, int linea) {
        this.no = x;
        this.simbolo = y;
        this.tipoSimbolo = z;
        this.linea = linea;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getNo() {
        return no;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public String getTipoSimbolo() {
        return tipoSimbolo;
    }
    
}
