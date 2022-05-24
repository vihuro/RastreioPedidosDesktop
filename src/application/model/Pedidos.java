package application.model;

public class Pedidos {
	
	private Integer id;
	private String numeroPedido;
	private String status;
	private String idProperty;

	

	public Pedidos(int i, String numeroPedido, String status) {

		this.id = id;
		this.numeroPedido = numeroPedido;
		this.status = status;
		
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNumeroPedido() {
		return numeroPedido;
	}



	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getIdProperty() {
		return idProperty;
	}



	public Integer idProperty() {
		
		return id;
	}



	

}
