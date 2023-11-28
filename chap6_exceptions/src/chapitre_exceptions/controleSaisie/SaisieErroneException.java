/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapitre_exceptions.controleSaisie;

/**
 *
 * @author moham
 */
public class SaisieErroneException extends Exception{

    public SaisieErroneException() {
        super();
    }
        public SaisieErroneException(String s) {
        super(s);
    }
}
