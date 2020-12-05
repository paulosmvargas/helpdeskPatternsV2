public class BuscaSilver extends BuscaTicket{
	
	@Override
    public Boolean find() {
        System.out.println("Procurando atendimentos no Plano Silver...");
        return false;
    }
	
}
