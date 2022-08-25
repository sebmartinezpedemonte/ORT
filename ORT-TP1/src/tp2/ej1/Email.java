package tp2.ej1;

public class Email {
	private String cuenta;
	private String dominio;
	
	public Email(String email) {
		String[] partes = email.split("@");
		this.cuenta = partes[0];
		this.dominio = partes[1];
	}
	
	public String getValor() {
		//return this.cuenta + "@" + this.dominio;
		return String.format("%s@%s", this.cuenta, this.dominio);
	}
	
	
}
