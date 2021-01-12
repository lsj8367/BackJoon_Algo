package while��;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex10951 {
	public static void main(String[] args) {
		//eof ó�� ���ù��� 
		//�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		try {
			while(true) {
				String line = br.readLine();
				
				if(line == null || line.equals("")) {
					break;
				}
				
				st = new StringTokenizer(line);
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write(a + b + "\n");
			}
			
			bw.flush();
			
			bw.close();
			br.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
