class prueba {

	iface loquesea;

  public prueba(iface objeto){
      objeto.palabra();
      objeto.numero();
  }	

  public static void main(String[] args) {
    System.out.println("Hola mundo");
    otro operacion = new otro();
    otromas operacion2 = new otromas();
    int result = operacion.jander(2,3);
    System.out.println(result);
    String result2 = operacion.escribir();
    System.out.println(result2);
    prueba probandoInterface = new prueba(operacion);
    prueba probandoInterface2 = new prueba(operacion2);

  }

}