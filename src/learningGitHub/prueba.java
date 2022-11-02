package learningGitHub;

public class prueba {

	public static void main(String[] args) {
		potenciaDos(3);
	}

	static Integer potenciaDos(Integer num) {
		Integer result;  // Hay que inicializar siempre las variables.
		if (num!=2) {
		result = (int) Math.pow(num, 2);
		}else {
			result = 3;
		}
		return result;
	}
	
}
