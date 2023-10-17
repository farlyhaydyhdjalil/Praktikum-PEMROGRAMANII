
//ubah nama classnya menjadi Pegawai karena kalau employee nama classnya maka tidak bisa dijalankan karena case sensitive
public class Pegawai {
    public String nama;

    // Mengubah char menjadi String untuk asal, dalam kasus ini, asal harus tipe data String karena kita ingin menyimpan string seperti "Kingdom of Orvel".
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Memperbaiki parameter metode setJabatan, Kita mencoba mendeklarasikan metode setJabatan tanpa parameter, tetapi seharusnya metode ini menerima parameter dalam bentuk string j.
    public void setJabatan(String j) {
        this.jabatan = j;
    }

    // Menambahkan metode getUmur, Tidak ada metode yang mengambil umur karyawan. jadi kita perlu memanggil method getUmur untuk memanggil umur
    public int getUmur() {
        return umur;
    }
}
