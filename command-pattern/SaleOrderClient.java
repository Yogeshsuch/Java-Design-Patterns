public class SaleOrderClient {
	
	private static Jacket jacket = new Jacket();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderHandler placeOrderHandler = new OrderHandler();
		OrderHandler retunOrderHandler = new OrderHandler();
		
		placeOrderHandler.invoke(new PlaceOrderHandler(jacket));
		retunOrderHandler.invoke(new ReturnOrderHandler(jacket));
	}

}
