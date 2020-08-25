package com.project2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cauhoi")

public class CauHoiEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int caiHoiId;
	@Column(name="cauhoi")
	private String cauHoi;
	@Column(name="dapan")
	private int dapAn;
	@Column(name="loaicauhoi")
	private int loaiCauHoi;
	@Column(name="dapanimg")
	private String dapAnImg;
	
	
	public int getCaiHoiId() {
		return caiHoiId;
	}
	
	
	public String getCauHoi() {
		return cauHoi;
	}
	public void setCauHoi(String cauHoi) {
		this.cauHoi = cauHoi;
	}
	public int getDapAn() {
		return dapAn;
	}
	public void setDapAn(int dapAn) {
		this.dapAn = dapAn;
	}
	public int getLoaiCauHoi() {
		return loaiCauHoi;
	}
	public void setLoaiCauHoi(int loaiCauHoi) {
		this.loaiCauHoi = loaiCauHoi;
	}
	public String getDapAnImg() {
		return dapAnImg;
	}
	public void setDapAnImg(String dapAnImg) {
		this.dapAnImg = dapAnImg;
	}
	
	
}
