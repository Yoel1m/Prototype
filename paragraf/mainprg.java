package paragraf;

public class mainprg {
    public static void main(String[] args) {
        kalimat salam = new kalimat();
        System.out.println(salam.contoh());
        
        penyusun.kata halo = new penyusun.kata();
        System.out.println(halo.contoh());
    
        penyusun.huruf h = new penyusun.huruf();
        System.out.println(h.contoh());
    }
}
