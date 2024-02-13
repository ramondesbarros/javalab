package br.com.javalab.designpatterns.observer;

public interface Subject {

	// notifique outros objetos, chamados de "observadores", sobre qualquer mudança em seu estado.
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();

}
