package Application;

public class ThreadDevolver extends Thread {

	private Clientes cliente;
	private Livros livro;
	
	public ThreadDevolver(Livros livro, Clientes cliente){
		this.livro = livro;
		this.cliente = cliente;
		}
	
@Override
	
	public void run() {
		
		this.cliente.devolver(this.livro);
		
	}
	
	
	
	
	
}
