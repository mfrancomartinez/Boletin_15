/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_15;

/**
 *
 * @author Marcos
 */
public class Evaluacion {
    private float probescrit;
    private float probpract;
    private float bol;

    public Evaluacion(float probescrit, float probpract, float bol) {
        this.probescrit = probescrit;
        this.probpract = probpract;
        this.bol = bol;
    }

    public float getProbescrit() {
        return probescrit;
    }

    public float getProbpract() {
        return probpract;
    }

    public float getBol() {
        return bol;
    }

    public void setProbescrit(float probescrit) {
        this.probescrit = probescrit;
    }

    public void setProbpract(float probpract) {
        this.probpract = probpract;
    }

    public void setBol(float bol) {
        this.bol = bol;
    }
        
    public void calcularNota(){
        
        int media;
        
        if(bol > 9){
            
            media = 2;
            
        } else if(bol >= 7 && bol <= 9){
        
            media = 1;
            
        } else {
            
            media = 0;
        }
        
        float total = ((probescrit*40/100)+(probpract*40/100)+media);
        
        System.out.println("Teorico:" + probescrit);
        System.out.println("Práctico:"+ probpract);
        System.out.println("Boletines:"+bol);
        System.out.println("Total:"+total);
    }
}
