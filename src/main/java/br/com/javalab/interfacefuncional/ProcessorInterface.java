package br.com.javalab.interfacefuncional;

@FunctionalInterface
public interface ProcessorInterface<T, R> {

	//Recebe "T" e retorna "R"
	R apply(T t);
}
