package br.com.javalab.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;
	
	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
        observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
        observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
        for (Observer observer : observers) {
            observer.update();
        }
	}

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        System.out.println("Valor do state: " + state);
        notifyObservers();
    }
}
