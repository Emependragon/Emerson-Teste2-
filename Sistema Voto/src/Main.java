import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Emepe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ContadorVotos contador = new ContadorVotos();
        InterfaceGrafica interfaceGrafica = new InterfaceGrafica(contador);
        interfaceGrafica.exibirMenu();
    }
}