public class PlaceOrderHandler implements Handler {
	
	private Jacket jacket;
	
	public PlaceOrderHandler(Jacket jacket) {
		this.jacket = jacket;
	}
	
	@Override
	public void execute() {
		this.jacket.placeOrder();
	}

}
