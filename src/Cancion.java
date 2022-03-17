/**
 * Clase cancion que sirve para crear objetos que definen unas canciones
 * Tiene 4 atributos:titulo,grupo,duracion y si esta sonando
 * @author Anton
 * @version 16-2-2022
 */
public class Cancion {
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores
	/**
	 * Constructor vacío para definir los atributos a partir de los setters y getters
	 */
	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
	/**
	 * Constructor en cual pasamos solo titulo y duracion de una canción sin tener que saber el nombre de autor
	 * @param titulo
	 * @param duracion
	 */
	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
	/**
	 * Constructor con la definicion más completa
	 * De quien es autor de la canción, su nombre y sí está soñando en el momento de la creacion de objeto
	 * @param titulo
	 * @param grupo
	 * @param duracion
	 * @param sonando
	 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
	/**
	 * Metodo para reproducir una canción y además devuelve si la canción ya esta soñando
	 * @return Sí la canción ya esta soñando te devuelve false si la cancion no esta soñando se le marca como soñando y devuelve true
	 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}
	/**
	 * Metodo para parar una canción y además devuelve si la cancion ya esta parado
	 * @return Sí la canción ya esta parada te devuelve false si la canción no esta parada se le para y devuelve true.
	 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter métodos get/set/toString()
	/**
	 * Devuelve titulo de canción
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Pone valor de parametro pasado a titulo de la canción
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * Devuelve grupo autora de esa canción
	 * @return
	 */
	public String getGrupo() {
		return grupo;
	}
	/**
	 * Pone valor de parametro pasado al grupo de la canción
	 * @param grupo
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	/**
	 * Devuelve duración de esa canción
	 * @return
	 */
	public int getDuracion() {
		return duracion;
	}
	/**
	 * Pone valor de parametro pasado como duración de esa canción
	 * @param duracion
	 */
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * Devuelve el estado de canción(si está soñando o no)
	 * @return si la canción esta soñando devuelve true sino devuelve false
	 */
	public boolean isSonando() {
		return sonando;
	}
	/**
	 * Permite definir manualmente si una canción está sonando o no
	 * Pasale true para que canción suene y false para que se para
	 * @param sonando
	 */
	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}
	/**
	 * Compara dos canciónes. Mejor dicho compara esa canción concreta con la canción que le pasamos como un parametro
	 * @param cancion Cancion que comparamos con esa concreta instancia de Objeto
	 * @return devuelve true si ambas canciones tienen el mismo titulo y estan de mismo grupo. En otro caso devuelve false
	 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}
	/**
	 * Un metodo estatico para obtener la canción de mayor duracion a partir de un array de canciones cuales le pasamos como parametro
	 * @param canciones La lista de las canciones de las cuales elegimos a una más larga
	 * @return devuelve el titulo de la canción de mayor duración
	 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
	/**
	 * Metodo estatico para saber cual es la siguienta canción en un array de canciones a partir de nombre de actual
	 * @param canciones array de canciones donde buscamos
	 * @param titulo titulo de canción cuyo proxima cancion buscamos
	 * @return devuelve el nombre de la siguiente cancion
	 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}
	/**
	 * Devuelve todos los datos(titulo,autor,duración y estado(si esta soñando o no)) de esa canción
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando
				+ "]";
	}
}