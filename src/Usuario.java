
public class Usuario {
	RedSocial redes;
	
	public void post(Articulo art){
		redes.post(art);
	}

	public void setRedes(RedSocial redes) {
		this.redes = redes;
	}
}
