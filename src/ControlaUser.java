
public class ControlaUser implements Observer {
    @Override
    public void verifica(Object licensa) {
        System.out.println("O usuario User agora possui acesso:"+licensa);
    }
}
