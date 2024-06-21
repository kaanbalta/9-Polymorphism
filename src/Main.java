//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String konus(){
        return "Hayvan konuşuyor";
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

class Kedi extends Hayvan{
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor";
    }
}

class Kopek extends Hayvan{
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor";
    }
}



public class Main {

    public static void konustur(Object object){

        if(object instanceof Kedi){
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());
        }
        else if(object instanceof Kopek){
            Kopek kopek = (Kopek) object;
            System.out.println(kopek.konus());
        }
        else if(object instanceof Hayvan){
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());
        }
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

       /* Hayvan hayvan = new Hayvan("Limon");
        System.out.println(hayvan.konus());

        Hayvan hayvan1 = new Kedi("Tekir");
        System.out.println(hayvan1.konus());

        Hayvan hayvan2 = new Kopek("Karabaş");
        System.out.println(hayvan2.konus());  */

        konustur(new Kedi("tekir"));
        konustur(new Hayvan("xyz"));
        konustur(new Kopek("karabaş"));

        Kopek kopek = new Kopek("Karabaş");
        if(kopek instanceof Kopek){
            System.out.println("Bu nesne köpek sınıfında");
        }
        if(kopek instanceof Hayvan){
            System.out.println("Bu nesne hayvan sınıfında");
        }

        //instanceof köpeğin o sınıatan türeyip türemediğini kontrol eder örneğin hayvan yerine kedi yazsak hata vericek...





    }
}