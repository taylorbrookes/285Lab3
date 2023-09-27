
public class myXMLValidator implements IXMLValidator {

	@Override
	public boolean validateXML(IStack stack, String inputXML) {
		// TODO Auto-generated method stub
		String[] temp = inputXML.split(" ");
		for (int i = 0; i < temp.length; i++) {
			String currentString = temp[i];
			if (currentString.contains("</")) {
				String word1 = currentString.substring(2, currentString.length()-1);
				String stackTop = stack.pop();
				if (!word1.equals(stackTop)) {
					return false;
				}
			}
			else if (currentString.contains("<")) {
				String word2 = currentString.substring(1, currentString.length()-1);
				stack.push(word2);
			}
		}
		if (stack.isEmpty()) {
			return true;
		}
		
		return false;
	}
}
