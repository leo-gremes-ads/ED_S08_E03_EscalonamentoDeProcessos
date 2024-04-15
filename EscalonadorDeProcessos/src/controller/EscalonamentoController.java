package controller;

import model.Processo;
import lib.model.Fila;

public class EscalonamentoController
{
	public EscalonamentoController()
	{
		super();
	}

	public void escalonador(Fila<Processo> fila)
	{
		Processo p;

		try {
			while (!fila.isEmpty()) {
				p = fila.remove();
				System.out.println(p.toString());
				p.decremento();
				if (p.getRetornos() > 0)
					fila.insert(p);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}