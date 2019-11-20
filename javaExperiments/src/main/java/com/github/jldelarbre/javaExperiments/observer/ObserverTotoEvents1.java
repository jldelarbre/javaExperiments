package com.github.jldelarbre.javaExperiments.observer;

public class ObserverTotoEvents1 implements IObserverTotoEvents1, IObservableTotosEvents1 {

	private final String observerDescription = "observer event 1";

	@Override
	public void eventCommon() {
		System.out.println("ObserverTotoEvents1.eventCommon()");
	}

	@Override
	public void eventYoupla1() {
		System.out.println("ObserverTotoEvents1.eventYoupla1()");
	}

	@Override
	public void eventYouplaBoom1(String someParam) {
		System.out.println("ObserverTotoEvents1.eventYouplaBoom1(" + someParam + ")");
	}

	@Override
	public IObservableTotosEvents1 process() {
		return this;
	}

	@Override
	public Class<IObservableTotosEvents1> getObservablesEventsType() {
		return IObservableTotosEvents1.class;
	}

	@Override
	public String toString() {
		return observerDescription + this.getObserverDescription();
	}
}
