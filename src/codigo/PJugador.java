package codigo;

public class PJugador extends Personaje implements Guerrero {
	
	private int edad;
	private int ataque;
	private int defensa;
	private int dano;
	
	
	
	public PJugador(String nombre, int salud, int nivel, int ataque) {
		super(nombre, salud, nivel);  // Llamo al constructor de Personaje
		this.ataque = ataque;
	
		
		
	}
	
		
		public PJugador(String nombre, int salud, int nivel, int edad, int ataque, int defensa, int dano) {
		super(nombre, salud, nivel);
		this.edad = edad;
		this.ataque = ataque;
		this.defensa = defensa;
		this.setDano(dano);
	}
		//Getters y Setters
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	
	//Métodos
	
	@ Override
	public void atacar(Personaje pnj) {
		// TODO Auto-generated method stub
		
		
		int danoFinal=getNivel()*ataque;
		
		if (danoFinal >= pnj.getsalud()) {
			
			pnj.setsalud(0);
		}
		
		else {
			pnj.setsalud(pnj.getsalud()-danoFinal);
		}
		
	}
	
	
	@Override
	public void defender(Personaje atacante) {
		// TODO Auto-generated method stub
		
		int danoRecibido = atacante.getNivel();
		
		int danoFinal;
		
		if (danoRecibido <= defensa) {
			danoFinal=0;
		}
		
		else danoFinal= danoRecibido-defensa;
		
		int nuevasalud= getsalud()-danoFinal;
		
		if (nuevasalud < 0) {
			
			nuevasalud=0;
		}
			
		
		setsalud(nuevasalud);
		

		
	}


	public int getDano() {
		return dano;
	}


	public void setDano(int dano) {
		this.dano = dano;
	}


		

}
