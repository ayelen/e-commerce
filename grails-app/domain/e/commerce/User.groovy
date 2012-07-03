package e.commerce

class User {
	
	Long id
	String username
	String password
	List<Role> roles

    static constraints = {
    }
}
