public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;
    private int jarak;

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setManufaktur(String manufaktur) {
        this.manufaktur = manufaktur;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = (int) rubahKecepatan(kecepatan);
    }

    public void setWaktu(double waktu) {
        this.waktu = rubahSecon(waktu);
    }

    public void hitungJarak() {
        this.jarak = this.kecepatan * (int) this.waktu;
    }

    private double rubahSecon(double waktu) {
        return waktu * 3600; 
    }

    private double rubahKecepatan(int kecepatan) {
        return (double) kecepatan * 10 / 36; 
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan);
    }
}
