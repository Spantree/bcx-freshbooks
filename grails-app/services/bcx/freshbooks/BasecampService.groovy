package bcx.freshbooks

class BasecampService {
	String username
	String password
	
	public String getCredentials() {
		return "${username}:${password}"
	}
}
