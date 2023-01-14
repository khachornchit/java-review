package JavaCore.Generic;

public class Node<T> {
	T data;
	Node<T> node;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
