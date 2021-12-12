/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.trivial.markup;

/**
 *
 * @author Julian Pieles
 */
public class Converter {

    public static String convert2HTML(String markdown) {
        String html = htmlStart();

        for (String line : markdown.split("\n")) {
            html += convertMarkdownLine(line);
        }

        return html + htmlEnd();
    }

    private static String convertMarkdownLine(String line) {
        String htmlLine = "";

        if (line.startsWith("#")) {
            htmlLine += htmlHeading(line);
        }
        else if (line.contains("---")) {
            htmlLine += htmlHR(line);
        }else {
            htmlLine += "\t\t" + line + "\n";
        }

        return htmlLine;
    }

    private static String htmlHeading(String line) {
        String text = line.split("# ")[1];

        if (line.startsWith("# ")) {
            return "\t\t<h1>" + text + "</h1>\n";
        } else if (line.startsWith("## ")) {
            return "\t\t<h2>" + text + "</h2>\n";
        } else if (line.startsWith("### ")) {
            return "\t\t<h3>" + text + "</h3>\n";
        } else if (line.startsWith("#### ")) {
            return "\t\t<h4>" + text + "</h4>\n";
        } else if (line.startsWith("##### ")) {
            return "\t\t<h5>" + text + "</h5>\n";
        } else if (line.startsWith("###### ")) {
            return "\t\t<h6>" + text + "</h6>\n";
        } else {
            return line;
        }
    }

    private static String htmlLink(String line) {
        if (line.contains("![")) {
            return htmlImage(line);
        } else {
            return htmlHrefLink(line);
        }
    }

    private static String htmlImage(String line) {
        return "";
    }

    private static String htmlHrefLink(String line) {
        return "";
    }

    private static String htmlHR(String line) {
        if (line.equals("---")) {
            return "\t\t<hr />\n";
        } else {
            return line.replace("---", "—");
        }
    }

    private static String htmlStart() {
        String s = "<!DOCTYPE html>\n"
                + "<html>\n"
                + "\t<head>\n\t</head>\n\t\t<title>Document</title>\n\t<body>\n";
        return s;
    }

    private static String htmlEnd() {
        String s = "\t</body>\n</html>";

        return s;
    }

    public static String convert2Markdown(String html) {
        String markdown = "";

        return markdown;
    }

}
