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
public class Markup {
    
    public static void main(String[] args) {
        String markup =
                "# seseg\n" +
                "---\n" + 
                "awfawff \n" +
                "## aefae";
        System.out.println(Converter.convert2HTML(markup));
    }
    
}
