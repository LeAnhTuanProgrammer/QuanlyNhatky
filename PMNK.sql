create database PMNK
go 
use PMNK
go
create table NguoiDung(
maND varchar(20) not null,
tenND nvarchar(20) not null,
matKhau varchar(50) not null,
gioiTinh bit default(1),
namSinh date not null,
hinhND nvarchar(50) not null,
quocTich nvarchar(50) not null,
primary key(maND)
)

create table BaiViet(
maBV varchar(20) not null,
maND varchar(20) not null,
tieuDe nvarchar(50) not null,
hinhBV nvarchar(50) not null,
ngayTao date not null,
moTa nvarchar(max) not null,
primary key(maBV),
CONSTRAINT FK_BaiViet FOREIGN KEY (maND)REFERENCES NguoiDung(maND)
)
create table LoiNhac(
maND varchar(20) not null,
chuDe nvarchar(50) not null,
ngayNhac date not null,
loiNhac nvarchar(250) not null
CONSTRAINT FK_LoiNhac FOREIGN KEY (maND)REFERENCES NguoiDung(maND)

)
