package p_project;

// 상품 클래스(1차완성)

import java.io.*;
import java.util.*;

public class Goods {
	private String csvFile = "GoodsList.csv";
	private BufferedReader br = null;
	private String sLine = null;
	private HashMap Goods;
	
	public Goods(){
	
	}
	
	public void LoadGoods() {
		try {
			br = new BufferedReader(new FileReader(csvFile));
			Goods = new HashMap();
			
			while ((sLine = br.readLine()) != null) {
				String[] sGoods = sLine.split(",");
				ArrayList list = new ArrayList<String>();
				
				list.add(sGoods[1]);
				list.add(sGoods[2]);
				list.add(sGoods[3]);
				list.add(sGoods[4]);
				list.add(sGoods[5]);
				Goods.put(sGoods[0], list);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void displayGoods () {
		System.out.println("======================== 상품 정보 ======================");
		System.out.println("ITEMCODE\tNAME\t\tPRICE\tCOUNT\tDC");
		
		HashMap mapdata = Goods;
		Set<String> set = mapdata.keySet();
		
		for (String goods:set) {
			ArrayList arr = (ArrayList)mapdata.get(goods);
			System.out.println(goods+"/t/t"+arr.get(0)+"/t/t"+arr.get(1)+"\t"+arr.get(2)+"\t"+arr.get(4));
		}
		System.out.println("=========================================================");
	}
	public HashMap GetGoodsList(){
		return Goods;
	}	
}
