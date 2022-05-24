package application;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import application.model.Pedidos;
import conection.connection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainViewController {
	
	@FXML
	private Button btCliclar;
	
	@FXML 
	private TableView<Pedidos> tableViewPedidos;
	
	@FXML 
	private TableColumn<Pedidos, Integer> clid;
	
	@FXML 
	private TableColumn<Pedidos, String> clnumeroPedido;
	
	@FXML 
	private TableColumn<Pedidos, String> clstatus;
	
	private List<Pedidos> listPedidos = new ArrayList();
	
	private ObservableList<Pedidos> observableListPedidos = FXCollections.observableArrayList();
	
	
	public void carregarPedidos() {
		

		
		connection conn = new connection ();
		String sql = "Select * from tab_Pedidos";
		
		ResultSet rs = conn.Busca(sql);
		
		try {
			while(rs.next()) {
		
				observableListPedidos.add(new Pedidos (
						rs.getInt("id"),
						rs.getString("numero_Pedido"),
						rs.getString("status")));
				
				tableViewPedidos.setItems(observableListPedidos);

				}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
	public void onBtTesteAction(){
		
		carregarPedidos();
		
		Pedidos pedidos;
		
		clid.setCellValueFactory(new PropertyValueFactory<Pedidos, Integer>("id"));
		
		
	
		connection conn = new connection ();
		String sql = "Select * from tab_Pedidos";
		
		ResultSet rs = conn.Busca(sql);
		
		try {
			while(rs.next()) {
				int id = rs.getInt("id");
				
				String numeroPedido = rs.getString("numero_pedido");
				String status = rs.getString("status");
				
				
				
				
				System.out.println(id+" - "+numeroPedido+" - "+status);
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	
	;
	

	private void preencherLista() {
		
		


		
	}
	

}
