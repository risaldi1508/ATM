package TugasPBO;
import java.util.Scanner;

class TestATM{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    int pilih;
    int pilihBank;
    int numb = 0;
    int fulus = 0;
    String nameb = "";
    String back;

    System.out.println("-- atm ini menggunakan uang pecahan Rp. 50.000 --");

    ATM TugasPBO = new ATM();    //instansiasi objek class atm

    TugasPBO.cekPasword();

    int i = 0;
    do{
    System.out.println("--- pilihan menu ---");
    System.out.println("1. penarikan ");
    System.out.println("2. informasi saldo");
    System.out.println("3. transfer");
    System.out.println("4. keluar");

    System.out.print("masukan pilihan anda: ");
    pilih = input.nextInt();

    if (pilih == 1)
        TugasPBO.penarikan();
    else if (pilih == 2)
        TugasPBO.infoSaldo();
    else if (pilih == 3){
        System.out.println("--- pilih bank ---");
        System.out.println("1. bank yang sama");
        System.out.println("2. bank yang berbeda");
        System.out.print("masukan pilihan anda: ");
        pilihBank = input.nextInt();
            if (pilihBank == 1){
                TugasPBO.transfer(numb, fulus);
            }if (pilihBank == 2){
                TugasPBO.transfer(numb, fulus, nameb);
            }else{
                System.out.println("Maaf inputan tidak benar");
            }       
    }else if (pilih == 4){
        System.out.println("Trimakasih atas kunjungan anda");
        break;
    }else{
        System.out.println("Maaf menu tidak tersedia");
    }
    System.out.print("apakah anda ingin bertransaksi lagi [y/t] : ");
    back = input.next();
    i++;
    }
    while (back.equals("y") || back.equals("Y"));
    System.out.println("TUGAS : RISALDI");
    }
}
