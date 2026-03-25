class Exercicio3_12{
	public static void main(String[] args){
		Invoice invoice = new Invoice("12345", "Invoice NF", 1, -50.0);

		System.out.printf("Invoice value is :%.2f%n",invoice.getInvoiceAmount());
	}
}