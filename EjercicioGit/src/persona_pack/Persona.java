package persona_pack;

public class Persona {

//	    Var

	    private String nombre;
	    private int edad;
	    private float saldo;



//	    Constructor

	    public Persona(String nombre) {

	        this.nombre = nombre;
	        this.edad = 0;
	        this.saldo = 0;
	    }

	@Override

		public String toString() {

			return "Persona [nombre=" + nombre + ", edad=" + edad + ", saldo=" + saldo + "]";
		}

		//    Setter
	    public Persona setNombre(String nombre) {

	        this.nombre = nombre;

	        return this;
	    }



	    public Persona setEdad(int edad) {

	        this.edad = edad;

	        return this;
	    }



	    public Persona setSaldo(float saldo) {

	        this.saldo = saldo;

	        return this;
	    }



//	    Getter
	    public String getNombre() {

	        return nombre;
	    }



	    public int getEdad() {

	        return edad;
	    }



	    public float getSaldo() {

	        return saldo;
	    }



//	    Mis métodos

	public void cumple(){

	        this.edad++;
	}



	public void trabajar(float sueldo){

	        this.saldo += sueldo;
	}


	public boolean comprar(float precio){

		boolean ret;

		

	        if(this.saldo<precio) {

	            System.out.println("No tienes saldo suficiente");

	        	ret = false;

	        }else {

	            this.saldo -= precio;

	            ret = true;

	        }

	        return ret;
	}
}
