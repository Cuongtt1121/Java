package Product;

public final class Info {
    private String tenSP;
    private String gia;
    private String soluong;
    private String mota;
    private String danhmuc;
    public Info(String tenSP, String gia, String soluong, String mota, String danhmuc){
        this.tenSP = tenSP;
        this.danhmuc = danhmuc;
        this.gia = gia;
        this.soluong = soluong;
        this.mota = mota;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(String danhmuc) {
        this.danhmuc = danhmuc;
    }
    public String toString(){
        return tenSP+"-"+gia+"-"+soluong+"-"+danhmuc+"-"+mota;
    }
}
