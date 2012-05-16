package bcx.freshbooks

import static org.junit.Assert.*
import grails.plugin.spock.IntegrationSpec

import org.junit.*

class BasecampServiceIntegrationSpec extends IntegrationSpec {
	def basecampService

	def "should return credentials"() {
		when:
			def creds = basecampService.getCredentials()
		then:
			creds
			creds != ':'
			creds != 'null:null'
	}
}
