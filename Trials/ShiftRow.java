public class ShiftRow{
	public static void main(String[]args){
		int [] start = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int [] finish = new int[16];
		for (int i=0; i<16; i++){
			if(i%4==0)
				finish[i] = (start[i])%16;
			if(i%4==1)
				finish[i] = (start[i]+1)%16;
			if(i%4==2)
				finish[i] = (start[i]+2)%16;
			if(i%4==3)
				finish[i] = (start[i]+3)%16;
		}
		for (int i=0; i<16; i++){
			System.out.print(finish[i]+"  ");
		}
	}
}
