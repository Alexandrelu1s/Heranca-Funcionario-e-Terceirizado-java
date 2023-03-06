package entities;

public class Terceirizados extends Funcionario{
	private Double cargaAdicional;
	
	public Terceirizados(Double cargaAdicional, String nome, int horas, Double valorPorHora) {
		super(nome, horas, valorPorHora);
		this.cargaAdicional = cargaAdicional;
	}

	public Double getCargaAdicional() {
		return cargaAdicional;
	}

	public void setCargaAdicional(Double cargaAdicional) {
		this.cargaAdicional = cargaAdicional;
	}
	
	@Override
	public Double pagamento() {
		return (getValorPorHora() * getHoras()) + (cargaAdicional * 110.0/100.0);
	}
	
	@Override
	public String toString() {
		return getNome() + ", " + getHoras() + ", " + getValorPorHora() + ", " + getCargaAdicional() + ", " + pagamento();
	}
}
