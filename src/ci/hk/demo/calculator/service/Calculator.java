package ci.hk.demo.calculator.service;

public interface Calculator<T> {
	
	Double average(T ...nb);

}
