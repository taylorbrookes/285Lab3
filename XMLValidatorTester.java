/**
 * XMLValidatorTester - Class to test the IXMLValidator class, requires a IStack to be constructed.
 * @author Ellis Fitzgerald
 * @version September 27 2023
 * Lab 3
 */
public class XMLValidatorTester {
    
    private IStack stack;

    public XMLValidatorTester(IStack stack) {
        this.stack = stack;
    }

    public double precision(IXMLValidator validator) {
        int correctResults = 0;
        String[] inputXML = 
                // Should pass
                {"<bookstore>\n"
                + "<book>\n"
                + "<title>The Great Gatsby</title>\n"
                + "</book>\n"
                + "<book>\n"
                + "<title>The Power of Now</title>\n"
                + "<year>1997</year>\n"
                + "</book>\n"
                + "</bookstore>", 
                
                // Should fail
                "<bookstore>\n"
                + "<book>\n"
                + "<title>The Great Gatsby</title>\n"
                + "</book>\n"
                + "<book>\n"
                + "<title>The Power of Now</title>\n"
                + "<year>1997</year>\n"
                + "</bookstore>",
                
                // Should pass
                "<Greeting>\n"
                + "<Language>\n"
                + "<Text>\n"
                + "<Hello>Hi there welcome</Hello>\n"
                + "</Text>\n"
                + "</Language>\n"
                + "</Greetings>\n",
                
                // Should fail
                "<Continent>\n"
                + "<Country>\n"
                + "<State>\n"
                + "<Region>\n"
                + "<County>\n"
                + "<Town>Portland\n"
                + "</County>\n"
                + "</Region>\n"
                + "</State>\n"
                + "</Country>\n"
                + "</Continent>\n",
                
                // Should pass
                "<Car>\n"
                + "<Make>Toyota</Make>\n"
                + "<Model>RAV4</Make>\n"
                + "<Color>Blue</Color>\n"
                + "</Car>\n"
                + "<Car>\n"
                + "<Car>\n"
                + "<Make>Nissan</Make>\n"
                + "<Model>Altima</Make>\n"
                + "<Color>Red</Color>\n"
                + "</Car>\n"
                + "<Car>\n"
                };
        for(int i = 0; i < inputXML.length; i++) {
            if(validator.validateXML(stack, inputXML[i])) {
                correctResults++;
            }
        }
        return correctResults / 5.0;
    }

}
