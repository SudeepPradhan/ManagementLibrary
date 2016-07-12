/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Bishal
 */
public class NotDirectoryException extends CORExceptionHandler {

    @Override
    public void handleRequest(Exception e) {
        if ("NotDirectoryException".equals(e.getClass().getSimpleName())) {
            System.out.println("No Directory found:" + e.getMessage());
        } else {
            System.out.println("No error in Directory");
            this.nextHandler.handleRequest(e);
        }
    }
}