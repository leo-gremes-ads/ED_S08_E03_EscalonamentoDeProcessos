package model;

public class Processo
{
	private String nome;
	private int retornos;

	public Processo(String nome, int retornos)
	{
		super();
		this.nome = nome;
		this.retornos = retornos;
	}

	public void decremento()
	{
		this.retornos--;
	}

	public int getRetornos()
	{
		return this.retornos;
	}

	@Override
	public String toString()
	{
		return "[" + this.nome + "(" + this.retornos + ")]";
	}
}
