package model;

public class BaiDang {

    private String tieuDe;
    private String danhMuc;
    private String moTa;
    private String lienHe;
    private String trangThai;

    public BaiDang(String tieuDe,
                   String danhMuc,
                   String moTa,
                   String lienHe,
                   String trangThai) {

        this.tieuDe = tieuDe;
        this.danhMuc = danhMuc;
        this.moTa = moTa;
        this.lienHe = lienHe;
        this.trangThai = trangThai;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getLienHe() {
        return lienHe;
    }

    public void setLienHe(String lienHe) {
        this.lienHe = lienHe;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
    private boolean biBaoCao = false;

public boolean isBiBaoCao() {
    return biBaoCao;
}

public void setBiBaoCao(boolean biBaoCao) {
    this.biBaoCao = biBaoCao;
}
}