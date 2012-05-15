// Place your Spring DSL code here
beans = {
	basecampService(bcx.freshbooks.BasecampService) {
		username = grailsApplication.config.bcx.username
		password = grailsApplication.config.bcx.password
	}
}
