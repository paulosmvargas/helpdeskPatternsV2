public abstract class BuscaTicket {
	
    private BuscaTicket next;
    public void setNext(BuscaTicket next) {
        this.next = next;
    }
    
    public abstract Boolean find();
    public Boolean Chain(){
        if (find()==true){
            return true; 
        }else if (next!= null){
            return next.Chain();
        }else{
            return false;
        }
    }
    
}
