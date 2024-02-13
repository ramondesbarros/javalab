package br.com.javalab.designpatterns.observer;

public class Application {

	public static void main(String[] args) {
		
		// Implementação da interface Subject que representa um objeto concreto que pode ser observado
        ConcreteSubject subject = new ConcreteSubject(); // representa um objeto concreto que pode ser observado

        // Implementação da interface Observer que representa um objeto concreto que observa o Subject.
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1"); // representa um objeto concreto que observa o Subject
        
        // Implementação da interface Observer que representa um objeto concreto que observa o Subject.
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2"); // representa um objeto concreto que observa o Subject

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState(10);
        subject.setState(20);

        subject.removeObserver(observer1);

        subject.setState(30);
        
        /**
         * Explicação do código:

         . A interface Subject define os métodos addObserver(), removeObserver() e notifyObservers().
         
         . A classe ConcreteSubject implementa a interface Subject e representa um objeto concreto que pode ser observado.
         
         . A interface Observer define o método update().
         
         . A classe ConcreteObserver implementa a interface Observer e representa um objeto concreto que observa o Subject.
         
         . A classe Main cria um ConcreteSubject e dois ConcreteObserver.
         
         . O ConcreteSubject é configurado para notificar os ConcreteObserver quando seu estado muda.
         
         . O estado do ConcreteSubject é alterado várias vezes.
         
         . O ConcreteObserver é notificado sobre as mudanças de estado e imprime uma mensagem no console.

         */
	}
}
