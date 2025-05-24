public class Pinjaman {
    private String idPinjaman;
    private String deskripsi;
    private String status;
    private String tanggalPengajuan;
    private String tanggalPencairan;
    private String tanggalPelunasan;

    public Pinjaman(String idPinjaman, String deskripsi, String status, String tanggalPengajuan, String tanggalPencairan, String tanggalPelunasan) {
        this.idPinjaman = idPinjaman;
        this.deskripsi = deskripsi;
        this.status = status;
        this.tanggalPengajuan = tanggalPengajuan;
        this.tanggalPencairan = tanggalPencairan;
        this.tanggalPelunasan = tanggalPelunasan;
    }

    // Getter and Setter methods
    public String getIdPinjaman() {
        return idPinjaman;
    }
    public void setIdPinjaman(String idPinjaman) {
        this.idPinjaman = idPinjaman;
    }
}
