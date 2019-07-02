package exception;


import java.io.FileNotFoundException;
import java.io.IOException;
	class A {
		public void method() throws IOException {	}
	}
	
	class B extends A {		public void method() throws FileNotFoundException {	}
	}
	
	class C extends A {		public void method() {	}
	}
	
	class E extends A {		public void method() throws IOException, FileNotFoundException {    }
	}
	class F extends A {		public void method() throws IOException, ArithmeticException {      }
	}


