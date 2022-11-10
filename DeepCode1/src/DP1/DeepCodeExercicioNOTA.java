package DP1;

import java.util.*;

public class DeepCodeExercicioNOTA {

/* Faça um programa que peça uma nota, entre zero e dez. 
Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um 
valor válido.

Challenge: Ask for a grade, between zero and ten. 
Show a message if the value is invalid and keep asking until the user enters a valid value.*/

public static void main (String []args) {
	System.out.println("Hello, world!"); 
	Scanner scan = new Scanner (System.in);
	System.out.println("Type a number between zero and ten"); 
	int number;
	number = scan.nextInt();
	System.out.println("Your number is: "+number);
	
	while (number>10 || number<0) {
		System.out.print("Number not accepted to attend what was required. Try again.");
		number = scan.nextInt();
		} 
	if (number<=10 && number>=0) {
		System.out.println("Valid number. You can pass");
	}
}
}


