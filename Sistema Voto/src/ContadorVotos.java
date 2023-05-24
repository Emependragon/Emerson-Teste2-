import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Emepe
 */
class ContadorVotos {
    private List<Municipio> municipios;
    private List<Candidato> candidatos;
    private List<Voto> votos;

    public ContadorVotos() {
        municipios = new ArrayList<>();
        candidatos = new ArrayList<>();
        votos = new ArrayList<>();
    }

    public void adicionarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public void adicionarVoto(Voto voto) {
        votos.add(voto);
    }

    public void listarMunicipios() {
        for (Municipio municipio : municipios) {
            System.out.println("Descrição: " + municipio.getDescricao());
            System.out.println("Província: " + municipio.getProvincia());
            System.out.println("Quantidade de Recenseados: " + municipio.getQuantRecenseados());
            System.out.println();
        }
    }

    public void listarCandidatos() {
        for (Candidato candidato : candidatos) {
            System.out.println("Nome: " + candidato.getNome());
            System.out.println("BI: " + candidato.getBi());
            System.out.println("Histórico: " + candidato.getHistorico());
            System.out.println();
        }
    }

    public void contarVotos() {
        int totalVotos = votos.size();
        int votosValidos = 0;
        int votosEmBranco = 0;

        for (Voto voto : votos) {
            if (voto.isValido()) {
                votosValidos++;
            }

            if (voto.isBranco()) {
                votosEmBranco++;
            }
        }

        System.out.println("Total de votos: " + totalVotos);
        System.out.println("Votos válidos: " + votosValidos);
        System.out.println("Votos em branco: " + votosEmBranco);
    }
}