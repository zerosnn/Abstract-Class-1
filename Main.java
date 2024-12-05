public class Main {
    public static void main(String[] args) {
        MakhlukHidup manusia = new Manusia();
        MakhlukHidup hewan = new Hewan();
        MakhlukHidup tumbuhan = new Tumbuhan();
        
        System.out.println("Manusia:");
        manusia.bernapas();
        manusia.makan();
        manusia.bergerak();
        
        System.out.println("\nHewan:");
        hewan.bernapas();
        hewan.makan();
        hewan.bergerak();
        
        System.out.println("\nTumbuhan:");
        tumbuhan.bernapas();
        tumbuhan.makan();
        tumbuhan.bergerak();
    }
}
