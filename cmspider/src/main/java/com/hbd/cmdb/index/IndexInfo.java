package com.hbd.cmdb.index;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.hbd.cmdb.BaseInfo;

public class IndexInfo {
	public static String wordCountFile = BaseInfo.indexPath + "wordcount.dat";
	public static String wordIndexFile = BaseInfo.indexPath + "wordindex.dat";
	
	public static List<Entry<String,Integer>> sortMap(Map<String,Integer> map){
		// sort
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>();
		for (Entry<String, Integer> entry : map.entrySet()) {
			list.add(entry);
		}
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> e1,
					Entry<String, Integer> e2) {
				return e2.getValue() - e1.getValue();
			}

		});
		return list;
	}
}
