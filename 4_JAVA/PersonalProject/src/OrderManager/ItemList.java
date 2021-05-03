package OrderManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ItemList {
		private String csvFile = "ItemList.csv";
		private BufferedReader br = null;
		private String strLine = null;
		private HashMap ItemList;
	
		
		public ItemList(){
		
		}
			
		public void LoadItemList(){
			try
			{
				br = new BufferedReader(new FileReader(csvFile));
				ItemList = new HashMap();
				
				while ((strLine = br.readLine()) != null) {
					String[] strItem = strLine.split(",");
					ArrayList list = new ArrayList<String>();
					/*//확인용
					System.out.println("===================================");
					System.out.println("[ itemcode 	: " + strItem[0] + " ]");
					System.out.println("[ name	    	: " + strItem[1] + " ]");
					System.out.println("[ price 	: " + strItem[2] + " ]");
					System.out.println("[ Count		: " + strItem[3] + " ]");
					System.out.println("[ Storage	: " + strItem[4] + " ]");
					System.out.println("[ dc	: " + strItem[5] + " ]");
					System.out.println("===================================");
					//*/
					
					list.add(strItem[1]);
					list.add(strItem[2]);
					list.add(strItem[3]);
					list.add(strItem[4]);
					list.add(strItem[5]);
					ItemList.put(strItem[0], list);
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public void printItemList(){
			System.out.println("======================== 상품 정보 ======================");
			System.out.println("ITEMCODE\tNAME\t\tPRICE\tCOUNT\tDC");
			
			HashMap mapdata = ItemList;
			Set<String> set = mapdata.keySet();
			
			for(String item:set)
			{
				ArrayList str = (ArrayList)mapdata.get(item);
				System.out.println(item+"\t\t"+str.get(0)+"\t\t"+str.get(1)+"\t"+str.get(2)+"\t"+str.get(4));	
			}	
			System.out.println("=========================================================");
		}
		
	public HashMap GetItemList(){return ItemList;}	
}
