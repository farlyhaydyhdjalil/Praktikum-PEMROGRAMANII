package soal2;

class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String r, String n, String W, String[] k) {
        super(r, n);
        this.warnaBulu = W;
        this.kemampuan = k;
    }

    public void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Memiliki kemampuan : " + String.join(", ", kemampuan));
    }
}
