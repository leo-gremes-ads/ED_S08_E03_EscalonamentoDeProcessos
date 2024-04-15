package view;

import lib.model.Fila;
import model.Processo;
import controller.EscalonamentoController;

public class Principal
{
	public static void main(String[] args)
	{
		Fila<Processo> fila = new Fila<>();
		EscalonamentoController ec = new EscalonamentoController();

		fila.insert(new Processo(	"chrome.exe", 		22	));
		fila.insert(new Processo(	"vscode.exe", 		12	));
		fila.insert(new Processo(	"paint.exe", 		8	));
		fila.insert(new Processo(	"solitaire.exe", 	5	));
		ec.escalonador(fila);
	}	
}