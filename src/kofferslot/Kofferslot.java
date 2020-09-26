package kofferslot;

/**
 * Author: Mark Amerkamp (markamerkamp@gmail.com)
 * Veel plezier ermee!
 */
public class Kofferslot {
    private char eersteLetter;
    private char tweedeLetter;
    private int cijfer;

    public Kofferslot(char eersteLetter, char tweedeLetter, int cijfer) {
        this.eersteLetter = eersteLetter;
        this.tweedeLetter = tweedeLetter;
        this.cijfer = cijfer;
        setCombinatie(eersteLetter, tweedeLetter, cijfer);

    }

    public Kofferslot() {
        this('A', 'A', 0);
    }

    public void setCombinatie(char eersteLetter, char tweedeLetter, int cijfer) {
        this.eersteLetter = getEersteLetter();
        this.tweedeLetter = getTweedeLetter();
        this.cijfer = getCijfer();
    }
    public char volgendeLetter(char letter) {
        if (letter == 'Z'){
            return 'A';
        }
        return ++letter;
    }

    public int volgendeCijfer(int cijfer) {
        if (cijfer == 9){
            return 0;
        }
        return ++cijfer;
    }

    public void volgende() {
        cijfer = volgendeCijfer(cijfer);
        if (cijfer == 0) {
            tweedeLetter = volgendeLetter(tweedeLetter);
            if (tweedeLetter == 'A') {
                eersteLetter = volgendeLetter(eersteLetter);
            }
        }

    }

    public char getEersteLetter() {
        return eersteLetter;
    }

    public void setEersteLetter(char eersteLetter) {
        this.eersteLetter = eersteLetter;
    }

    public char getTweedeLetter() {
        return tweedeLetter;
    }

    public void setTweedeLetter(char tweedeLetter) {
        this.tweedeLetter = tweedeLetter;
    }

    public int getCijfer() {
        return cijfer;
    }

    public void setCijfer(int cijfer) {
        this.cijfer = cijfer;
    }
}
