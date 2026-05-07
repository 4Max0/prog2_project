/* (C)2026 */
package org.example;

public class App {
	public String getGreeting() {
		return "Hello World!";
	}

	public String getJavaVersion() {
		return System.getProperty("java.version");
	}

	public static void main(String[] args) {
		App a = new App();
		IO.println(a.getGreeting());
		IO.println(a.getJavaVersion());
	}
}
