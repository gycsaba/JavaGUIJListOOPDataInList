/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

/**
 *
 * @author gycsaba
 */
public class Diak {
    private String nev;
        private int magassag;
        private float tomeg;
        private boolean fiu;

        public Diak(String nev, int magassag, float tomeg, boolean fiu)
        {
            this.nev = nev;
            this.magassag = magassag;
            this.tomeg = tomeg;
            this.fiu = fiu;
        }

        public String getNev()
        {
            return nev;
        }
        public int getMagassag()
        {
            return magassag;
        }
        public float getTomeg()
        {
            return tomeg;
        }
        public boolean getFerfi()
        {
            return fiu;
        }
        public boolean getNo()
        {
            return !fiu;
        }

    @Override
    public String toString() {
        return "Diak{" + "nev=" + nev + ", magassag=" + magassag + ", tomeg=" + tomeg + ", fiu=" + fiu + '}';
    }
        
        
}
