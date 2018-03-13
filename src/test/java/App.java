import dev.utils.*;

/**
 * @author Emmanuel
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int distance = StringUtils.levenshteinDistance("chien", "chine");
		if (distance != 2) {
			throw new RuntimeException("Test 1: le r�sultat doit �tre de 2 et non " + distance);
		}

		distance = StringUtils.levenshteinDistance("cien", "chien");
		if (distance != 1) {
			throw new RuntimeException("Test 2: le r�sultat doit �tre de 1 et non " + distance);
		}

		distance = StringUtils.levenshteinDistance("chiens", "chiens");
		if (distance != 0) {
			throw new RuntimeException("Test 3: le r�sultat doit �tre de 0 et non " + distance);
		}

		distance = StringUtils.levenshteinDistance(null, null);
		if (distance != -1) {
			throw new RuntimeException("Test 4: le r�sultat doit �tre de -1 et non " + distance);
		}

		distance = StringUtils.levenshteinDistance("a", "zerty");
		if (distance != 5) {
			throw new RuntimeException("Test 5: le r�sultat doit �tre de 5 et non " + distance);
		}
	}

}
