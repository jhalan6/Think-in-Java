package csh.tij.test11_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ToRun {
	public static void main(String[] args) {
		Generate generate=new Generate();
		ArrayList<String> arrayList=new ArrayList<String>();
		LinkedList<String> linkedList=new LinkedList<String>();
		HashSet<String> hashSet=new HashSet<String>();
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<String>();
		TreeSet<String>treeSet=new TreeSet<String>();
		for (int i = 0; i < 30; i++) {
			arrayList.add(generate.next());
			linkedHashSet.add(generate.next());
			linkedList.add(generate.next());
			hashSet.add(generate.next());
			treeSet.add(generate.next());
		}
		System.out.println(arrayList);
		System.out.println(linkedList);
		System.out.println(linkedHashSet);
		System.out.println(hashSet);
		System.out.println(treeSet);
	}
}
class Generate{
	private int next=-1;
	public String next() {
		ArrayList<String> names=new ArrayList<String>(Arrays.asList("这是电影名字","这个也是电影名字","这个还是电影名字","还有什么电影名字","想不到电影名字","最后一个电影名字"));
		next=(next+1)%names.size();
		return names.get(next);
	}
}