class otro implements iface{

	public otro(){
		int x;
		System.out.println("Constructor");
		for (x=0;x<10;x++){
			System.out.println(x);
		}
	}
	
	public int jander(int num, int num2){

		int resultado = num + num2;
		return resultado;

	}

	public String escribir(){
		String escrito=frase();
		return escrito;
	}

	private String frase(){
		return "Esta es la frase";
	}

	public void palabra(){
		System.out.println("crander");
	}
	public void numero(){
		System.out.println(666);
	}

}