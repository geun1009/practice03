package prob02;
import java.util.*;
public class GoodsApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Goods[] g = new Goods[3];
		
		for(int i=0;i<3;i++){
			g[i] = new Goods();
			g[i].setName(sc.next());
			g[i].setPrice(sc.nextInt());
			g[i].setStock(sc.nextInt());
		}
		
		for(int i=0;i<3;i++){
			g[i].show();
		}
	}
}
