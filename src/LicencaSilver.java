public class LicencaSilver implements Licenca {
	String desc;
    private String acesso;

    public LicencaSilver(String desc, String acesso) {
    	this.desc = desc;
        this.acesso = acesso;
    }
    
    @Override
    public String getDesc() {
    	return this.desc;
    }

    @Override
    public String getAcesso() {
        return this.acesso;
    }
}
