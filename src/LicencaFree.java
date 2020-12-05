
public class LicencaFree implements Licenca {

	private String desc;
    private String acesso;

    public LicencaFree(String desc,String acesso) {
        this.desc = desc;
        this.acesso = acesso;
    }
    
    @Override
    public String getDesc() {
        return desc;
    }

    @Override
    public String getAcesso() {
        return this.acesso;
    }
    
}
