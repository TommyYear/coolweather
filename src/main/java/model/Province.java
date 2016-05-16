package model;

/**
 * Created by TOMMY on 2016/5/16.
 */
public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {

        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getId() {
        return id;
    }
}
