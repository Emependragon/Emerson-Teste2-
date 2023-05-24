import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Emepe
 */
class Voto {
    private boolean isBranco;
    private boolean isValido;
    private String dataVoto;

    public Voto(boolean isBranco, boolean isValido, String dataVoto) {
        this.isBranco = isBranco;
        this.isValido = isValido;
        this.dataVoto = dataVoto;
    }


    public boolean isIsBranco() {
        return isBranco;
    }

    public void setIsBranco(boolean isBranco) {
        this.isBranco = isBranco;
    }

    public boolean isIsValido() {
        return isValido;
    }

    public void setIsValido(boolean isValido) {
        this.isValido = isValido;
    }

    public String getDataVoto() {
        return dataVoto;
    }

    public void setDataVoto(String dataVoto) {
        this.dataVoto = dataVoto;
    }

    public boolean isValido() {
        return isValido;
    }
     public boolean isBranco() {
        return isBranco;
    }
}
