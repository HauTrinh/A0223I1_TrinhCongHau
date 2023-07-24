CREATE DATABASE ERD_sang_SQL;
USE ERD_sang_SQL;

CREATE TABLE VATTU (
  MaVTU varchar(20) PRIMARY KEY,
  TenVTU varchar(20)
);

CREATE TABLE PHIEUXUAT (
  SoPX varchar(20) PRIMARY KEY,
  NgayXuat date
);

CREATE TABLE CHI_TIET_PHIEU_XUAT (
  So_Phieu_Xuat varchar(20),
  Ma_Vat_Tu varchar(20),
  DGXuat float,
  SLXuat int,
  PRIMARY KEY (So_Phieu_Xuat, Ma_Vat_Tu),
  FOREIGN KEY (So_Phieu_Xuat) REFERENCES PHIEUXUAT(SoPX),
  FOREIGN KEY (Ma_Vat_Tu) REFERENCES VATTU(MaVTU)
);

CREATE TABLE PHIEUNHAP (
  SoPN varchar(20) PRIMARY KEY,
  NgayNhap date
);

CREATE TABLE CHI_TIET_PHIEU_NHAP (
  So_Phieu_Nhap varchar(20),
  Ma_Vat_Tu varchar(20),
  DGNhap float,
  SLNhap int,
  PRIMARY KEY (So_Phieu_Nhap, Ma_Vat_Tu),
  FOREIGN KEY (So_Phieu_Nhap) REFERENCES PHIEUNHAP(SoPN),
  FOREIGN KEY (Ma_Vat_Tu) REFERENCES VATTU(MaVTU)
);

CREATE TABLE DONDH (
  SoDH varchar(20) PRIMARY KEY,
  NgayDH date
);

CREATE TABLE DH_chi_tiet (
  So_Don_Hang varchar(20),
  Ma_Vat_Tu varchar(20),
  NgayDat date,
  PRIMARY KEY (So_Don_Hang, Ma_Vat_Tu),
  FOREIGN KEY (So_Don_Hang) REFERENCES DONDH(SoDH),
  FOREIGN KEY (Ma_Vat_Tu) REFERENCES VATTU(MaVTU)
);

CREATE TABLE NHACC (
  MaNCC varchar(20) PRIMARY KEY,
  TenNCC varchar(20),
  DiaChi varchar(20)
);

CREATE TABLE nha_cc_sdt (
  ma_nha_cung_cap varchar(20),
  sdt VARCHAR(20) PRIMARY KEY,
  FOREIGN KEY (ma_nha_cung_cap) REFERENCES NHACC(MaNCC)
);