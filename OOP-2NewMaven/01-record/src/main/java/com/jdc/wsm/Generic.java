package com.jdc.wsm;

public class Generic {

	public static void main(String[] args) {
		Human<String> h=new Human<>();
		Checker<String>c=new Checker<>("ss");
		useData(20);
		String s=getData();
		System.out.println(s);
		
		
	}
	static <T>void useData(T t) {
		System.out.println(t);
	}
	static <R> R getData() {
		return null;
	}
	
}
record  Checker <T> (T t) {
	
}
interface Pair<K,V>{
	void setKey(K k);
	void setValue(V v);
}

class OrderPair<X,Y> implements Pair<X,Y>{
	@Override
	public void setKey(X k) {
		
	}
	@Override
	public void setValue(Y v) {
		
	}
}
class Human<T>{
	
}