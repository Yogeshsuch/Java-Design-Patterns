
public class ReturnOrderHandler implements Handler {
	
	private Jacket jacket;
	
	public ReturnOrderHandler(Jacket jacket) {
		this.jacket = jacket;
	}
	
	@Override
	public void execute() {
		this.jacket.returnOrder();
	}

}
