package TugasPBO;
import java.util.Scanner;

class ATM {

    private int firstsaldo = 1000000;
    private String nama;
    private int pasword;
    int userinput1;
    int userinput2;
    int penarikan;
    int nomtransfer;
    double rek;
    public int stop = 0;
    String namaBank;
    Scanner input = new Scanner(System.in);

    public ATM(){
    String nm = "BRI";
    int pswd = 6969;
    pasword = pswd;
    nama = nm;
    }

    void cekPasword(){

    int i = 0;
    do{
    System.out.print("masukan pasword anda : ");
    userinput1 = input.nextInt();
        if (i > 1){
            System.out.println("Maaf, transaksi anda dibatalkan");
            System.exit(0);
        }
    i++;
    }
    while (userinput1 != pasword);
    }

    void infoSaldo(){
    System.out.println("Saldo anda sekarang adalah : "+firstsaldo);
    }

    int penarikan(){
    int i = 0;
    do{
    System.out.print("Masukan nominal penarikan    : ");
    penarikan = input.nextInt();
    if (penarikan > firstsaldo){
        System.out.println("maaf, saldo anda tidak mencukupi");
        System.out.println("silahkan masukan nominal yang lebih kecil");
    }
    
    if (penarikan < 0){
        System.out.println("Maaf anda tidak memasukkan nominal yang benar");
        System.out.println("Silahkan masukkan nominal yang benar");
        penarikan();
    }
    else {
        System.out.println("penarikan berhasil, sebanyak : " +penarikan);
        System.out.println("terima kasih^^, silahkan ambil uang anda ...");
        firstsaldo = firstsaldo - penarikan;
    }
    i++;
    }
    while (penarikan > firstsaldo);
    return firstsaldo;
    }

    public void transfer(int norek, int money){                 //method overload (mempunyai 2 parameter)
    rek = norek;
    nomtransfer = money;
    int i = 0;
    do{
    System.out.print("masukan nomer rekening     : ");
    rek = input.nextDouble();
    System.out.print("masukan nominal transfer   : ");
    nomtransfer = input.nextInt();
        if (nomtransfer > firstsaldo){
            System.out.println("maaf, saldo anda tidak mencukupi");
            System.out.println("silahkan masukan nominal yang lebih kecil");
        }
        else {
            System.out.println("transfer berhasil, sebesar : "+ nomtransfer);
            firstsaldo = firstsaldo - nomtransfer;
        }
    i++;

    }
    while (nomtransfer > firstsaldo);
    }
    public void transfer(int norek, int money, String bankname){     //method overload (mempunyai 3 parameter)
    rek = norek;
    nomtransfer = money;
    namaBank = bankname;

    int i = 0;
    do{
    System.out.print("masukan nomer rekening     : ");
    rek = input.nextDouble();
    System.out.print("masukan nama bank          : ");
    bankname = input.next();
    System.out.print("masukan nominal transfer   : ");
    nomtransfer = input.nextInt();
        if (nomtransfer > firstsaldo){
            System.out.println("maaf, saldo anda tidak mencukupi");
            System.out.println("silahkan masukan nominal yang lebih kecil");
        }
        else {
            System.out.println("transfer berhasil, sebesar : "+ nomtransfer);
            firstsaldo = firstsaldo - nomtransfer;
        }
    i++;
    }
    while (nomtransfer > firstsaldo);
    }
}
