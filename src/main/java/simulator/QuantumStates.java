package simulator;

import calculator.MatrixCalculator;
import calculator.Functions;
import model.ComplexVector;

public class QuantumStates {

    public static double likeliHood(ComplexVector vector, int i) {
		
		return Math.sqrt(Functions.Modulus(vector.getElement(i)) / MatrixCalculator.norm(vector));

	}

}