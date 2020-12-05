public class Main {

	public static void main(String[] args) {
		System.out.println("---------------------------------------------------");
		System.out.println("-Licenciamento de uso do software HelpDesk Pattern-");
		Licenca free = new LicencaFree("Gratuito","Buscas Limitadas (padrão para qualquer usuário)");
		Licenca silver = new LicencaSilver("Silver","Acesso Gratuito + Recursos");
		Licenca gold = new LicencaGold(free, silver, "Com recursos GOLD!");
		Licenciamento license = new Licenciamento();
		license.addItem(free);
		license.addItem(silver);
		license.addItem(gold);
		license.outLicense();

		Observer novo = new ControlaUser();
        User observado = new User();
        observado.novoAcesso(novo);
        System.out.println("---------------------------------------------------");
        System.out.println("- Mudando acesso para User -");
        observado.setAcesso("Gold");
        System.out.println("---------------------------------------------------");
        System.out.println("- Mudando acesso para User -");
        observado.setAcesso("Silver");
		
		System.out.println("---------------------------------------------------");
		BuscaTicket cFree = new BuscaFree();
        BuscaSilver pS = new BuscaSilver();
        cFree.setNext(pS);
        Boolean found1 = cFree.Chain();
        System.out.println("Encontrado:" + found1);
        System.out.println("---------------------------------------------------");
        
        BuscaTicket cPremium = new BuscaFree();
        BuscaTicket pG = new BuscaGold();
        cPremium.setNext(pG);
        Boolean found = cPremium.Chain();
        System.out.println("Encontrado:" + found);
        System.out.println("---------------------------------------------------");

	}

}
