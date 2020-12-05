public class LicencaGold implements Licenca {
	Licenca desc1;
    Licenca desc2;
    private String acesso;

    public LicencaGold(Licenca desc1, Licenca desc2, String acesso) {
    	this.desc1 = desc1;
    	this.desc2 = desc2;
        this.acesso = acesso;
    }
    
    @Override
    public String getDesc() {
    	return "GOLD - Todos os recursos dos planos " + desc1.getDesc() + " e " + desc2.getDesc();
    }

    @Override
    public String getAcesso() {
        return this.acesso;
    }
}