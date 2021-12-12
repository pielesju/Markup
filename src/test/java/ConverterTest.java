/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.trivial.markup.Converter;

/**
 *
 * @author julian
 */
public class ConverterTest {
    
    public ConverterTest() {
    }
    
    @Test
    public void test() {
        String markup
                = "# seseg\n"
                + "---\n"
                + "awfawff \n"
                + "## aefae";
        String html = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "	<head>\n"
                + "	</head>\n"
                + "		<title>Document</title>\n"
                + "	<body>\n"
                + "		<h1>seseg</h1>\n"
                + "		<hr />\n"
                + "		awfawff \n"
                + "		<h2>aefae</h2>\n"
                + "	</body>\n"
                + "</html>";
        
        assertEquals(html, Converter.convert2HTML(markup));
    }
}
