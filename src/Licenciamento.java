import java.util.ArrayList;
import java.util.List;

public class Licenciamento {
	
	List<Licenca> itens = new ArrayList<>();
    public void addItem(Licenca item){
        itens.add(item);
    }
    public void outLicense(){
        for(Licenca p:itens){
            System.out.println(p.getDesc()+" - "+p.getAcesso());
        }
    }
    
}
