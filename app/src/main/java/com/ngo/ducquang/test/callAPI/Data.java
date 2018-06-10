package com.ngo.ducquang.test.callAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ducqu on 6/5/2018.
 */

public class Data {
    @SerializedName("Customers")
    @Expose
    private List<Customer> customers = null;
    @SerializedName("QuanLyDanhBaKhachHang")
    @Expose
    private Boolean quanLyDanhBaKhachHang;
    @SerializedName("IsChange")
    @Expose
    private Boolean isChange;

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Boolean getQuanLyDanhBaKhachHang() {
        return quanLyDanhBaKhachHang;
    }

    public void setQuanLyDanhBaKhachHang(Boolean quanLyDanhBaKhachHang) {
        this.quanLyDanhBaKhachHang = quanLyDanhBaKhachHang;
    }

    public Boolean getChange() {
        return isChange;
    }

    public void setChange(Boolean change) {
        isChange = change;
    }
}
