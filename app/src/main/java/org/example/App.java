/* (C)2026 */
package org.example;

public class App {
	public String getGreeting() {
		return "Hello World!";
	}
	public String getJavaVersion() {
		return System.getProperty("java.version");
	}

	public String testSpotless() {String a="I'm u";String b="sing spotless!!" ;return a+b;}


	public void x(){
		System.out.println("hi");







	}


	public void y()
	{
	}



	public static void main(String[] args) {
		App a = new App();
		System.out.println(a.getGreeting());
		System.out.println(a.getJavaVersion());
		System.out.println(a.testSpotless());
	}
}
