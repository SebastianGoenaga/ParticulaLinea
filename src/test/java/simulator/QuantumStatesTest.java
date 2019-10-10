package simulator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import model.Complex;
import model.ComplexVector;

public class QuantumStatesTest {

    @Test
    void likeliHoodTest() {

        ComplexVector vector = new ComplexVector(4);

        // mat1
        Complex c1 = new Complex(-3, -1);
        Complex c2 = new Complex(0, -2);
        Complex c3 = new Complex(0, 1);
        Complex c4 = new Complex(2, 0);

        // add

        vector.addToMatrix(0, c1);
        vector.addToMatrix(1, c2);
        vector.addToMatrix(2, c3);
        vector.addToMatrix(3, c4);

        QuantumStatesSystem system = new QuantumStatesSystem(vector);

        double answer = system.likeliHood(2);

        double answerExpected = 0.47897362544357464;

        assertEquals(answerExpected, answer);

    }

    @Test
    void transitionAmplitudesTest() {

        ComplexVector vector = new ComplexVector(2);
        ComplexVector vector2 = new ComplexVector(2);

        // mat1
        Complex c1 = new Complex(1, 0);
        Complex c2 = new Complex(0, -1);
        Complex c3 = new Complex(0, 1);
        Complex c4 = new Complex(1, 0);

        // add

        vector.addToMatrix(0, c1);
        vector.addToMatrix(1, c2);
        vector2.addToMatrix(0, c3);
        vector2.addToMatrix(1, c4);

        QuantumStatesSystem system = new QuantumStatesSystem(vector);

        Complex answer = system.transitionAmplitudes(vector2);

        Complex answerExpected = new Complex(0, -2);
        
        assertEquals(answerExpected, answer);

    }

}