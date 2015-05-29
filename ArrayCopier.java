package day6;

public class ArrayCopier {
	
	public void copy (int [] dst, int [] src) {
		
		if ((dst.length <= src.length)){
			for (int i = 0; i<dst.length;i++) {
				dst[i] =src[i];
			}
		} else if (dst.length>src.length) {
			for (int i =0; i<src.length;i++) {
				dst[i] = src[i];
			}
			
			for(int j =src.length; j<dst.length; j++ ) {
				dst[j]=0;
			}
		} else {
			System.out.println("oops, something is wrong");
		}

		
	}

}
