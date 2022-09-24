public abstract class GameCalculator {
    public abstract void hesapla();
    public final void gameOver(){
        System.out.println("Oyun bitti");
    }

}
//classın abstract olması için public abstract class
//operasyonun abstract olabilmesi için public abstract void
// şeklinde yazılması lazım
//abstract classta illaki bir abstract operasyonun olmasına gerek yoktur
//tek başına final operation olabilir
//Sadece abstract olabilir
//ikisinden de bol bol olabilir
//Abstract classlar new lenemez !!!!!
//new lemek için override etmek lazım ancak iyi bir kullanım değildir.
//abstractlar tek başına kullanılamaz...
