public class BuscaFree extends BuscaTicket{
	
	@Override
	public Boolean find() {
        System.out.println("Procurando atendimentos no plano gratuito...");
        return false;
    }
	
}
