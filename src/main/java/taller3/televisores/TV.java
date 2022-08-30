package taller3.televisores;

public class TV {
	Marca marca;
	int canal=1;
	int precio=500;
	boolean estado;
	int volumen=1;
	public static int numTV;
	Control control;
	
	public TV(Marca marca, boolean estado) {
		
		this.marca = marca;
		this.estado = estado;
		numTV++;
	}
	
	
	public void turnOff(){
		if (estado==true){
			estado= false;
			
			
		}
		
		
	}
	
	public void turnOn(){
		if (estado==false){
			estado= true;
			
			
		}
		
		
		
	}
	
	
	public void canalUp() {
		if (estado==true){
			if(canal>=1 && canal <120) {
				canal++;
				
			}
			
			
		}
		
		
	}
	
	public void canalDown() {
		if (estado==true){
			if(canal>1 && canal <=120) {
				canal--;
				
			}
			
			
		}
		
		
		
	}
	
	public void volumenUp(){
		if (estado==true){
			if(volumen>=0 && volumen <7) {
				volumen++;
				
			}
			
			
		}
		
		
	}
	
	public void volumenDown(){
		if (estado==true){
			if(volumen>0 && volumen <=7) {
				volumen--;
				
			}
			
			
		}
		
		
	}
	
	
	
	
	
	
	public boolean getEstado() {
		return estado;
	}

	

	public static int getNumTV() {
		return numTV;
	}



	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}



	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (canal>=1 && canal <=120 && estado==true) {
			this.canal = canal;
		}
		
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if(volumen>=0 && volumen <=7) {
			this.volumen = volumen;
			
		}
		
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	
	
	

}
