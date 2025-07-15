# Katalon Mobile Sample Test
Sample Mobile Automation Test

Berikut ini hasil dari pengerjaan test automate login mobile dengan contoh aplikasi Smart Residence

> Berikut contoh testcase yang telah dibuat
 terdapat 3 postive case dan 6 negative case.
> Berikut Report Hasil testing
https://github.com/hendar-suhendar/BNI-New-Mobile-Sample-Test/files/13914645/20240112_095633.pdf

sebelum dijalankan bersama disini ada 1 case yang saya uncheck, karena memerlukan autorisasi akses automate 
untuk set default limitasi dan unblock, namun untuk scripting telah saya kerjakan, 
hanya pada validasi akhir butuh penyesuaian teks keterangan yang dibuat seperti apa, bila akun telah terblokir

Setelah diuncheck, Selanjutnya kita coba jalankan :

1. Jalankan Test suite yang telah dibuat
2. Bila kita ingin memonitor log tag object saat menjalankan, 
   kita bisa melihat dari log view dan log console atau dari debbuging log console
2. Lihat hasil report hasil menjalankan, untuk melihat hasil menjalankan test, kita bisa lihat dari test suite result dan kita lakukan generite 
atau buka pada folder report di katalon 

Catatan Deffect/Bug issue :
1. Input dengan nomor HP dengan kode negara +62 tidak dikenali atau akan tetap dianggap tidak ditemukan
2.  Saat tidak memasukkan nomor HP dan mengisi password akan memberikan notifikasi yang tidak sesuai dengan keterangan
"username tidak valid"
Example mine : "data ini wajib diisi" atau "no handphone harus diisi"
3. Memberikan keterangan dg informasi validasi popup yang kurang sesuai dengan penyebuatan Username
"Username dan Password Anda salah. Silakan ulangi kembali, jika salah lebih 3x, Akun Anda akan diblokir."
Example mine : "Password yang anda masukkan salah, silakan ulangi kembali. Bila lebih dari 3x kesalahan, Akun Anda akan terblokir."
4. Saat tidak mengisi Input Nomor HP dan Password lalu pilih button masuk, memberikan notifikasi yang kurang sesuai pada input Nomor HP
dengan keterangan "username tidak valid"
Example mine : "hidden button saat belum melakukan input Nomor HP dan Password"
