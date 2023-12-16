import java.io.*;

class RailFence{
	public static void main(String[] args)throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Plain Text : ");
		String pt = br.readLine();
		System.out.println("Enter Depth : ");
		int d = Integer.parseInt(br.readLine());
		String ct = encrypt(pt, d);
		System.out.println("Encrypted Text : " + ct);
		String dText = decrypt(ct, d);
		System.out.println("Decrypted Text : " + dText);
	}
	
	public static String encrypt(String pt, int d){
		String ct = "";
		int r = 0, n = 1;
		String[] arr = new String[d];
		for(int i = 0; i < pt.length(); i++){
			if(arr[r] == null) arr[r] = "";
			arr[r] += pt.charAt(i);
			r += n;
			if(r == (d - 1) || r == 0) n *= -1;
		}
		for(int i = 0; i < arr.length; i++) ct +=arr[i];
		return ct;
	}
		
	public static String decrypt(String ct, int d){
		String pt = "";
		int r = 0, n = 1;
		int[] arrIndex = new int[d];
		String[] arr = new String[d];
		for(int i = 0; i < ct.length(); i++){
			arrIndex[r] += 1;
			r += n;
			if(r == (d - 1) || r == 0) n *= -1;
		}
		String temp = ct;
		for(int i = 0; i < d; i++){
			arr[i] = temp.substring(0, arrIndex[i]);
			temp = temp.substring(arrIndex[i], temp.length());
		}
		r = 0; 
		n = 1;
		while(pt.length() != ct.length()){
			pt += arr[r].charAt(0);
			arr[r] = arr[r].substring(1, arr[r].length());
			r += n;
			if(r == (d - 1) || r == 0) n*= -1;
		}
		return pt;
	}
}
