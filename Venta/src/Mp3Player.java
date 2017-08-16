public class Mp3Player extends AutoDecorator {
	public Mp3Player(Vendible vendible) {
		super(vendible);
	}

	public String getDescripcion() {
		return getVendible().getDescripcion() + " + MPC Player";
	}

	public int getPrecio() {
		return getVendible().getPrecio() + 250;
	}
}
