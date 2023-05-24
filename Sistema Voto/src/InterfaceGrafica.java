import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Emepe
 */
class InterfaceGrafica {
    private ContadorVotos contador;

    public InterfaceGrafica(ContadorVotos contador) {
        this.contador = contador;
    }

    public void exibirMenu() {
        String opcao;
        do {
            opcao = JOptionPane.showInputDialog("Escolha uma opção:"
                    + "\n1. Registrar município"
                    + "\n2. Registrar candidato"
                    + "\n3. Registrar voto"
                    + "\n4. Listar municípios"
                    + "\n5. Listar candidatos"
                    + "\n6. Contar votos"
                    + "\n0. Sair");

            switch (opcao) {
                case "1":
                    registrarMunicipio();
                    break;
                case "2":
                    registrarCandidato();
                    break;
                case "3":
                    registrarVoto();
                    break;
                case "4":
                    listarMunicipios();
                    break;
                case "5":
                    listarCandidatos();
                    break;
                case "6":
                    contarVotos();
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Encerrando o programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (!opcao.equals("0"));
    }

    private void registrarMunicipio() {
        String descricao = JOptionPane.showInputDialog("Informe a descrição do município:");
        String provincia = JOptionPane.showInputDialog("Informe a província do município:");
        String quantRecenseadosStr = JOptionPane.showInputDialog("Informe a quantidade de recenseados:");
        int quantRecenseados = Integer.parseInt(quantRecenseadosStr);

        Municipio municipio = new Municipio(descricao, provincia, quantRecenseados);
        contador.adicionarMunicipio(municipio);

        JOptionPane.showMessageDialog(null, "Município registrado com sucesso!");
    }

    private void registrarCandidato() {
        String nome = JOptionPane.showInputDialog("Informe o nome do candidato:");
        String biStr = JOptionPane.showInputDialog("Informe o BI do candidato:");
        int bi = Integer.parseInt(biStr);
        String historico = JOptionPane.showInputDialog("Informe o histórico do candidato:");

        Candidato candidato = new Candidato(nome, bi, historico);
        contador.adicionarCandidato(candidato);

        JOptionPane.showMessageDialog(null, "Candidato registrado com sucesso!");
    }

    private void registrarVoto() {
        String isBrancoStr = JOptionPane.showInputDialog("O voto é em branco? (S/N)");
        boolean isBranco = isBrancoStr.equalsIgnoreCase("S");

        String isValidoStr = JOptionPane.showInputDialog("O voto é válido? (S/N)");
        boolean isValido = isValidoStr.equalsIgnoreCase("S");

        String dataVoto = JOptionPane.showInputDialog("Informe a data do voto:");

        Voto voto = new Voto(isBranco, isValido, dataVoto);
        contador.adicionarVoto(voto);

        JOptionPane.showMessageDialog(null, "Voto registrado com sucesso!");
    }

    private void listarMunicipios() {
        contador.listarMunicipios();
    }

    private void listarCandidatos() {
        contador.listarCandidatos();
    }

    private void contarVotos() {
        contador.contarVotos();
    }
}