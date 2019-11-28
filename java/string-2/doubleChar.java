/* Given a string, return a string where for every char in the original, 
 * there are two chars.
 */
public String doubleChar(String str) {
	String res = "";
		for (int i = 0; i < str.length(); i++) {
			char c = (char) (str.charAt(i));
			res = res + c + c;
		}
		return res;
}
