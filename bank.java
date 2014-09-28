import java.util.Scanner;
class bank {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int saldo,tabung,ambil,hasil,pilih;
		int tb;
		saldo = 50000;
		tabung =0;
	
		System.out.println("1.Menabung :");
        System.out.println("2.Tarik Tunai");
        System.out.println("3.Cek Saldo");
        System.out.print("pilih Salah satu :");
        pilih = sc.nextInt();
        
        if(pilih == 1){
        	System.out.println("Saldo anda saat ini adalah : "+saldo);
            System.out.println("Berapa anda akan menabung :");
            tabung = sc.nextInt();
            System.out.println("===========================");
            tb = saldo + tabung;
            System.out.println("anda berhasil menabung ,Total tabungan anda :"+tb);
        }
        
		if(pilih == 2){
			System.out.println("Berapa uang yang ingin anda ambil :");
			ambil = sc.nextInt();
			
			if(saldo < ambil ){
				System.out.println("Saldo anda tidak mencukupi");
			}
			if(saldo > ambil){
				System.out.println("anda berhasil menarik uang sebesar :"+ambil);
			}
		}
		if (pilih == 3){
			System.out.println("Saldo anda adalah :"+saldo);
		}
	
	}
}