package br.com.javalab.interfacefuncional;

public class Application {

	public static void main(String[] args) {
		
		MessageInterface<String> sendMessageUser = new MessageInterface<String>() {
			
			public String sendMessage(String name) {
				
				return name + " Welcome!";
			}
		};
		
		String name1 = "Ramon";
		
		System.out.println(sendMessageUser.sendMessage(name1));
		
		System.out.println(sendMessageUser.createName("Kurt Cobain"));
		
		//--------
		
		ProcessorInterface<Integer, Integer> addOne = x -> x + 1;
		
		System.out.println(addOne.apply(10));
	}
}
