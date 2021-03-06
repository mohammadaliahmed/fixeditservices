package com.fixed.fixitservices.Models;

public class CouponModel {
   String couponId,couponName,couponCode;
   int discount;
   long time;
   boolean active;
   long couponEndTime,couponStartTime;
    public CouponModel() {
    }

    public CouponModel(String couponId, String couponName, String couponCode, int discount, long time, boolean active) {
        this.couponId = couponId;
        this.couponName = couponName;
        this.couponCode = couponCode;
        this.discount = discount;
        this.time = time;
        this.active = active;
    }

    public long getCouponEndTime() {
        return couponEndTime;
    }

    public void setCouponEndTime(long couponEndTime) {
        this.couponEndTime = couponEndTime;
    }

    public long getCouponStartTime() {
        return couponStartTime;
    }

    public void setCouponStartTime(long couponStartTime) {
        this.couponStartTime = couponStartTime;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
