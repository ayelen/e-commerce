package e.commerce

class Purchase {

	Long id
	User user
	List<Product> products
	Double total

    static constraints = {
    }
}
