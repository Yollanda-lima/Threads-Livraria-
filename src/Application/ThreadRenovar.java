package Application;

public class ThreadRenovar extends Thread {

	private Clientes cliente;
	private Livros livro;
	
	public ThreadRenovar(Livros livro, Clientes cliente){
		this.livro = livro;
		this.cliente = cliente;
		}
	
@Override
	
	public void run() {
		
		this.livro.estender();
		
	}
	
	
	
	
}
