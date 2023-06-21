package entidade;

public class Evento {
	private int codigo;
	private String titulo;
	private String local;
	private String data;
	private String hora;
	private int capacidade;
	private int qtdLugaresVendidos;
	private double valorIngresso;
	private String status;
	private int qtdLugaresLivres;

	private static final double VALOR_DEFAULT_INGRSSO = 100;
	private static final int CAPACIDADE_DEFAULT = 3 ;
	private static int  QTD_INGRESSOS_VENDA_DEFAULT = 2;


	public Evento(int codigo, String titulo, String local, String data, String hora) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.local = local;
		this.data = data;
		this.hora = hora;
		this.capacidade = CAPACIDADE_DEFAULT;
		this.qtdLugaresVendidos = 0;
		this.valorIngresso = VALOR_DEFAULT_INGRSSO;
		this.status = "Vendas não iniciadas";
	}
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getLocal() {
		return local;
	}


	public void setLoca(String local) {
		this.local = local;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}


	public int getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}


	public int getQtdLugaresVendidos() {
		return qtdLugaresVendidos;
	}


	public void setQtdLugaresVendidos(int qtdLugaresVendidos) {
		this.qtdLugaresVendidos = qtdLugaresVendidos;
	}


	public double getValorIngresso() {
		return valorIngresso;
	}


	public void setValorIngresso(double valorIngresso) {
		this.valorIngresso = valorIngresso;
	}


	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void venda(int qtdIngresso) {
	 if (status.equals("Venda Iniciada") && getQtdLugaresVendidos()<= capacidade) {
		qtdLugaresVendidos -= qtdIngresso;
		qtdIngresso += qtdIngresso;
		System.out.println("Venda realizada com sucesso");

	 }else {
		 System.out.println("Não foi possivel realizar a venda");
	 }	 
	}

    public void venda() {
    	venda(QTD_INGRESSOS_VENDA_DEFAULT);
    }

	public void iniciarvenda() {
		if (!status.equals("Evento cancelado") && status.equals("Evento não iniciado")) {
			status = "Venda iniciada";
			System.out.println("Vendas iniciadas com sucesso");
		}else {
			System.out.println("Não foi possivel iniciar as vendas");
		}
	}

     public int qtdLugaresLivres () {
		return capacidade - qtdLugaresVendidos;	 
     }

	public void Ocorrido() {
	if (status.equals("Vendas iniciadas") && !status.equals("Evento cancelado")) {
		status = "Evento ocorrido";
	}else {
		System.out.println("Evento não ocorrido");
	}
	}

    public void EventoCancelado() {
    if (status.equals("Vendas não iniciadas") && !status.equals("Evento ocorrido")) {
    	status = "Evento cancelado";
    	System.out.println("Evento cancelado");
    }else {
    	System.out.println("Evento não cancelado");
    }
    }
    public void FinalizarVenda() {
    	if(status.equals("Venda iniciada")) {
    	status = "venda encerrada";
    	System.out.println("Vendas encerradas");
    	}else {
    		System.out.println("Vendas não encerradas");
    	}
    }






	@Override
	public String toString() {
		return "Evento [codigo=" + codigo 
				+ ", titulo=" + titulo 
				+ ", local=" + local
				+ ", data=" + data
				+ ", hora=" + hora 
				+ ", capacidade=" + capacidade 
				+ ", qtdLugaresVendidos=" 
				+ qtdLugaresVendidos
				+ ", valorIngresso=" + valorIngresso 
				+ ", status=" + status + "]";
	}



	}






