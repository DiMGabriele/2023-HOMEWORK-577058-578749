package it.uniRoma3.DiaDia.comandi;

import it.uniRoma3.DiaDia.IO;
import it.uniRoma3.DiaDia.Partita;
import it.uniRoma3.DiaDia.ambienti.Stanza;

public class ComandoVai implements IComando {
	private String direzione;
	private IO io;
	private final static String NOME = "vai";


	public ComandoVai(String direzione) {
		this.direzione = direzione;

	}
	public ComandoVai() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void esegui(Partita partita) {
		if(direzione==null)
			io.mostraMessaggio("");
		Stanza prossimaStanza = null;
		prossimaStanza = partita.labirinto.getStanzaCorrente().getStanzaAdiacente(direzione);
		if (prossimaStanza == null)
			io.mostraMessaggio("Direzione inesistente");
		else {
			partita.labirinto.setStanzaCorrente(prossimaStanza);
			int cfu = partita.giocatore.getCfu();
			partita.giocatore.setCfu(cfu--);
			io.mostraMessaggio("ti trovi in:");
			io.mostraMessaggio(partita.labirinto.getStanzaCorrente().getDescrizione());
			io.mostraMessaggio("dove vuoi andare");
		}
	}
		public void setParametro(String parametro) {
			this.direzione = parametro;
		}
		@Override
		public String getParametro() {
			return this.direzione;
		}

		@Override
		public void setIo(IO io) {
			this.io = io;

		}

		@Override
		public String getNome() {
			return NOME;
		}


	}

