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
public class StreamCorruptedException extends CORExceptionHandler {
    @Override
    public void handleRequest(Exception e) {
        if ("StreamCorruptedException".equals(e.getClass().getSimpleName())) {
            System.out.println("Corrupted file error :" + e.getMessage());
        } else {
            System.out.println("No file is corrupted");
            this.nextHandler.handleRequest(e);
        }
    } 
}