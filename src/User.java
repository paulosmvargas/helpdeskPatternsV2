import java.util.ArrayList;
import java.util.List;

public class User {
	private List<Observer> observers = new ArrayList<>();
    private String acesso;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        notificarTodos(nome);
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
        notificarTodos(acesso);
    }

    private void notificarTodos(Object licensa) {
        for (Observer obs : observers) {
            obs.verifica(licensa);
        }
    }

    public void novoAcesso(Observer obs) {
    	observers.add(obs);
    }
}
