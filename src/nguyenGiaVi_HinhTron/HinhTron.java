package nguyenGiaVi_HinhTron;

public class HinhTron {
    private double BanKinh;
    private ToaDo tam;
    public double getBanKinh() {
        return BanKinh;
    }
    public void setBanKinh(double banKinh) {
        BanKinh = banKinh;
    }
    public ToaDo getTam() {
        return tam;
    }
    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public HinhTron() {}
    public HinhTron(double banKinh, ToaDo tam) {
        super();
        BanKinh = banKinh;
        this.tam = tam;
    }

    public double getDienTich() {
        return Math.PI * getBanKinh() * getBanKinh();
    }

    @Override
    public String toString() {
        String s1 = "";
        s1+=s1.format("Ban Kinh: %-5s; Dien Tich: %-10s;", getBanKinh(), getDienTich());
        return s1;
    }







}