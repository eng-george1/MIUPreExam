package prob1;
import java.util.*;
public class Problem1 {
	/** Implement a recursive strategy to compute the 
	 *  sum of the test scores that are found as values
	 *  in the scores HashMap 
	 */
	/* Do not modify the signature of this method */
//	private double computeSum(HashMap<String, String> scores) {
//		HashMap<String, String> scoresClone = (HashMap<String, String>) scores.clone();
//		
//		if(scoresClone == null || scoresClone.size() == 0)
//			return 0;
//		
//		String scoresString = scoresClone.toString();
//		String keyString = scoresString.substring(1, scoresString.indexOf('='));
//		String valueString = new String();
//		
//		if(scores.size() > 1)
//			valueString = scoresString.substring(scoresString.indexOf('=') + 1, scoresString.indexOf(','));
//		else 
//			valueString = scoresString.substring(scoresString.indexOf('=') + 1, scoresString.indexOf('}'));
//		
//		double valueDouble = Double.parseDouble(valueString);
//		
//		scoresClone.remove(keyString);
//		return valueDouble + computeSum(scoresClone);
//	}
	
	/* Do not modify the signature of this method */
	private double computeSum(HashMap<String, String> scores) {
		HashMap<String, String> scoresClone = (HashMap<String, String>) scores.clone();
		
		if(scoresClone == null || scoresClone.size() == 0)
			return 0;
		
		Object[] stringKeys = scoresClone.keySet().toArray();
		String keyString = stringKeys[0].toString();
		double keyValue = Double.parseDouble(scoresClone.get(keyString));

		scoresClone.remove(keyString);
		return keyValue + computeSum(scoresClone);
	}
	
	/* Do not modify this code. */
	public double computeAverage(HashMap<String, String> scores) {
		computeSum(scores);
		if(scores.size() > 0) {
			return (double)computeSum(scores)/scores.size();
		} else {
			return 0.0;
		}
	}
	// Test your implementation here. Expected output is app	roximately 9.666.
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("John William", "77.5");
		map.put("Annette Jones", "91.0");
		map.put("Kevin Specker", "88.8");
		Problem1 m = new Problem1();
		System.out.println(m.computeAverage(map));
				
	}
	
	
}
