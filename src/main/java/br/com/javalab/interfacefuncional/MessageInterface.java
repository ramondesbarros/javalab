package br.com.javalab.interfacefuncional;

@FunctionalInterface
public interface MessageInterface<T> {

	String sendMessage(String name);
	
	default String createName(String name) {
		
		return name;
	}
}
