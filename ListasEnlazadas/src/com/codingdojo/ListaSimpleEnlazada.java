package com.codingdojo;

public class ListaSimpleEnlazada {
	 public Nodo head;
	    public ListaSimpleEnlazada() {
	        
	    }
	    public ListaSimpleEnlazada(Nodo head) {
			super();
			this.head = head;
		}
	    
	    
		public Nodo getHead() {
			return head;
		}
		public void setHead(Nodo head) {
			this.head = head;
		}
		
		// Los métodos de SLL van aquí. Para empezar, te mostraremos cómo agregar un nodo a la lista.
	    public void add(int value) {
	        Nodo newNodo = new Nodo(value);
	        if(head == null) {
	            head = newNodo;
	        } else {
	            Nodo runner = head;
	            while(runner.next != null) {
	                runner = runner.next;
	            }
	            runner.next = newNodo;
	        }
	    }    
	    
	    public void remove(int value) {
	    	Nodo previo = null;
			
			if(head != null) {
				Nodo runner = head;
				while(runner.next != null) {
					previo = runner;
					runner = runner.next;
				}
				
				if(runner.next == null) {
					previo.next = null;
				}
			}
	    } 
	    
	    public void printValues() {
			Nodo runner = head;
			while(runner != null) {
				System.out.println(runner.value);
				runner = runner.next;
			}
		}

}
