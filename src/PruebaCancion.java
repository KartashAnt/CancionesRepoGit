/**
 * El clase en cual realizamos prueba de los clases de las canciones
 * @author Anton
 * @version 16-2-2022
 * @see Cancion El clase de la canción
 */
public class PruebaCancion {
	/**
	 * El metodo main donde realizamos las pruebas sobre canciones
	 * @param args
	 * @see Cancion#Cancion()
	 * @see Cancion#Cancion(String, int)
	 * @see Cancion#Cancion(String, String, int, boolean)
	 * @see Cancion#reproducirCancion()
	 * @see Cancion#pararCancion()
	 * @see Cancion#MismaCancion(Cancion)
	 * @see PruebaCancion#mostrarCancionesyAutor(Cancion[])
	 * @see PruebaCancion#mostrarCancionMasLarga(Cancion[])
	 * @see PruebaCancion#mostrarSiguienteCancion(Cancion, Cancion[])
	 */
	public static void main(String[] args) {
		
		Cancion cancionPrueba = new Cancion();
		System.out.println(cancionPrueba);
		
		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionPrueba);
		
		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don’t Stop Believin’", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);
		
		Cancion primeraCancionGit = new Cancion("Before I Forget", "Slipknot", 217, false);
		Cancion segundaCancionGit = new Cancion("Freezing moon","Mayhem",383,false);

		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + "está sonando");
		}
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + "stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canción");
		}
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, nueva };
		
		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}

	/**
	 * Ese metodo se usa desde main para verificar cual es la siguente canción
	 * a partir del titulo de una canción
	 * @param miCancion la canción que elegimos para buscar su titulo
	 * @param canciones la lista de canciones en donde lo estamos buscando
	 * @see Cancion#SiguienteCancion(Cancion[], String)
	 * @see Cancion#getTitulo()
 	 */
	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canción que sonará después de " + miCancion.getTitulo() + " será "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}

	/**
	 * Muestra la cancion más larga de una lista
	 * @param canciones la lista de canciones
	 * @see Cancion#MayorDuracion(Cancion[])
	 * @see Cancion#toString()
	 */
	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canción más larga es: " + Cancion.MayorDuracion(canciones));
	}

	/**
	 * Muestra nombre de cada cancion y su autor
	 * @param canciones la lista de canciones a mostrar
	 * @see Cancion#getTitulo()
	 * @see Cancion#getGrupo()
	 */
	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canción es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}
	}
	

}