package tp4.ejercicios11a20;

public class UtilArrays {

	/*
	 * Mostrar el contenido de un array de caracteres recibido como parámetro sin
	 * valores repetidos. public static void mostrarSinRepetidos (char[] elementos)
	 * 'I' 'N' 'M' 'I' 'N' 'E' 'N' 'T' 'E' devuelve 'I' 'N' 'M' 'E' 'T'
	 */

	public static void main(String[] args) {

		char[] elementos = new char[9];
		elementos[0] = 'I';
		elementos[1] = 'N';
		elementos[2] = 'M';
		elementos[3] = 'I';
		elementos[4] = 'N';
		elementos[5] = 'E';
		elementos[6] = 'N';
		elementos[7] = 'T';
		elementos[8] = 'E';
		String palabra = "INMINENTE";
		char[] elementosbis = transformarStringAArray(palabra);
		// mostrarSinRepetidos(elementosbis);
		mostrarSinRepetidosV1(elementosbis);

	}
	
	

	// 'I' 'N' 'M' 'E' 'T'
	public static void mostrarSinRepetidos(char[] elementos) {
		char[] respuesta = new char[elementos.length];
		int contador = 0;
		for (int i = 0; i < elementos.length; i++) {
			contador = 0;
			for (int j = 0; j < elementos.length; j++) {				
				if (elementos[i] == elementos[j]) {//poniendolo asi me da la solucion mas cercana(INM)
					respuesta[contador] = elementos[contador];
					contador++;
				}
				
			}
			
		}

		for (char letra : respuesta) {
			System.out.print(letra);
		}
	}
	// 'I' 'N' 'M' 'E' 'T'
	public static void mostrarSinRepetidosV1(char[] elementos) {
		char[] repetidos = new char[elementos.length];
		char[] unicos = new char[elementos.length];
		
		int contador = 0;
		for (int i = 0; i < elementos.length; i++) {
			if (!existe(elementos[i],repetidos)){
				unicos[contador] = elementos[i];
				repetidos[contador] = elementos[i];
				contador++;
                
			} 
			
		}

		for (char letra : unicos) {
			System.out.print(letra);
		}
	}
	
	// 'I' 'N' 'M' 'E' 'T'
	public static void mostrarSinRepetidosV2(char[] elementos) {
		char[] respuesta = new char[elementos.length];
		int contador = 0;
		for (int i = 0; i < elementos.length; i++) {
			//contador = 0;
			for (int j = 0; j < elementos.length; j++) {				
				if (elementos[i] == elementos[j]) {//poniendolo asi me da la solucion mas cercana(INM)
					respuesta[contador] = elementos[contador];
					//contador++;
				}
				
			}
			contador++;
			
		}

		for (char letra : respuesta) {
			System.out.print(letra);
		}
	}
	
	private static boolean existe(char c, char[] repetidos) {
		boolean existe = false;
		
		for (int i = 0; !existe && i < repetidos.length; i++) {
			if(repetidos[i] == c) {
				existe = true;
			}
			
		}
		return existe;
	}
	
	public static char[] transformarStringAArray(String mensaje) {
		char[] resultado = mensaje.toCharArray();

		// char[] letras = mensaje.subSequence(0, 0);
		return resultado;
	}

}
/*
 * public static void mostrarDiferentes(char[] elementos){ char[] respuesta =
 * new char[elementos.length]; int contador = 0; for(int i = 0; i <
 * elementos.length-1; i++){
 * 
 * if(elementos[i] !=elementos[i+1] ){ for(int j=0; j< elementos.length -1;
 * j++){ respuesta[contador] = elementos[i];
 * 
 * System.out.print(respuesta[contador]); contador++; } }
 * 
 * } }
 */
