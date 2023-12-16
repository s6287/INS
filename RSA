import java.math.*;
import java.util.*;

class RSA{
	public static void main(String args[]){
		int p, q, n, z, d = 0, e, i;
		//The Number To Be Encrypted And Decrypted
		int msg = 12;
		double c;	
		BigInteger msgback;
		p = 3;
		q = 11;
		n = p * q;
		z = (p - 1) * (q-1);
		System.out.println("shivam");
		System.out.println("The Value Of  z = " + z);
		for(e = 2; e < z; e++){
			//e Is For Public Key Exponent
			if(gcd(e, z) == 1){
				break;
			}
		}
		System.out.println("The Value Of e = " + e);
		for(i = 0; i <= 9; i++){
			int x = 1 + (i  * z);
			//d Is For Private Key Exponent
			if(x % e == 0){
				d = x / e;
				break;
			}
		}
		System.out.println("The Value Of d = " + d);
		c = (Math.pow(msg, e)) % n;
		System.out.println("Encrypted Message Is : " + c);
		//Converting int Value Of n To BigInteger
		BigInteger N = BigInteger.valueOf(n);
		//Converting Float Value Of c To BigInteger
		BigInteger C = BigDecimal.valueOf(c).toBigInteger();
		msgback = (C.pow(d)).mod(N);
		System.out.println("Decrypted Message Is : " + msgback);	
	}
	static int gcd(int e, int z){
		if(e == 0)
			return z;
		else
		return gcd(z % e, e);
	}
}
